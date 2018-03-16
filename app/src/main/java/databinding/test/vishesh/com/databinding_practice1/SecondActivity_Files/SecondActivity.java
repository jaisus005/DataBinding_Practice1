package databinding.test.vishesh.com.databinding_practice1.SecondActivity_Files;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import databinding.test.vishesh.com.databinding_practice1.Fragments.FragmentSecondActivity;
import databinding.test.vishesh.com.databinding_practice1.R;
import databinding.test.vishesh.com.databinding_practice1.ThirdActivity_Files.ThirdAcivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FragmentTransaction trans=getSupportFragmentManager().beginTransaction();
        FragmentSecondActivity fragmentSecondActivity =new FragmentSecondActivity();
        trans.add(R.id.secondFragContainer, fragmentSecondActivity);
        trans.commit();
    }

    public void moveToThirdAcivity(View view){
     startActivity(new Intent(this, ThirdAcivity.class));
    }
}
