package com.xchen218.cs541p3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private TranslateAnimation ta;
    private AlphaAnimation aa;
    private RotateAnimation ra;
    private ScaleAnimation sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = new TranslateAnimation(0,200,0,200);
        ta.setDuration(1500);

        aa = new AlphaAnimation(1.0f, 0.0f);
        aa.setDuration(1500);

        ra = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        ra.setDuration(1500);

        sa = new ScaleAnimation(0, 10, 0, 10, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        sa.setDuration(1500);

        findViewById(R.id.btnTranslateMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View translateview) {
                translateview.startAnimation(ta);
            }
        });

        findViewById(R.id.btnAlphaMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View alphaview) {
                alphaview.startAnimation(aa);
            }
        });

        findViewById(R.id.btnRotateMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rotateview) {
                rotateview.startAnimation(ra);
            }
        });

        findViewById(R.id.btnScaleMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View scaleview) {
                scaleview.startAnimation(sa);
            }
        });

    }
}
