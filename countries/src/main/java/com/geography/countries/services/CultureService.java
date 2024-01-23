package com.geography.countries.services;

import com.geography.countries.CountryCultureRequest;
import com.geography.countries.Culture;
import com.geography.countries.repository.CultureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CultureService {

    @Autowired
    private CultureRepository cultureRepository;

    public Culture getCulture(CountryCultureRequest countryRequest){
        Culture culture = cultureRepository.getCultureByOrigin(countryRequest.getName());
        return culture;
    }

}
