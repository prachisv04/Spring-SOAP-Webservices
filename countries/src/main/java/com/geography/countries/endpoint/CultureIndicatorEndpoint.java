package com.geography.countries.endpoint;

import com.geography.countries.CountryCultureRequest;
import com.geography.countries.CountryGKRequest;
import com.geography.countries.Culture;
import com.geography.countries.services.CultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CultureIndicatorEndpoint {

    public static final String NAMESPACE  = "http://www.geography.com/countries";

    @Autowired
    private CultureService cultureService;

    @PayloadRoot(localPart = "CountryCultureRequest" , namespace = NAMESPACE)
    @ResponsePayload
    public Culture getCulture(@RequestPayload CountryCultureRequest countryRequest){
        return cultureService.getCulture(countryRequest);
    }


}
