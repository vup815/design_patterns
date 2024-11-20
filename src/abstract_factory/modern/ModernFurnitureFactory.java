package abstract_factory.modern;

import abstract_factory.Chair;
import abstract_factory.FurnitureFactory;
import abstract_factory.Sofa;
import abstract_factory.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
