package jolpai.com.wordcard.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import jolpai.com.wordcard.R
import jolpai.com.wordcard.databinding.ActivityTestBinding

class Test : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
       // val binding : ActivityTestBinding = DataBindingUtil.setContentView(this,R.layout.activity_test)
       // binding.lifecycleOwner = this
        //binding.viewModel
        val name : TextView = findViewById(R.id.title)
        name.text="Tanim Reja"

    }
}
