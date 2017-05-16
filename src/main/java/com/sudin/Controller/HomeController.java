package com.sudin.Controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by ranji on 5/16/2017.
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    /**
     * @AuthenticationPrincipal is used to check the username and password
     * UserDetails comes from the spring core
     * @param userDetails
     * @return
     */
    @RequestMapping(value = "/hello")
    public String home(@AuthenticationPrincipal final UserDetails userDetails){
        String username=userDetails.getUsername();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        authorities.stream().forEach(System.out::println);

        return "Hello Sudin Ranjitkar";
    }
}
