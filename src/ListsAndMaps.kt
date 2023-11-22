fun main() {
    val nums = mutableListOf(1,2,3)
    println(nums.indexOf(3))
    nums.add(5)
    nums.add(4)
    nums.remove(1)
    nums.contains(4)
    println(nums)


    val nums2 = listOf(11,7,9)
    nums.addAll(nums2)
    println(nums)
}