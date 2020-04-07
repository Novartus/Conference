package com.novartus.conferencedemo.repositories;

import com.novartus.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository  extends  JpaRepository<Speaker, Long> {

}
