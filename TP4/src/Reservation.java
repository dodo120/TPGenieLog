import java.util.Date;
import java.util.List;

public class Reservation {

public Date date;
public Double identifiant;
public String etat;
public List<Client> maListeClient;
public List<Passager> maListePassager;
public Vol vol;

public Reservation(Date date, Double identifiant, String etat, List<Client> listeClient, List<Passager> listePassager, Vol vol) {
	this.date = date;
	this.identifiant = identifiant;
	this.etat = etat;
	this.maListeClient = listeClient;
	this.maListePassager = listePassager;
	this.vol = vol;
}

public void annuler() {
	this.etat = "annuler";
}

public void confirmer() {
	if(etat == "annuler" || etat == "en attente"){
		return;
	}
	etat = "confirmer";
}

public void payer() {
	if(etat == "en attente"){
		etat = "payer";
	}
}

}
