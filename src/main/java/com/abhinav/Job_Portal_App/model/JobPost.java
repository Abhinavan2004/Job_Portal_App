package com.abhinav.Job_Portal_App.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobPost{
int postid ;
String profile ;
String desciption;
int experience ;
String []tech_stack ;
}
