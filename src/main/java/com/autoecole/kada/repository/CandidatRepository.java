package com.autoecole.kada.repository;

import com.autoecole.kada.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "candidats", path = "candidats")
public interface CandidatRepository extends JpaRepository<Candidat, Integer> {

    List<Candidat> findByNom(@Param("nom") String nom);
}
