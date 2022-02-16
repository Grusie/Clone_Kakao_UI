package com.grusie.clone_kakao_ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.grusie.clone_kakao_ui.databinding.FragmentUserBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UserFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UserFragment : Fragment() {
    lateinit var binding: FragmentUserBinding
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
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentUserBinding.inflate(layoutInflater)
        binding.toolbarUser.apply{
            inflateMenu(R.menu.menu_user_fragment)
            title = "친구"
        }
        val datas = mutableListOf<String>()
        for(i in 1..10) {
            datas.add("Item $i")
        }
        binding.recyclerviewUserFragment.apply {
            layoutManager = LinearLayoutManager(this@UserFragment.context)
            adapter = UserAdapter(datas)
            addItemDecoration(DividerItemDecoration(this@UserFragment.context,LinearLayoutManager.VERTICAL))

        }
            return binding.root
        }
    }