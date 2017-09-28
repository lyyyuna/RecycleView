package cn.lemon.recyclerview.ui.bean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.lemon.recyclerview.R;
import cn.lemon.recyclerview.ui.GlideImageLoader;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String content = intent.getStringExtra("content");

        ArrayList<String> images = new ArrayList<String>(Arrays.asList(content.split(" ")));

        Banner banner = (Banner) findViewById(R.id.banner);
        banner.setBannerStyle(BannerConfig.NUM_INDICATOR);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(15000);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}
