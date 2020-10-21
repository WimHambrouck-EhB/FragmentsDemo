package org.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TweedeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TweedeFragment extends Fragment {

   private TextView mText;

    public TweedeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tweede, container, false);
        mText = view.findViewById(R.id.txt_tweede_fragment);
        return  view;
    }

    public void updateText(String text)
    {
        mText.setText(text);
    }

}