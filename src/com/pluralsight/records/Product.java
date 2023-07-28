package com.pluralsight.records;

// it will not compile: no extend clause allowed for record
// but a record can implement interfaces
//public record Product(String name, int price, boolean inStock)  extends Object{
public record Product(String name, int price, boolean inStock) {

    // you cannot add a field to the record
    // it will not compile: "instance field is not allowed in record"
    // private boolean inStock;

    // static members are ok, but you cannot define any stance fields on the record
    // because that would mean that not all of the status of records is represented by the components.

    // the name, price and inStock parameters of the constructor are implicitly there
    // we don't have to write them down if we don't want to.
    // because we're using a compact construction,
    // the compiler inserts the assignments to the fields of the record automatically as the last statement.
    public Product {
        if (price < 0) {
            // throw new IllegalArgumentException();
            price = 100;
        }
    }

    @Override
    public String toString() {
        if (inStock) {
            return name;
        }
        return "Out of stock";
    }
}
