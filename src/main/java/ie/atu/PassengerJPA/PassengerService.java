package ie.atu.PassengerJPA;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class PassengerService {

    private final PassengerRepo passengerRepo;

    @GetMapping
    public List<Passenger> getPassengers(){

        return passengerRepo.findAll();
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Tom", "9485823241", "0872993884", 34);
        return myPassenger;
    }
}
