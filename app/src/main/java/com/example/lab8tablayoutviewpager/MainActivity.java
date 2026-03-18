package com.example.lab8tablayoutviewpager;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Ánh xạ các view từ layout XML
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // 2. Khởi tạo Adapter (Người điều phối các Fragment)
        MyViewPagerAdapter adapter = new MyViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        // 3. Kết nối TabLayout với ViewPager2
        // TabLayoutMediator giúp hiển thị tên trên thanh Tab tương ứng với trang
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Trang Chủ");
                    break;
                case 1:
                    tab.setText("Yêu Thích");
                    break;
                case 2:
                    tab.setText("Cài Đặt");
                    break;
            }
        }).attach();
    }
}