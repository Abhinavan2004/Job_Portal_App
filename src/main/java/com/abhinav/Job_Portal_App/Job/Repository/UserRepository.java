package com.abhinav.Job_Portal_App.Job.Repository;

import com.abhinav.Job_Portal_App.Job_Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username) ;

}
