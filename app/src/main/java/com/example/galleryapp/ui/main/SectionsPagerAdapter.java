package com.example.galleryapp.ui.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.galleryapp.ImageModel;
import com.example.galleryapp.R;

import java.util.ArrayList;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};


    private final Context mContext;

    private ArrayList<ImageModel> imageData;

    public SectionsPagerAdapter(@NonNull FragmentManager fm, Context mContext, ArrayList<ImageModel> imageData) {
        super(fm);
        this.mContext = mContext;
        this.imageData = imageData;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position, imageData.get(position).getImageName(), imageData.get(position).getImageUrl());
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return imageData.get(position).getImageName();
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return imageData.size();
    }
}