package pl.am.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.am.model.User;
import pl.am.repositories.UserRepository;

@RestController
public class IndexController {
    private final UserRepository userRepository;

    public IndexController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public Iterable<User> users() {
        return userRepository.findAll();
    }
}
