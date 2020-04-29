package com.user.registration.repository;

import com.user.registration.bo.Admin;
import com.user.registration.dao.AdminDao;
import io.vavr.NotImplementedError;
import io.vavr.control.Try;

public class AdminRepository implements AdminDao {
    @Override
    public Try<Integer> createAdmin(Admin admin) {
        return Try.failure(new NotImplementedError());
    }

    @Override
    public Try<Integer> modifyAdmin(Admin admin) {
        return Try.failure(new NotImplementedError());
    }
}
