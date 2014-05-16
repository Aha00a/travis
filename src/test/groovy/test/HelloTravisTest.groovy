package test

import spock.lang.Specification

class HelloTravisTest extends Specification {
    def "Say"() {
        expect: "Hello, Travis!" == new HelloTravis().say()
    }
}
