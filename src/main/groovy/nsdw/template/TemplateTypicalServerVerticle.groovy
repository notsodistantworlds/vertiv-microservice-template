package nsdw.template

import io.vertx.core.DeploymentOptions
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import nsdw.vertiv.core.TypicalServerVerticle

class TemplateTypicalServerVerticle extends TypicalServerVerticle {
   // ...
}

class TemplateTypicalServerVerticleStarter {
    public static void main(String[] args) {
        def opts = new DeploymentOptions().setConfig(new JsonObject().put("http", new JsonObject().put("port", 53863)))
        Vertx.vertx().deployVerticle(new TypicalServerVerticle(), opts)
    }
}