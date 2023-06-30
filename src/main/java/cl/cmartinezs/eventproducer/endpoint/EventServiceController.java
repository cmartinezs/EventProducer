package cl.cmartinezs.eventproducer.endpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventServiceController {
    @GetMapping("/services")
    public ResponseEntity<List<String>> get(){
        List<String> services = new ArrayList<>();
        services.add("Catering");
        services.add("Decoración");
        services.add("Entretenimiento");
        services.add("Musica en vivo");
        return ResponseEntity.ok(services);
    }
}
