package bstar128.example.hansung.myprojict;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class showpics extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showpics);
        img = (ImageView)findViewById(R.id.img);
        Intent intent = getIntent();
        int rid = intent.getIntExtra("rid", -1);
        if(rid != -1) img.setImageResource(R.drawable.fan1);

    }
}
