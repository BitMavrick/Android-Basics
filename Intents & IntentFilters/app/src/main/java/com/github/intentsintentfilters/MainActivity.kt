package com.github.intentsintentfilters

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.github.intentsintentfilters.ui.theme.IntentsIntentFiltersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentsIntentFiltersTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
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

                        }
                    ) {
                        Text(text = "Click me")
                    }
                }
            }
        }
    }
}