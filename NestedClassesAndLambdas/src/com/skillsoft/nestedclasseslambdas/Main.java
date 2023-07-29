package com.skillsoft.nestedclasseslambdas;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.format("Current thread name: %s, priority: %d\n",
                        Thread.currentThread().getName(), Thread.currentThread().getPriority()); // Current thread name: Thread-0, priority: 5
            }
        });
        thread.start();

        System.out.format("Current thread name: %s, priority: %d\n",
                Thread.currentThread().getName(), Thread.currentThread().getPriority()); // Current thread name: main, priority: 5

//        class LocalThread extends Thread {
//
//            public void run() {
//                System.out.format("Current thread name: %s, priority: %d\n",
//                        Thread.currentThread().getName(), Thread.currentThread().getPriority());  // Current thread name: Thread-0, priority: 5
//            }
//        }
//
//        Thread thread = new LocalThread();
//        thread.start();
//
//        System.out.format("Current thread name: %s priority: %d\n",
//                Thread.currentThread().getName(), Thread.currentThread().getPriority()); // Current thread name: main priority: 5

//        System.out.println("Current thread name: " + Thread.currentThread().getName()); // main
//        System.out.println("Current thread priority: " + Thread.currentThread().getPriority()); // 5

//        Home home1 = new Home("townhome", "Seattle", 2345);
//        Home home2 = new Home("villa", "Mountain View", 1500);
//        Home home3 = new Home("brownstone", "New York", 1200);
//        Home home4 = new Home("condo", "Boston", 4000);
//
//        List<Home> homesList = new ArrayList<>();
//
//        homesList.add(home1);
//        homesList.add(home2);
//        homesList.add(home3);
//        homesList.add(home4);
//
//        System.out.println("**Before sorting: \n" + homesList);
//
//        Collections.sort(homesList, new Comparator<Home>() {
//            @Override
//            public int compare(Home o1, Home o2) {
//                return o1.getAreaSqFt() - o2.getAreaSqFt();
//            }
//        });
//
//        System.out.println("**After sorting: \n" + homesList);

//        List<String> namesList = new ArrayList<>();
//
//        namesList.add("John");
//        namesList.add("Zoe");
//        namesList.add("Alice");
//        namesList.add("Lucy");
//
//        System.out.println("**Before sorting: " + namesList);
//
//        Collections.sort(namesList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        System.out.println("**After sorting: " + namesList);

//        List<Integer> numbersList = new ArrayList<>();
//
//        numbersList.add(234);
//        numbersList.add(9876);
//        numbersList.add(100);
//        numbersList.add(34);
//        numbersList.add(-23);
//
//        System.out.println("**Before sorting: " + numbersList);
//
//        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2) * -1;
//            }
//        };
//
//        Collections.sort(numbersList, descendingComparator);
//
//        System.out.println("**After sorting: " + numbersList);

//        System.out.println("\nB compareTo b: " + "B".compareTo("b"));
//        System.out.println("\nz compareTo Z: " + "z".compareTo("Z"));

//        System.out.println("\nA compareTo B: " + "A".compareTo("B"));
//        System.out.println("\nA compareTo Z: " + "A".compareTo("Z"));
//        System.out.println("\nB compareTo A: " + "B".compareTo("A"));
//        System.out.println("\nZ compareTo A: " + "Z".compareTo("A"));
//        System.out.println("\nC compareTo C: " + "C".compareTo("C"));

//        List<Integer> numbersList = new ArrayList<>();
//
//        numbersList.add(234);
//        numbersList.add(9876);
//        numbersList.add(100);
//        numbersList.add(34);
//        numbersList.add(-23);
//
//        System.out.println("**Before sorting: " + numbersList);
//
//        Collections.sort(numbersList);
//
//        System.out.println("**After sorting: " + numbersList);


//        List<String> namesList = new ArrayList<>();
//
//        namesList.add("John");
//        namesList.add("Zoe");
//        namesList.add("Alice");
//        namesList.add("Lucy");
//
//        System.out.println("**Before sorting: " + namesList);
//
//        Collections.sort(namesList);
//
//        System.out.println("**After sorting: " + namesList);

    }
}

// Anonymous Classes
// Nested, inner classes, defined without specifying a name for the class

// compareTo() in the Comparable interface
// current < other: negative integer, current equal to other: zero, current > other: positive integer