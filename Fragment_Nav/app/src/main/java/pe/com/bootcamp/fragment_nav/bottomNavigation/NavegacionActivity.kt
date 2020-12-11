package pe.com.bootcamp.fragment_nav.bottomNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import pe.com.bootcamp.fragment_nav.R
import pe.com.bootcamp.fragment_nav.databinding.ActivityNavegacionBinding

class NavegacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavegacionBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavegacionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setContentView(R.layout.activity_navegacion)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragNavHost) as NavHostFragment

        NavigationUI.setupWithNavController(binding.bottomNavView, navHostFragment.navController)



        navController = navHostFragment.navController


    }
}