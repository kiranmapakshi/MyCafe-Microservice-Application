package com.user.registration.controller;

import com.user.registration.bo.Admin;
import com.user.registration.interfaces.IAdminService;
import io.vavr.NotImplementedError;
import io.vavr.control.Try;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@RequestMapping(path = "/AdminRegistration")
public class AdminRegistrationController {
   // static { System.setProperty("logback.configurationFile", "src/main/resources/logback.xml");}
    private static final Logger logger = LoggerFactory.getLogger(AdminRegistrationController.class);
    org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AdminRegistrationController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public final IAdminService adminService;

    public AdminRegistrationController(IAdminService adminService) {
        this.adminService = adminService;
    }
    @GetMapping(path = "/ping")
    public ResponseEntity<String> ping(){
        logger.info("Hello World");
        log.info("Hello Worls log4j");
        String obj = restTemplate.getForObject("http://localhost:9191/ChefRegistration", String.class);
        logger.info("Hello World");
        logger.debug("Hello World");
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
