package com.leesai.shop.service;

import com.leesai.shop.dao.UserDao;
import com.leesai.shop.model.User;
import com.leesai.shop.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService implements UserDao {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Optional<User> get(UUID iUuid) {
    return userRepository.findById(iUuid);
  }

  @Override
  public Optional<User> getByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  @Override
  public List<User> getAll() {
    return userRepository.findAll();
  }

  @Override
  public Optional<User> create(User object) {
    return Optional.ofNullable(userRepository.save(object));
  }

  @Override
  public Optional<User> update(User object) {
    return Optional.ofNullable(userRepository.save(object));
  }

  @Override
  public int delete(UUID iUuid) {
    userRepository.deleteById(iUuid);
    return 0;
  }
}
