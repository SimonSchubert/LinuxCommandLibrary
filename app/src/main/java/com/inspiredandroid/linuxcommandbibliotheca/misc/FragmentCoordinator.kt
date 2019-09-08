package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.activities.BasicGroupActivity
import com.inspiredandroid.linuxcommandbibliotheca.activities.CommandManActivity
import com.inspiredandroid.linuxcommandbibliotheca.fragments.BasicGroupFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm
import io.realm.kotlin.where

/* Copyright 2019 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
object FragmentCoordinator {

    fun startScriptCategoryActivity(activity: FragmentActivity?, category: Int) {
        activity?.let {
            if (!isTabletLayout(activity)) {
                val intent = Intent(activity, BasicGroupActivity::class.java)
                intent.putExtra(BasicGroupActivity.EXTRA_CATEGORY_ID, category)
                activity.startActivity(intent)
            } else {
                val container = activity.findViewById<View>(R.id.fragment_container_secondary)
                (container as ViewGroup).removeAllViews()

                activity.intent.putExtra(BasicGroupActivity.EXTRA_CATEGORY_ID, category)

                val fragment = BasicGroupFragment()

                val fragmentManager = activity.supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()

                fragmentTransaction.replace(R.id.fragment_container_secondary, fragment)
                fragmentTransaction.commitAllowingStateLoss()
            }
        }
    }

    fun startCommandManActivity(activity: FragmentActivity?, id: Long) {
        activity?.let {
            if (!isTabletLayout(activity)) {
                val intent = Intent(activity, CommandManActivity::class.java)
                intent.putExtra(CommandManActivity.EXTRA_COMMAND_ID, id)
                activity.startActivity(intent)
            } else {
                val container = activity.findViewById<View>(R.id.fragment_container_secondary)
                (container as ViewGroup).removeAllViews()

                val realm = Realm.getDefaultInstance()

                val command = realm.where<Command>().equalTo(Command.ID, id).findFirst()
                if (command != null) {
                    showManFragmentInSecondaryFrame(activity, id)
                }

                realm.close()
            }
        }
    }

    fun startCommandManActivity(activity: FragmentActivity?, name: String) {
        activity?.let {
            val realm = Realm.getDefaultInstance()
            val command = realm.where<Command>().equalTo(Command.NAME, name).findFirst()
            if (command == null) {
                realm.close()
                return
            }
            val id = command.id.toLong()
            realm.close()

            if (!isTabletLayout(activity)) {
                val intent = Intent(activity, CommandManActivity::class.java)
                intent.putExtra(CommandManActivity.EXTRA_COMMAND_ID, id)
                activity.startActivity(intent)
            } else {
                val container = activity.findViewById<View>(R.id.fragment_container_secondary)
                (container as ViewGroup).removeAllViews()

                showManFragmentInSecondaryFrame(activity, id)
            }
        }
    }

    private fun showManFragmentInSecondaryFrame(activity: FragmentActivity, id: Long) {
        val fragment = CommandManFragment()

        // Add unique command ID for fragment
        val bundle = Bundle()
        bundle.putLong(CommandManActivity.EXTRA_COMMAND_ID, id)
        fragment.arguments = bundle

        val fragmentManager = activity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container_secondary, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }

    fun isTabletLayout(activity: Activity?): Boolean {
        return if (activity == null) {
            false
        } else {
            activity.findViewById<View>(R.id.fragment_container_secondary) != null
        }
    }
}
