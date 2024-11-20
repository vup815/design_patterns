package abstract_factory;

import abstract_factory.chinese.ChineseFurnitureFactory;
import abstract_factory.modern.ModernFurnitureFactory;

public class Main {
    public static void main(String[] args){
        createModernFurniture();
        System.out.println("----------");
        createChineseFurniture();
    }

    private static void createChineseFurniture() {
        FurnitureFactory chineseFurnitureFactory = new ChineseFurnitureFactory();
        Chair chair = chineseFurnitureFactory.createChair();
        System.out.println(chair.getName());
        Table table = chineseFurnitureFactory.createTable();
        System.out.println(table.getName());
        Sofa sofa = chineseFurnitureFactory.createSofa();
        System.out.println(sofa.getName());
    }

    private static void createModernFurniture() {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Chair chair = modernFurnitureFactory.createChair();
        System.out.println(chair.getName());
        Table table = modernFurnitureFactory.createTable();
        System.out.println(table.getName());
        Sofa sofa = modernFurnitureFactory.createSofa();
        System.out.println(sofa.getName());
    }
}
