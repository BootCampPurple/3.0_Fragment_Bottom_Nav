package pe.com.bootcamp.fragment_nav.sharedPreferences

import android.content.Context
import android.content.SharedPreferences

//Reference https://github.com/lomza/sharedpreferences-in-kotlin
object AppPreferences {
    private const val NAME = "preferenceClase"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    // list of app specific preferences
    private val NAME_USER = Pair("nameUser", "")


    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    fun cleanSharedPreferences() {
        preferences.edit().clear().apply()
    }
    /**
     * SharedPreferences extension function, so we won't need to call edit() and apply()
     * ourselves on every SharedPreferences operation.
     */
    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }


    //region login
    var nameUser: String?
        get() = preferences.getString(NAME_USER.first, NAME_USER.second)
        set(value) = preferences.edit {
            it.putString(NAME_USER.first, value)
        }

    //endregion


}