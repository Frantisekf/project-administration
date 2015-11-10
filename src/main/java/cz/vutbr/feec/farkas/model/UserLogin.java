package cz.vutbr.feec.farkas.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by frantisek on 8.11.15.
 */
public class UserLogin {
    //git test
    @NotEmpty
    @Size(min = 4, max = 20)
    private String userName;

    @NotEmpty
    @Size(min = 4, max = 8)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

