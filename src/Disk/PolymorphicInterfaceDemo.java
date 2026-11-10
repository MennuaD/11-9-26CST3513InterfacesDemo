package Disk;

import java.text.*;
        //Mennua Netri Herta Davis

public class PolymorphicInterfaceDemo {
    public static void main(String[] args){
        CompactDisc cd = new CompactDisc("Greatest Hits", "Joe Looney Band", 18.95);
        DvdMovie movie = new DvdMovie("Wheels of Fury", 137, 12.95);

        System.out.println("Item #1: " + cd.getTitle());
        showPrice(cd);
        System.out.println("Item #2: " + movie.getTitle());
        showPrice(movie);
    }

    private static void showPrice(RetailItem item){
        DecimalFormat dollar = new DecimalFormat("#,##.00");
        System.out.println("Price: $" + dollar.format(item.getRetailPrice()));
    }
}
