package mvss;

import mvss.samples.models.Box;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void printClassInfo(Class<?> classToInspect) {
        System.out.println("Inspecting " + classToInspect.getName());
        System.out.println("Following are the fields");
        for (Field boxField : classToInspect.getDeclaredFields()) {
            System.out.println(boxField.getModifiers() + " " + boxField.getName());
        }
        System.out.println("Following are the methods");
        for (Method boxMethod : classToInspect.getDeclaredMethods()) {
            System.out.println(boxMethod.getModifiers() + " " + boxMethod.getName());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Box myBox;
        System.out.println("Hello world!");

        myBox = new Box(1, 2, 3);
        System.out.println("My box1 is " + myBox);
        Box myBox2 = new Box(1, 2, 3);
        System.out.println("My box2 is " + myBox2);

        printClassInfo(Box.class);

        Class<?> myDynamicClass = Class.forName("samples.DynaLoadedClass");
        printClassInfo(myDynamicClass);
    }
}