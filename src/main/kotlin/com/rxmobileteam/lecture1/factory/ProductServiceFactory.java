package com.rxmobileteam.lecture1.factory;

import com.rxmobileteam.lecture1.service.ProductService;
import com.rxmobileteam.utils.ExerciseNotCompletedException;

/**
 * {@link ProductServiceFactory} is used to create an instance of {@link ProductService}
 * <p>
 * TODO: 1. Implement method {@link ProductServiceFactory#createProductService()}
 */
public class ProductServiceFactory {

    /**
     * Create a new instance of {@link ProductService}
     *
     * @return ProductService
     */
    private static ProductService productService;
    public ProductService createProductService() {
        if (productService == null) {
            productService = new ProductService();
        }
        return productService;
    }
}
