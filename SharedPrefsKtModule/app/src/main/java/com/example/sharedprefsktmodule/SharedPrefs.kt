package com.example.sharedprefsktmodule

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs private constructor(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    //Overladen Writing Methods
    fun write(key: String, values: Set<String>) { prefs.edit().putStringSet(key,values).apply() }
    fun write(key: String, value: String)       { prefs.edit().putString(key, value).apply()    }
    fun write(key: String, value: Int)          { prefs.edit().putInt(key, value).apply()       }
    fun write(key: String, value: Boolean)      { prefs.edit().putBoolean(key, value).apply()   }
    fun write(key: String, value: Float)        { prefs.edit().putFloat(key, value).apply()     }
    fun write(key: String, value: Long)         { prefs.edit().putLong(key, value).apply()      }

    //Overladen Reading Methods
    fun read(key: String, defaultValue: Set<String>): Set<String> = prefs.getStringSet(key, defaultValue) ?: defaultValue
    fun read(key: String, defaultValue: String):           String = prefs.getString(key, defaultValue) ?: defaultValue
    fun read(key: String, defaultValue: Int):                 Int = prefs.getInt(key, defaultValue)
    fun read(key: String, defaultValue: Boolean):         Boolean = prefs.getBoolean(key, defaultValue)
    fun read(key: String, defaultValue: Float):             Float = prefs.getFloat(key, defaultValue)
    fun read(key: String, defaultValue: Long):               Long = prefs.getLong(key, defaultValue)

    fun clear() { prefs.edit().clear().apply() }                                    //Clear Preferences
    fun getSize(): Long = prefs.all.toString().toByteArray().size.toLong()          //Return Preferences size

    fun remove(key: String): String {
        var removedVal = ""
        if (getSize() > 0) { removedVal = prefs.getString(key, "Not Found").toString(); prefs.edit().remove(key).apply() }
        return removedVal
    }


    companion object {
        private const val SHARED_PREFS_NAME = "EnterYourDesiredNameHere"            /*xml file name*/

        @Volatile
        private var instance: SharedPrefs? = null

        fun getInstance(context: Context): SharedPrefs {
            return instance ?: synchronized(this) { instance ?: SharedPrefs(context.applicationContext).also {instance = it}  }
        }

    }
}
