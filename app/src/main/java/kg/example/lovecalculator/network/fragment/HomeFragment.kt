package kg.example.lovecalculator.network.fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.example.lovecalculator.R
import kg.example.lovecalculator.databinding.FragmentHomeBinding
import kg.example.lovecalculator.network.App
import kg.example.lovecalculator.network.model.LoveModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : androidx.fragment.app.Fragment() {
    lateinit var binding: FragmentHomeBinding
    val bundle2 = Bundle()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btn.setOnClickListener {
                bundle2.putString("My", firstText.text.toString())// PutName1
                bundle2.putString("My2", secondText.text.toString())// PutName2
                val firstEd = firstText.text.toString()
                val secondEd = secondText.text.toString()
                App.loveApi.getPersantage(firstEd, secondEd).enqueue(object : Callback<LoveModel> {
                    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
//                        Log.e("ololo", "onResponse:${response.body()?.result}")
//                        var res  = response.body()?.resul
                        val per = response.body()?.percentage
                        bundle2.putString("MyArg", per)
                        findNavController().navigate(R.id.resultFragment, bundle2)
                    }override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                        Log.e("ololo", "onFailure:${t.message}")
                    }
                })
            }
        }
    }
}


//        initMediaBackground()
//        binding.videoView.setOnCompletionListener {
//            initMediaBackground()
//        }


//    private fun initMediaBackground() {
//        val ac = requireActivity().packageName
//        val offlineV = Uri.parse("android.resource://${ac}/${R.raw.joja}")
//        binding.videoView.setVideoURI(offlineV)
//        binding.videoView.requestFocus()
//        binding.videoView.start()
//    }