package com.example.appkhushveehoreca;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class GridProductLayoutAdapter extends BaseAdapter {

    List<HorizontalProductScrollModel> horizontalProductScrollModelList;

    public GridProductLayoutAdapter(List<HorizontalProductScrollModel> horizontalProductScrollModelList) {
        this.horizontalProductScrollModelList = horizontalProductScrollModelList;
    }

    @Override
    public int getCount() {
        return horizontalProductScrollModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_scroll_item_layout,null);

            view.setElevation(0);
            view.setBackgroundColor(Color.parseColor("#FFFFFF"));

            ImageView productImage = view.findViewById(R.id.h_s_product_image);
            TextView productTitle = view.findViewById(R.id.h_s_product_title);
            TextView productDescription = view.findViewById(R.id.h_s_product_description);
            TextView productDescription1 = view.findViewById(R.id.h_s_product_description1);
            TextView productPrice = view.findViewById(R.id.h_s_product_price);
            TextView cuttedPrice = view.findViewById(R.id.h_s_cutted_price);


            Glide.with(parent.getContext()).load(horizontalProductScrollModelList.get(position).getProductImage()).apply(new RequestOptions().placeholder(R.drawable.placeholder)).into(productImage);
            productTitle.setText(horizontalProductScrollModelList.get(position).getProductTitle());
            productDescription.setText(horizontalProductScrollModelList.get(position).getProductDescription());
            productDescription1.setText(horizontalProductScrollModelList.get(position).getProductDescription1());
            productPrice.setText(horizontalProductScrollModelList.get(position).getProductPrice());
            cuttedPrice.setText(horizontalProductScrollModelList.get(position).getCuttedPrice());

        }else{
            view = convertView;
        }
        return view;
    }
}
