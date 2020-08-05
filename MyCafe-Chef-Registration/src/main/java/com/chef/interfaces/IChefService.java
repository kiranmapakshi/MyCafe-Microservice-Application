package com.chef.interfaces;

import com.chef.bo.Chef;

public interface IChefService {
    void createChef(Chef chef);
    void modifyChef(Chef chef);
    void deleteChef(Chef chef);
}
