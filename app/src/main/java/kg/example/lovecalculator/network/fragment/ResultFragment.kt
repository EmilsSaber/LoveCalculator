package kg.example.lovecalculator.network.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kg.example.lovecalculator.R
import kg.example.lovecalculator.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    lateinit var binding: FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getRes()
        getNamef()
    }

    private fun getNamef() {
        val name = arguments?.getString("My")
        val name2 = arguments?.getString("My2")
        binding.firsName.text = name.toString()
        binding.secondName.text = name2.toString()
    }

    private fun getRes() {
        val text = arguments?.getString("MyArg")
        binding.getPer.text = "$text%"
    }
}