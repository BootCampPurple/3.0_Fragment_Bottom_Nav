package pe.com.bootcamp.fragment_nav.dialog


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import pe.com.bootcamp.fragment_nav.R
import pe.com.bootcamp.fragment_nav.databinding.DialogTermsConditionBinding


class TermsConditionDialog : DialogFragment() {


    private var _binding: DialogTermsConditionBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setStyle(STYLE_NORMAL, R.style.FullScreenDialogStyle)
        this.isCancelable = false
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DialogTermsConditionBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butAccept.setOnClickListener { dismiss() }


    }


    override fun onStart() {
        super.onStart()
        val dialog = dialog


        if (dialog != null) {
            val width = ViewGroup.LayoutParams.MATCH_PARENT
            val height = ViewGroup.LayoutParams.MATCH_PARENT
            dialog.window!!.setLayout(width, height)
        }
    }


    //region Method


    //endregion


}
