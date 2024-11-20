package abstract_factory.chinese;

import abstract_factory.Table;

public class ChineseTable implements Table {
    @Override
    public String getName() {
        return "Chinese Table";
    }
}
