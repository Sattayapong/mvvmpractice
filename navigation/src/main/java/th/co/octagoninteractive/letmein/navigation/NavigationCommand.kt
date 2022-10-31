package th.co.octagoninteractive.letmein.navigation

import androidx.annotation.IdRes
import androidx.navigation.NavDirections

sealed class NavigationCommand {
    data class To(val directions: NavDirections) : NavigationCommand()
    data class BackTo(@IdRes val destinationId: Int, val inclusive: Boolean) : NavigationCommand()
    object Back : NavigationCommand()
}