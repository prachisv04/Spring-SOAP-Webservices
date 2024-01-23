package com.geography.countries.services;

import com.geography.countries.CountryGKRequest;
import com.geography.countries.GK;
import com.geography.countries.repository.GKRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GKService {

    @Autowired
    private GKRepository gkRepository;

    public GK getGK(CountryGKRequest countryRequest){

        GK gk = gkRepository.getGKByName(countryRequest.getName());
        return gk;
    }

    public String saveGK(GK gk) {
        gkRepository.save(gk);
        return "check database if data is saved";
    }
}
