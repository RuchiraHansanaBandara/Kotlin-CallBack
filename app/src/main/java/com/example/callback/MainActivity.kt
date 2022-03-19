package com.example.callback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),TextCallback {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fargmentData = DataSubmitFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fargmentData).commit()

    }

    override fun Datapass(name: String, Email: String) {
        val bundle = Bundle()
        bundle.putString("Name" ,name)
        bundle.putString("Email" ,Email)

        val trans = this.supportFragmentManager.beginTransaction()
        val fragmentDataView = DataviewFragment()
        fragmentDataView.arguments = bundle

        trans.replace(R.id.fragment_container,fragmentDataView)
        trans.commit()

    }


}