package com.owenpeterson;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        Functions functions = new Functions();
        boolean running = true;

        System.out.println("Calculator9000 is booting up...");
        System.out.println("");
        System.out.println("The currently supported functions include:");
        System.out.println("");
        System.out.println("STOP: exits the program");
        System.out.println("VOLCUBE: finds the volume of a cube");
        System.out.println("VOLCYL: finds the volume of a cylinder");
        System.out.println("Please type one of the commands:");


        while (running == true){

            switch (keyboard.nextLine()){
                case "VOLCUBE": functions.volumeOfCube();
                break;
                case "STOP": running = false;
                break;
                case "VOLCYL": functions.volumeOfCylinder();
                break;
                case "GUI" : GUI.gui();
                case "WATTAGE" : functions.wattage();


            }
        }

    }
}
