package ru.itis.Marat.Jarvis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream(new File("D:\\Учеба\\Информатика\\projects\\algos\\Jarvis_algoritm\\Jarvis\\src\\ru\\itis\\Marat\\Jarvis\\data50.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Point> points = (ArrayList) ois.readObject();
            ois.close();

            System.out.println(points.size());
            final List<Point> hull = JarvisAlgorithm.createConvexHull(points);
            System.out.println(hull);
        }catch(Exception ex){
            ex.printStackTrace();
        }


    }
}
