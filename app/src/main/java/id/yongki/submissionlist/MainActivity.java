package id.yongki.submissionlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements ListFilmAdapter.OnItemListener {
    public static final String NAMA = "id.yongki.subMission.NAMA";
    public static final String DETAIL = "id.yongki.subMission.DETAIL";
    public static final String IMG = "id.yongki.subMission.IMG";
    private RecyclerView recyclerView;
    ArrayList<FilmModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.rv_film);
        recyclerView.setHasFixedSize(true);


        list.addAll(FilmData.getListData());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(getApplicationContext(),list, this );
        recyclerView.setAdapter(listFilmAdapter);
    }

    @Override
    public void onItemClick(int position) {
        FilmModel id = new FilmModel();
        String nama = id.getName();
        String detail = id.getDetail();
        int img = id.getPhoto();
        Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
        intent.putExtra(NAMA, nama);
        intent.putExtra(DETAIL, detail);
        intent.putExtra(IMG, img);
        startActivity(intent);
    }
}