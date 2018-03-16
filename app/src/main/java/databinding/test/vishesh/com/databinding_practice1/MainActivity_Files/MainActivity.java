package databinding.test.vishesh.com.databinding_practice1.MainActivity_Files;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import databinding.test.vishesh.com.databinding_practice1.R;
import databinding.test.vishesh.com.databinding_practice1.SecondActivity_Files.SecondActivity;
import databinding.test.vishesh.com.databinding_practice1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //----------------here binding activity with data source--------------------------//
        ActivityMainBinding actMainBind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityDataSource mainActivityDataSource = new MainActivityDataSource();
        actMainBind.setMainActivityDataSource(mainActivityDataSource);
        //-----------------binding ends here----------------------------------------------//


    }

    public  void moveToSecond(View view){
      startActivity(new Intent(this, SecondActivity.class));
    }
}
