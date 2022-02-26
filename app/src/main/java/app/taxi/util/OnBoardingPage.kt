package app.taxi.util

import androidx.annotation.DrawableRes
import app.taxi.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.ic_first_board,
        title = "EASY SEARCH",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore."
    )

    object Second : OnBoardingPage(
        image = R.drawable.ic_second_board,
        title = "QUICK ACCESS",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore."
    )

    object Third : OnBoardingPage(
        image = R.drawable.ic_third_board,
        title = "GET YOUR TAXI",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore."
    )
}
