package ie.atu.PassengerJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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


    @PostMapping("")
    public void savePassenger(@RequestBody Passenger passenger){
        myService.savePassenger(passenger);
    }

    @GetMapping("/name/{name}")
    public Passenger getPassengerName(@PathVariable("name") String name){
        return myService.findPassengerByName(name);
    }

    @DeleteMapping("/delete/{count}")
    public void deletePassenger(@PathVariable("count") Long count){
        myService.deletePassenger(count);
    }

    @GetMapping("/age")
    public List<Passenger> getPassengerByAge(@RequestParam(name = "age_start") int age1, @RequestParam(name = "age_end") int age2){
        return myService.findPassengerByAgeRange(age1, age2);
    }
}
