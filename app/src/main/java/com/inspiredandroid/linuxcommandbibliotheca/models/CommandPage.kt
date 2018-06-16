package com.inspiredandroid.linuxcommandbibliotheca.models

import io.realm.RealmObject
import io.realm.annotations.Required

/**
 * Created by simon on 24.01.16.
 */
open class CommandPage : RealmObject() {

    var id: Int = 0
    var commandid: Int = 0
    @Required
    var page: String? = null
    @Required
    var title: String? = null

    companion object {
        val COMMANDID = "commandid"
    }
}
