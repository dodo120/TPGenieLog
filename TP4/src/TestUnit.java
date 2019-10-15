import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestUnit {

	String[] identifiant = {};
	LocalDateTime ldt = LocalDateTime.of(2019, Month.OCTOBER, 22, 14, 30);
	LocalDateTime ldt2 = LocalDateTime.of(2019, Month.OCTOBER, 23, 14, 30);
	ZonedDateTime depart = ldt.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
	ZonedDateTime arrivee = ldt2.atZone(ZoneId.of("Asia/Kuala_Lumpur"));	
	Vol vol = new Vol(identifiant,depart,arrivee);
	String duree = "PT24H";

//Test Durée
 @Test
 public void dureeVol() {
      assertThat(duree, is(vol.duree().toString()));
  }


}
