<<<<<<<< HEAD:app/src/androidTest/java/com/example/showcurrentlocation/ExampleInstrumentedTest.kt
package com.example.showcurrentlocation
========
package com.example.mapstesting
>>>>>>>> d782cc0b8876caa880b81ebd391233a868f70ada:mapsTesting/app/src/androidTest/java/com/example/mapstesting/ExampleInstrumentedTest.kt

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
<<<<<<<< HEAD:app/src/androidTest/java/com/example/showcurrentlocation/ExampleInstrumentedTest.kt
        assertEquals("com.example.showcurrentlocation", appContext.packageName)
========
        assertEquals("com.example.mapstesting", appContext.packageName)
>>>>>>>> d782cc0b8876caa880b81ebd391233a868f70ada:mapsTesting/app/src/androidTest/java/com/example/mapstesting/ExampleInstrumentedTest.kt
    }
}