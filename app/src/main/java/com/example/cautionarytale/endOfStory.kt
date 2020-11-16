package com.example.cautionarytale

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class endOfStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_of_story)

            val videoView = findViewById<VideoView>(R.id.video_View)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val onlineUri = Uri.parse("https://r1---sn-bg0ezn7z.googlevideo.com/videoplayback?expire=1605505423&ei=L72xX7WKDeyIv_IPwt2nmAY&ip=45.167.36.35&id=o-AOcTTEtPo79KbSHYYmIp2X9Pu37H4vXqVKRp_8_J9cSg&itag=399&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C399&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=hyXw-XaFMANJmpqJItwgbN8F&gir=yes&clen=21098131&dur=176.041&lmt=1599295970258409&fvip=1&keepalive=yes&beids=9466586&c=WEB&txp=5531432&n=el7HcAwIRd949rsXG&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cdur%2Clmt&sig=AOq0QJ8wRQIgF-OVptrr2B_yVpRCpzQx-PeK6fI4tdNQfqBQMZ1iwCECIQCQ8VhSFr-LqYqq2bPz7OChn4_uTgbBMJ3u7J5G3kpdRA%3D%3D&rm=sn-wjuxaxjvcg-gqje7e,sn-pmcg-bg0e7e&fexp=9466586&req_id=122b0c156c26a3ee&redirect_counter=2&cms_redirect=yes&ipbypass=yes&mh=xg&mm=30&mn=sn-bg0ezn7z&ms=nxu&mt=1605499459&mv=m&mvi=1&pl=24&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhAJEvcn7yKhwu_XKE625OVgFIl5glJ1qU9dhdbhGGRNiyAiBgsDcUV9TmBmEvEJk2a6yhlmMMIVWJXvdczTnygSKn9w%3D%3D")
        val offlineUri = Uri.parse("android.resource://$packageName/${R.raw.watermelonacautionarytale}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()
    }


}