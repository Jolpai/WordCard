package com.jolpai.wordkeeper.activity;



import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;
import com.jolpai.wordkeeper.R;
import com.jolpai.wordkeeper.fragment.All;
import com.jolpai.wordkeeper.fragment.Memorized;
import com.jolpai.wordkeeper.fragment.New;

import io.realm.Realm;

public class Home extends AppCompatActivity {
    FragmentPagerAdapter pagerAdapter;
    private PagerSlidingTabStrip tab;
    private ViewPager pager;
    private MyPagerAdapter adapter;
    private FloatingActionButton floatingButtonAddNew;
    private EditText editTextWord,editTextMeaning;
    private TextView txtWord,txtMeaning;

    private int toolbarColor,toolbarTextColor,white,amber_500,green_500;

    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initialize();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }

    public void initialize(){
        realm =Realm.getDefaultInstance();

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

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View v = initializeDialogView();
        builder.setView(v);
        builder.setPositiveButton("Save",null);
        builder.setNegativeButton("Cancel",null);
        final AlertDialog dialog = builder.create();
        dialog.show();
        //Overriding the handler immediately after show is probably a better approach than OnShowListener as described below
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Boolean wantToCloseDialog = saveDate();
                //Do stuff, possibly set wantToCloseDialog to true then...
                if(wantToCloseDialog)
                    dialog.dismiss();
                //else dialog stays open. Make sure you have an obvious way to close the dialog especially if you set cancellable to false.
            }
        });

    }

    private boolean saveDate() {
        if(editTextWord.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(Home.this,"Word is missing",Toast.LENGTH_SHORT).show();
            return false;
        }else if(editTextMeaning.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(Home.this,"Meaning is missing",Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private View initializeDialogView() {

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
