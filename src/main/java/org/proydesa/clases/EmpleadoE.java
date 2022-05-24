package org.proydesa.clases;

import java.io.Serializable;

public class EmpleadoE implements Serializable {

    // CAMPOS
    private int idDistrito;
    private String domicilio;
    private String responsable;

    // CONSTRUCTORES
    public EmpleadoE() {
    }

    public EmpleadoE(int idDistrito, String domicilio, String responsable) {
        this.idDistrito = idDistrito;
        this.domicilio = domicilio;
        this.responsable = responsable;
    }

    // METODOS
    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public static String distrito(int id) {

        String texto;
        switch (id) {
            case 1:
                texto = "Gral.Bustos";
                break;
            case 2:
                texto = "Alta Cordoba";
                break;
            case 3:
                texto = "Pueyrredon";
                break;
            default:
                texto = "NO EXISTE EL DISTRITO";
                break;
        }
        return texto;
    }

    // IMPRIME
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append("EmpleadoE{" );
        sb.append(distrito(idDistrito)).append(" ");
        //sb.append("idDistrito= ").append(idDistrito);
        sb.append(", domicilio= ").append(domicilio);
        //sb.append(", responsable= ").append(responsable);
        //sb.append('}');
        return sb.toString();
    }

    // HASHCODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.idDistrito;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpleadoE other = (EmpleadoE) obj;
        return this.idDistrito == other.idDistrito;
    }

} // Fin de la clase EmpleadoE
