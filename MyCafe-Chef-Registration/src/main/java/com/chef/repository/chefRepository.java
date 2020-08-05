package com.chef.repository;

import com.chef.bo.Chef;
import com.chef.dao.ChefDao;
import io.vavr.NotImplementedError;
import io.vavr.control.Try;

public class chefRepository implements ChefDao {
    @Override
    public Try<Integer> createChef(Chef chef) {
        return Try.failure(new NotImplementedError());
    }

    @Override
    public Try<Integer> modifyChef(Chef chef) {
        return Try.failure(new NotImplementedError());
    }

    @Override
    public Try<Integer> deleteChef(Chef chef) {
        return Try.failure(new NotImplementedError());
    }
}
