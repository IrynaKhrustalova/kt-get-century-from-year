package mate.academy

fun getCentury(year: Int) : Int {
    if (year == 0) return 0
    if (year in 1..100) return 1
    return if (year > 100 && year % 100 == 0) {
        year / 100
    } else {
        year / 100 + 1
    }
}
