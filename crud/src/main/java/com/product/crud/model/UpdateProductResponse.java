//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.20 at 09:48:04 PM IST 
//


package com.product.crud.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://www.product.com/crud/model}ServiceStatus"/&gt;
 *         &lt;element name="product" type="{http://www.product.com/crud/model}Product"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response",
    "product"
})
@XmlRootElement(name = "UpdateProductResponse")
public class UpdateProductResponse {

    @XmlElement(required = true)
    protected ServiceStatus response;
    @XmlElement(required = true)
    protected Product product;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setResponse(ServiceStatus value) {
        this.response = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

}
