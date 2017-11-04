package com.github.zhuanchanganimation1;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.image1)
    ImageView image1;
    @BindView(R.id.image2)
    ImageView image2;
    @BindView(R.id.image3)
    ImageView image3;
    @BindView(R.id.image4)
    ImageView image4;
    @BindView(R.id.image5)
    ImageView image5;
    @BindView(R.id.image6)
    ImageView image6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        click();

    }

    private void click() {
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //Acitvity间的共享控件转场动画
        switch (view.getId()) {
            case R.id.image1:
                //makeSceneTransitionAnimation()  参数1：上下文 参数2：共享的空间 参数3：共享的transitionName
                startActivity(new Intent(this, Main2Activity.class),
                        ActivityOptions.makeSceneTransitionAnimation(this, image1, "myimage1").toBundle());
                break;
            case R.id.image2:
                startActivity(new Intent(this, Main3Activity.class),
                        ActivityOptions.makeSceneTransitionAnimation(this, image2, "myimage2").toBundle());
                break;
            case R.id.image3:
                break;
            case R.id.image4:
                break;
            case R.id.image5:
                break;
            case R.id.image6:
                break;
        }
    }

}
