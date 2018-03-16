package databinding.test.vishesh.com.databinding_practice1.CustomViews;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import databinding.test.vishesh.com.databinding_practice1.Fragments.FragSecondDataSource;
import databinding.test.vishesh.com.databinding_practice1.databinding.CustViewMyBinding;

/**
 * Created by JaiSuS on 3/15/2018.
 */

public class MyCustView extends LinearLayout {

    CustViewMyBinding custViewMyBinding;

    public MyCustView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
         custViewMyBinding=CustViewMyBinding.bind(this);
    }


    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        FragSecondDataSource dataSource=new FragSecondDataSource();
        custViewMyBinding.setDataSource(dataSource);
    }
}
