package com.autoecole.kada.repository;

import com.autoecole.kada.entity.Candidat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "candidats", path = "candidats")
//@Repository
public interface CandidatRepository extends JpaRepository<Candidat, Integer> {

    List<Candidat> findByNom(@Param("nom") String nom);
    @GetMapping("examens/{id}/candidats")
    @Query("select e.candidats from Examen as e left join  e.candidats as c where e.id = :id")
    List<Candidat> findByExamen(@PathVariable Integer id);
}
