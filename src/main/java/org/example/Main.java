package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Hey");
        Box<String> stringBox2 = new Box<>("Hey");

        System.out.println(stringBox.hasSameName(stringBox2));


    }
}