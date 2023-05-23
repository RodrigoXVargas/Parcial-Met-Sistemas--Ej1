package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.Base;
import com.example.ejercicio1.services.ServiceBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


public abstract class BaseControllerImpl<E extends Base,S extends ServiceBaseImpl<E, Long>> implements BaseController<E, Long>{

    @Autowired
    protected S service;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveOne(@RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.saveOne(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateOne(@PathVariable Long id, @RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.updateOne(entity, id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.deleteById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }
}
