package loescht.advent.dayOne

import loescht.advent.utils.FileReader

class taskOne {

    static void main(String[] args) {
        def captcha = FileReader.readFile(args[0])

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
