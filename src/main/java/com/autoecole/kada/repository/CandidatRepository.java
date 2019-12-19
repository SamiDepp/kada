package com.autoecole.kada.repository;

import com.autoecole.kada.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "candidats", path = "candidats")
public interface CandidatRepository extends JpaRepository<Candidat, Integer> {

    List<Candidat> findByNom(@Param("nom") String nom);

    @GetMapping("examens/{id}/candidats")
    @Query("select e.candidats from Examen as e left join  e.candidats as c where e.id = :id")
    List<Candidat> findByExamen(@PathVariable Integer id);

//    When a client needs to replace an existing Resource entirely, they can use PUT. When they're doing a partial update, they can use HTTP PATCH.



}
