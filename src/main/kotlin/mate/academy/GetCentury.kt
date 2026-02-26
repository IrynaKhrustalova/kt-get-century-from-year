package mate.academy

const val FIRSTCENTURY = 1
const val HUNDREDCENTURY = 100

fun getCentury(year: Int) : Int {
    if (year in 1..100) return FIRSTCENTURY
    return if (year > 100 && year % 100 == 0) {
        year / HUNDREDCENTURY
    } else {
        year / HUNDREDCENTURY + FIRSTCENTURY
    }
}
