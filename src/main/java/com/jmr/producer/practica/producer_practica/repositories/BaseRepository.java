package com.jmr.producer.practica.producer_practica.repositories;

import com.jmr.producer.practica.producer_practica.models.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface BaseRepository<T extends Instrument>
        extends JpaRepository<T, Long> {
}
