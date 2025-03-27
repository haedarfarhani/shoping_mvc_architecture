package com.heydar.simplemcv.model.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Product {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "login_id")
    var loginId: String? = null

    @ColumnInfo(name = "password")
    var password: String? = null

    @ColumnInfo(name = "full_name")
    var fullName: String? = null

    @ColumnInfo(name = "contact")
    var contact: String? = null
}