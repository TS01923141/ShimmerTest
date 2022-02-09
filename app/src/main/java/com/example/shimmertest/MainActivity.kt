package com.example.shimmertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.shimmertest.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

//參考
//https://akshayranagujjar.medium.com/skeleton-content-loading-animation-in-android-facebook-shimmer-2a4f155de534
//https://blog.mindorks.com/using-shimmer-effect-placeholder-in-android
/*
    ShimmerFrameLayout跟item的color會影響顯示的顏色
    目前是顯示shimmerFrameLayout，要試別的再調整view的visibility
    facebookShimmerLayout
    shimmerFrameLayout
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.facebookShimmerLayout.visibility = View.VISIBLE
//        binding.facebookShimmerLayout.isVisible = true
//        binding.facebookShimmerLayout.startShimmer()
//        lifecycleScope.launch(Dispatchers.Default) {
//            delay(5000)
//            withContext(Dispatchers.Main) {
//                binding.facebookShimmerLayout.stopShimmer()
//                binding.facebookShimmerLayout.isVisible = false
//                binding.post.visibility = View.VISIBLE
//            }
//        }

        binding.shimmerFrameLayout.startShimmer()
    }
}