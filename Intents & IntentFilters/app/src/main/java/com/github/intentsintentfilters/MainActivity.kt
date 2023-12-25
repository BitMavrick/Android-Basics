package com.github.intentsintentfilters

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage
import com.github.intentsintentfilters.ui.theme.IntentsIntentFiltersTheme

@Suppress("DEPRECATION")
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<ImageViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentsIntentFiltersTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    viewModel.uri?.let {
                        AsyncImage(
                            model = viewModel.uri,
                            contentDescription = null
                        )
                    }
                    /*


                    Button(
                        onClick = {
                            // These are explicit intents
                            /*
                            Intent(applicationContext, SecondActivity::class.java).also {
                                startActivity(it)
                            }
                            */
                            /*
                            Intent(Intent.ACTION_MAIN).also {
                                it.`package` = "com.google.android.youtube" // Apps package name

                                try{
                                    startActivity(it)
                                } catch ( e: ActivityNotFoundException) {
                                    e.printStackTrace()
                                }
                            }
                             */

                            // Implicit Intents
                            val intent = Intent(Intent.ACTION_SEND).apply {
                                type = "text/plain"
                                putExtra(Intent.EXTRA_EMAIL, arrayOf("hello.mehedi@outlook.com"))
                                putExtra(Intent.EXTRA_SUBJECT, "Subject of the mail")
                                putExtra(Intent.EXTRA_TEXT, "This is the body of the mail")
                            }

                            if (intent.resolveActivity(packageManager) != null){
                                startActivity(intent)
                            }
                        }
                    ) {
                        Text(text = "Click me")
                    }
                    */
                }
            }
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        // Image is only showing from the browser link, not from the internal link

        val uri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent?.getParcelableExtra(Intent.EXTRA_STREAM, Uri::class.java)
        } else {
            intent?.getParcelableExtra(Intent.EXTRA_STREAM)
        }

        viewModel.updateUri(uri)
    }
}