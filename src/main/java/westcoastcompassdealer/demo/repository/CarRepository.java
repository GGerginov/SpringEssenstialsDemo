package westcoastcompassdealer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import westcoastcompassdealer.demo.domain.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

    Car getByBrand(String brand);

    @Query("SELECT u FROM User u")
    List<Car> getAll();
}
