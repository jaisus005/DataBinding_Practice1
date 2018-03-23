package databinding.test.vishesh.com.databinding_practice1.FourthAcivity_Files;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import databinding.test.vishesh.com.databinding_practice1.FifthActivity_Files.FifthActivity;
import databinding.test.vishesh.com.databinding_practice1.MyNewHandler;
import databinding.test.vishesh.com.databinding_practice1.R;
import databinding.test.vishesh.com.databinding_practice1.databinding.ActivityFourthBinding;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFourthBinding activityFourthBinding = DataBindingUtil.setContentView(this, R.layout.activity_fourth);
        activityFourthBinding.setMyData(new Fourth_Act_Data());
        MyNewHandler myNewHandler=new MyNewHandler();
        myNewHandler.pleaseClickMe(new Fourth_Act_Data());
        activityFourthBinding.setButtonListeners(myNewHandler);
    }

   public void  showMessage(){
       Toast.makeText(FourthActivity.this,"hey there",Toast.LENGTH_LONG).show();
   }


   public View.OnClickListener getButtonListener(){
       return  new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            Toast.makeText(FourthActivity.this,"hell of show",Toast.LENGTH_LONG).show();

           }
       };
   }

    public void moveToFifth(View view){
       startActivity(new Intent(this, FifthActivity.class));
    }

}

