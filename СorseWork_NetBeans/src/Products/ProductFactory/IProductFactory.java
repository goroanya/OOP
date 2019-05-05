package Products.ProductFactory;

import Products.Fridge;
import Products.TVSet;
import Products.WashingMachine;
import Users.Worker;

interface IProductFactory {

    WashingMachine getWashingMachine();

    Fridge getFridge();

    TVSet getTVSet();

    int setTVDiscount(int value, Worker w);

    int setFridgeDiscount(int value, Worker w);

}