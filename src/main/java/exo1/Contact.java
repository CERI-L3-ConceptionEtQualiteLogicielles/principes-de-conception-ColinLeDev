package exo1;

public class Contact {
    private String nom;
    private String numero;

    private Contact() {    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getInfoContact(ContactPrinter formatter) {
        return formatter.infoContact(this);
    }
    
    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Numéro: " + getNumero();
    }

    public static class ContactBuilder {
        private String nom;
        private String numero;

        public ContactBuilder() {

        }

        public void setNom(String newName) {
            this.nom = newName;
        }

        public void setNumero(String newNumero) {
            this.numero = newNumero;
        }

        public Contact build() {
            Contact contact = new Contact();
            contact.nom = this.nom;
            contact.numero = this.numero;
            return contact;
        }
    }
}

