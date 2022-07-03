fun main() {
    println("hello world")

    val p = Person("aa", null, "bb")
    if (p.middle != null) {
        // p.middle의 타입을 String? 대신 String으로 인식 -> 영리한 타입 변환 수행
        val middleNameLength: Int = p.middle.length
    }

    var p1 = Person("aa", null, "bb")
    if (p1.middle != null) {
//        val middleNameLength = p.middle.length
        val middleNameLength = p1.middle!!.length
    }

    var p2 = Person("aa", null, "bb")
    if (p2.middle != null) {
//        val middleNameLength = p.middle.length
        val middleNameLength = p2.middle?.length
    }

    val p3 = Person("aa", null, "bb")
    val p4 = p3 as? Person


}