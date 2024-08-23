package dsa


fun main() {
    twoSum(intArrayOf(2, 7, 11, 15), 9)?.forEach { value ->
        print(" " + value )
    }
    println("")
    twoSum(intArrayOf(3, 2, 4), 6)?.forEach { value ->
        print(" " + value)
    }
    println("")
    twoSum(intArrayOf(3, 3), 6)?.forEach { value ->
        print(" " + value)
    }
}

fun twoSum(nums: IntArray, target: Int) : IntArray? {
    val hashMap: HashMap<Int, Int> = HashMap<Int, Int>()

    for (i in nums.indices) {
        val req_num = target - nums[i]
        if (hashMap.containsKey(req_num)) {
            val arr = intArrayOf(hashMap[req_num]!!, i)
            return arr
        }
        hashMap[nums[i]] = i
    }
    return null
}

//fun twoSum1(nums: IntArray, target: Int): IntArray? {
//    val hm = HashMap<Int, Int>()
//
//    for (i in nums.indices) {
//        val req_num = target - nums[i]
//        if (hm.containsKey(req_num)) {
//            val arr = intArrayOf(hm[req_num]!!, i)
//            return arr
//        }
//        hm[nums[i]] = i
//    }
//    return null
//}