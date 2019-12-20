//package com.autoecole.kada.controller;
//
//import com.autoecole.kada.entity.Examen;
//import com.autoecole.kada.repository.ExamenRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ExamenController {
//    @Autowired
//    private ExamenRepository examenRepository;
//
//
//    @GetMapping("/examens")
//    public Object findAll(){
//        return examenRepository.findAll();
//    }
//    @PostMapping("/examens")
//    public Object save(@RequestBody Examen examen){
//        return examenRepository.save(examen);
//    }
//}
