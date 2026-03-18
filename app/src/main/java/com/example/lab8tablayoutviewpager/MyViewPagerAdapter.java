package com.example.lab8tablayoutviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Trình tự xuất hiện của các trang
        switch (position) {
            case 0: return new HomeFragment();
            case 1: return new FavoriteFragment();
            case 2: return new SettingsFragment();
            default: return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3; // Tổng số Tab bạn có
    }
}