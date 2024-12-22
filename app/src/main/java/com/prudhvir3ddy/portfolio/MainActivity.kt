package com.prudhvir3ddy.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.prudhvir3ddy.portfolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val anim1 = AnimationUtils.loadAnimation(this, R.anim.left_to_right)
    binding.socialLinks1.socialMedia1.startAnimation(anim1)

    val anim2 = AnimationUtils.loadAnimation(this, R.anim.right_to_left)
    binding.socialLinks2.socialMedia2.startAnimation(anim2)

    initSocialMedia()

  }

  private fun initSocialMedia() {
    binding.socialLinks1.linkedinIv.setOnClickListener {
      openUrl(getString(R.string.linkedin))
    }
    binding.socialLinks1.twitterIv.setOnClickListener {
      openUrl(getString(R.string.twitter))
    }
    binding.socialLinks1.githubIv.setOnClickListener {
      openUrl(getString(R.string.github))
    }
    binding.socialLinks1.playstoreIv.setOnClickListener {
      openUrl(getString(R.string.playstore))
    }
    binding.socialLinks1.gmailIv.setOnClickListener {
      openUrl(getString(R.string.gmail))
    }
    binding.socialLinks2.instagramIv.setOnClickListener {
      openUrl(getString(R.string.instagram))
    }
    binding.socialLinks2.mediumIv.setOnClickListener {
      openUrl(getString(R.string.medium))
    }
    binding.socialLinks2.facebookIv.setOnClickListener {
      openUrl(getString(R.string.facebook))
    }
    binding.socialLinks2.youtubeIv.setOnClickListener {
      openUrl(getString(R.string.youtube))
    }
  }

  private fun openUrl(url: String) {
    val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse(url)
    startActivity(intent)
  }
}