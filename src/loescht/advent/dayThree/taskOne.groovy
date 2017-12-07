package loescht.advent.dayThree

class taskOne {

    // Formula for highest number in layer y = 2x + 1
    static int calcManhattanDist(int pos) {
        println("layer: " + calculateLayer(100))
        -1
    }

    // Given n, the number in question
    // Calculate and return the layer in which the number resides in spiral memory
    static int calculateLayer(int n) {
        int i = 0
        int layerMax = 1 // Assume we start in the first layer
        while (n > layerMax) {
            i++
            layerMax = calculateSideLength(i) ** 2
        }
        println(layerMax)
        i
    }

    // Given i, the layer in spiral memory
    // Calculate and return the 'side length' of the given layer
    static int calculateSideLength(int i) {
        ((2 * i) + 1)
    }
}
