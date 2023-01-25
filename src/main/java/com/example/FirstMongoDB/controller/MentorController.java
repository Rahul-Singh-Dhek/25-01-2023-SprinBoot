package com.example.FirstMongoDB.controller;

import com.example.FirstMongoDB.module.MentorModel;
import com.example.FirstMongoDB.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentor")
public class MentorController {
    @Autowired(required = true)
    private MentorService Mservice;

    @PostMapping("/addMentor")
    @ResponseStatus(HttpStatus.CREATED)
    public MentorModel createMentor(@RequestBody MentorModel Mentor){
        System.out.println(Mentor);
        return Mservice.addMentor(Mentor);
    }

    @GetMapping("/getMentors")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<MentorModel> getMentors(){
        System.out.println(Mservice.findAllMentors().toString());
        System.out.println("I am in");
//        return "I am in the Api.";
        return Mservice.findAllMentors();
    }

    @GetMapping("/getMentorByName/{name}")
    public List<MentorModel> getMentorByName(@PathVariable String name ){
        return Mservice.getMentorByName(name);
    }

    @GetMapping("/getMentorById/{id}")
    public MentorModel getMentorById(@PathVariable String id){
        return Mservice.getMentorByMentorId(id);
    }

    @GetMapping("/getMentorByPhone/{phone}")
    public List<MentorModel> getMentorByPhone(@PathVariable String phone){
        return Mservice.getMentorByPhone(phone);
    }

}
