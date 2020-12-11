package pe.com.bootcamp.fragment_nav.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pe.com.bootcamp.fragment_nav.databinding.FragmentPrimeroBinding

class PrimerFragment : Fragment(), View.OnClickListener {


    private var _binding: FragmentPrimeroBinding? = null
    private val binding get() = _binding!!


    lateinit var listener: OnPrimerFragmentListener



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentPrimeroBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.butPrimerFragment.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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