package com.example.r2dbctest.repository;

import com.example.r2dbctest.model.Event;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R2dbcTestRepo extends ReactiveCrudRepository<Event, Long> {
}
