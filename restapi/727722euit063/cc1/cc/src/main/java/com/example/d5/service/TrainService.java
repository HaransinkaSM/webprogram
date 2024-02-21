package com.example.d5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d5.model.Train;
import com.example.d5.repository.TrainRepo;

@Service
public class TrainService {
    @Autowired
    TrainRepo trainRepo;
    @SuppressWarnings("null")
    public Train addTrain(Train p){
        return trainRepo.save(p);
    }
    public List<Train> getTrain()
    {
        return trainRepo.findAll();
    }
    public Optional<Train>getTrainById(int id)
    {
        return trainRepo.findById(id);
    }
    public Train UpdateTrain(int id,Train p)
    {
        Train obj=trainRepo.findById(id).orElse(null);
        if(obj!=null)
        {
            obj.setTrainId(p.getTrainId());
            obj.setName(p.getName());
            obj.setFrom(p.getFrom());
            obj.setTo(p.getTo());    
            trainRepo.saveAndFlush(obj);
            return obj;
        }
        else
        return null;
    }
    public String deleteTrain(int id)
    {
        trainRepo.deleteById(id);
        return("Traveller removed");
    }

}
