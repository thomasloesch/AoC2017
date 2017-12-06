package loescht.advent.dayTwo

import loescht.advent.utils.FileReader

class taskOne {
    static void main(String[] args) {
        def input = FileReader.readFile(args[0])

        println(calcCheckSum(input))
    }

    static int calcCheckSum(String spreadSheet) {
        def checkSum = 0

        spreadSheet.eachLine { line ->
            def array = line.split("\t")
            List<Integer> list = new ArrayList<Integer>()
            for (item in array) {
                list.add(item.trim().toInteger())
            }
            checkSum += arrayRange(list)
        }

        checkSum
    }

    static int arrayRange(List<Integer> arr) {
        findTheLargest(arr) - findTheSmallest(arr)
    }

    static int findTheSmallest(List<Integer> arr) {
        def smallest = arr[0]
        arr.each { i ->
            if(i < smallest) smallest = i
        }
        smallest
    }

    static int findTheLargest(List<Integer> arr) {
        def largest = arr[0]
        arr.each { i ->
            if(i > largest) largest = i
        }
        largest
    }
}
