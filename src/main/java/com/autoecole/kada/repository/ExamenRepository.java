package com.autoecole.kada.repository;


import com.autoecole.kada.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {

}
