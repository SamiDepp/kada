package com.autoecole.kada.repository;

import com.autoecole.kada.entity.Condidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "condidat", path = "condidat")
public interface CandidatRepository extends JpaRepository<Condidat, Integer> {
}
