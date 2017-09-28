package cn.lemon.recyclerview.ui;

import android.content.Context;
import android.view.ViewGroup;

import cn.lemon.recyclerview.ui.bean.Album;
import cn.lemon.recyclerview.ui.bean.Consumption;
import cn.lemon.view.adapter.BaseViewHolder;
import cn.lemon.view.adapter.RecyclerAdapter;


class CardRecordAdapter extends RecyclerAdapter<Album> {

    private Context mcontext;

    public CardRecordAdapter(Context context) {
        super(context);
        mcontext = context;
    }

    @Override
    public BaseViewHolder<Album> onCreateBaseViewHolder(ViewGroup parent, int viewType) {
        return new ImageViewHolder(parent, mcontext);
    }
}