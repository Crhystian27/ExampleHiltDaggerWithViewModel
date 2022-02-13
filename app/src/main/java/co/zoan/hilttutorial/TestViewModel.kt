package co.zoan.hilttutorial

import android.util.Log
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named


@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String2")
    testString2: String
) : ViewModel(), LifecycleObserver {

    init {
        Log.d("ViewModel", "Test String from viewModel: $testString2")
    }
}