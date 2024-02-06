package com.crudTestDemo.controlers;

import com.crudTestDemo.entitis.User;
import com.crudTestDemo.servicis.UserServicis;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/User")
public class UserControler {

    @Autowired
    private UserServicis userServicis;


    @PostMapping("/insert")
    protected User userCreate (@RequestBody User user){
        userServicis.createUser(user);
        return user;
    }

    @PutMapping("/activation")
    public void setUserActivae(@PathVariable Long id, @PathVariable boolean activated){
        userServicis.setUserActivationStatus(id, activated);
    }

    @PatchMapping("/update/{id}")
    protected User patchPerson(@PathVariable Long id, @RequestBody User user){

        return userServicis.patchPerson(id, user);
    }

    @PutMapping("/put/{id}")
    protected User putUser(@PathVariable Long id, @RequestBody User user){
        userServicis.putSingleUser(id, user);
        return user;
    }


    @GetMapping("/list")
    protected List<User> personList(){return userServicis.userList(); }

    @GetMapping("/view/{id}")
    protected Optional<User> getSinglrPerson(@PathVariable Long id) throws Exception {
        return userServicis.getSingleUser(id);
    }

    @DeleteMapping("/delite/{id}")
    protected String delateUser (@PathVariable Long id, HttpServletResponse response){


        userServicis.delateUser(id);
        response.setStatus(HttpServletResponse.SC_OK);
        return "cancelato " + id + " " + response;
    }

}
