package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.activity_deeplink.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.io.File

class DeeplinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink)
        setSupportActionBar(toolbar)

        if (AppManager.existsDatabase(this)) {
            showLoadingFragment()
            doAsync {

                AppManager.createDatabase(applicationContext)
                AppManager.setDatabaseVersionUpToDate(applicationContext)
                uiThread {
                    handleIntent()
                }
            }
        } else {
            handleIntent()
        }
    }

    private fun handleIntent() {
        var commandId : Long = -1
        val data = intent.dataString
        if (intent.action == Intent.ACTION_VIEW && data != null) {
            val urlFileName = data.substring(data.lastIndexOf("/") + 1)
            val commandName = urlFileName.substring(0, urlFileName.length - 5)
            val realm = Realm.getDefaultInstance()
            val command = realm.where<Command>().equalTo(Command.NAME, commandName).findFirst()
            if (command != null) {
                commandId = command.id.toLong()
            }
            realm.close()
        }

        if(commandId != -1L) {
            val intent = Intent(this, CommandManActivity::class.java)
            intent.putExtra(CommandManActivity.EXTRA_COMMAND_ID, commandId)
            startActivity(intent)
        } else {
            Toast.makeText(this, R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_SHORT).show()
        }
        finish()
    }

    /**
     *
     */
    private fun showLoadingFragment() {
        val fragment = DatabaseLoadingFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }
}
