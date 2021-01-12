package solid_lessons.srp;

public class UserController {

  private UserDataValidator userDataValidator;
  private UserRepository userRepository;

  public Boolean createNewUser(String name, String email, String password) {
    if (userDataValidator.validateUserData(name, email, password)) {
      User user = new User(name, email, password);
      return userRepository.save(user);
    } else {
      return false;
    }
  }

  public Boolean updateUser(String name, String email) {
    if (userDataValidator.validateUserData(name)) {
      User existingUser = userRepository.getUser(email);
      User updatedUser = new User(name, email, existingUser.getPassword());
      return userRepository.save(existingUser);
    }
    else return false;
  }

}
