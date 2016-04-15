package com.swen.data;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by swen on 4/13/16.
 */
public class ProfileForm {

    @Size(min = 2, message = "Please type in your twitter name")
    private String twitterHandler;

    @Email
    @NotEmpty(message = "Please type in your email")
    private String email;

    @NotEmpty(message = "Please type in your birth date")
    private String birthDate;

    @NotEmpty
    private List<String> tastes = new ArrayList<String>();

    public String getTwitterHandler() {
        return twitterHandler;
    }

    public void setTwitterHandler(String twitterHandler) {
        this.twitterHandler = twitterHandler;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public List<String> getTastes() {
        return tastes;
    }

    public void setTastes(List<String> tastes) {
        this.tastes = tastes;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ProfileForm{" +
                "twitterHandler='" + twitterHandler + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", tastes=" + tastes +
                '}';
    }
}
