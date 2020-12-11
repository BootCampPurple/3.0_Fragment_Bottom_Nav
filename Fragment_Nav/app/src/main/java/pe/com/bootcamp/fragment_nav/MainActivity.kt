package pe.com.bootcamp.fragment_nav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.com.bootcamp.fragment_nav.bottomNavigation.NavegacionActivity
import pe.com.bootcamp.fragment_nav.databinding.ActivityMainBinding
import pe.com.bootcamp.fragment_nav.fragment.FragmentActivity
import pe.com.bootcamp.fragment_nav.sharedPreferences.FormActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tviFragment.setOnClickListener(this)
        binding.tviBottomNavigation.setOnClickListener(this)
        binding.tviFragmentDialog.setOnClickListener(this)
        binding.tviSharedPreferences.setOnClickListener(this)
    }


    override fun onClick(view: View) {

        when (view.id) {
            R.id.tviFragment -> {
                val intent = Intent(this, FragmentActivity::class.java)
                startActivity(intent)
            }

            R.id.tviSharedPreferences -> {
                val intent = Intent(this, FormActivity::class.java)
                startActivity(intent)
            }
            R.id.tviBottomNavigation -> {
                val intent = Intent(this, NavegacionActivity::class.java)
                startActivity(intent)
            }

            R.id.tviFragmentDialog -> {
                /*val fm = supportFragmentManager
                val dialog = TermsConditionDialog()
                dialog.show(fm, "")*/
            }


        }

    }
}