package ie.atu.PassengerJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerController {
    PassengerService myService;

    public PassengerController(PassengerService myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PassengerJpaApplication.class, args);
    }

    @GetMapping
    public List<Passenger> getPassengers(){
        return myService.getPassengers();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID){
        return myService.getPassenger(passengerID);
    }
}
