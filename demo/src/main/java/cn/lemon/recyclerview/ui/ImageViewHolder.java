package cn.lemon.recyclerview.ui;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import cn.lemon.recyclerview.R;
import cn.lemon.recyclerview.ui.bean.Album;
import cn.lemon.recyclerview.ui.bean.Main2Activity;
import cn.lemon.view.adapter.BaseViewHolder;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by linlongxin on 2016/8/23.
 */

public class ImageViewHolder extends BaseViewHolder<Album> {

    private ImageView mImage;
    private TextView mText;
    private Context mcontext;

    public ImageViewHolder(ViewGroup parent, Context context) {
        super(parent, R.layout.holder_image);
        mcontext = context;
    }

    @Override
    public void onInitializeView() {
        super.onInitializeView();
        mImage = findViewById(R.id.image);
        mText = findViewById(R.id.text_right);
    }

    @Override
    public void setData(Album object) {
        super.setData(object);
        Glide.with(itemView.getContext())
                .load(object.cover)
                .into(mImage);
        String []urlStrs = object.content.split(" ");
        int total = urlStrs.length;
        mText.setText(total + " photos..");
    }

    @Override
    public void onItemViewClick(Album object) {
        super.onItemViewClick(object);
        Intent intent = new Intent(mcontext, Main2Activity.class);
        intent.putExtra("content", object.content);
        mcontext.startActivity(intent);
    }
}
