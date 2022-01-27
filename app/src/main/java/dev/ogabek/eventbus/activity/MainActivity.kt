package dev.ogabek.eventbus.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.ogabek.eventbus.R
import dev.ogabek.eventbus.fragment.FirstFragment
import dev.ogabek.eventbus.fragment.SecondFragment

class MainActivity : AppCompatActivity() {

    private lateinit var firstFragment: FirstFragment
    private lateinit var secondFragment: SecondFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        firstFragment = FirstFragment()
        secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.first_fragment, firstFragment)
            .replace(R.id.second_fragment, secondFragment)
            .commit()
    }
}