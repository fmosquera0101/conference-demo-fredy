package co.com.fredymosquera.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.fredymosquera.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
