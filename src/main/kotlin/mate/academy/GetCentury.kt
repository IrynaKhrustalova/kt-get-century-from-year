package mate.academy

const val FIRSTCENTURY = 1
const val HUNDREDCENTURY = 100

fun getCentury(year: Int) : Int {
    if (year in FIRSTCENTURY..HUNDREDCENTURY) return FIRSTCENTURY
    return if (year > HUNDREDCENTURY && year % HUNDREDCENTURY == 0) {
        year / HUNDREDCENTURY
    } else {
        year / HUNDREDCENTURY + FIRSTCENTURY
    }
}
