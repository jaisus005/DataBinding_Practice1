package databinding.test.vishesh.com.databinding_practice1.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import databinding.test.vishesh.com.databinding_practice1.databinding.LayoutFragSecondActivityBinding;


/**
 * Created by JaiSuS on 3/15/2018.
 */

public class FragmentSecondActivity extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //--------here binding fragment data source to fragement and return to the class by secFrag.getRoot();------------//
        LayoutFragSecondActivityBinding secFrag = LayoutFragSecondActivityBinding.inflate(inflater, container, false);
        FragSecondDataSource fragSeconddataSource = new FragSecondDataSource();
        secFrag.setFragmentSecondDataSource(fragSeconddataSource);
        return secFrag.getRoot();
        //------------------------------------ends here--------------------------------------------------------------------//

    }



}
