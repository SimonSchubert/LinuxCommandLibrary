package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.view.View
import android.view.ViewGroup
import com.inspiredandroid.linuxcommandbibliotheca.BasicGroupActivity
import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.fragments.BasicGroupFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm
import io.realm.kotlin.where

/**
 * Created by simon on 25/01/17.
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
                    val name = command.name.toUpperCase()
                    showManFragmentInSecondaryFrame(activity, name, id)
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
            val category = command.category
            realm.close()

            if (!isTabletLayout(activity)) {
                val intent = Intent(activity, CommandManActivity::class.java)
                intent.putExtra(CommandManActivity.EXTRA_COMMAND_ID, id)
                activity.startActivity(intent)
            } else {
                val container = activity.findViewById<View>(R.id.fragment_container_secondary)
                (container as ViewGroup).removeAllViews()

                showManFragmentInSecondaryFrame(activity, name, id)
            }
        }
    }

    /**
     * @param name     command name
     * @param id       unique command id
     * @param category command category
     */
    private fun showManFragmentInSecondaryFrame(activity: FragmentActivity, name: String, id: Long) {
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
