package com.autoecole.kada.repository;


import com.autoecole.kada.entity.Candidat;
import com.autoecole.kada.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;


@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {


//    @Query("select e.candidats from Examen as e left join  e.candidats as c where e.id = ?1")

}
