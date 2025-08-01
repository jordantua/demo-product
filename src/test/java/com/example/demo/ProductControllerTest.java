package com.example.demo;

import com.example.demo.controller.ProductController;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProductControllerTest {

    @Test
    void testGetAllProducts() {
        ProductService service = mock(ProductService.class);
        ProductController controller = new ProductController(service);

        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(BigDecimal.valueOf(100));

        when(service.getAllProducts()).thenReturn(List.of(product));

        List<Product> result = controller.getAll();

        assertEquals(1, result.size());
        assertEquals("Test Product", result.get(0).getName());
    }
}
