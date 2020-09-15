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
        tripsList.add(new Trips("Keral", "descrption of the place", "454km"));
        tripsList.add(new Trips("Manali", "descrption of the place", "234km"));
        tripsList.add(new Trips("Delhi", "descrption of the place", "342km"));
        tripsList.add(new Trips("Kolkata", "descrption of the place", "564km"));
        tripsList.add(new Trips("Bengalore", "descrption of the place", "100km"));
        tripsList.add(new Trips("Pune", "descrption of the place", "100km"));
        tripsList.add(new Trips("Goa", "descrption of the place", "345km"));
        tripsList.add(new Trips("Dun", "descrption of the place", "244km"));
        tripsList.add(new Trips("Himachal", "descrption of the place", "100km"));
        tripsList.add(new Trips("leh", "descrption of the place", "230km"));
        tripsList.add(new Trips("Puri", "descrption of the place", "490km"));
        tripsList.add(new Trips("Podi", "descrption of the place", "140km"));
        tripsList.add(new Trips("Patna", "descrption of the place", "120km"));
        tripsList.add(new Trips("Shilong", "descrption of the place", "230km"));
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