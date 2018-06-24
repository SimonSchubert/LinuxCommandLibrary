package com.inspiredandroid.linuxcommandbibliotheca.models

import io.realm.RealmObject

/**
 * Created by simon on 24.01.16.
 */
open class CommandPage : RealmObject() {

    var id: Int = 0
    var commandid: Int = 0
    var page: String = ""
    var title: String = ""

    companion object {
        val COMMANDID = "commandid"
    }
}
