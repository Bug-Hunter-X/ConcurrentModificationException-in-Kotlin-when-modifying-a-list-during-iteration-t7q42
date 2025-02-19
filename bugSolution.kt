fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    // Correct way to modify list during iteration
    val list2 = mutableListOf(1,2,3,4,5)
    list2.removeAll { it > 2 }
    println(list2)
    
    //Alternative using an iterator
    val list3 = mutableListOf(1,2,3,4,5)
    val iterator = list3.iterator()
    while (iterator.hasNext()){
        val item = iterator.next()
        if (item > 2){
            iterator.remove()
        }
    }
    println(list3)
} 