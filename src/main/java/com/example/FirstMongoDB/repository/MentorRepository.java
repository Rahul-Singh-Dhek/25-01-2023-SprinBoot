package com.example.FirstMongoDB.repository;

import com.example.FirstMongoDB.module.MentorModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MentorRepository extends MongoRepository<MentorModel,String> {

    List<MentorModel> findByPhone(Integer phone);

    @Query("{name:?0}")
    List<MentorModel> findByName(String Name);
}
