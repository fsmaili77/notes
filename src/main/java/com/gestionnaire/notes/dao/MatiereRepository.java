package com.gestionnaire.notes.dao;

import com.gestionnaire.notes.entities.Matiere;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {

    public List<Matiere> findByNomMatiere(String n);
    public Page<Matiere> findByNomMatiere(String n, Pageable pageable);

    @Query("select m from Matiere m where m.nomMatiere like :x")
    public Page<Matiere> chercherMatieres(@Param("x") String mc, Pageable pageable);

    @Query("select m from Matiere m where m.idMatiere > :x and m.idMatiere < :y")
    public List<Matiere> chercherMatieres(@Param("x") Long xLong, @Param("y") Long yLong);
}
