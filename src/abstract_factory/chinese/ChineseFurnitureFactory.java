package abstract_factory.chinese;

import abstract_factory.Chair;
import abstract_factory.FurnitureFactory;
import abstract_factory.Sofa;
import abstract_factory.Table;

public class ChineseFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ChineseChair();
    }

    @Override
    public Table createTable() {
        return new ChineseTable();
    }

    @Override
    public Sofa createSofa() {
        return new ChineseSofa();
    }
}
