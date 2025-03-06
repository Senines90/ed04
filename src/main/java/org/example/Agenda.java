package org.example;

import java.util.*;

/**
 * Clase Agenda, contiene el listado de contactos con su teléfono.
 * Permite añadir, modificar y eliminar los contactos de la lista.
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor de la clase Agenda
     * Inicializa la lista de contactos vacía
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método para añadir un contacto a la lista
     *
     * @param name nombre del contacto
     * @param phone número de teléfono del contacto
     */

    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método para eliminar un contacto a la lista.
     * Si el contacto existe se elimina
     *
     * @param name nombre del contacto
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método que modifica el número de teléfono de un contacto
     * Si el antiguo número existe en la lista se reemplaza por el nuevo
     *
     * @param name nombre del contacto
     * @param oldPhone número de teléfono antiguo
     * @param newPhone número de teléfono nuevo
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
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
    @Override
    public List<Persona> getContacts()
    {
        return this.contacts;
    }
}