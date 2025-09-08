package models;

public class Contacto {
    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public String setTelefono(String telefono) {
        this.telefono = telefono;
        return telefono;
    }

    public String setCorreo(String correo) {
        this.correo = correo;
        return correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getCorreo() {
        return this.correo;
    }





}

