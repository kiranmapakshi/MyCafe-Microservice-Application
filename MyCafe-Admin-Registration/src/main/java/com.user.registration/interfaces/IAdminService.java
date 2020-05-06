package com.user.registration.interfaces;

import com.user.registration.bo.Admin;
import org.springframework.http.ResponseEntity;

public interface IAdminService {
   ResponseEntity createAdmin(Admin admin);
   void modifyAdmin(Admin admin);
}
