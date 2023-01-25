package com.example.FirstMongoDB.service;

import com.example.FirstMongoDB.module.MentorModel;
import com.example.FirstMongoDB.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MentorService {
    @Autowired(required = true)
    private MentorRepository repository;

    //Create
    public MentorModel addMentor(MentorModel Mentor){
//        Mentor.setMentorId();
        return repository.save(Mentor);
    }

    //Read

    public List<MentorModel> findAllMentors(){
        return repository.findAll();
    }

    public MentorModel getMentorByMentorId(String MentorId){
        return repository.findById(MentorId).get();
    }

    public List<MentorModel> getMentorByPhone(String Phone){
        return repository.findByPhone(Phone);
    }

    public List<MentorModel> getMentorByName(String Name){

        return repository.findByName(Name);
    }
}
