package tech.portfolio.portfolio.security.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import tech.portfolio.portfolio.security.model.User;
import tech.portfolio.portfolio.security.repo.UserRepository;

@Service
@Transactional
@ComponentScan
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Optional<User> getByNameUser(String nameUser) {
        return userRepository.findByNameUser(nameUser);
    }

    public boolean existsByNameUser(String nameUser) {
        return userRepository.existsByNameUser(nameUser);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
