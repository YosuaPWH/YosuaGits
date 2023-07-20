import java.util.Stack

fun main() {
    println(balanceBracket(readln()))
}

fun balanceBracket(input: String): String {
    val splittedInput = input.toCharArray()
    val stackInput = Stack<Char>()

    for (i in splittedInput.indices) {
        if (splittedInput[i] == '{' || splittedInput[i] == '[' || splittedInput[i] == '(') {
            stackInput.push(splittedInput[i])
        } else if (splittedInput[i] == '}') {
            if (stackInput.isNotEmpty() && stackInput.peek() == '{') {
                stackInput.pop()
            } else return "NO"

        } else if (splittedInput[i] == ']') {
            if (stackInput.isNotEmpty() && stackInput.peek() == '[') {
                stackInput.pop()
            } else return "NO"

        } else if (splittedInput[i] == ')') {
            if (stackInput.isNotEmpty() && stackInput.peek() == '(') {
                stackInput.pop()
            } else return "NO"
        }
    }

    return if (stackInput.isEmpty()) "YES" else "NO"
}