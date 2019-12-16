package com.autoecole.kada.repository;

import com.autoecole.kada.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "candidats", path = "candidats")
//@CrossOrigin(origins = "http://localhost:4200")
//@Repository
public interface CandidatRepository extends JpaRepository<Candidat, Integer> {

    List<Candidat> findByNom(@Param("nom") String nom);
}
