package com.abhinav.Job_Portal_App.Job_Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobPost{
    @Id
private int postid ;
private String profile ;
private String description;
private int experience ;
private List<String>tech_stack ;
}
