package In;

import Out.Car;
import java.io.*;
import java.util.List;

    class Main {
        public static void main(String[] args) {
            try (ObjectInputStream inp = new ObjectInputStream(new FileInputStream("CarsSerial.bin"))) {
                List<Car> car2 = (List<Car>) inp.readObject();
                for (Car car: car2){
                    System.out.println(car);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

