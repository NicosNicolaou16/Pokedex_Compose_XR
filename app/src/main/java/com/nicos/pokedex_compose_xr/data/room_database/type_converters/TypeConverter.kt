package com.nicos.pokedex_compose_xr.data.room_database.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nicos.pokedex_compose_xr.domain.dto.StatDto
import com.nicos.pokedex_compose_xr.data.room_database.entities.StatsEntity

class ConverterStats {

    @TypeConverter
    fun fromStringToStatsList(value: String): MutableList<StatsEntity>? {
        return Gson().fromJson(value, object : TypeToken<MutableList<StatsEntity>>() {}.type)
    }

    @TypeConverter
    fun fromStatsListToString(statsEntityList: MutableList<StatsEntity>): String =
        Gson().toJson(statsEntityList)
}

class ConverterStat {

    @TypeConverter
    fun fromStringToStat(value: String): StatDto? {
        return Gson().fromJson(value, object : TypeToken<StatDto>() {}.type)
    }

    @TypeConverter
    fun fromStatToString(statDto: StatDto): String = Gson().toJson(statDto)
}