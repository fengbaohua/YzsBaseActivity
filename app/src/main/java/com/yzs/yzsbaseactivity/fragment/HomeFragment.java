package com.yzs.yzsbaseactivity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yzs.yzsbaseactivity.R;
import com.yzs.yzsbaseactivity.activity.TestActivity;
import com.yzs.yzsbaseactivitylib.entity.EventCenter;
import com.yzs.yzsbaseactivitylib.fragment.YzsBaseFragment;
import com.yzs.yzsbaseactivitylib.util.ActivityGoUtils;


/**
 * Author: 姚智胜
 * Version: V1.0版本
 * Description:
 * Date: 2016/12/15.
 */
public class HomeFragment extends YzsBaseFragment {
    private static final String TAG = "HomeFragment";

    private TextView textView;

    public static HomeFragment newInstance(Bundle bundle) {
        HomeFragment fragment = new HomeFragment();
        if (null != bundle) {
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @Override
    protected View initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_home, container, false);
        return view;
    }

    @Override
    protected void initView(View view) {
        textView = (TextView) view.findViewById(R.id.home);
    }

    @Override
    protected void initLogic() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityGoUtils.getInstance().readyGo(TestActivity.class);
            }
        });
    }


    @Override
    protected void getBundleExtras(Bundle bundle) {

    }

    @Override
    protected void onEventComing(EventCenter center) {

    }

}
