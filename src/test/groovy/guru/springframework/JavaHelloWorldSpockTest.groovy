package guru.springframework

import spock.lang.Specification

/**
 *    Created by rfh on 10/12/2019
 */
class JavaHelloWorldSpockTest extends Specification {

    def "GetHello"() {

        when:
        def foo = "123"

        then:
        true
    }
}
