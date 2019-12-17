//package com.autoecole.kada.controller;
//
//import com.autoecole.kada.repository.CandidatRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class CandidatController {
//    @Autowired
//    private CandidatRepository candidatRepository;
//
//    @GetMapping("/examens/{id}/candidats")
//    public Object findAll(@PathVariable Integer id)
//    {
//        return candidatRepository.findByExamens(id);
//    }
//
//}
