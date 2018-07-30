package com.jolpai.wordkeeper.presenter;

import com.jolpai.wordkeeper.contract.C_My_Word;
import com.jolpai.wordkeeper.model.M_My_Word;
import com.jolpai.wordkeeper.model.entity.Word;
import com.jolpai.wordkeeper.view.activity.Activity_My_Word;

import javax.annotation.Nonnull;

/**
 * Created by Tanim reja on 7/28/2018.
 */

public class P_My_Word implements C_My_Word.Presenter{

    M_My_Word model;
    Activity_My_Word view;


    public P_My_Word(Activity_My_Word view){
        this.view=view;
    }

    @Override
    public boolean saveWord(@Nonnull Word word) {

        boolean isSuccessfullySave =false ;

        if(word.getWord().equalsIgnoreCase("")){
            view.showWarningMessage("empty");
        }else if(word.getMeaning().equalsIgnoreCase("")){
            view.showWarningMessage("empty");
        }else {
            isSuccessfullySave = model.saveData(word);
        }
        return isSuccessfullySave;
    }

    @Override
    public boolean checkWord(Word word) {

        if(word.getWord().equalsIgnoreCase("")){
            view.showWarningMessage("empty");
        }else if(word.getMeaning().equalsIgnoreCase("")){
            view.showWarningMessage("empty");
        }
        return false;
    }
}


