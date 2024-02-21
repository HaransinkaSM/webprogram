package com.example.d5.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.d5.model.Train;
import com.example.d5.service.TrainService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class TrainController {
    @Autowired
    TrainService trainService;
    @PostMapping("/add")
    public Train postMethodName(@RequestBody Train p) {
        
        
        return trainService.addTrain(p);
    }
    @GetMapping("/get")
    public List<Train> getMethodName() {
        return trainService.getTrain();
    }
    @PutMapping("/path/{id}")
    public Train putMethodName(@PathVariable int id, @RequestBody Train p) {
        
        return trainService.UpdateTrain(id,p);
    }
    @DeleteMapping("/del/{id}")
    public String delMethod(@PathVariable int id)
    {
        return trainService.deleteTrain(id);
    }
    
    
}
