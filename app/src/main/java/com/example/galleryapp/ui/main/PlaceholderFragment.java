package com.example.galleryapp.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;
import com.example.galleryapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String ARG_IMG_TITLE = "image_title";
    private static final String ARG_IMG_URL = "image_url";

    private PageViewModel pageViewModel;


    int pos;
    String name, url;

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        this.pos = args.getInt(ARG_SECTION_NUMBER);
        this.name = args.getString(ARG_IMG_TITLE);
        this.url = args.getString(ARG_IMG_URL);
    }

    public static PlaceholderFragment newInstance(int index, String imageName, String imageUrl) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        bundle.putString(ARG_IMG_TITLE, imageName);
        bundle.putString(ARG_IMG_URL, imageUrl);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detail, container, false);
        ImageView imageView = root.findViewById(R.id.detail_image);
        Glide.with(getActivity())
                .load(url)
                .thumbnail(0.1f)
                .into(imageView);

        return root;
    }


}