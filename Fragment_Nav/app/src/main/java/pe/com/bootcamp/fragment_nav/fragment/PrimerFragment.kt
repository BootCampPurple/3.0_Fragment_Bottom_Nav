package pe.com.bootcamp.fragment_nav.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_primero.*
import pe.com.bootcamp.fragment_nav.R

class PrimerFragment : Fragment(), View.OnClickListener {
    lateinit var listener: OnPrimerFragmentListener


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        return inflater.inflate(R.layout.fragment_primero, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        butPrimerFragment.setOnClickListener(this)
    }

    override fun onClick(view: View) {
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // Utilizado para instanciar interface
        listener = try {
            context as OnPrimerFragmentListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                activity.toString()
                        + " must implement OnHeadlineSelectedListener"
            )
        }
    }

}

// Container Activity must implement this interface
interface OnPrimerFragmentListener {
    fun onBotonSeleccionado(mensaje: String)
}