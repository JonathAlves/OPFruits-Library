package com.jonathanguerra.opfruitslibrary.repositorios;

import com.jonathanguerra.opfruitslibrary.entidades.AkumaNoMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AkumaNoMiRepositorio extends JpaRepository<AkumaNoMi, Long> {
}
