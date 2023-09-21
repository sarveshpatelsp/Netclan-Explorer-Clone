package com.example.dummy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterClass extends FragmentStateAdapter {

    public AdapterClass(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new PersonalFragment();
            case 1:
                return new BusinessFragment();
            case 2:
                return new MerchantFragment();
            default: return new PersonalFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
