package com.viet.demonviewpager

import android.os.Parcelable
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class StatePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return Int.MAX_VALUE
    }

    override fun getItem(position: Int): Fragment {
        var p = position%3
        when(p){
            0 -> return AFragment()
            1-> return BFragment()
            2->return CFragment()
        }
        return AFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Fragment $position"
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        //Log.e("aaa","DestroyItem $position")
    }

    override fun startUpdate(container: ViewGroup) {
        super.startUpdate(container)
        //Log.e("aaa","startUpdate")
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        Log.e("aaa","instantiateItem: $position")
        return super.instantiateItem(container, position)
    }

    override fun finishUpdate(container: ViewGroup) {
        super.finishUpdate(container)
        //Log.e("aaa","finishUpdate")
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        //Log.e("aaa","isViewFromObject")
        return super.isViewFromObject(view, `object`)
    }

    override fun saveState(): Parcelable? {
        //Log.e("aaa","saveState")
        return super.saveState()
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {
        //Log.e("aaa","restoreState")
        super.restoreState(state, loader)
    }

    override fun setPrimaryItem(container: ViewGroup, position: Int, `object`: Any) {
        //Log.e("aaa","setPrimaryItem: $position")
        super.setPrimaryItem(container, position, `object`)
    }
}