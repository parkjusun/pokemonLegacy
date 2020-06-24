package com.jusun.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class RoadDTO {
	public String
    streetName,
    streetIntroduction,
    gunLength,
    demandTime,
    startingPointName,
    startingPointAddress,
    startingPointNumberAddress,
    endPointName,
    endPointNameAddress,
    endPointnumberAddress,
    phoneNumber,
    managementAgencyName,
    baseDate,
    latitude,
    longitude,
    providerName;
}
