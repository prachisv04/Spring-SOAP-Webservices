package com.product.crud.service;

import com.product.crud.entity.ProductEntity;
import com.product.crud.model.*;
import com.product.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public GetProductResponse getProduct(GetProductRequest productRequest) {
        GetProductResponse productResponse = new GetProductResponse();
        ProductEntity p =  productRepository.findProductById(productRequest.getId());
        if(!p.getName().isEmpty()){
            Product prd = new Product();
            prd.setId(p.getId());
            prd.setCategory(p.getCategory());
            prd.setName(p.getName());
            prd.setPrice(p.getPrice());
            productResponse.setProduct(prd);
            ServiceStatus status = new ServiceStatus();
            status.setStatus("200");
            status.setMessage("Data Found");
            productResponse.setResponse(status);
        }
        else{
            productResponse.setProduct(null);
            ServiceStatus status = new ServiceStatus();
            status.setStatus("403");
            status.setMessage("Data Not Found");
            productResponse.setResponse(status);
        }
        return productResponse;
    }

    public SaveProductResponse saveProduct(SaveProductRequest productRequest) {
        ProductEntity p = new ProductEntity();
        p.setId(productRequest.getProduct().getId());
        p.setCategory(productRequest.getProduct().getCategory());
        p.setName(productRequest.getProduct().getName());
        p.setPrice(productRequest.getProduct().getPrice());
        productRepository.save(p);
        SaveProductResponse response = new SaveProductResponse();
        ServiceStatus s = new
                ServiceStatus();
        s.setStatus("200 OK");
        s.setMessage("Product saved into database");
        response.setResponse(s);
        return response;
    }
}
