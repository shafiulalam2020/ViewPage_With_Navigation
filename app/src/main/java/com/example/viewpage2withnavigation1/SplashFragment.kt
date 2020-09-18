package com.example.viewpage2withnavigation1

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viewpage2withnavigation1.R.id.action_splashFragment_to_homeFragment
import com.example.viewpage2withnavigation1.R.id.action_splashFragment_to_viewPageFragment


class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            if (onBoardingFinished(R.id.action_splashFragment_to_homeFragment)){ //eita relation hoccena keno ? দেখতিছি
                findNavController().navigate(action_splashFragment_to_homeFragment)
            }
            else{
                findNavController().navigate(action_splashFragment_to_viewPageFragment)
            }




        }, 3000) /** eikhane ami joto millis dibo totokkhon SPLASHScreen Thakbe**/

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun onBoardingFinished(actionSplashfragmentToHomefragment: Int): Boolean {

        val sharedPref = requireActivity().getSharedPreferences(""
            /**ei jaygai jodi ami ("onBoarding") lagaia dey tahole
             * kono prokar viewpage sarai page Open hobe kin2 splash screen hobe**/

            , Context.MODE_PRIVATE)
       return sharedPref.getBoolean("Finished",false)
    }


}