package nsdw.template

import io.vertx.junit5.VertxExtension
import io.vertx.junit5.VertxTestContext
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.slf4j.LoggerFactory

@ExtendWith(VertxExtension)
class TemplateTest {
    static final log = LoggerFactory.getLogger(this.class)

    @BeforeAll
    static void setup() {

    }

    @Test
    void testVerticleStartupSuccessful(VertxTestContext ctx) {
        assert true
        ctx.completeNow()
    }

}
