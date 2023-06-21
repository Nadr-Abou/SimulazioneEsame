package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    List<Car> carList = new ArrayList<Car>();

    public CarManager() {
        carList.add(new Car(1, "BMW", 10, 1500.00));
        carList.add(new Car(1, "bmw", 10, 1500.00));
        carList.add(new Car(5, "Toyota", 10, 1700.00));
        carList.add(new Car(2, "Ferrari", 20, 1100.00));
        carList.add(new Car(3, "fiat", 50, 1020.00));
        carList.add(new Car(4, "Toyota", 10, 1700.00));
    }

    public List<Car> getAll() {
        return carList;
    }

    public Car getMoreExpensive() {
        List<Car> nuovaLista = new ArrayList<>();
        List<Car> varLista = new ArrayList<>(carList);
        while (varLista.size() != 0) {
            double maxPrice = 0;
            int maxIndex = -1;
            for (int i = 0; i < varLista.size(); i++) {
                if (maxPrice < varLista.get(i).getPrice()) {
                    maxPrice = varLista.get(i).getPrice();
                    maxIndex = i;
                }
            }
            nuovaLista.add(varLista.get(maxIndex));
            varLista.remove(maxIndex);
        }
        return nuovaLista.get(0);
    }

    public List<Car> getSorted() {
        List<Car> nuovaLista = new ArrayList<>();
        List<Car> varLista = new ArrayList<>(carList);
        while (varLista.size() != 0) {
            char maxChar = 'z';
            int maxIndex = -1;
            for (int i = 0; i < varLista.size(); i++) {
                if (maxChar > varLista.get(i).getBrand().toUpperCase().charAt(0)) {
                    maxChar = varLista.get(i).getBrand().toUpperCase().charAt(0);
                    maxIndex = i;
                }
            }
            nuovaLista.add(varLista.get(maxIndex));
            varLista.remove(maxIndex);
        }
        return nuovaLista;
    }

}
