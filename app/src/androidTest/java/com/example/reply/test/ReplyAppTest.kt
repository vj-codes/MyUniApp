package com.example.reply.test

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.reply.R
import com.example.reply.ui.UniApp
import org.junit.Rule
import org.junit.Test

class UniAppTest {

    /**
     * Note: To access to an empty activity, the code uses ComponentActivity instead of
     * MainActivity.
     */
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    @TestCompactWidth
    fun compactDevice_verifyUsingBottomNavigation() {
        // Set up compact window
        composeTestRule.setContent {
            UniApp(
                windowSize = WindowWidthSizeClass.Compact
            )
        }
        // Bottom navigation is displayed
        composeTestRule.onNodeWithTagForStringId(
            R.string.navigation_bottom
        ).assertExists()
    }

    @Test
    @TestMediumWidth
    fun mediumDevice_verifyUsingNavigationRail() {
        // Set up medium window
        composeTestRule.setContent {
            UniApp(
                windowSize = WindowWidthSizeClass.Medium
            )
        }
        // Navigation rail is displayed
        composeTestRule.onNodeWithTagForStringId(
            R.string.navigation_rail
        ).assertExists()
    }

    @Test
    @TestExpandedWidth
    fun expandedDevice_verifyUsingNavigationDrawer() {
        // Set up expanded window
        composeTestRule.setContent {
            UniApp(
                windowSize = WindowWidthSizeClass.Expanded
            )
        }
        // Navigation drawer is displayed
        composeTestRule.onNodeWithTagForStringId(
            R.string.navigation_drawer
        ).assertExists()
    }
}
