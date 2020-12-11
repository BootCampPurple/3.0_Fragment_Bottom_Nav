package pe.com.bootcamp.fragment_nav.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import pe.com.bootcamp.fragment_nav.R
import pe.com.bootcamp.fragment_nav.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        binding = ActivityFragmentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.butUno.setOnClickListener(this)
        binding.butDos.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.butUno) {
            //loadFragment(PrimerFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.flaFragment, fragment)
        fragmentTransaction.commit()
    }


}