package databinding.test.vishesh.com.databinding_practice1;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * Created by JaiSuS on 3/19/2018.
 */
//here i am creating custom binding adapter to bind data via app:setMyTextData or app:setNumberText
public class TextViewBindingAdapter {

    @BindingAdapter("bind:setMyTextData")
    public static void setMyTextData(TextView view,String text){
        view.setText(text);
    }

    @BindingAdapter("bind:setNumberText")
    public static  void setNumberText(TextView view,int number){
        view.setText(String.valueOf(number));
    }
}
