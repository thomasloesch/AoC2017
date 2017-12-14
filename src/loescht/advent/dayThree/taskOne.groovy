package loescht.advent.dayThree

class taskOne {

    static void main(String[] args) {
        println(calcManhattanDist(args[0].toInteger()))
    }

    // Formula for highest number in layer y = 2x + 1
    static int calcManhattanDist(int pos) {
        def layer = calculateLayer(pos)
        println("layer: " + layer)
        // Calc side
        def offset = calcPositionFromCenter(layer, pos)
        println("offset: " + offset)
        // Calc distance
        offset + layer
    }

    // Given n, the number in question
    // Calculate and return the layer in which the number resides in spiral memory
    static int calculateLayer(int n) {
        int i = 0
        int layerMax = 1 // Assume we start in the first layer
        while (n > layerMax) {
            i++
            layerMax = calculateLayerSize(i)
        }
        i
    }

    static int calculateLayerSize(int i) {
        calculateSideLength(i) ** 2
    }

    // Given i, the layer in spiral memory
    // Calculate and return the 'side length' of the given layer
    static int calculateSideLength(int i) {
        ((2 * i) + 1)
    }

    static int calcPositionFromCenter(int layer, int n) {
        if(layer == 0 || n == 0)
            return 0
        if(n < 0)
            throw new IllegalArgumentException("Value of 'n' cannot be less than 0.")

        def previousLayerSize = calculateLayerSize(layer - 1)
        def currentSideLength = calculateSideLength(layer) - 1
        def halfSideLength = ((currentSideLength / 2).doubleValue().round())

        def side = 0
        def temp = previousLayerSize
        for(int i : 1..4) {
            temp += currentSideLength
            if (temp > n) {
                side = i
                break
            }
        }
        def currentSideCenter = previousLayerSize + (currentSideLength * (side - 1)) + halfSideLength
        Math.abs( (int)currentSideCenter - n)
    }
}
