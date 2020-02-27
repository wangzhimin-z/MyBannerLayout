package com.wwwzm.mybannerlayout;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BannerLayout bannerLayout1 = (BannerLayout) findViewById(R.id.banner1);
        BannerLayout bannerLayout2 = (BannerLayout) findViewById(R.id.banner2);

        //根据URL加载网络图片
        final List<String> urls=new ArrayList<>();
        urls.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1435609199,2696310551&fm=26&gp=0.jpg");
        urls.add("https://dss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3166106592,2283685970&fm=26&gp=0.jpg");
        urls.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3725039361,385668773&fm=26&gp=0.jpg");
        urls.add("https://ns-strategy.cdn.bcebos.com/ns-strategy/upload/fc_big_pic/part-00571-3198.jpg");
        urls.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1829599303,3330274726&fm=26&gp=0.jpg");
        bannerLayout1.setImageLoader(new GlideImageLoader());
        bannerLayout1.setViewUrls(urls);

        //加载本地res中的图片
        final List<Integer> images=new ArrayList<>();
        images.add(R.mipmap.image1);
        images.add(R.mipmap.image2);
        images.add(R.mipmap.image3);
        images.add(R.mipmap.image4);
        bannerLayout2.setImageLoader(new GlideImageLoader());
        bannerLayout2.setViewRes(images);
    }
}
