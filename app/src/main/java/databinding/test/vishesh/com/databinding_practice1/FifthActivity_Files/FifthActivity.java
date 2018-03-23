package databinding.test.vishesh.com.databinding_practice1.FifthActivity_Files;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

import databinding.test.vishesh.com.databinding_practice1.R;
import databinding.test.vishesh.com.databinding_practice1.databinding.ActivityFifthBinding;

public class FifthActivity extends AppCompatActivity{

    ActivityFifthBinding binding;
    ViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding= DataBindingUtil.setContentView(this,R.layout.activity_fifth);
      binding.setListeners(this);
      viewModel=new ViewModel();
      binding.setViewModel(viewModel);


    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void onCheckChanged(CompoundButton view, boolean isChecked){
      viewModel.IsOn.set(isChecked);
      binding.setViewModel(viewModel);
    }

    public static class ViewModel extends BaseObservable{
       @Bindable public final ObservableBoolean IsOn=new ObservableBoolean();
    }
}
