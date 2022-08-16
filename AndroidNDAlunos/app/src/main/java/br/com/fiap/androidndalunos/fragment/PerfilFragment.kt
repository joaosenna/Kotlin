package br.com.fiap.androidndalunos.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.fiap.androidndalunos.databinding.FragmentAlunosBinding
import br.com.fiap.androidndalunos.databinding.FragmentPerfilBinding

class PerfilFragment : Fragment(){

    lateinit var binding: FragmentPerfilBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPerfilBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }
}