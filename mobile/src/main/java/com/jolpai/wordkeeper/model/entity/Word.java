package com.jolpai.wordkeeper.model.entity;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Tanim reja on 10/10/2016.
 */

public class Word extends RealmObject{
    private @PrimaryKey int  id;
    private @Index String word;
    private String meaning;
    private String voiceIdOne;
    private String voiceIdTwo;
    private String ImageId;
    private String createDate;
    private String editDate;
    private String status;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getVoiceIdOne() {
        return voiceIdOne;
    }

    public void setVoiceIdOne(String voiceIdOne) {
        this.voiceIdOne = voiceIdOne;
    }

    public String getVoiceIdTwo() {
        return voiceIdTwo;
    }

    public void setVoiceIdTwo(String voiceIdTwo) {
        this.voiceIdTwo = voiceIdTwo;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
