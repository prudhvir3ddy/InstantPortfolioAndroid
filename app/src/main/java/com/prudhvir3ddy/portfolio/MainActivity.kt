package com.prudhvir3ddy.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.prudhvir3ddy.portfolio.theme.InstantPortfolioTheme

class MainActivity : ComponentActivity() {

  @OptIn(ExperimentalMaterial3Api::class)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    installSplashScreen()
    enableEdgeToEdge()
    setContent {
      InstantPortfolioTheme {
        Surface {
          Scaffold(topBar = {
            TopAppBar(
              title = {
                Column {
                  Text(stringResource(R.string.hi_i_m_prudhvi_reddy))
                  Text(text = stringResource(R.string.role_intro), style = MaterialTheme.typography.bodySmall)
                }
              })
          }) { innerPadding ->
            MainScreen(modifier = Modifier.padding(innerPadding))
          }
        }
      }
    }
  }


  @Composable
  fun MainScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
      socials.forEach { social ->
        Row(modifier = Modifier.padding(vertical = 8.dp)) {
          Text(social.action, fontStyle = FontStyle.Italic)
          Text(
            social.description,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.clickable {
              openUrl(social.link)
            }.padding(horizontal = 4.dp))
        }
      }
    }
  }


//    private fun initSocialMedia() {
//        binding.socialLinks1.linkedinIv.setOnClickListener {
//            openUrl(SocialLinks.LINKEDIN)
//        }
//        binding.socialLinks1.twitterIv.setOnClickListener {
//            openUrl(SocialLinks.TWITTER)
//        }
//        binding.socialLinks1.githubIv.setOnClickListener {
//            openUrl(SocialLinks.GITHUB)
//        }
//        binding.socialLinks1.playstoreIv.setOnClickListener {
//            openUrl(SocialLinks.PLAYSTORE)
//        }
//        binding.socialLinks1.gmailIv.setOnClickListener {
//            openUrl(SocialLinks.GMAIL)
//        }
//        binding.socialLinks2.instagramIv.setOnClickListener {
//            openUrl(SocialLinks.INSTAGRAM)
//        }
//        binding.socialLinks2.youtubeIv.setOnClickListener {
//            openUrl(SocialLinks.YOUTUBE)
//        }
//    }

  private fun openUrl(url: String) {
    val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse(url)
    startActivity(intent)
  }
}