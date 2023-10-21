package com.example.tgsoptionmenu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.tgsoptionmenu.databinding.FragmentRegisterBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {
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
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragregis = inflater.inflate(R.layout.fragment_register, container, false)
        val btnReg = fragregis.findViewById<Button>(R.id.btnregister)
        val name = fragregis.findViewById<EditText>(R.id.Rusername)
        val email = fragregis.findViewById<EditText>(R.id.Remail)
        val telepon = fragregis.findViewById<EditText>(R.id.Rphone)
        val password = fragregis.findViewById<EditText>(R.id.RPassword)

        btnReg.setOnClickListener{
            MainActivity.EXTRA_NAME = name.text.toString()
            MainActivity.EXTRA_EMAIL = email.text.toString()
            MainActivity.EXTRA_PHONE = telepon.text.toString()
            MainActivity.EXTRA_PASSWORD = password.text.toString()
            name.setText("")
            email.setText("")
            telepon.setText("")
            password.setText("")
            Toast.makeText(activity, "register successfully", Toast.LENGTH_SHORT).show()
        }
        return fragregis

    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment RegisterFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            RegisterFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}