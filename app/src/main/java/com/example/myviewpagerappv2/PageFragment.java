package com.example.myviewpagerappv2;

import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {

    private static final String KEY_POSITION = "position";
    private static final String KEY_COLOR = "color";

    public PageFragment() {
        // Required empty public constructor
    }

    public static PageFragment newInstance(int position, int color) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(KEY_POSITION, position);
        args.putInt(KEY_COLOR, color);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Get layout of PageFragment
        View result = inflater.inflate(R.layout.fragment_page, container, false);

        // Get widgets from layout an serialise it
        LinearLayout rootView = result.findViewById(R.id.fragment_page_rootview);
        TextView textView = result.findViewById(R.id.fragment_page_title);

        // Get data from Bundle
        int position = getArguments().getInt(KEY_POSITION, -1);
        int color = getArguments().getInt(KEY_COLOR, -1);

        Log.i(getClass().getSimpleName(), "onCreateView pos " + position + " col " + color);

        // Update widgets with data
        rootView.setBackgroundColor(color);
        textView.setText("Page number " + position);

        Log.e(getClass().getSimpleName(), "onCreate called for fragment number " + position);

        return result;
    }
}