package cz.levinzonr.damiapp.view

import cz.levinzonr.damiapp.model.entities.User

interface MainView {

    fun onUserInfoLoaded(user: User)
}