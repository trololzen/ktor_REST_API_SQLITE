package com.example.modelsdb

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object CouponDB : Table(){
    var CouponId: Column<String> = varchar("id",50).uniqueIndex()
    var Discount: Column<String> = varchar("discount",50)
    var MinOrder: Column<String> = varchar("min_order",50)
}