package databinding.test.vishesh.com.databinding_practice1.ThirdActivity_Files;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import databinding.test.vishesh.com.databinding_practice1.Others.MenuItem;
import databinding.test.vishesh.com.databinding_practice1.databinding.ExpressionsBinding;

/**
 * Created by JaiSuS on 3/16/2018.
 */

class ThirdActivityRecyclerAdapter extends RecyclerView.Adapter<ThirdActivityRecyclerAdapter.MyViewHolder> {

    private LayoutInflater layoutInflater;
    Context context;

    ThirdActivityRecyclerAdapter(Context context) {
        this.context = context;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ExpressionsBinding inSecBind = ExpressionsBinding.inflate(LayoutInflater.from(context), parent, false);

        return new MyViewHolder(inSecBind.getRoot());
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MenuItem menuItem = new MenuItem(false, "vanilla", "102", 0);
        // IncludeSecondFragmentBinding binding= DataBindingUtil.getBinding(holder.itemView);
        ExpressionsBinding binding = DataBindingUtil.getBinding(holder.itemView);
        binding.setItem(menuItem);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
    

    class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
