package ru.itis.Marat.Jarvis;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(9900) + 100;
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int x = rand.nextInt(10000);
            int y = rand.nextInt(10000);
            Point point = new Point(x, y);

            points.add(point);
        }

        System.out.println(n);

            try {
                FileOutputStream fos = new FileOutputStream(new File("D:\\Учеба\\Информатика\\projects\\algos\\Jarvis_algoritm\\Jarvis\\src\\ru\\itis\\Marat\\Jarvis\\data32.txt"));
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                // Запись объектов в файл
                for(int i = 0; i < n; i++) {

                    oos.writeObject(points);
                }
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
        }



    }
}
