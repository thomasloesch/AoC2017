package loescht.advent.dayOne

class taskOne {

    static void main(String[] args) {
        File inputFile = new File(args[0])
        Scanner scan = new Scanner(inputFile)

        def captcha = scan.next()

        println(solveCaptcha(captcha))
    }

    static int solveCaptcha(String captcha) {
        def previous = ""
        def total = 0

        captcha.each {a ->
            if(a == previous)
                total+= Integer.parseInt(previous)
            previous = a
        }

        if (previous == captcha[0]) {
            total += Integer.parseInt(previous)
        }

        total
    }

}
