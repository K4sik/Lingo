package com.example.lingo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lingo.R
import com.example.lingo.adapters.HomeLevelsAdapter
import com.example.lingo.adapters.SettingsAdapter
import com.example.lingo.models.HomeLevels
import com.example.lingo.models.Settings


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

//        val bt_button: Button = rootView.findViewById(R.id.bt_button)
//        bt_button.setOnClickListener{
//            val i = Intent(activity, Level2Activity::class.java)
//            startActivity(i)
//        }


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_recyclerView)
        recyclerView.setLayoutManager(LinearLayoutManager(context))
        val dataholder = arrayListOf<HomeLevels>()

        dataholder.add(HomeLevels(R.drawable.ic_people, R.drawable.ic_near_me, "Write to us", R.drawable.ic_arrow_forward))
        dataholder.add(HomeLevels(R.drawable.ic_people, R.drawable.ic_star, "Rate us on app store", R.drawable.ic_arrow_forward))
        dataholder.add(HomeLevels(R.drawable.ic_people, R.drawable.ic_people, "About us", R.drawable.ic_arrow_forward))

        recyclerView.adapter = HomeLevelsAdapter(dataholder)

        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

}