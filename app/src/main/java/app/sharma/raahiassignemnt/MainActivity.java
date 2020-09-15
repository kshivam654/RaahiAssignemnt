package app.sharma.raahiassignemnt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mList;

    private LinearLayoutManager linearLayoutManager;
    private DividerItemDecoration dividerItemDecoration;
    private List<Trips> tripsList;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = findViewById(R.id.recyclerview);

        tripsList = new ArrayList<>();
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        tripsList.add(new Trips("Shimla", "descrption of the place", "100km"));
        adapter = new TripAdapter(getApplicationContext(), tripsList);

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        dividerItemDecoration = new DividerItemDecoration(mList.getContext(), linearLayoutManager.getOrientation());

        mList.setHasFixedSize(true);
        mList.setLayoutManager(linearLayoutManager);
        mList.addItemDecoration(dividerItemDecoration);
        mList.setAdapter(adapter);

    }



}