package com.zubairmuddasir12fyp.work_at_home;

public class ModelClass1 {
    String Budget;
    String Description;
    String Email;
    String Time;
    String Token;

    public ModelClass1() {
    }

    public ModelClass1(String description, String time, String budget, String email, String token) {
        this.Budget = budget;
        this.Description = description;
        this.Email = email;
        this.Time = time;
        this.Token = token;

    }

    public String getDescription() {
        return Description;
    }

    public String getTime() {
        return Time;
    }

    public String getBudget() {
        return Budget;
    }

    public String getEmail() {
        return Email;
    }

    public String getToken() {
        return Token;
    }

}
