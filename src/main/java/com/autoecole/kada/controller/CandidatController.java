package com.autoecole.kada.controller;

import com.autoecole.kada.repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatController {
    @Autowired
    private CandidatRepository candidatRepository;

//    @GetMapping("candidats")
//    public Object findAll()
//    {
//        return candidatRepository.findAll();
//    }

}
