package com.edu.uniquindio.centroImpresion.model;


import com.edu.uniquindio.centroImpresion.exceptions.ImpresoraException;
import java.util.ArrayList;
import java.util.List;

public class CentroImpresion {

    //Atributos de clase
    private String code;
    private List<Impresora> listaImpresoras= new ArrayList<>();
    private List<Documento> listaDocumentos= new ArrayList<>();

    /**
     * Metodo constructor donde además se inicializan varios atributos
     * @param code
     */
    public CentroImpresion(String code) {
        this.code = code;
        inicializarDatos();
    }

    /**
     * Método donde se queman datos para poder usarlos posteriormente en el resto del proyecto
     */
    private void inicializarDatos() {
        List<Documento> documentos= new ArrayList<>();
        Documento documento1= new Documento("titulo1", "hola que mas", EstadoDocumento.IMPRIMIENDO, PrioridadDocumento.ALTA);
        Documento documento2= new Documento("titulo1", "Como estas", EstadoDocumento.IMPRESO, PrioridadDocumento.MEDIA);
        Documento documento3= new Documento("titulo1", "Espero que bien", EstadoDocumento.IMPRESO, PrioridadDocumento.BAJA);
        documentos.add(documento1);
        documentos.add(documento2);
        documentos.add(documento3);
        setListaDocumentos(documentos);

        List<Impresora> impresoras= new ArrayList<>();
        Impresora impresora1= new Impresora("Impresora1","Acer", EstadoImpresora.ACTIVA,listaDocumentos);
        Impresora impresora2= new Impresora("Impresora2","Asus", EstadoImpresora.MANTENIMIENTO,listaDocumentos);
        Impresora impresora3= new Impresora("Impresora3","Hp", EstadoImpresora.INACTIVA,listaDocumentos);
        impresoras.add(impresora3);
        impresoras.add(impresora2);
        impresoras.add(impresora1);
        setListaImpresoras(impresoras);

    }

    /**
     * Métodos getter and setter de los atributos de clase
     * @return
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Impresora> getListaImpresoras() {
        return listaImpresoras;
    }

    public void setListaImpresoras(List<Impresora> listaImpresoras) {
        this.listaImpresoras = listaImpresoras;
    }

    public List<Documento> getListaDocumentos() {
        return listaDocumentos;
    }

    public void setListaDocumentos(List<Documento> listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }

    /**
     * metodos CRUD de las impresoras
     * mos sirven en el momento que queramos manejarlas
     */
    public void ImpresoraService() {
        this.listaImpresoras = new ArrayList<>();
    }

    public void agregrarImpresora(Impresora impresora) {
        listaImpresoras.add(impresora);
    }

    public void eliminarImpresora(Impresora impresora) {
        listaImpresoras.remove(impresora);
    }

    /**
     * Método que busca una impresora por su marca
     * @param marca
     * @return
     */
    public Impresora buscarImpresoraPorMarca(String marca) {
        for (Impresora impresora : listaImpresoras) {
            if (impresora.getMarca().equals(marca)) {
                return impresora;
            }
        }
        return null;
    }

    /**
     * metodo que obtiene los nombres de todas las impresoras que existen y los mete en una lista
     * @return
     */
    public List<String> obtenerNombresImpresoras() {
        List<String> nombresImpresoras = new ArrayList<>();
        for (Impresora impresora : listaImpresoras){
            nombresImpresoras.add(impresora.getName());
        }
        return nombresImpresoras;
    }

    /**
     * Método que verifica si existe una impresora (por nombre) y si no existe la puede agregar como nueva
     * @param impresora
     * @throws ImpresoraException
     */
    public void verificarImpresora(Impresora impresora) throws ImpresoraException {
        for (Impresora imp : listaImpresoras) {
            if (imp.getName().equals(impresora.getName())) {
                throw new ImpresoraException("Ya existe una impresora con el mismo nombre");
            }
        }
        agregrarImpresora(impresora);
    }
}
