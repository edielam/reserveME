package com.flight.flightservices.entities;

import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String flightNumber;
    private String operatingAirlines;
    private String depatureCity;
    private String arrivalCity;
    private Date dateOfDepature;
    private Timestamp estimatedDepatureTime;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getOperatingAirlines() {
        return operatingAirlines;
    }
    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }
    public String getDepatureCity() {
        return depatureCity;
    }
    public void setDepatureCity(String depatureCity) {
        this.depatureCity = depatureCity;
    }
    public String getArrivalCity() {
        return arrivalCity;
    }
    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
    public Date getDateOfDepature() {
        return dateOfDepature;
    }
    public void setDateOfDepature(Date dateOfDepature) {
        this.dateOfDepature = dateOfDepature;
    }
    public Timestamp getEstimatedDepatureTime() {
        return estimatedDepatureTime;
    }
    public void setEstimatedDepatureTime(Timestamp estimatedDepatureTime) {
        this.estimatedDepatureTime = estimatedDepatureTime;
    }

    
}
