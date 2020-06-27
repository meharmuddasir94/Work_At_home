package com.zubairmuddasir12fyp.work_at_home.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.zubairmuddasir12fyp.work_at_home.R;
import com.zubairmuddasir12fyp.work_at_home.guest_gig;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link guest_category#newInstance} factory method to
 * create an instance of this fragment.
 */
public class guest_category extends Fragment {
    private LinearLayout l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, lv11, lv12, lv13, lv14, lv15, lv16, lv17, lv18, lv19, lv20;
    private View objcategory;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public guest_category() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment guest_category.
     */
    // TODO: Rename and change types and number of parameters
    public static guest_category newInstance(String param1, String param2) {
        guest_category fragment = new guest_category();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public void install() {
        l1 = objcategory.findViewById(R.id.lvv);
        l2 = objcategory.findViewById(R.id.lvv1);
        l3 = objcategory.findViewById(R.id.lvv2);
        l4 = objcategory.findViewById(R.id.lvv3);
        l5 = objcategory.findViewById(R.id.lvv4);
        l6 = objcategory.findViewById(R.id.lvv5);
        l7 = objcategory.findViewById(R.id.lvv6);
        l8 = objcategory.findViewById(R.id.lvv7);
        l9 = objcategory.findViewById(R.id.lvv8);
        l10 = objcategory.findViewById(R.id.lvv9);
        lv11 = objcategory.findViewById(R.id.lvv10);
        lv12 = objcategory.findViewById(R.id.lvv11);
        lv13 = objcategory.findViewById(R.id.lvv12);
        lv14 = objcategory.findViewById(R.id.lvv13);
        lv15 = objcategory.findViewById(R.id.lvv14);
        lv16 = objcategory.findViewById(R.id.lvv15);
        lv17 = objcategory.findViewById(R.id.lvv16);
        lv18 = objcategory.findViewById(R.id.lvv17);
        lv19 = objcategory.findViewById(R.id.lvv18);
        lv20 = objcategory.findViewById(R.id.lvv19);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.logod));
                startActivity(intent);
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.logoA));
                startActivity(intent);
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.busc));
                startActivity(intent);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.traf));
                startActivity(intent);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.soc));
                startActivity(intent);
            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.tshir));
                startActivity(intent);
            }
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.voice));
                startActivity(intent);
            }
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.seo));
                startActivity(intent);
            }
        });
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.photo));
                startActivity(intent);
            }
        });
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.artic));
                startActivity(intent);
            }
        });
        lv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.word));
                startActivity(intent);
            }
        });
        lv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.ill));
                startActivity(intent);
            }
        });

        lv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.mob));
                startActivity(intent);
            }
        });
        lv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.cra));
                startActivity(intent);
            }
        });
        lv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.websd));
                startActivity(intent);
            }
        });
        lv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.inte));
                startActivity(intent);
            }
        });
        lv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.res));
                startActivity(intent);
            }
        });
        lv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.vid));
                startActivity(intent);
            }
        });
        lv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.mus));
                startActivity(intent);
            }
        });
        lv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), guest_gig.class);
                intent.putExtra("full", getString(R.string.other));
                startActivity(intent);
            }
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        objcategory = inflater.inflate(R.layout.fragment_guest_category, container, false);
        install();
        return objcategory;
    }
}