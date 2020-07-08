package pl.am.configuration;

import org.springframework.stereotype.Component;
import pl.am.model.User;
import pl.am.repositories.UserRepository;

import javax.annotation.PostConstruct;

@Component
public class DbInitalizer {
    private final UserRepository userRepository;

    public DbInitalizer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    private void initialize() {
        for(int i = 0;i<10;i++) {
            userRepository.save(createUser("Jan" + i, "Kowalski" + i));
        }
    }

    private User createUser(String firstName, String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }
}
