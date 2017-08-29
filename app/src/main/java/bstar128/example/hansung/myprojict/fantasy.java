package bstar128.example.hansung.myprojict;


import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class fantasy extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fantasy);
        ViewGroup root = (ViewGroup) findViewById(android.R.id.content);
        LinearLayout ll = (LinearLayout)((LinearLayout) root.getChildAt(0)).getChildAt(0);
        int count = ll.getChildCount();
        for(int i=0;i<count;i++) {
            ImageView v = (ImageView) ll.getChildAt(i);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "click", Toast.LENGTH_SHORT).show();
                }
            });
        }
        setTitle("사진 선택");
    }

}
