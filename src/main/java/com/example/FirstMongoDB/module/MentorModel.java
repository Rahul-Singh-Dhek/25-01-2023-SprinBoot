package com.example.FirstMongoDB.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Mentor")
public class MentorModel {

    @Id
    private String mentorId;

    private String name;
    private String subject;
    private String phone;
}
