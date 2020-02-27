package com.wwwzm.mybannerlayout;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016/12/21 0021.
 */

public class GlideImageLoader implements BannerLayout.ImageLoader {
    @Override
    public void displayImage(Context context, String path, ImageView imageView) {
        Glide.with(context).load(path).centerCrop().into(imageView);
    }

    @Override
    public void displayImage1(Context context, Integer id, ImageView imageView) {
        Glide.with(context).load(id).centerCrop().into(imageView);
    }

}
