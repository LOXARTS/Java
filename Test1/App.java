package training.Test1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main (String[] args){

    Car cars = new Car();
    cars.start();
    cars.setYear(2005);
    cars.battery1();
    cars.compressor1();
    System.out.println(cars.getYear());

    File file = new File("C:\\Users\\KinoLockhart\\IdeaProjects\\java-training\\src\\training\\Test1\\report.txt");



        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line;
            line=bufferedReader.readLine();
            System.out.println(line);





            System.out.println("File Ready");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file" + file.toString());
        }

    }





}




