package exo1;

public class ServiceEnvoiPhotoManager extends ServiceEnvoiPhoto implements SendService {
    public void envoi(Contact contact, String message) {
        envoiPhoto(contact, message);
    }
}


// public class ServiceEnvoiPhotoManager implements SendService {
//     private ServiceEnvoiPhoto serviceEnvoiPhoto = new ServiceEnvoiPhoto();

//     public void envoi(Contact contact, String message) {
//         serviceEnvoiPhoto.envoiPhoto(contact, message);
//     }
// }

