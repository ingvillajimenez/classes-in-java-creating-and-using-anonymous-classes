package com.skillsoft.nestedclasseslambdas;

import java.util.Objects;

public class Main {

//    private static void displayCar(Car car) {
//        System.out.println("*** Displaying car");
//        System.out.println(car);
//    }
//
//    private static void displayHome(Home home) {
//        System.out.println("*** Displaying home");
//        System.out.println(home);
//    }

    public static void main(String[] args) {

        Condo condo = new Condo("Boston", "Victorian", 678000) {
        // Anonymous class derives from the concrete Condo class
            @Override
            public String getArchitecturalStyle() {
                return "Gothic";
            }
        };

        Honda honda = new Honda("Acura", 34000, 24) {
            // Anonymous class derives from the concrete Honda class
            @Override
            public int getPrice() {
                return 30000;
            }
        };

        System.out.println(condo);
        System.out.println(honda);

//        final String make = "Lamborghini"; // explicitly final
//        final String model = "Aventador"; // explicitly final
//        final int price = 200000; // explicitly final
//        final int mileage = 14; // explicitly final

//        String make = "Lamborghini"; // effectively final
//        String model = "Aventador"; // effectively final
//        int price = 200000; // effectively final
//        int mileage = 14; // effectively final
//
//        Car lamborghini = new Car() {
//
//            @Override
//            public String getMake() {
//                return make; // Variable 'make' is accessed from within inner class, needs to be final or effectively final
//            }
//
//            @Override
//            public String getModel() {
//                return model; // Variable 'model' is accessed from within inner class, needs to be final or effectively final
//            }
//
//            @Override
//            public int getPrice() {
//                return price; // Variable 'price' is accessed from within inner class, needs to be final or effectively final
//            }
//
//            @Override
//            public int getMileage() {
//                return mileage; // Variable 'mileage' is accessed from within inner class, needs to be final or effectively final
//            }
//
//            @Override
//            public String toString() {
//                return String.format("Make: %s, model: %s, price: %d, mileage: %d",
//                        getMake(), getModel(), getPrice(), getMileage());
//            }
//        };
//
//        make = "Lamborghini"; // it is no longer final
//        model = "Huracan"; // it is no longer final
//        price = 210000; // it is no longer final
//        mileage = 16; // it is no longer final
//
//        displayCar(lamborghini);

//        Car lamborghini = new Car() {
//
//            @Override
//            public String getMake() {
//                return "Lamborghini";
//            }
//
//            @Override
//            public String getModel() {
//                return "Aventador";
//            }
//
//            @Override
//            public int getPrice() {
//                return 200000;
//            }
//
//            @Override
//            public int getMileage() {
//                return 14;
//            }
//
//            public void printDetails() {
//                System.out.println(String.format("Make: %s, model: %s, price: %d, mileage: %d\n",
//                        getMake(), getModel(), getPrice(), getMileage());;
//            }
//        };
//
//        lamborghini.printDetails(); // Cannot resolve method 'printDetails' in 'Car'

//      Car lamborghini = new Car() {
//
//          public String make = "Lamborghini";
//          public String model = "Aventador";
//          public int price = 200000;
//          public int mileage = 14;
//
////          String make = "Lamborghini";
////          String model = "Aventador";
////          int price = 200000;
////          int mileage = 14;
//
//          @Override
//          public String getMake() {
//              return make;
//          }
//
//          @Override
//          public String getModel() {
//              return model;
//          }
//
//          @Override
//          public int getPrice() {
//              return price;
//          }
//
//          @Override
//          public int getMileage() {
//              return mileage;
//          }
//
//          @Override
//          public String toString() {
//              return String.format("Make: %s, model: %s, price: %d, mileage: %d",
//                      this.make, this.model, this.price, this.mileage);
//          }
//      };
//
//      displayCar(lamborghini);
//
//      System.out.println("Make: " + lamborghini.make); // Cannot resolve symbol 'make'
//      System.out.println("Model: " + lamborghini.model); // Cannot resolve symbol 'model'
//      System.out.println("Price: " + lamborghini.price); // Cannot resolve symbol 'price'
//      System.out.println("Mileage: " + lamborghini.mileage); // Cannot resolve symbol 'mileage'
    }
}

// Anonymous Classes
// Nested, inner classes, defined without specifying a name for the class