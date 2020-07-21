package com.prudhvir3ddy.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.social_links_1.github_iv
import kotlinx.android.synthetic.main.social_links_1.gmail_iv
import kotlinx.android.synthetic.main.social_links_1.linkedin_iv
import kotlinx.android.synthetic.main.social_links_1.playstore_iv
import kotlinx.android.synthetic.main.social_links_1.social_media_1
import kotlinx.android.synthetic.main.social_links_1.twitter_iv
import kotlinx.android.synthetic.main.social_links_2.facebook_iv
import kotlinx.android.synthetic.main.social_links_2.instagram_iv
import kotlinx.android.synthetic.main.social_links_2.medium_iv
import kotlinx.android.synthetic.main.social_links_2.social_media_2
import kotlinx.android.synthetic.main.social_links_2.stackinflow_iv
import kotlinx.android.synthetic.main.social_links_2.youtube_iv

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val anim1 = AnimationUtils.loadAnimation(this, R.anim.left_to_right)
    social_media_1.startAnimation(anim1)

    val anim2 = AnimationUtils.loadAnimation(this, R.anim.right_to_left)
    social_media_2.startAnimation(anim2)

    initSocialMedia()

  }

  private fun initSocialMedia() {
    linkedin_iv.setOnClickListener {
      openUrl(getString(R.string.linkedin))
    }
    twitter_iv.setOnClickListener {
      openUrl(getString(R.string.twitter))
    }
    github_iv.setOnClickListener {
      openUrl(getString(R.string.github))
    }
    playstore_iv.setOnClickListener {
      openUrl(getString(R.string.playstore))
    }
    gmail_iv.setOnClickListener {
      openUrl(getString(R.string.gmail))
    }
    instagram_iv.setOnClickListener {
      openUrl(getString(R.string.instagram))
    }
    medium_iv.setOnClickListener {
      openUrl(getString(R.string.medium))
    }
    facebook_iv.setOnClickListener {
      openUrl(getString(R.string.facebook))
    }
    youtube_iv.setOnClickListener {
      openUrl(getString(R.string.youtube))
    }
    stackinflow_iv.setOnClickListener {
      val sendIntent = Intent()
      sendIntent.action = Intent.ACTION_SEND
      sendIntent.putExtra(
          Intent.EXTRA_TEXT,
          "Hey check out this cool portfolio app at: https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID
      )
      sendIntent.type = "text/plain"
      startActivity(sendIntent)
    }
  }

  private fun openUrl(url: String) {
    val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse(url)
    startActivity(intent)
  }
}