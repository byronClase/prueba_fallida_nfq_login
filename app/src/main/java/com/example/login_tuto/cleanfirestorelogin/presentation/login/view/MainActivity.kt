package com.example.login_tuto.cleanfirestorelogin.presentation.login.view


import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.login_tuto.R
import com.example.login_tuto.cleanfirestorelogin.base.BaseActivity
import com.example.login_tuto.cleanfirestorelogin.presentation.login.LoginContract
import kotlinx.android.synthetic.main.activity_main.butonSignIn
import kotlinx.android.synthetic.main.activity_main.progressBar

/**
 * Created by Byron Nasimba on 14 April 2023
 */

class MainActivity : BaseActivity(), LoginContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        butonSignIn.setOnClickListener {
            signIn()
        }
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun showError(msnError: String) {
        Toast.makeText(this, msnError, Toast.LENGTH_SHORT).show()
    }

    override fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        progressBar.visibility = View.GONE
    }

    override fun signIn() {
        Toast.makeText(this, "Prueba de sesion", Toast.LENGTH_SHORT).show()
    }
}