package com.leesai.shop.controller.api;

import com.leesai.shop.model.User;
import com.leesai.shop.service.UserService;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping()
  public ResponseEntity<?> getAll() {
    return ResponseEntity.ok().body(userService.getAll());
  }

  // @GetMapping()
  // public ResponseEntity<?> get(@PathVariable String email) {
  //   return ResponseEntity.ok().body(userService.getByEmail(email));
  // }

  // @GetMapping("")
  // public ResponseEntity<?> search(
  //     @RequestParam Optional<UUID> id, @RequestParam Optional<String> email) {
  //   HashMap<String, String> text = new HashMap<>();
  //   text.put("id", id.toString());
  //   text.put("email", email.toString());
  //   return ResponseEntity.ok().body(text);
  // }

  @PostMapping()
  public ResponseEntity<Optional<User>> create(@RequestBody User user) {
    return ResponseEntity.ok().body(userService.create(user));
  }

  @PutMapping()
  public Optional<User> update(@RequestBody User user) {
    return userService.update(user);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Integer> delete(@PathVariable UUID id) {
    return ResponseEntity.notFound().build();
  }
}
