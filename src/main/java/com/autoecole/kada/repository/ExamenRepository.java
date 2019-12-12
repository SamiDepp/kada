package com.autoecole.kada.repository;


import com.autoecole.kada.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "examen", path = "examen")
public interface ExamenRepository extends JpaRepository<Examen, Integer> {
}
