package com.dagger.interoperability

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dagger.featureb.IAmB
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var b: IAmB

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(b.print())
    }
}
