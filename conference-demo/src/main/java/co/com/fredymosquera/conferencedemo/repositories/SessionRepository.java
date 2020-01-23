package co.com.fredymosquera.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.fredymosquera.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
