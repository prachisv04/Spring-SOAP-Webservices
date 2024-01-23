package com.calculate.soap.calculator.service;

import com.calculate.soap.calculator.OperationRequest;
import com.calculate.soap.calculator.Result;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Result calculate(OperationRequest operationRequest)
    {
        Result response = new Result();
        String res = "";
        String operator = operationRequest.getOperator();

        switch (operator){
            case "+":
                    res = String.valueOf(operationRequest.getNumber1()+operationRequest.getNumber2());
                    break;
            default:
                res = "Look for upgraded version";
        }
        response.setResult(res);
        return response;
    }

}
