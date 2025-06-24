package assessment;

import java.util.ArrayList;
import java.util.List;

public interface Discount {

    double getDiscount(List<PercentageDiscount.Item> items);

    String getDescription();
}

