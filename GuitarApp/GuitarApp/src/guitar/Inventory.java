package guitar;

import java.util.ArrayList;

public class Inventory {
    private int inventoryCount;
    private final ArrayList<Guitar> guitarList = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood) {
        this.inventoryCount++;
        this.guitarList.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
    }

    public int guitarCount() {
        return inventoryCount;
    }

    public Guitar getGuitar(String serialNumber) {
        return findGuitar(serialNumber);
    }
    private Guitar findGuitar(String serialNumber) {
        Guitar guitar = null;
        for(Guitar searchedGuitar : guitarList ) {
            if(searchedGuitar.getSerialNumber().equals(serialNumber)) {
                guitar = searchedGuitar;
            }
        }
        return guitar;
    }

    public Guitar searchGuitar(Guitar guitar) {
        return searchForGuitar(guitar);
    }
    private Guitar searchForGuitar(Guitar guitar) {
        Guitar searchedGuitar = null;
        for(Guitar searchGuitar : guitarList ) {
            if(searchGuitar.getModel().equals(guitar.getModel()) && searchGuitar.getSerialNumber().equals(guitar.getSerialNumber())) {
                searchedGuitar = searchGuitar;
            }
        }
        return searchedGuitar;
    }
}
