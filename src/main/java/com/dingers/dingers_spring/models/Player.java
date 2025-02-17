package com.dingers.dingers_spring.models;

public class Player {
    private int mlbId;
    private String firstName;
    private String lastName;
    private String teamName;
    private String teamLocation;

    public Player(int mlbId, String firstName, String lastName, String teamName, String teamLocation){
        this.mlbId = mlbId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
        this.teamLocation = teamLocation;
    }

    public int getMlbId() {
        return mlbId;
    }

    public void setMlbId(int mlbId) {
        this.mlbId = mlbId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamLocation() {
        return teamLocation;
    }

    public void setTeamLocation(String teamLocation) {
        this.teamLocation = teamLocation;
    }
}
