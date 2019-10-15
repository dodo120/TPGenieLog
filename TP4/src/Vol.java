import java.time.ZonedDateTime;
import java.time.Duration;

public class Vol {
	private String[] identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;	

	public Vol(String[] identifiant, ZonedDateTime depart, ZonedDateTime arrivee) {
	
	this.identifiant = identifiant;
	this.depart = depart;
	this.arrivee = arrivee;
}

	public Duration duree() {
		return Duration.between(depart, arrivee);
}
	public void ouvrir() {}
	public void fermer() {} 
}
