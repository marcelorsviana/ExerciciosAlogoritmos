package com.mrsv.exerciciosalogoritmos

/**
 * 8) Develop a program that reads a distance in meters and shows the relative
 *  values in other measures. E.g.:
 *  Type a distance in meters: 185.72
 *  185.72m is the same to:
 *  0.18572Km
 *  1.8572Hm
 *  18.572Dam
 *  1857.2dm
 *  18572.0cm
 *  185720.0mm
 */

fun main() {
    var distanceInMeters = -1.0

    while (distanceInMeters < 0.0) {
        println("Type a distance in meters: ")
        distanceInMeters = readln().toDouble()

        if (distanceInMeters > 0) {
            val converters = arrayOf(
                MetersToKilometers(),
                MetersToHectometers(),
                MetersToDecameters(),
                MetersToDecimeters(),
                MetersToCentimeters(),
                MetersToMilimeters()
            )
            converters.forEach {
                println(it.convert(distanceInMeters))
            }
        } else if (distanceInMeters < 0) {
            println("Insert a distance greater than zero.")
        }
    }
}

interface Converter {
    fun convert(distanceInMeters: Double): String
}

class MetersToKilometers() : Converter {
    override fun convert(distanceInMeters: Double): String {
        return "${distanceInMeters / 1000}km"
    }
}

class MetersToHectometers() : Converter {
    override fun convert(distanceInMeters: Double): String {
        return "${distanceInMeters / 100}hm"
    }
}

class MetersToDecameters() : Converter {
    override fun convert(distanceInMeters: Double): String {
        return "${distanceInMeters / 10}dm"
    }
}

class MetersToDecimeters() : Converter {
    override fun convert(distanceInMeters: Double): String {
        return "${distanceInMeters * 10}dm"
    }
}

class MetersToCentimeters() : Converter {
    override fun convert(distanceInMeters: Double): String {
        return "${distanceInMeters * 100}cm"
    }
}

class MetersToMilimeters() : Converter {
    override fun convert(distanceInMeters: Double): String {
        return "${distanceInMeters * 1000}mm"
    }
}