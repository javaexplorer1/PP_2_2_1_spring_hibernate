package hiber.service;

import hiber.model.User;

import javax.persistence.Column;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    List<User> findByModelAndSeries(String model, int series);
}
