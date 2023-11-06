import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HoroscopeRestController {
    @Autowired
    private HoroscopeService horoscopeService;

    @GetMapping("/api/horoscope")
    public String getHoroscope() {
        return horoscopeService.getHoroscope();
    }
}
