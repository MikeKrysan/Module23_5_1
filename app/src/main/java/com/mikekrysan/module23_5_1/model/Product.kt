package com.mikekrysan.module23_5_1.model

import androidx.annotation.DrawableRes

class Product (val id: Int, @DrawableRes val idIcon: Int, val name: String, val desc: String) : Item