package com.github.viewmodelconfchanges

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.github.viewmodelconfchanges.ui.theme.ViewModelConfChangesTheme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<ContactsViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewModelConfChangesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                    Button(
                        onClick = {
                            viewModel.changeBackGroundColor()
                        }
                    ) {
                        Text(text = "Change color")
                    }
                }
            }
        }
    }
}