import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HoroscopeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HoroscopeApplication.class, args);
    }
}

@RestController
@RequestMapping("/horoscopes")
class HoroscopeController {
    private final List<Horoscope> horoscopes = new ArrayList<>();

    @GetMapping("/")
    public List<Horoscope> getAllHoroscopes() {
        return horoscopes;
    }

    @PostMapping("/")
    public Horoscope createHoroscope(@RequestBody Horoscope horoscope) {
        horoscopes.add(horoscope);
        return horoscope;
    }
}

class Horoscope {
    private String zodiacSign;
    private String prediction;

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }
}