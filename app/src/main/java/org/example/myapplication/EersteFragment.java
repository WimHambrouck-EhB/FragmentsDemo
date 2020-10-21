package org.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EersteFragment extends Fragment {

    public interface OnButtonClickedListener {
        void OnButtonClicked(String text);
    }

    private OnButtonClickedListener activityCallback;
    Button myButton;

    public EersteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eerste, container, false);

        myButton = view.findViewById(R.id.btn_eerste_fragment);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked();
            }
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            activityCallback = (OnButtonClickedListener) context;
        } catch (ClassCastException e) {
            Log.e("Eerste fragment", e.getMessage());
        }
    }

    private void buttonClicked() {
        if(activityCallback != null)
        {
            activityCallback.OnButtonClicked(getString(R.string.update_second_fragment));
        }
    }
}