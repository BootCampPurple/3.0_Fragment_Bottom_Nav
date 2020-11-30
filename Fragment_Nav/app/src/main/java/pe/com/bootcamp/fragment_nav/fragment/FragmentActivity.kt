package pe.com.bootcamp.fragment_nav.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_fragment.*
import pe.com.bootcamp.fragment_nav.R

class FragmentActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        butUno.setOnClickListener(this)
        butDos.setOnClickListener(this)
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