package westcoastcompassdealer.demo.service;

import org.springframework.stereotype.Service;
import westcoastcompassdealer.demo.domain.models.service.UserServiceModel;


public interface UserService{

    UserServiceModel findByUsernameAndPassword(String username, String password);

    void register(UserServiceModel userServiceModel);
}
