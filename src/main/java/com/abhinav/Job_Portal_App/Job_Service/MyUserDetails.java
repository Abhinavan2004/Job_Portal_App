package com.abhinav.Job_Portal_App.Job_Service;

import com.abhinav.Job_Portal_App.Job.Repository.UserRepository;
import com.abhinav.Job_Portal_App.Job_Model.PrincipalUser;
import com.abhinav.Job_Portal_App.Job_Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetails implements UserDetailsService {

    @Autowired
    private UserRepository repo ;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);

        if(user == null){
            System.out.println("NOT FOUND");
            throw new UsernameNotFoundException("NOT FOUND");
}
            return new PrincipalUser(user);
    }
}
