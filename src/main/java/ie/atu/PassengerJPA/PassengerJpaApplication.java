package ie.atu.PassengerJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerJpaApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers(){

		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Joe", "1234567890", "0872736459", 25),
				new Passenger("Mr", "Mark", "9384756203", "0875968322", 38),
				new Passenger("Mr", "David", "1029203945", "0856900938", 65),
				new Passenger("Mr", "Oliver", "6803747493", "0891209656", 18));
		return myPassengers;
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		Passenger myPassenger = new Passenger("Mr", "Tom", "9485823241", "0872993884", 34);
		return myPassenger;
	}
}

