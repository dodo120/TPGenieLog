import java.util.List;

public final class Client {

private String nom;
private String paiement;
private String contact;
private String reference;

public List<Reservation> maListeReservation; 

public Client(String nom, String paiement, String contact, String reference, List<Reservation> listReservation) {

	this.nom = nom;
	this.paiement = paiement;
	this.contact = contact;
	this.maListeReservation = listReservation;
}
}
