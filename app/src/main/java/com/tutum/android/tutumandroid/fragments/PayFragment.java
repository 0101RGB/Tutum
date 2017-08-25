package com.tutum.android.tutumandroid.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutum.android.tutumandroid.R;

/**
 * Created by godjakoo on 2017. 8. 24..
 */

public class PayFragment extends Fragment {
    private View wholeView= null;

    public static PayFragment newInstance(){
        return new PayFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        wholeView= inflater.inflate(R.layout.fragment_pay, null);
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

    }

    View.OnClickListener click= new View.OnClickListener(){
        @Override
        public void onClick(View v){
            int id= v.getId();
        }
    };
}
