package com.sekai.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("oneSchool")
public class School {

    @Value("北京大学师范")
    String schoolName;

    @Value("北京")
    String address;

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
