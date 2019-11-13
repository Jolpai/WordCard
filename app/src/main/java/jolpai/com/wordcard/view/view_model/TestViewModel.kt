package jolpai.com.wordcard.view.view_model

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    fun getWordItem() : LiveData<List<String>> {
        var liveWordList : MutableLiveData<List<String>> = MutableLiveData()
        var wordList : MutableList<String> = mutableListOf("Word-1","Word-2","Word-1","Word-4","Word-1","Word-7","Word-1","Word-1",
                "Word-1","Word-10","Word-1","Word-1","Word-14",
                "Word-1","Word-1","Word-19")

        liveWordList.value = wordList
        return liveWordList
    }
}