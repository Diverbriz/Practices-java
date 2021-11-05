package com.company;

public class Ball {
    private String company;
    private float pumping;

    public Ball(String n, float p) {
        company= n;
        pumping = p;
        if (pumping > 100) {
            pumping = 100;
        }
        if (pumping < 0) {
            pumping = 0;
        }
    }
    public Ball(String n) {
        company = n;
        pumping = 0;
    }
    public Ball(){
        company = "Nameless";
        pumping = 0;
    }
    public void setCompany(String n) {
        this.company = n;
    }
    public void pumpTheBall(float p) {
        this.pumping += p;
        if (this.pumping > 100) {
            pumping = 100;
        }
    }
    public void pumpOutTheBall(float p) {
        this.pumping -= p;
        if (this.pumping < 0) {
            pumping = 0;
        }
    }
    public String getCompany() {
        return this.company;
    }
    public float getPumping() {
        return this.pumping;
    }
    public String toString() {
        return ("This is a ball from " + this.company + " club, pumped by " + this.pumping + "%");
    }
    public void kickStrength(float kick) {
        float kickStrength = this.pumping * kick;
        System.out.println("This ball from " + this.company + " club were flew away by the kick with " + kickStrength +
                " strength");
    }
}