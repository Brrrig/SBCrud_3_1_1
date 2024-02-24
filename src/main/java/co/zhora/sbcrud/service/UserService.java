package co.zhora.sbcrud.service;



import co.zhora.sbcrud.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    void remove(long id);

    void update(User user);

    Optional<User> userById(long id);
}
