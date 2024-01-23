package com.product.crud.endpoint;

import com.product.crud.model.GetProductRequest;
import com.product.crud.model.GetProductResponse;
import com.product.crud.model.SaveProductRequest;
import com.product.crud.model.SaveProductResponse;
import com.product.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProductIndicatorEndpoint {

    public static final String NAMESPACE = "http://www.product.com/crud/model";

    @Autowired
    private ProductService productService;

    @PayloadRoot(namespace = NAMESPACE , localPart = "GetProductRequest")
    @ResponsePayload
    public GetProductResponse getProduct(@RequestPayload GetProductRequest productRequest){
        return productService.getProduct(productRequest);
    }

    @PayloadRoot(namespace = NAMESPACE , localPart = "SaveProductRequest")
    @ResponsePayload
    public SaveProductResponse saveProduct(@RequestPayload SaveProductRequest productRequest){
        return productService.saveProduct(productRequest);
    }


}
