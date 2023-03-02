// O(n log(n)) 
fun quickSort(nums: IntArray): IntArray {
    // base case
    return if(nums.size <= 1 ) nums
    else{
        var povit  = nums[nums.size / 2]
        var less : IntArray= nums.filter{it < povit}.toIntArray()
        var geater : IntArray= nums.filter{it > povit}.toIntArray()
        var equal = nums.filter{it == povit}
        quickSort(less) + equal + quickSort(geater)
    }
}
fun main(){
    var list = intArrayOf  (99, 33 , 22 , 43 , 69 , 59 , 0 , -10)
    quickSort(list).forEach {element ->
        print("${element}  ") } // -10  0  22  33  43  59  69  99  
}
