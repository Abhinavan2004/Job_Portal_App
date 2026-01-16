package com.abhinav.Job_Portal_App.Job_Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobPost{
private int postid ;
private String profile ;
private String description;
private int experience ;
private List<String>tech_stack ;
}
