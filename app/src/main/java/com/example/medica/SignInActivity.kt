package com.example.medica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medica.databinding.ActivitySignInBinding
import com.example.medica.databinding.ActivitySignUpBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var emailEtSelect = binding.emailEt
        emailEtSelect.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus == true){
                binding.emailEt.setBackgroundResource(R.drawable.create_account_plantext_sellect_border_radius)
                binding.emailEt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.select_message, 0, 0, 0);

            }else{
                binding.emailEt.setBackgroundResource(R.drawable.create_account_plantext_border_radius)
                binding.emailEt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.message, 0, 0, 0);
            }
        }
        var passwordEtSelect = binding.passwordEt
        passwordEtSelect.setOnFocusChangeListener{v , hasFocus ->
            if (hasFocus == true) {
                binding.passwordEt.setBackgroundResource(R.drawable.create_account_plantext_sellect_border_radius)
                binding.passwordEt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.select_lock, 0, R.drawable.select_group, 0);
            }else{
                binding.passwordEt.setBackgroundResource(R.drawable.create_account_plantext_border_radius)
                binding.passwordEt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, R.drawable.group, 0);
            }
        }


    }
}




//      val emailEt = binding.emailEt
//
//emailEt.setOnFocusChangeListener { v, hasFocus ->
//    if (hasFocus) {
//        // Edit Textga fokus qilinganda orqa fonni o'zgartiring
//        emailEt.setBackgroundResource(R.drawable.create_account_plaintext_select_border_radius)
//    } else {
//        // Edit Textdan fokus olib tashlanganda orqa fonni qaytarish
//        emailEt.setBackgroundResource(R.drawable.create_account_plaintext_default_border_radius)
//    }
//}
