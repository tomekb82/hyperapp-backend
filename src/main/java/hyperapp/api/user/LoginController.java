package hyperapp.api.user;

import hyperapp.domain.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller("/login")
public class LoginController {

    @PostMapping
    @ResponseBody
    public User login(@RequestBody User user) {
        user.setToken(UUID.randomUUID().toString());
        return new User(user.getName(), "", user.getToken());
    }

}
