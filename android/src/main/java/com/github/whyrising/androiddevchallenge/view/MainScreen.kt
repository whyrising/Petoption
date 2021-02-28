/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.whyrising.androiddevchallenge.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.github.whyrising.androiddevchallenge.theme.TemplateTheme

@Composable
private fun formatHelloText(name: String): AnnotatedString =
    buildAnnotatedString {
        append("Hello ")
        withStyle(
            SpanStyle(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.primary
            )
        ) {
            append(name)
        }
        append(" \uD83D\uDE01")
    }

@Composable
fun Greeting(name: String) {
    Scaffold {
        Surface {
            Box(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.align(Alignment.Center)) {
                    Text(text = formatHelloText(name))
                }
            }
        }
    }
}

@Composable
@Preview
fun GreetingPreview() {
    TemplateTheme {
        Greeting(name = "Jetpack Compose")
    }
}

@Composable
@Preview
fun GreetingDarkPreview() {
    TemplateTheme(isDarkTheme = true) {
        Greeting(name = "Jetpack Compose")
    }
}