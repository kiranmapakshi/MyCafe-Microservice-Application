package com.user.registration.services;

import com.user.registration.bo.Admin;
import com.user.registration.dao.AdminDao;
import com.user.registration.interfaces.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public ResponseEntity createAdmin(Admin admin) {
       adminDao.createAdmin(admin);
        return new ResponseEntity<>("created", HttpStatus.CREATED);
    }

    @Override
    public void modifyAdmin(Admin admin) {
        adminDao.modifyAdmin(admin);
    }

}
