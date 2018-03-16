package databinding.test.vishesh.com.databinding_practice1.Others;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JaiSuS on 3/16/2018.
 */

public class MenuItem  {

    public boolean isSpecial;
    public String flavour;
    public String price;
    public int index;
    public Map<String,String> map=new HashMap<>();

    public MenuItem(boolean isSpecial, String flavour, String price, int index) {
        this.isSpecial = isSpecial;
        this.flavour = flavour;
        this.price = price;
        this.index = index;
        map.put("flavour",flavour);
        map.put("price",price);
    }


}
