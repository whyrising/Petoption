object Libs {
    const val kotlinVersion = "1.6.10"
    const val jvmTarget = "1.8"

    object AndroidMaterial {
        private const val version = "1.5.0"

        const val material = "com.google.android.material:material:$version"
    }

    object Compose {
        private const val gr = "androidx.compose"
        const val version = "1.1.0-rc03"

        const val ui = "$gr.ui:ui:$version"

        // Tooling support (Previews, etc.)
        const val uiTooling = "$gr.ui:ui-tooling:$version"

        // Foundation (Border, Background, Box, Image, shapes, animations, etc.)
        const val foundation = "$gr.foundation:foundation:$version"

        // Material design
        const val material = "$gr.material:material:$version"

        // Material design icons
        const val iconsCore = "$gr.material:material-icons-core:$version"
        const val iconsExt = "$gr.material:material-icons-extended:$version"

        // Integration with activities
        const val activity = "androidx.activity:activity-compose:1.3.0-alpha03"

        // Integration with ViewModels
        const val viewModels =
            "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha02"

        // UI Testing
        const val uiTestJUnit = "$gr.ui:ui-test-junit4:$version"
    }

    object AndroidX {
        private const val version = "1.0.0"
        const val constraintlayout =
            "androidx.constraintlayout:constraintlayout-compose:$version"
        const val navigation =
            "androidx.navigation:navigation-compose:2.4.1"
    }

    object LayoutInspector {
        const val uiTooling = Compose.uiTooling
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
    }

    object Kotest {
        private const val version = "5.1.0"

        const val runner = "io.kotest:kotest-runner-junit5:$version"
        const val assertions = "io.kotest:kotest-assertions-core:$version"
        const val property = "io.kotest:kotest-property:$version"
    }

    object Kotlinx {
        private const val group = "org.jetbrains.kotlinx"
        private const val version = "1.6.0"

        const val coroutines = "$group:kotlinx-coroutines-android:$version"

        const val coroutinesTest = "$group:kotlinx-coroutines-test:$version"
    }
}
