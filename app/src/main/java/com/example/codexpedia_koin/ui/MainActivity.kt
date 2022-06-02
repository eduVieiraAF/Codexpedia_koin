package com.example.codexpedia_koin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.codexpedia_koin.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val mainActivityViewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        mainActivityViewModel.githubAccount.observe(this) {
            tv_content.text = it.toString()
        }

        btn_fetch.setOnClickListener {
            mainActivityViewModel.fetchAccount(et_account.text.toString())
        }
    }
}