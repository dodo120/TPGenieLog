import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main{

public static void main(String[] args) {

try{
	List<Reservation> listReservation = new ArrayList<Reservation>();
	String[] identifiant = {};
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	Date date = format.parse("2019-10-22");
	Double identifiantDouble = 1254.0;
	String etat = "en attente";


	LocalDateTime ldt = LocalDateTime.of(2019, Month.OCTOBER, 22, 14, 30);
	LocalDateTime ldt2 = LocalDateTime.of(2019, Month.OCTOBER, 23, 14, 30);
	ZonedDateTime depart = ldt.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
	ZonedDateTime arrivee = ldt2.atZone(ZoneId.of("Asia/Kuala_Lumpur"));



	Client client1 = new Client("aaa","bbb","ccc","ddd",listReservation);
	Client client2 = new Client("aaa","bbb","ccc","ddd",listReservation);
	Client client3 = new Client("aaa","bbb","ccc","ddd",listReservation);

	List<Client> listClient = new ArrayList<Client>();
	listClient.add(client1);
	listClient.add(client2);
	listClient.add(client3);

	Passager passager1 = new Passager("aaa","bbb",listReservation);
	Passager passager2 = new Passager("aaa","bbb",listReservation);
	Passager passager3 = new Passager("aaa","bbb",listReservation);
	List<Passager> listPassager = new ArrayList<Passager>();
	listPassager.add(passager1);
	listPassager.add(passager2);
	listPassager.add(passager3);

	if(depart.isBefore(arrivee)) {	
	Vol vol = new Vol(identifiant,depart,arrivee);
	
if(vol == null || listClient.isEmpty() || listPassager.isEmpty()) {
		System.out.println("Réservation non valide");
	} else {
		Reservation reservation = new Reservation(date,identifiantDouble,etat,listClient,listPassager,vol);
		reservation.confirmer();

		System.out.println("duree: " + vol.duree());
		System.out.println("reservation etat: " + reservation.etat);
		reservation.payer();
		System.out.println("reservation etat: " + reservation.etat);
		reservation.annuler();
		System.out.println("reservation etat: " + reservation.etat);
	}
	} else {
System.out.println("La date de départ du vol est après la date d'arrivée");
}

	

	
}
catch(Exception e){
	System.out.println(e + "");
}

}

}
