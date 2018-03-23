package databinding.test.vishesh.com.databinding_practice1.ThirdActivity_Files;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import databinding.test.vishesh.com.databinding_practice1.FourthAcivity_Files.FourthActivity;
import databinding.test.vishesh.com.databinding_practice1.R;
import databinding.test.vishesh.com.databinding_practice1.databinding.ActivityThirdAcivityBinding;

public class ThirdAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityThirdAcivityBinding thirdAcivityBinding= DataBindingUtil.setContentView(this,R.layout.activity_third_acivity);

        ThirdActivityRecyclerDataSource dataSource=new ThirdActivityRecyclerDataSource();
        thirdAcivityBinding.setDataSource(dataSource);

        thirdAcivityBinding.thirdActRecycler.setLayoutManager(new LinearLayoutManager(this));
        ThirdActivityRecyclerAdapter adapter= new ThirdActivityRecyclerAdapter(this);
        thirdAcivityBinding.thirdActRecycler.setAdapter(adapter);

    }

    public void moveToFourth(View view){
        startActivity(new Intent(this, FourthActivity.class));
    }

}
