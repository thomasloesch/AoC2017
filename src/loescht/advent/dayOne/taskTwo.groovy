package loescht.advent.dayOne

class taskTwo {

    static void main(String[] args) {
        File inputFile = new File(args[0])
        Scanner scan = new Scanner(inputFile)

        def captcha = scan.next()

        println(solveCaptcha(captcha))
    }

    static int solveCaptcha(String captcha) {
        def total = 0
        int offset = captcha.length() / 2

        for (int i = 0; i < offset; i++) {
            if (captcha[i] == captcha[(i + offset)]) {
                total += Integer.parseInt(captcha[i])
            }
        }

        total * 2
    }

}
