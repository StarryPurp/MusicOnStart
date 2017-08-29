package bstar128.example.hansung.myprojict;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menu extends Activity{
    Button fanbut;
    Button sourbut;
    Button sweetbut;
    Button hopbut;
    Intent intent;
    @Override
    protected  void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

       fanbut=(Button)findViewById(R.id.mongbut);
        sourbut=(Button)findViewById(R.id.sourbut);
        sweetbut=(Button)findViewById(R.id.sweetbut);
        hopbut=(Button)findViewById(R.id.hopbut);
       fanbut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intent=new Intent(getApplicationContext(),fantasy.class);
                startActivity(intent);
            }
        });
        sourbut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intent=new Intent(getApplicationContext(),fantasy.class);
                startActivity(intent);
            }
        });
    }



}
