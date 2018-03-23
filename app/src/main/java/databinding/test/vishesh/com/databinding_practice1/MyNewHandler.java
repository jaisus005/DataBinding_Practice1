package databinding.test.vishesh.com.databinding_practice1;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import databinding.test.vishesh.com.databinding_practice1.FourthAcivity_Files.Fourth_Act_Data;

/**
 * Created by JaiSuS on 3/20/2018.
 */

public class MyNewHandler {


    public  void OnClickMe(View view){
        Toast.makeText(view.getContext(),"hell of the show",Toast.LENGTH_LONG).show();
    }

    public void pleaseClickMe(Fourth_Act_Data fourth_act_data){
        Log.i("hell",fourth_act_data.getMytext());
    }

}
