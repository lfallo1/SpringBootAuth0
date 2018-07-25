package com.lancefallon.sprinbootreview.users;

import com.lancefallon.sprinbootreview.config.exceptions.CustomErrorMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(1, "lfallo1", "fallon.lance@gmail.com"));
        users.add(new User(2, "jdoe123", "jdoe123@gmail.com"));
        users.add(new User(3, "msmith1", "msmith@gmail.com"));
    }

    public List<User> findAll() {
        return this.users;
    }

    public User findByID(Integer id) throws UserNotFoundException {
        Optional<User> user = this.users.stream().filter(u -> id.equals(u.getId())).findFirst();
        if(!user.isPresent()){
            throw new UserNotFoundException(new CustomErrorMessage("UsersModule", "User not found"));
        }
        return user.get();
    }
}
