package abstract_factory.chinese;

import abstract_factory.Chair;

public class ChineseChair implements Chair {
    @Override
    public String getName() {
        return "Chinese Chair";
    }
}
