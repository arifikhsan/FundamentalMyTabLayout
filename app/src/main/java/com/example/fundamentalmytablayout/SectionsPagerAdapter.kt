package com.example.fundamentalmytablayout

import android.content.Context
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    @androidx.annotation.StringRes
    private val tabTitles =
        intArrayOf(R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3)

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return HomeFragment.newInstance(position + 1)
    }

    @Nullable
    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(tabTitles[position])
    }
}