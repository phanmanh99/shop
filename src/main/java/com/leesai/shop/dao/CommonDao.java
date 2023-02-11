package com.leesai.shop.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommonDao<T> {
  Optional<T> get(UUID iUuid);

  List<T> getAll();

  Optional<T> create(T object);

  Optional<T> update(T object);

  int delete(UUID iUuid);
}
