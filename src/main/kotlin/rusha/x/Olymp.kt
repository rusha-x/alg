package rusha.x

@Suppress("ReplaceWithOperatorAssignment")
fun main(args: Array<String>) {
    val fiveTaskTimes = args.drop(1).map { s -> s.toInt() }
    val thirdTaskTimes = fiveTaskTimes.reversed()
    val oneTaskTimes = fiveTaskTimes.sorted()

    var fiveCurrentTime = 0

    var fiveCount = 0
    var fivePenalty = 0
    fiveTaskTimes.forEach { taskTime ->
        fiveCurrentTime = fiveCurrentTime + taskTime
        fivePenalty = fivePenalty + fiveCurrentTime
        fiveCount = fiveCount + 1
    }

    var thirdCurrentTime = 0

    var thirdCount = 0
    var thirdPenalty = 0
    thirdTaskTimes.forEach { taskTime ->
        thirdCurrentTime = thirdCurrentTime + taskTime
        thirdPenalty = thirdPenalty + thirdCurrentTime
        thirdCount = thirdCount + 1
    }

    var oneCurrentTime = 0

    var oneCount = 0
    var onePenalty = 0
    oneTaskTimes.forEach { taskTime ->
        oneCurrentTime = oneCurrentTime + taskTime
        onePenalty = onePenalty + oneCurrentTime
        oneCount = oneCount + 1
    }

    val result = when {
        fiveCount > thirdCount && fiveCount > oneCount -> 5
        thirdCount > fiveCount && thirdCount > oneCount -> 3
        oneCount > fiveCount && oneCount > thirdCount -> 1
        else -> when {
            fivePenalty < thirdPenalty -> 5
            else -> 1
        }
    }
}
