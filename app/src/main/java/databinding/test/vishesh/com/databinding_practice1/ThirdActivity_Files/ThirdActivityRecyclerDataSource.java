package databinding.test.vishesh.com.databinding_practice1.ThirdActivity_Files;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JaiSuS on 3/16/2018.
 */

public class ThirdActivityRecyclerDataSource {

    private String title="This is Fun";
    private String[] bodyElements={"hell","hell1","hell2","hell3","hell4","hell5","hell6","hell7"};

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getBodyElements() {
        return bodyElements;
    }

    public void setBodyElements(String[] bodyElements) {
        this.bodyElements = bodyElements;
    }
}
