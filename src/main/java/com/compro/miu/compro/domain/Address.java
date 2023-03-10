package com.compro.miu.compro.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
public class Address {


    private String street;
    private String city;
    private String postCode;
    private String stateProvince;
    private String countryRegion;

}