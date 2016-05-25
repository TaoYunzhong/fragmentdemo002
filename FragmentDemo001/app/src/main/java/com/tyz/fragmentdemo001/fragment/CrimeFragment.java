package com.tyz.fragmentdemo001.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tyz.fragmentdemo001.R;
import com.tyz.fragmentdemo001.model.Crime;

/**
 * Created by Administrator on 2016/5/23.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mEtTitle;
    private Button mBtnShow;
    @Override
    public void onCreate(Bundle savedInstanceState) {
		// add by ted test
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_xml, container, false);
        mEtTitle = (EditText) v.findViewById(R.id.et_crimetitle);
        mBtnShow = (Button) v.findViewById(R.id.btn_show);
        mEtTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mCrime.setTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mBtnShow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), mCrime.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
