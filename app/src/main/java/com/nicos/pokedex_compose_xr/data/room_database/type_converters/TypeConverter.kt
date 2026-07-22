package com.nicos.pokedex_compose_xr.data.room_database.type_converters

import androidx.room3.ColumnTypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nicos.pokedex_compose_xr.data.dto.StatDto
import com.nicos.pokedex_compose_xr.data.room_database.entities.StatsEntity

class ConverterStats {

    @ColumnTypeConverter
    fun fromStringToStatsList(value: String): MutableList<StatsEntity>? {
        return Gson().fromJson(value, object : TypeToken<MutableList<StatsEntity>>() {}.type)
    }

    @ColumnTypeConverter
    fun fromStatsListToString(statsEntityList: MutableList<StatsEntity>): String =
        Gson().toJson(statsEntityList)
}

class ConverterStat {

    @ColumnTypeConverter
    fun fromStringToStat(value: String): StatDto? {
        return Gson().fromJson(value, object : TypeToken<StatDto>() {}.type)
    }

    @ColumnTypeConverter
    fun fromStatToString(statDto: StatDto): String = Gson().toJson(statDto)
}