package com.autoecole.kada.repository;

import com.autoecole.kada.entity.Candidat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat, Integer> {

    List<Candidat> findByNom(@Param("nom") String nom);

    @Query("select e.candidats from Examen as e left join  e.candidats as c where e.id = :id")
    List<Candidat> findByExamen(@PathVariable Integer id);


}
