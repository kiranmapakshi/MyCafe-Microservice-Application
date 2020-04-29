package com.chef.dao;

import com.chef.bo.Chef;
import io.vavr.control.Try;

public interface ChefDao {
    Try<Integer> createChef(Chef chef);
    Try<Integer> modifyChef(Chef chef);
    Try<Integer> deleteChef(Chef chef);
}
