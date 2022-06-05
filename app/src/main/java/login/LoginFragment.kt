package login

import android.os.Bundle
import android.view.View
import intership.base.BaseFragment
import com.example.second_lesson.R
import com.example.second_lesson.databinding.FragmentLoginBinding
import com.example.second_lesson.fragments.base.BaseFragment
import com.example.second_lesson.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment :
    BaseFragment<FragmentLoginBinding>(contentLayoutID = R.layout.fragment_login) {
    private val viewModel: LoginViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

    }
}