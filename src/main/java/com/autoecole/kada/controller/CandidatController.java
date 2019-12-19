//package com.autoecole.kada.controller;
//
//import com.autoecole.kada.entity.Candidat;
//import com.autoecole.kada.repository.CandidatRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class CandidatController {
//    @Autowired
//    private CandidatRepository candidatRepository;
//
//    @GetMapping("/candidats")
//    public Object findAll(){
//        return candidatRepository.findAll();
//    }
//    @PostMapping("/candidats")
//    public Object save(@RequestBody Candidat candidat){
//        return candidatRepository.save(candidat);
//    }
//    @PutMapping("/candidats")
//    public Object update(@RequestBody Candidat candidat){
//        return candidatRepository.save(candidat);
//    }
//    @GetMapping("/candidats/{id}")
//    public Object getOne(@PathVariable Integer id){
//        return candidatRepository.findById(id);
//    }
//
//    @GetMapping("/examens/{id}/candidats")
//    public Object findAll(@PathVariable Integer id)
//    {
//        return candidatRepository.findByExamen(id);
//    }
//
//}
