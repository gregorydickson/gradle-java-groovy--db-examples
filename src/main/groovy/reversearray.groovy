//originally written for hackerrank.com problem


def scan = new Scanner(System.in)
def lines = scan.nextInt()
def trash = scan.nextLine()
def array = scan.nextLine().split(" ")

    def len = array.size()
    Integer halfLen = len/2
    for ( i=0; i<halfLen; i++) {
        def temp = array[i]
        array[i] = array[len-1-i]
        array[len-1-i] = temp
    }

array.collect{print it+" "}