package com.inspiredandroid.linuxcommandbibliotheca.models

import io.realm.RealmObject
import io.realm.annotations.Required

/**
 * Created by Simon Schubert
 */
open class CommandManModel : RealmObject() {

    @Required
    var man: String? = null
}
