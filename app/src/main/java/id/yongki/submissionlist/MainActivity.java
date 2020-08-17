package id.yongki.submissionlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements ListFoodAdapter.OnItemListener {
    public static final String NAMA = "id.yongki.subMission.NAMA";
    public static final String DETAIL = "id.yongki.subMission.DETAIL";
    public static final String IMG = "id.yongki.subMission.IMG";
    public static final String ID = "id.yongki.subMission.ID";
    private RecyclerView recyclerView;
    ArrayList<FoodModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_food);
        recyclerView.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(getApplicationContext(),list, this );
        recyclerView.setAdapter(listFoodAdapter);
    }

    @Override
    public void onItemClick(int position) {

        FoodModel foodModel = list.get(position);
        Toast.makeText(getApplicationContext(), foodModel.getName(),Toast.LENGTH_LONG).show();
        String nama = foodModel.getName();
        String detail = foodModel.getDetail();
        String img = Integer.toString(foodModel.getPhoto()) ;
        Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
        intent.putExtra(NAMA, nama);
        intent.putExtra(DETAIL, detail);
        intent.putExtra(IMG, img);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            startActivity(new Intent(getApplicationContext(), AboutActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}