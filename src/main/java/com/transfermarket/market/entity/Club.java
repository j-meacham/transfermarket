package com.transfermarket.market.entity;

import jakarta.persistence.*;

@Entity
@Table(name="club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="clubId")
    private int clubId;

    @Column(name="clubName")
    private String clubName;

    @Column(name="budget")
    private long budget;

    @Column(name="pullingPower")
    private int pullingPower;

    // No-argument constructor
    public Club() {}

    // Constructor
    public Club(String clubName, long budget, int pullingPower) {
        this.clubName = clubName;
        this.budget = budget;
        this.pullingPower = pullingPower;
    }

    // Getters and Setters
    public int getClubId() {
        return clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public int getPullingPower() {
        return pullingPower;
    }

    public void setPullingPower(int pullingPower) {
        this.pullingPower = pullingPower;
    }

    // toString method
    @Override
    public String toString() {
        return "Club{" +
                "clubId=" + clubId +
                ", clubName='" + clubName + '\'' +
                ", budget=" + budget +
                ", pullingPower=" + pullingPower +
                '}';
    }
}
