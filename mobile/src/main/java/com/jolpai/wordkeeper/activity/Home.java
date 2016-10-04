package com.jolpai.wordkeeper.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;
import com.jolpai.wordkeeper.R;
import com.jolpai.wordkeeper.fragment.All;
import com.jolpai.wordkeeper.fragment.Memorized;
import com.jolpai.wordkeeper.fragment.New;

public class Home extends AppCompatActivity {
    FragmentPagerAdapter pagerAdapter;
    private PagerSlidingTabStrip tab;
    private ViewPager pager;
    private MyPagerAdapter adapter;
    private FloatingActionButton floatingButtonAddNew;

    private int toolbarColor,toolbarTextColor,white,amber_500,green_500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initialize();




    }

    public void initialize(){
        white=Home.this.getResources().getColor(R.color.white);
        amber_500=Home.this.getResources().getColor(R.color.amber_500);
        green_500=Home.this.getResources().getColor(R.color.green_500);

        floatingButtonAddNew = (FloatingActionButton)findViewById(R.id.floatingButtonAddNew);
        floatingButtonAddNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddNewDialog();
            }
        });

        toolbarColor=green_500;
        toolbarTextColor=white;

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);


        pager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

        // Bind the tabs to the ViewPager
        tab = (PagerSlidingTabStrip)findViewById(R.id.tabs);
        tab.setViewPager(pager);

        tab.setIndicatorColor(white);
        tab.setTextColor(white);
        tab.setDividerColor(white);
        tab.setUnderlineColor(white);
        tab.setUnderlineHeight(0);
        tab.setIndicatorHeight(10);
    }

    private void showAddNewDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(Home.this);
        // Get the layout inflater

        View v = initializeDialogView();

        dialog.setView(v)
                // Add action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                        //sendCertificateStatementData();
                    }
                })
                .setNegativeButton("DISCARD", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                       // txtDetail.setText("");
                    }
                })
                .setTitle("");
        dialog.create().show();
    }

    private View initializeDialogView() {
        EditText editTextWord,editTextMeaning;
        TextView txtWord,txtMeaning;

        LayoutInflater inflater = LayoutInflater.from(Home.this);

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        View v = inflater.inflate(R.layout.dialog_add_new, null);

        editTextWord=(EditText)v.findViewById(R.id.editTextWord);
        editTextMeaning=(EditText)v.findViewById(R.id.editTextMeaning);
        txtWord=(TextView)v.findViewById(R.id.txtWord);
        txtMeaning=(TextView)v.findViewById(R.id.txtMeaning);

        //editTextWord.setOnT

        return v;
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS =3;
        private final String[] TITLES = { "New", "Memorized", "All" };
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return the Fragment associated with a specified position.
         *
         * @param position
         */
        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    return New.newInstance(0,"NEW WORD");
                case 1:
                    return All.newInstance(1,"ALL");
                case 2:
                    return Memorized.newInstance(2,"MEMORIZED");
                default:
                    return null;
            }
        }

        /**
         * Return the number of views available.
         */
        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }

        @Override
        public int getCount() {
            return TITLES.length;
        }
    }
}
