package com.pluralsight.records;

public class RecordsMain {

    public static void main(String[] args) {
        Product p1 = new Product("Peanut Butter", 200, true);
        System.out.println(p1); // Product[name=Peanut Butter, price=200, inStock=true]

        Product p2 = new Product("Peanut Butter", 200, true);
        System.out.println(p1 == p2); // false ( p1 and p2 are 2 separate object instances)
        System.out.println(p1.equals(p2)); // true (p1 and p2 have the same values for their components)

        record DiscountedProduct(Product product, boolean discounted) {
        }
        // local records can be useful when you want to group some data into stream pipelines,
        // or when you quickly want to define a compound map key

        System.out.println(new DiscountedProduct(p1, true));
        // DiscountedProduct[product=Peanut Butter, discounted=true]
        // the custom toString impl is used
        // and because inStock is true, only the name is returned.
    }
}
