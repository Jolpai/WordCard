package com.jolpai.wordkeeper.model;

import com.jolpai.wordkeeper.contract.C_My_Word;
import com.jolpai.wordkeeper.model.entity.Word;

/**
 * Created by Tanim reja on 7/28/2018.
 */

public class M_My_Word implements C_My_Word.Model {


    @Override
    public boolean saveData(Word word) {

        return true;
    }

    @Override
    public void getData() {

    }
}
