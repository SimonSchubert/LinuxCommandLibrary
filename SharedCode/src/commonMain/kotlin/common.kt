package org.kotlin.mpp.mobile

expect fun platformName(): String

const val CURRENT_DATABASE_VERSION = 5

fun createApplicationScreenMessage(): String {
  return "Kotlin Rocks on ${platformName()}"
}

