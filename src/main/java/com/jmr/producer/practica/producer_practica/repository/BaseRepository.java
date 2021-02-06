package com.jmr.producer.practica.producer_practica.repository;

import com.jmr.producer.practica.producer_practica.model.Instrument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends Instrument>
        extends CrudRepository<T, Long> {
}
