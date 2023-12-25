package com.github.intentsintentfilters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.github.intentsintentfilters.ui.theme.IntentsIntentFiltersTheme

// Second Activity
class SecondActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            IntentsIntentFiltersTheme{
                Text(text = "Second Activity")
            }
        }
    }
}