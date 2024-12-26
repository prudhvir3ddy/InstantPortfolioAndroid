package com.prudhvir3ddy.portfolio

class SocialLinks {
    companion object {
        const val LINKEDIN = "https://www.linkedin.com/in/prudhvir3ddy/"
        const val TWITTER = "https://twitter.com/prudhvir3ddy"
        const val GITHUB = "https://github.com/prudhvir3ddy"
        const val PLAYSTORE = "https://play.google.com/store/apps/dev?id=4827386835890009798"
        const val GMAIL = "mailto:prudhvireddy.m01@gmail.com"
        const val INSTAGRAM = "https://www.instagram.com/prudhvir3ddy/"
        const val YOUTUBE = "https://www.youtube.com/channel/UC-VnpasahhnVnNOhyQ1Y5JQ"
    }
}

data class Social(
    val action: String,
    val link: String,
    val description: String
)

val socials = listOf(
    Social("Hire", SocialLinks.LINKEDIN, "LinkedIn"),
    Social("Fork", SocialLinks.GITHUB, "GitHub"),
    Social("Install apps", SocialLinks.PLAYSTORE, "Play Store"),
    Social("Contact", SocialLinks.GMAIL, "Gmail"),
    Social("Fire", SocialLinks.TWITTER, "Twitter")
)