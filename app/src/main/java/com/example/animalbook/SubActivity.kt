package com.example.animalbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

    lionButton.setOnClickListener {
        val fragment = LionFragment()
        val fragmentManager = this.getSupportFragmentManager()
        val fragmentTransaction = fragmentManager.beginTransaction()
   fragmentTransaction.replace(R.id.container,fragment)
       .addToBackStack(null)
       .commit()
    }
        dogButton.setOnClickListener {
            val fragment = DogFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()
        }
        catButton.setOnClickListener {
            val fragment = CatFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()
        }
        val fragment = titleFragment as? TitleFragment
        fragment?.setTitle("図鑑画面")
    }
}
