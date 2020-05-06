package com.user.registration.controller;

import com.user.registration.bo.Admin;
import com.user.registration.interfaces.IAdminService;
import io.vavr.NotImplementedError;
import io.vavr.control.Try;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@RequestMapping(path = "/AdminRegistration")
public class AdminRegistrationController {
    @Autowired
    public final IAdminService adminService;

    public AdminRegistrationController(IAdminService adminService) {
        this.adminService = adminService;
    }
    @GetMapping(path = "/ping")
    public ResponseEntity<String> ping(){
        return  new ResponseEntity<>("pong", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createAdmin(@RequestBody Admin admin){
        return  adminService.createAdmin(admin);
    }

    @PatchMapping
    public Try<ResponseEntity> modifyAdmin(@RequestBody Admin admin){
        return Try.failure(new NotImplementedError());
    }

    @GetMapping(path = "/{adminName}")
    public Try<ResponseEntity> adminAuthorization(@PathVariable("adminName") String adminName, @RequestBody String password){
        return Try.failure((new NotImplementedError()));
    }

}
