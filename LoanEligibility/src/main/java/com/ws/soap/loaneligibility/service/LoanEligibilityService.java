package com.ws.soap.loaneligibility.service;

import com.ws.soap.loaneligibility.Acknowledgement;
import com.ws.soap.loaneligibility.CustomerRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanEligibilityService {

    public Acknowledgement isEligibileForLoan(CustomerRequest customerRequest){
        Acknowledgement acknowledgement = new Acknowledgement();
        acknowledgement.setIsEligible(true);
        acknowledgement.setApprovedAmount(500000);
        List<String> mismatchCriteria = acknowledgement.getCriteriaMismatched();
        mismatchCriteria.add("no issues just testing");
        return acknowledgement;
    }

}
