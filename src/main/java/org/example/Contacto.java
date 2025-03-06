package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Contacto, contiene los contactos con nombre y lista de teléfonos
 */
public class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor de la clase Contacto
     *
     * @param name nombre del contacto
     * @param phone telefono del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto
     *
     * @return nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de teléfonos del contacto
     *
     * @return número de teléfono del contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}