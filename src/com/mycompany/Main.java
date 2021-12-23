package com.mycompany;

import com.mycompany.model.Product;

public class Main {
    public static void main(String... args){
        System.out.println("Hello World");

        Product product = new Product("Bose");

        System.out.println(product.getName());
    }


}
