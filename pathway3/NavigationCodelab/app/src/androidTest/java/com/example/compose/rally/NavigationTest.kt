package com.example.compose.rally

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.navigation.testing.TestNavHostController
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class NavigationTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    lateinit var navController: TestNavHostController

//    @Test
//    fun rallyNavHost() {
//        composeTestRule.setContent {
//            // Creates a TestNavHostController
//            navController =
//                TestNavHostController(LocalContext.current)
//            // Sets a ComposeNavigator to the navController so it can navigate through composables
//            navController.navigatorProvider.addNavigator(
//                ComposeNavigator()
//            )
//            RallyNavHost(navController = navController)
//        }
//        fail()
//    }

//    @Test
//    fun rallyNavHost_verifyOverviewStartDestination() {
//        composeTestRule.setContent {
//            navController =
//                TestNavHostController(LocalContext.current)
//            navController.navigatorProvider.addNavigator(
//                ComposeNavigator()
//            )
//            RallyNavHost(navController = navController)
//        }
//
//        composeTestRule
//            .onNodeWithContentDescription("Overview Screen")
//            .assertIsDisplayed()
//    }

//    @Before
//    fun setupRallyNavHost() {
//        composeTestRule.setContent {
//            navController =
//                TestNavHostController(LocalContext.current)
//            navController.navigatorProvider.addNavigator(
//                ComposeNavigator()
//            )
//            RallyNavHost(navController = navController)
//        }
//    }
//
//    @Test
//    fun rallyNavHost_verifyOverviewStartDestination() {
//        composeTestRule
//            .onNodeWithContentDescription("Overview Screen")
//            .assertIsDisplayed()
//    }

//    @Test
//    fun rallyNavHost_clickAllAccount_navigatesToAccounts() {
//        composeTestRule
//            .onNodeWithContentDescription("All Accounts")
//            .performClick()
//
//        composeTestRule
//            .onNodeWithContentDescription("Accounts Screen")
//            .assertIsDisplayed()
//    }

    @Test
    fun rallyNavHost_clickAllBills_navigateToBills() {
        composeTestRule.onNodeWithContentDescription("All%20Bills")
            .performScrollTo()
            .performClick()

        val route = navController.currentBackStackEntry?.destination?.route
        assertEquals(route, "bills")
    }
}