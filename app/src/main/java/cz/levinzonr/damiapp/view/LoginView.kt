package cz.levinzonr.damiapp.view

import cz.levinzonr.damiapp.model.entities.User

interface LoginView {

    fun onLoginStart()

    fun onLoginFinished(user: User)

    fun onLoginError(error: String)

    fun enableLoginButton(enable: Boolean)

}