package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Persona, contiene los contactos con nombre y lista de teléfonos
 */
public class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor de la clase Persona
     *
     * @param name nombre del contacto
     * @param phone telefono del contacto
     */
    public Persona(String name, String phone) {
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
     * Establece el nombre del contacto
     * @param name nuevo nombre del contacto
     * @return instancia actual del contacto
     */
    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Obtiene la lista de teléfonos del contacto
     *
     * @return lista de números de teléfono del contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * Establece la lista de teléfonos del contacto
     *
     * @param phones lista de números de teléfono a asignar a cada contacto
     * @return instancia actual del contacto
     */
    public Persona setPhones(List<String> phones) {
        this.phones = phones;
        return this;
    }
}