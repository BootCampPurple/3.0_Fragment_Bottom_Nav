package pe.com.bootcamp.fragment_nav.bottomNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_navegacion.*
import pe.com.bootcamp.fragment_nav.R

class NavegacionActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_navegacion)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragNavHost) as NavHostFragment

        NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)



        navController = navHostFragment.navController


    }
}