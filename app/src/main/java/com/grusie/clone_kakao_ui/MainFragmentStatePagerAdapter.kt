package com.grusie.clone_kakao_ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

const val USER_FRAG = 0
const val CHAT_FRAG = 1
const val VIEW_FRAG = 2
const val SHOPPING_FRAG = 3
const val PLUS_FRAG = 4

class MainFragmentStatePagerAdapter(fm : FragmentManager, val fragmentCount : Int) : FragmentStatePagerAdapter(fm){
    override fun getCount() = fragmentCount

    override fun getItem(position: Int): Fragment {
        when(position){
            USER_FRAG -> return UserFragment()
            CHAT_FRAG -> return ChatFragment()
            VIEW_FRAG -> return ViewFragment()
            SHOPPING_FRAG -> return ShoppingFragment()
            PLUS_FRAG -> return PlusFragment()
            else -> return UserFragment()
        }
    }
}