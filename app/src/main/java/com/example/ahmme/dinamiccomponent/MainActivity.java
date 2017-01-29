package com.example.ahmme.dinamiccomponent;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int colum =10;
    int row=40;
    int totalcell=1;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayoutMain = (LinearLayout) findViewById(R.id.main_linear_layout);

        LinearLayout.LayoutParams LL_params =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LL_params.setMargins(0,0,0,1);
        LinearLayout.LayoutParams LL_params_text =new LinearLayout.LayoutParams(220, ViewGroup.LayoutParams.WRAP_CONTENT);
        LL_params_text.setMargins(0,0,1,0);

        for(int j=1;j<=row;j++){

            LinearLayout linearLayout=new LinearLayout(this);
            linearLayout.setLayoutParams(LL_params);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            linearLayoutMain.addView(linearLayout);
                for(int i = 1; i<= colum; i++)
                {
                    TextView text = new TextView(this);
                    //text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                    text.setLayoutParams(LL_params_text);
                    text.setText("Zakaria "+totalcell+"  ");
                    text.setTextSize(18);
                    text.setGravity(Gravity.CENTER);
                    text.setTextColor(getResources().getColor(R.color.colorPrimaryDark,null));
                    text.setBackgroundColor(getResources().getColor(R.color.colorAccent,null));
                    linearLayout.addView(text);
                    totalcell=totalcell+1;
                }

        }

    }
}
