package com.calculate.soap.calculator.endpoint;

import com.calculate.soap.calculator.OperationRequest;
import com.calculate.soap.calculator.Result;
import com.calculate.soap.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorIndicatorEndpoint {
    private static final String NAMESPACE_URI = "http://www.calculate.com/soap/calculator";

    @Autowired
    private CalculatorService calculatorService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "OperationRequest")
    @ResponsePayload
    public Result findLoanEligibility(@RequestPayload OperationRequest operationRequest){
        return calculatorService.calculate(operationRequest);
    }
}

