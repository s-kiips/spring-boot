package com.sudin.Controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by ranji on 5/16/2017.
 */
@RestController
public class HomeController {

    @RequestMapping(value = {"/","/hello"},method = RequestMethod.GET)
    public ModelAndView hello(){
       ModelAndView modelAndView=new ModelAndView();
       modelAndView.setViewName("hello");
       return  modelAndView;
    }
}
