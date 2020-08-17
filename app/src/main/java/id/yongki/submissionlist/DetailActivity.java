package id.yongki.submissionlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import java.util.Objects;

import static id.yongki.submissionlist.MainActivity.DETAIL;
import static id.yongki.submissionlist.MainActivity.IMG;
import static id.yongki.submissionlist.MainActivity.NAMA;

public class DetailActivity extends AppCompatActivity {
    ImageView iv_food;
    TextView labelName, labelDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        labelName = findViewById(R.id.detail_label_name);
        iv_food = findViewById(R.id.detail_img_food);
        labelDetail = findViewById(R.id.detail_label_detail);

        Intent intent = getIntent();

        String nama = intent.getStringExtra(NAMA);
        String detail = intent.getStringExtra(DETAIL);

        int img = Integer.parseInt(Objects.requireNonNull(intent.getStringExtra(IMG)));
        labelName.setText(nama);
        labelDetail.setText(detail);
        Glide.with(getApplicationContext())
                .load(img)
                .into(iv_food);

    }

}