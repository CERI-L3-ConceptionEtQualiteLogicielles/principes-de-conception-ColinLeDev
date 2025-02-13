package exo1;

public class Sender {
    public void envoyer(SendService service, Contact dest, String contenu){
        service.envoi(dest, contenu);
    }
}
