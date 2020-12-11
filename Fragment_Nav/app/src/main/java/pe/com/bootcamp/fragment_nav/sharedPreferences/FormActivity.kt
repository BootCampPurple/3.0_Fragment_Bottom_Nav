package pe.com.bootcamp.fragment_nav.sharedPreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import pe.com.bootcamp.fragment_nav.databinding.ActivityFormBinding

class FormActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFormBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.chkRecordar.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(compoundButton: CompoundButton, isChecked: Boolean) {

    }
}