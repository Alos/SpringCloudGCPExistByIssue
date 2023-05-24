package com.example.existissue;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface AnimalRepository extends DatastoreRepository<Animal, Long> {
  boolean existsByName(String name);
}
