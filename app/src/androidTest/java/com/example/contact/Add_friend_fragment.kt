package com.example.contact

import android.os.Bundle
import android.provider.CalendarContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.*

class Add_friend_fragment: Fragment() {

    companion object {
        fun newInstance(): Add_friend_fragment {
            return Add_friend_fragment()
        }
    }
    override fun  onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstances: Bundle?): view? {
        return inflater.inflate(R.layout.add_friend_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }

}