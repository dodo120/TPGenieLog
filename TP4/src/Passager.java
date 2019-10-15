import java.util.List;

public class Passager {
	private String nom;
	private String contact;
	public List<Reservation> listReservation;

	public Passager(String nom, String contact, List<Reservation> listReservation) {

	this.nom = nom;
	this.contact = contact;
	this.listReservation = listReservation;
}
}
