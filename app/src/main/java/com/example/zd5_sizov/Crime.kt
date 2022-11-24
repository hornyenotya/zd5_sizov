package com.example.zd5_sizov

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)