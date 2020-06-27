package com.zubairmuddasir12fyp.work_at_home;

public class ModelClass {
    String Description;
    String Time;
    String Budget;
    String Category;
    String Token;

    public ModelClass() {
    }

    public ModelClass(String description, String time, String budget, String category, String token) {
        this.Description = description;
        this.Time = time;
        this.Budget = budget;
        this.Category = category;
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

    public String getCategory() {
        return Category;
    }

    public String getToken() {
        return Token;
    }
}
