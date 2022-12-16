package ie.atu.PassengerJPA;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;
    @GetMapping
    public List<Passenger> getPassengers(){
        return passengerRepo.findAll();
    }

    public Passenger getPassenger(String id) {
        return passengerRepo.getPassenger(id);
    }

    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }


    /*public void List<Passenger> findPassengerByAgeRange(int age1, int age2){
        return passengerRepo.findPassengerByAge(age1, age2);
    }

    public Passenger findPassengerByName(String name) {
        return passengerRepo.findPassengerByName(name);
    }*/

    public void deletePassenger(Long count) {
        passengerRepo.deleteById(count);
    }
}
