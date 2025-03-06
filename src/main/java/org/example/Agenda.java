package org.example;

import java.util.*;

/**
 * Clase Agenda, contiene el listado de contactos con su teléfono.
 * Permite añadir, modificar y eliminar los contactos de la lista.
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor de la clase Agenda
     * Inicializa la lista de contactos vacía
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método addContact para añadir un contacto a la lista
     *
     * @param name nombre del contacto
     * @param phone número de teléfono del contacto
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método removeContact para eliminar un contacto a la lista.
     * Si el contacto existe se elimina
     *
     * @param name nombre del contacto
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método modifyPhoneNumber que modifica el número de teléfono de un contacto
     * Si el antiguo número existe en la lista se reemplaza por el nuevo
     *
     * @param name nombre del contacto
     * @param oldPhone número de teléfono antiguo
     * @param newPhone número de teléfono nuevo
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos guardados en la agenda
     *
     * @return lista de contactos
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}