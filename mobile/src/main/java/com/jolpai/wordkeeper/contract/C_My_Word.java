package com.jolpai.wordkeeper.contract;

import com.jolpai.wordkeeper.model.entity.Word;

/**
 * Created by Tanim reja on 7/28/2018.
 */

public interface C_My_Word {

    interface Model {
        boolean saveData(Word word);
        void getData();
    }

    interface View{
       void showWarningMessage(String message);
       void showSuccessMessage(String message);
       void closeDialog();
    }

    interface Presenter {
        boolean saveWord( Word word);
        boolean checkWord(Word word);
       // Array<Word> getWordList();
    }



}
