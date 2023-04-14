package com.example.login_tuto.cleanfirestorelogin.presentation.login

interface LoginContract {
    interface View{
        fun showError(msnError:String)
        fun showProgressBar()
        fun hideProgressBar()
        fun signIn()
    }

}