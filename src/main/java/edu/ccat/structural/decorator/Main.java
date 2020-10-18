package edu.ccat.structural.decorator;

public class Main {

  public static void main(String[] args) {

    Pizza cake = new Pizza("Cake");

    Pizza pizza = new Pizza("Pizza light");
    Extra pizzaTomato = new Extra("Tomato", 2.5, pizza);
    Extra pizzaTomatoGarlic = new Extra("Garlic", 3.0, pizzaTomato);
//    Extra pizzaCheeseGarlicOnion = new Extra("Onion",
//        new Extra("Garlic",
//            new Extra("Chesse", pizza)));

    System.out.println(pizza.describe());

    System.out.println(pizzaTomato.describe());

    System.out.println(pizzaTomatoGarlic.describe());

//    System.out.println(pizzaCheeseGarlicOnion.describe());

//    System.out.println((new Extra("Cherry",
//        new Extra("Creme",
//            new Extra("Body",
//                new Extra("Milk", cake)))))
//        .describe());
  }
}
