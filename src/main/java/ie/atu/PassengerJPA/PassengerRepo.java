package ie.atu.PassengerJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
/*    Passenger findPassengerByName(String name);*/

    @Query
    Passenger getPassenger(String id);
}
