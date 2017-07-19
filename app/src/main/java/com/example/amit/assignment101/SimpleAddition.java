package com.example.amit.assignment101;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SimpleAddition extends Fragment {

    EditText input;
    Button btninput;
    TextView textView;
    public SimpleAddition() {
    }

    public static SimpleAddition newInstance(String param1, String param2) {
        SimpleAddition fragment = new SimpleAddition();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.fragment_simple_addition, container, false);
        input=(EditText)rootview.findViewById(R.id.editinput);
        btninput=(Button)rootview.findViewById(R.id.btnsubmit);
        textView=(TextView)rootview.findViewById(R.id.text1);
        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               textView.setText(input.getText());
            }


        });
        return rootview;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
