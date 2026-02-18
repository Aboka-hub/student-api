package com.bcnd.studentback.Service;

import com.bcnd.studentback.Dto.UserCreateDto;
import com.bcnd.studentback.Dto.UserResponseDto;
import com.bcnd.studentback.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    Map<Long, User> users = new HashMap<>();
    private AtomicLong idGenerator = new AtomicLong();

    public UserResponseDto userCreate(UserCreateDto dto) {
        Long id = idGenerator.incrementAndGet();

        User user = new User(
                id,
                dto.getName(),
                dto.getEmail()
        );

        users.put(id, user);

        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    public User getUser(long id) {
        User user = users.get(id);

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        return user;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public UserResponseDto updateUser(long id, UserCreateDto dto) {
        User user = users.get(id);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    public void deleteUser(long id) {
        if(!users.containsKey(id)) {
            throw new RuntimeException("User not found");
        }

        users.remove(id);
    }

}
