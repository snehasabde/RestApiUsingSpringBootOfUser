package in.sp.main.service;

import java.util.List;
import java.util.Optional;

import in.sp.main.entities.User;

public interface UserService {
 public User createUser(User user);
 public List<User> getAllUSers();
 public Optional<User>getUserDetails(int id);
 public User updateUserDetails(int id , User user);
 public void deleteUser(int id);
}
