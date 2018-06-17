package com.inspiredandroid.linuxcommandbibliotheca.models

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.Required
import java.util.*

/**
 * Created by Simon Schubert
 */
open class CommandChildModel : RealmObject {

    @Required
    var command: String? = null
    var mans: RealmList<CommandManModel> = RealmList()

    constructor() {

    }

    constructor(_command: String, _mans: ArrayList<String>) {
        command = _command
        for (man in _mans) {
            mans.add(CommandManModel(man))
        }
    }

    companion object {

        fun getMans(model: CommandChildModel): Array<String> {
            return model.mans.map { it.man!! }.toTypedArray()
        }
    }
}
