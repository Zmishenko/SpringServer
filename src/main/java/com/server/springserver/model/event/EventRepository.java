package com.server.springserver.model.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EventRepository extends JpaRepository<Event, Integer> {

}
