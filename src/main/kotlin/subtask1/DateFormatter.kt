package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

      fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            date.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale.forLanguageTag("ru")))
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }

    /*fun toTextDay(day: String, month: String, year: String): String {
        val finalDay: StringBuilder = java.lang.StringBuilder()

        try {
            var date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val dateOfWeek = date.dayOfWeek.toString()
            finalDay.append("$day ${addMonths(month)}, ${traslateDayOfWeek(dateOfWeek)}")
        } catch (e: Exception){
            return "Такого дня не существует"
        }

        println(finalDay.toString())

        return finalDay.toString()
    }*/

    /* fun addMonths(s: String): String {
        when (s) {
            "1" -> return "января"
            "2" -> return "февраля"
            "3" -> return "марта"
            "4" -> return "апреля"
            "5" -> return "мая"
            "6" -> return "июня"
            "7" -> return "июля"
            "8" -> return "августа"
            "9" -> return "сентября"
            "10" -> return "октября"
            "11" -> return "ноября"
            "12" -> return "декабря"
        }
        return "такого месяца не существует"
    }

    fun traslateDayOfWeek(dateOfWeek: String): String{
        when (dateOfWeek){
            "SUNDAY" -> return "воскресенье"
            "MONDAY" -> return "понедельник"
            "TUESDAY" -> return "вторник"
            "WEDNESDAY" -> return "среда"
            "THURSDAY" -> return "четверг"
            "FRIDAY" -> return "пятница"
            "SATURDAY" -> return "суббота"
        }
        return "такого дня не существует"
    }
}*/

}
