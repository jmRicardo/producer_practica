package com.jmr.producer.practica.producer_practica.repository;

import com.jmr.producer.practica.producer_practica.model.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface BaseRepository<T extends Instrument>
        extends JpaRepository<T, Long> {
}
