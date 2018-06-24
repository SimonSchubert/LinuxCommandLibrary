package com.inspiredandroid.linuxcommandbibliotheca.models

import io.realm.RealmObject

/**
 * Created by Simon Schubert
 */
open class CommandManModel : RealmObject() {

    var man: String = ""
}
