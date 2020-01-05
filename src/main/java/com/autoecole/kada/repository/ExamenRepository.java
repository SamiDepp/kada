package com.autoecole.kada.repository;


import com.autoecole.kada.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestResource(collectionResourceRel = "examens", path = "examens")
public interface ExamenRepository extends JpaRepository<Examen, Integer> {

}
