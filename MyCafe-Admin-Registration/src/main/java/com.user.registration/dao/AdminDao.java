package com.user.registration.dao;

import com.user.registration.bo.Admin;
import io.vavr.control.Try;

public interface AdminDao {
    Try<Integer> createAdmin(Admin admin);
    Try<Integer> modifyAdmin(Admin admin);
}
