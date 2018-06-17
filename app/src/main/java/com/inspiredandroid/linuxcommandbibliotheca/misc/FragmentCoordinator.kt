package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.view.View
import android.view.ViewGroup
import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ScriptChildrenActivity
import com.inspiredandroid.linuxcommandbibliotheca.fragments.BasicChildrenFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm

/**
 * Created by simon on 25/01/17.
 */
object FragmentCoordinator {

    fun startScriptCategoryActivity(activity: FragmentActivity, category: Int) {
        if (!isTabletLayout(activity)) {
            val intent = Intent(activity, ScriptChildrenActivity::class.java)
            intent.putExtra(ScriptChildrenActivity.EXTRA_CATEGORY_ID, category)
            activity.startActivity(intent)
        } else {
            val container = activity.findViewById<View>(R.id.fragment_container_secondary)
            (container as ViewGroup).removeAllViews()

            activity.intent.putExtra(ScriptChildrenActivity.EXTRA_CATEGORY_ID, category)

            val fragment = BasicChildrenFragment()

            val fragmentManager = activity.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.fragment_container_secondary, fragment)
            fragmentTransaction.commitAllowingStateLoss()
        }
    }

    fun startCommandManActivity(activity: FragmentActivity, id: Long) {
        if (!isTabletLayout(activity)) {
            val intent = Intent(activity, CommandManActivity::class.java)
            intent.putExtra(CommandManActivity.EXTRA_COMMAND_ID, id)
            activity.startActivity(intent)
        } else {
            val container = activity.findViewById<View>(R.id.fragment_container_secondary)
            (container as ViewGroup).removeAllViews()

            val realm = Realm.getDefaultInstance()

            val command = realm.where(Command::class.java).equalTo(Command.ID, id).findFirst()
            val name = command!!.name!!.toUpperCase()
            val category = command.category

            realm.close()

            showManFragmentInSecondaryFrame(activity, name, id, category)
        }
    }

    fun startCommandManActivity(activity: FragmentActivity, name: String) {
        val realm = Realm.getDefaultInstance()
        val command = realm.where(Command::class.java).equalTo(Command.NAME, name).findFirst()
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

            showManFragmentInSecondaryFrame(activity, name, id, category)
        }
    }

    /**
     * @param name     command name
     * @param id       unique command id
     * @param category command category
     */
    private fun showManFragmentInSecondaryFrame(activity: FragmentActivity, name: String, id: Long, category: Int) {
        val fragment = CommandManFragment()

        // Add unique command ID for fragment
        val bundle = Bundle()
        bundle.putLong(CommandManActivity.EXTRA_COMMAND_ID, id)
        bundle.putString(CommandManActivity.EXTRA_COMMAND_NAME, name)
        bundle.putInt(CommandManActivity.EXTRA_COMMAND_CATEGORY, category)
        fragment.arguments = bundle

        val fragmentManager = activity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container_secondary, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }

    fun isTabletLayout(activity: Activity): Boolean {
        return activity.findViewById<View>(R.id.fragment_container_secondary) != null
    }
}
