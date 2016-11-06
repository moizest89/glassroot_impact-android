package moizest89.indigitous.com.glassrootimpact.ui.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import moizest89.indigitous.com.glassrootimpact.R;
import moizest89.indigitous.com.glassrootimpact.utility.PabloPicasso;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.Holder>{

    private Context context;

    public MainAdapter(Context context) {
        this.context = context;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.item_requests_list, parent, false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {


        //

        holder.request_church_logo.setBorderColor(this.context.getResources().getColor(R.color.colorAccent));
        holder.request_church_logo.setBorderWidth(1);

        Picasso picasso = PabloPicasso.with(this.context);
        picasso.load("http://www.freedomchurch.uk/wp-content/uploads/2016/06/multi-generational-workplace-600x400.jpg")
                .placeholder(R.drawable.ind_logo_transparent)
                .error(R.drawable.ind_logo_transparent)
                .into(holder.request_church_logo);
    }

    @Override
    public int getItemCount() {
        return 10;
    }


    public void setData(){
        this.notifyDataSetChanged();
    }

    public class Holder extends RecyclerView.ViewHolder{

        @Bind(R.id.request_church_logo)
        CircleImageView request_church_logo;

        public Holder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);



        }
    }
}
