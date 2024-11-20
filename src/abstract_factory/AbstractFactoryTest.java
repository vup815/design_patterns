package abstract_factory;

import abstract_factory.chinese.ChineseFurnitureFactory;
import abstract_factory.modern.ModernFurnitureFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void test_chinese_furnitureFactory() {
        FurnitureFactory chineseFurnitureFactory = new ChineseFurnitureFactory();
        Assertions.assertEquals("Chinese Chair", chineseFurnitureFactory.createChair().getName());
        Assertions.assertEquals("Chinese Sofa", chineseFurnitureFactory.createSofa().getName());
        Assertions.assertEquals("Chinese Table", chineseFurnitureFactory.createTable().getName());
    }

    @Test
    public void test_modern_furnitureFactory() {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Assertions.assertEquals("Modern Chair", modernFurnitureFactory.createChair().getName());
        Assertions.assertEquals("Modern Sofa", modernFurnitureFactory.createSofa().getName());
        Assertions.assertEquals("Modern Table", modernFurnitureFactory.createTable().getName());
    }
}
