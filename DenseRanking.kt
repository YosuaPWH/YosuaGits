import kotlin.system.exitProcess

fun main() {
    val numOfInitialSkor = readln().toInt()
    val initialSkor = readln()

    val numOfGitScore = readln().toInt()
    val gitScore = readln()

    val result = denseRanking(numOfInitialSkor, initialSkor, numOfGitScore, gitScore)
    println(result)


}

fun denseRanking(numOfInitialSkor: Int, initialSkor: String, numOfGitScore: Int, gitScore: String): String {
    val modifInitialSkor = initialSkor.split(" ").map { it.toInt() }
    val modifGitScore = gitScore.split(" ").map { it.toInt() }

    if (numOfInitialSkor != modifInitialSkor.size || numOfGitScore != modifGitScore.size) exitProcess(99999)

    val sortedScores = modifInitialSkor.distinct().sortedDescending()
    val newScore = (sortedScores + modifGitScore).distinct().sortedDescending()

    val ranking = arrayListOf<Int>()

    modifGitScore.forEach {
        val index = newScore.indexOf(it) + 1
        ranking.add(index)
    }

    return ranking.joinToString(" ")
}
