package com.example.orders.dto;

import jakarta.validation.constraints.*;

public class OrderRequestDTO {
    @NotNull(message = "Name is required")
    @Size(min = 3)
    private String customerName;
    @NotNull(message="Email is required")
    @Email(message = "Enter Valid email")
    private String email;
    @NotNull(message = "Product is Required")
    private String productName;
    @NotNull(message = "Quantity is required")
    @Min(value = 1)
    private Integer quantity;
    @NotNull(message = "Price is required")
    @Min(value = 1)
    private Double pricePerUnit;

    public OrderRequestDTO(){}

    public OrderRequestDTO(String customerName, String email, String productName, Integer quantity, Double pricePerUnit) {
        this.customerName = customerName;
        this.email = email;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
