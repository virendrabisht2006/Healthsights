package com.qms.rest.model;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DimMemeber {

    private String memberId;

    private String memberSk;

    private String gender;

    private String dateOfBirthSk;

    private String dateOfDeathSk;

    private String name;

    private String address1;

    private String address2;

    private String city;

    private String state;

    private String zip;

    private String countryName;

    private String phone;

    private String emailAddress;

    private String maritalStatus;

    private String language;

    private String lngId;

    private String latId;

    private String ethnicity;

    private String imagePath;

    private String currentFlag;

    private Date recCreateDate;

    private String latestFlag;

    private String activeFlag;

    private Date ingestionDate;

    private String source;

    private String user;

    private String nextAppointmentDate;

    private String pcpName;

    private String mrn;

    private String compliant = "No";
}
