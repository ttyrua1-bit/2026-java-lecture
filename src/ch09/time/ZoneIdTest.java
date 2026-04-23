package ch09.time;

import java.time.ZoneId;

public class ZoneIdTest {

    static void main() {
        for(String availableZoneId: ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId+ " / "+zoneId.getRules());
        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault() = "+zoneId);

        ZoneId seoul = ZoneId.of("Asia/Seoul");  //UTC / GMT
        System.out.println("seoul = "+seoul);
    }

}
