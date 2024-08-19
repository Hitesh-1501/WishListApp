package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0L,
    @ColumnInfo("wish-title")
    val title:String = "",
    @ColumnInfo("wish-desc")
    val description:String = ""

)

object dummyData{
    val wishList = listOf(Wish(
        title = "Android developer", description = "In future i wish to job in google"),
        Wish(title = "Samsunng z fold", description = "price = 100000"))
}
