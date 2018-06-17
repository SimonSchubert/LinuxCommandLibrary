package com.inspiredandroid.linuxcommandbibliotheca.asnytasks

import android.content.Context
import android.os.AsyncTask
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnCraftDatabaseListener
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants
import java.io.File
import java.io.IOException
import java.io.InputStream

/**
 * Created by Simon Schubert
 */
class LoadDatabaseAsyncTask(private val mContext: Context, private val mCallback: OnCraftDatabaseListener) : AsyncTask<Boolean, Void, Boolean>() {

    override fun doInBackground(vararg params: Boolean?): Boolean {
        val oldDatabase = mContext.getDatabasePath("commands.db")
        if (oldDatabase.exists()) {
            oldDatabase.delete()
        }

        val file = File(mContext.filesDir.toString() + "/" + Constants.REALM_DATABASE)
        if (!file.exists() || !AppManager.isDatabaseVersionUpToDate(mContext)) {
            try {
                copyBundledRealmFile(mContext.resources.openRawResource(R.raw.database))
                AppManager.setDatabaseVersionUpToDate(mContext)
            } catch (e: IOException) {
                e.printStackTrace()
                return false
            }
        }

        return true
    }

    @Throws(IOException::class)
    private fun copyBundledRealmFile(inputStream: InputStream) {
        val file = File(mContext.filesDir, Constants.REALM_DATABASE)
        file.delete()
        file.copyInputStreamToFile(inputStream)
    }

    fun File.copyInputStreamToFile(inputStream: InputStream) {
        inputStream.use { input ->
            this.outputStream().use { fileOut ->
                input.copyTo(fileOut)
            }
        }
    }

    override fun onPostExecute(success: Boolean?) {
        super.onPostExecute(success)
        if (success!!) {
            mCallback.onDatabaseCreateSuccess()
        } else {
            mCallback.onDatabaseCreateFail()
        }
    }
}