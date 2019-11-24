package westcoastcompassdealer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import westcoastcompassdealer.demo.domain.Car;
import westcoastcompassdealer.demo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    User findByUsernameAndPassword(String username,String password);
}
