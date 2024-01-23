package com.geography.countries.endpoint;

import com.geography.countries.CountryGKRequest;
import com.geography.countries.GK;
import com.geography.countries.services.GKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GKIndicatorEndpoint {

    public static final String NAMESPACE  = "http://www.geography.com/countries";

    @Autowired
    private GKService countryService;

    @PayloadRoot(localPart = "CountryGKRequest" , namespace = NAMESPACE)
    @ResponsePayload
    public GK getGK(@RequestPayload CountryGKRequest countryRequest){
        return countryService.getGK(countryRequest);
    }




}
