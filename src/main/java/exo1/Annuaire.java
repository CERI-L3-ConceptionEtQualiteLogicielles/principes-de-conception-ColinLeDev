package exo1;

import java.util.ArrayList;
import java.util.List;

public class Annuaire implements ContactService {
    private static List<Contact> lesContacts = new ArrayList<>();
    
    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            System.out.println("Nom: " + contact.getNom() + ", Numéro: " + contact.getNumero());
        }
    }

    public void sauvegardeEnBD() { // Passer le dbService en arg ?
        // Logique pour sauvegarder les contacts dans une base de données
    }
}
