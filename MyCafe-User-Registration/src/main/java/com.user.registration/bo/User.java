package com.user.registration.bo;

import lombok.Data;

/*This User Bean is used to register only Admins.
        Then Admins register chefs
                Chefs open Chef page using their user name by using MyCafe-Chef Service*/

@Data
public class User {
    public String userName;
    public String password;
    public String role;
}
