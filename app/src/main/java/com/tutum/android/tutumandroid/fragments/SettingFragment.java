package com.tutum.android.tutumandroid.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tutum.android.tutumandroid.R;
import com.tutum.android.tutumandroid.forlists.SettingAdapter;
import com.tutum.android.tutumandroid.forlists.SettingItem;

import java.util.ArrayList;

/**
 * Created by godjakoo on 2017. 8. 24..
 */

public class SettingFragment extends Fragment {
    private View wholeView= null;
    private SettingAdapter mAdapter= null;
    private ArrayList<SettingItem> mContent= null;
    private ListView mList= null;

    public static SettingFragment newInstance(){
        return new SettingFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        wholeView= inflater.inflate(R.layout.fragment_setting, null);
        return wholeView;
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        mList= (ListView)wholeView.findViewById(R.id.fragment_setting_listview);
        mList.setAdapter(mAdapter);
        mList.setOnItemClickListener(itemClick);
    }

    View.OnClickListener click= new View.OnClickListener(){
        @Override
        public void onClick(View v){
            int id= v.getId();
        }
    };
    AdapterView.OnItemClickListener itemClick= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    };
}
