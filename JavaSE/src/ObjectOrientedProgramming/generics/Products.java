package ObjectOrientedProgramming.generics;

public class Products<T, U> {
    T item;
    U price;

    public Products(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrices(){
        return this.price;
    }

}
