package demo

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

@Integration
class DemoControllerSpec extends GebSpec {

    void "test something"() {
        when:
        go '/demo/showName?name=Jeff'

        then:
        $('h2').text() == 'Name: Jeff'
    }
}
