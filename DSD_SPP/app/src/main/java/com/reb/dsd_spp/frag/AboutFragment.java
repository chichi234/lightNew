package com.reb.dsd_spp.frag;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reb.dsd_spp.R;
import com.reb.dsd_spp.base.BaseFragment;

/**
 * Created by Administrator on 2018/1/7 0007.
 */

public class AboutFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.frag_about, null);
        }
        return mRootView;
    }
}
