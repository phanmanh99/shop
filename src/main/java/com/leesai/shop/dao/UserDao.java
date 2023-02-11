package com.leesai.shop.dao;

import com.leesai.shop.model.User;
import java.util.Optional;

public interface UserDao extends CommonDao<User> {
  Optional<User> getByEmail(String email);
}
