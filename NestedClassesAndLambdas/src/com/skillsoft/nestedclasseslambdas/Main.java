package com.skillsoft.nestedclasseslambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Home> populateAndGetHomesList() {

        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
        Home home2 = new Home("house", "Seattle", 5200, 1500000);
        Home home3 = new Home("townhome", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Mumbai", 3500, 1000000);
        Home home5 = new Home("villa", "Bangalore", 5400, 300000);
        Home home6 = new Home("mansion", "Palo Alto", 7500, 10000000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);
        homesList.add(home5);
        homesList.add(home6);

        return homesList;
    }

    private static List<Home> filter(List<Home> homesList, HomeFilter... homeFilters) {

        List<Home> filteredList = new ArrayList<>();

        for (Home home : homesList) {

            boolean allCriteriaApplicable = true;

            for (HomeFilter homeFilter : homeFilters) {
                if (!homeFilter.test(home)) {
                    allCriteriaApplicable = false;

                    break;
                }
            }

            if (allCriteriaApplicable) {
                filteredList.add(home);
            }
        }

        return  filteredList;
    }

//    private static List<Home> filter(List<Home> homesList, HomeFilter homeFilter) {
//
//        List<Home> filteredlist = new ArrayList<>();
//
//        for (Home home : homesList) {
//            if (homeFilter.test(home)) {
//                filteredlist.add(home);
//            }
//        }
//
//        return filteredlist;
//    }

    public static void main(String[] args) {

        List<Home> homesList = populateAndGetHomesList();

        System.out.println("** Original list: \n" + homesList);

        List<Home> filteredList = filter(homesList, new HomeFilter() {
            @Override
            public boolean test(Home home) {
                return home.getAreaSqFt() > 3000 && home.getAreaSqFt() < 5500;
            }
        }, new HomeFilter() {
            @Override
            public boolean test(Home home) {
                return home.getPrice() < 1000000;
            }
        });

        System.out.println("** Filtered list: \n" + filteredList);

//        List<Home> homesList = populateAndGetHomesList();
//
//        System.out.println("*** Original list: \n" + homesList);
//
//        List<Home> filteredList = filter(homesList, new HomeFilter() {
//            @Override
//            public boolean test(Home home) {
//                return home.getAreaSqFt() > 3000 && home.getAreaSqFt() < 5500;
//            }
//        });
//
//        System.out.println("*** Filtered list: \n" + filteredList);

//        List<Home> homesList = populateAndGetHomesList();
//
//        System.out.println("*** Original list: \n" + homesList);
//
//        class PriceHomeFilter implements HomeFilter {
//
//            @Override
//            public boolean test(Home home) {
//                return home.getPrice() >= 400000 && home.getPrice() < 1100000;
//            }
//        }
//
//        List<Home> filteredList = filter(homesList, new PriceHomeFilter());
//
//        System.out.println("*** Filtered list: \n" + filteredList);

//        List<Home> homesList = populateAndGetHomesList();
//
//        System.out.println("*** Original list: \n" + homesList);
//
////        List<Home> filteredList = filterByPriceInRange(homesList, 200000, 600000);
//        List<Home> filteredList = filterByAreaSqFtInRange(homesList, 1500, 4000);
//
//        System.out.println("*** Filtered list: \n" + filteredList);

    }

//    private static List<Home> filterByPriceInRange(List<Home> homesList, int low, int high) {
//
//        List<Home> filteredList = new ArrayList<>();
//
//        for (Home home : homesList) {
//            if (home.getPrice() >= low && home.getPrice() < high) {
//                filteredList.add(home);
//            }
//        }
//
//        return filteredList;
//    }
//
//    private static List<Home> filterByAreaSqFtInRange(List<Home> homesList, int low, int high) {
//
//        List<Home> filteredList = new ArrayList<>();
//
//        for (Home home : homesList) {
//            if (home.getAreaSqFt() >= low && home.getAreaSqFt() < high) {
//                filteredList.add(home);
//            }
//        }
//
//        return filteredList;
//    }

}

// Anonymous Classes
// Nested, inner classes, defined without specifying a name for the class

// compareTo() in the Comparable interface
// current < other: negative integer, current equal to other: zero, current > other: positive integer