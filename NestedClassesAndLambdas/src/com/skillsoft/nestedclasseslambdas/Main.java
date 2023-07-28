package com.skillsoft.nestedclasseslambdas;

import java.util.Objects;

public class Main {

    private static void displayCar(Car car) {
        System.out.println("*** Displaying car");
        System.out.println(car);
    }

    private static void displayHome(Home home) {
        System.out.println("*** Displaying home");
        System.out.println(home);
    }

    public static void main(String[] args) {

        Car lamborghini = new Car() {

            @Override
            public String getMake() {
                return "Lamborghini";
            }

            @Override
            public String getModel() {
                return "Aventador";
            }

            @Override
            public int getPrice() {
                return 200000;
            }

            @Override
            public int getMileage() {
                return 14;
            }

            @Override
            public int hashCode() {
                return Objects.hash(getMake(), getModel(), getPrice(), getMileage());
            }

            @Override
            public boolean equals(Object other) {
                if (other == null) {
                    return false;
                }

                if (!(other instanceof Car)) {
                    return false;
                }

                Car otherCar = (Car) other;

                if (otherCar.getMake().equals(getMake()) &&
                        otherCar.getModel().equals(getModel()) &&
                        otherCar.getPrice() == getPrice() &&
                        otherCar.getMileage() == getMileage()) {
                    return true;
                }

                return false;
            }

            @Override
            public String toString() {
                return String.format("Make: %s, model: %s, price: %d, mileage: %d",
                        getMake(), getModel(), getPrice(), getMileage());
            }
        };

        Car camry = new Car() {

            @Override
            public String getMake() {
                return "Toyota";
            }

            @Override
            public String getModel() {
                return "Camry";
            }

            @Override
            public int getPrice() {
                return 28000;
            }

            @Override
            public int getMileage() {
                return 24;
            }

            @Override
            public int hashCode() {
                return Objects.hash(getMake(), getModel(), getPrice(), getMileage());
            }

            @Override
            public boolean equals(Object other) {
                if (other == null) {
                    return false;
                }

                if (!(other instanceof Car)) {
                    return false;
                }

                Car otherCar = (Car) other;

                if (otherCar.getMake().equals(getMake()) &&
                        otherCar.getModel().equals(getModel()) &&
                        otherCar.getPrice() == getPrice() &&
                        otherCar.getMileage() == getMileage()) {
                    return true;
                }

                return false;
            }

            @Override
            public String toString() {
                return String.format("Make: %s, model: %s, price: %d, mileage: %d",
                        getMake(), getModel(), getPrice(), getMileage());
            }
        };

        displayCar(lamborghini);
        displayCar(camry);

        System.out.println("lamborghini.equals(camry): " + lamborghini.equals(camry));

//        Home mansion = new Home() {
//
//            @Override
//            public String getCity() {
//                return "Palo Alto";
//            }
//
//            @Override
//            public int getNumberOfFloors() {
//                return 2;
//            }
//
//            @Override
//            public String getArchitecturalStyle() {
//                return "Victorian";
//            }
//
//            @Override
//            public int getPrice() {
//                return 5755000;
//            }
//
//            @Override
//            public int hashCode() {
//                return Objects.hash(ge);
//            }
//
//            @Override
//            public String toString() {
//                return String.format("City: %s, Number of floors: %s, style: %s, price: %d",
//                        getCity(), getNumberOfFloors(), getArchitecturalStyle(), getPrice());
//            }
//        };
//
//        displayCar(lamborghini);
//        displayHome(mansion);

//        System.out.println(lamborghini.getClass());
//        System.out.println(mansion.getClass());
//
//        System.out.println();
//        System.out.println("Is lamborghini anonymous: " + lamborghini.getClass().isAnonymousClass());
//        System.out.println("Is mansion anonymous: " + mansion.getClass().isAnonymousClass());
//
//        System.out.println();
//        System.out.println("Is lamborghini an interface: " + lamborghini.getClass().isInterface());
//        System.out.println("Is mansion an interface: " + mansion.getClass().isInterface());
//
//        System.out.println();
//        System.out.println("Is lamborghini an object: " + (lamborghini instanceof Object));
//        System.out.println("Is mansion an object: " + (mansion instanceof Object));
    }
}

// Anonymous Classes
// Nested, inner classes, defined without specifying a name for the class