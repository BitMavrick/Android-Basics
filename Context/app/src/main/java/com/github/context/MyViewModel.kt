package com.github.context

import android.content.Context
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var context: Context? = null // We should not do this way : It caused memory leaks
}