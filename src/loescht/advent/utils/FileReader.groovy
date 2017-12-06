package loescht.advent.utils

class FileReader {
    static String readFile(String path) {
        new File(path).text
    }
}
