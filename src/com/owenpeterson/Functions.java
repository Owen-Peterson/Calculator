package com.owenpeterson;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Functions {
    Scanner input = new Scanner(System.in);

    private static void returnToProgram(){
        System.out.println("Returning you to command prompt:");
        System.out.println("Please type one of the commands: ");
    }
    void volumeOfCube(){
        System.out.println("Length: ");
        int l = input.nextInt();
        System.out.println("Width: ");
        int w = input.nextInt();
        System.out.println("Height: ");
        int h = input.nextInt();
        System.out.println("Volume of cube is: " + (l*w*h));
        returnToProgram();
    }
    void volumeOfCylinder(){
        System.out.println("Radius: ");
        int r = input.nextInt();
        System.out.println("Height: ");
        int h = input.nextInt();
        System.out.println("Volume of cylinder: "+ (r*r)*Math.PI*h);
        returnToProgram();
    }

    void wattage(){
        System.out.println("Volts: ");
        int v = input.nextInt();
        System.out.println("Amps: ");
        int a = input.nextInt();
        System.out.println(v * a + " Watts");
    }
    }

