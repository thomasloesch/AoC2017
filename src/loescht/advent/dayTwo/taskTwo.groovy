package loescht.advent.dayTwo

import loescht.advent.utils.FileReader
import sun.plugin.dom.exception.InvalidStateException

class taskTwo {
    private static final BigDecimal DECIMAL_VALUE_ONE = new BigDecimal(1)

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
            def lineValue = arrayFindDivisibleValue(list)
            if(lineValue == -1)
                throw new InvalidStateException("No evenly divisible value found in line:\n" + line)
            checkSum += lineValue
        }

        checkSum
    }

    static int arrayFindDivisibleValue(List<Integer> arr) {
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                def result
                if (arr[i] > arr[j]) {
                    result = arr[i] / arr[j]
                } else {
                    result = arr[j] / arr[i]
                }
                if (result.remainder(DECIMAL_VALUE_ONE) == 0) {
                    return result
                }
            }
        }
        // Should never be true
        return -1
    }
}
