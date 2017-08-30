package bstar128.example.hansung.myprojict;


import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;


public class fantasy extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fantasy);
        ViewGroup root = (ViewGroup) findViewById(android.R.id.content);
        GridLayout gl = (GridLayout) root.getChildAt(0);
        int count = gl.getChildCount();
        for (int i = 0; i < count; i++) {
            ImageView v = (ImageView) gl.getChildAt(i);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int resourceId = v.getId();
                    Intent intent=new Intent(getApplicationContext(), showpics.class);
                    intent.putExtra("rid", resourceId);
                    startActivity(intent);
                    // Toast.makeText(getApplicationContext(), "click", Toast.LENGTH_SHORT).show();
                }
            });
            setTitle("사진 선택");
        }
    }
}
