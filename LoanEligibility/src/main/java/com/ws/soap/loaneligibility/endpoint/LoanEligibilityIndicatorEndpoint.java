package com.ws.soap.loaneligibility.endpoint;

import com.ws.soap.loaneligibility.Acknowledgement;
import com.ws.soap.loaneligibility.CustomerRequest;
import com.ws.soap.loaneligibility.service.LoanEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LoanEligibilityIndicatorEndpoint {

    private static final String NAMESPACE_URI = "http://www.ws.com/soap/loaneligibility";

    @Autowired
    private LoanEligibilityService loanEligibility;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement findLoanEligibility(@RequestPayload CustomerRequest customerRequest){
        return loanEligibility.isEligibileForLoan(customerRequest);
    }

}
