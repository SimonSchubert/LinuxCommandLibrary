package com.inspiredandroid.linuxcommandbibliotheca.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by simon on 24.01.16.
 */
open class Command : RealmObject() {

    @PrimaryKey
    var id: Int = 0
    var category: Int = 0
    var name: String = ""
    var desc: String = ""

    companion object {
        val ID = "id"
        val NAME = "name"
        val DESCRIPTION = "desc"
    }
}
