package com.example.aplikasidrum.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aplikasidrum.*
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_lagu.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [lagu.newInstance] factory method to
 * create an instance of this fragment.
 */
class lagu : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var auth: FirebaseAuth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = FirebaseAuth.getInstance()

        satu_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LagusatuActivity::class.java)
                it.startActivity(intent)
            }

        }
        dua_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LaguduaActivity::class.java)
                it.startActivity(intent)
            }

        }
        tiga_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LagutigaActivity::class.java)
                it.startActivity(intent)
            }

        }
        empat_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LaguempatActivity::class.java)
                it.startActivity(intent)
            }

        }
        lima_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LagulimaActivity::class.java)
                it.startActivity(intent)
            }

        }
        enam_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LaguenamActivity::class.java)
                it.startActivity(intent)
            }

        }
        tujuh_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LagutujuhActivity::class.java)
                it.startActivity(intent)
            }

        }
        delapan_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LagudelapanActivity::class.java)
                it.startActivity(intent)
            }

        }
        sembilan_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LagusembilanActivity::class.java)
                it.startActivity(intent)
            }

        }
        sepuluh_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LagusepuluhActivity::class.java)
                it.startActivity(intent)
            }

        }
        sebelas_blur.setOnClickListener {
            activity?.let {
                val intent = Intent(it, LagusebelasActivity::class.java)
                it.startActivity(intent)
            }

        }

        logout.setOnClickListener {
            activity?.let {
                auth.signOut()
                val intent = Intent(it, SigninActivity::class.java)
                it.startActivity(intent)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lagu, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment lagu.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            lagu().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}