package com.user.registration.repository;

import com.user.registration.bo.Admin;
import com.user.registration.dao.AdminDao;
import io.vavr.NotImplementedError;
import io.vavr.control.Try;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AdminRepository implements AdminDao {
    private final String SQL_INSERT = "INSERT INTO ADMIN (admin_id, admin_name, admin_password) VALUES" +
            "(?, ?, ?)";
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public AdminRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public Try<Integer> createAdmin(Admin admin) {
        return Try.of(() -> jdbcTemplate.update(SQL_INSERT,admin.getAdminId(), admin.getAdminName(), admin.getPassword()));
    }

    @Override
    @Transactional
    public Try<Integer> modifyAdmin(Admin admin) {
        return Try.failure(new NotImplementedError());
    }
}
