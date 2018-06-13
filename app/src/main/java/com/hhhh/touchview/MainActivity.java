package com.hhhh.touchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mRootView 就是要出现悬浮按钮的界面的根view。就是setContentView的View。
        RelativeLayout mRootView = findViewById(R.id.constraintlayout);

        FloatDragView.addFloatDragView(this, mRootView, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 点击事件
            }
        });
    }
}
