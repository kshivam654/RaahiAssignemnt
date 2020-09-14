package app.sharma.raahiassignemnt;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.ViewHolder> {

    private Context context;
    private List<Trips> list;

    public TripAdapter(Context context, List<Trips> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Trips movie = list.get(position);

        holder.tripid.setText(movie.getTripID());
        holder.userid.setText(String.valueOf(movie.getUserId()));
        holder.location.setText(String.valueOf(movie.getLocationId()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tripid, userid, location;

        public ViewHolder(View itemView) {
            super(itemView);

            tripid = itemView.findViewById(R.id.tripid);
            userid = itemView.findViewById(R.id.userid);
            location = itemView.findViewById(R.id.locationid);
        }
    }

}
