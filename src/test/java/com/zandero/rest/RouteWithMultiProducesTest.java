package com.zandero.rest;
/*

import com.zandero.rest.test.TestMultiProducesRest;
import com.zandero.rest.writer.TestJsonResponseWriter;
import com.zandero.rest.writer.TestXmlResponseWriter;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.VertxTestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.web.Router;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.core.MediaType;

*/
/**
 *
 *//*

@ExtendWith(VertxExtension.class)
public class RouteWithMultiProducesTest extends VertxTest {

	@BeforeAll
	static void start() {

		super.before();

		Router router = new RestBuilder(vertx)
			.register(TestMultiProducesRest.class)
			.writer(MediaType.APPLICATION_XML, TestXmlResponseWriter.class)
			.writer(TestJsonResponseWriter.class) // resolve from @Produces
			.build();


		vertx.createHttpServer()
			.requestHandler(router)
			.listen(PORT);
	}

	@Test
	public void echoXmlTest(VertxTestContext context) {

		final Async async = context.async();
		client.get("/multi/consume").as(BodyCodec.string())
                .send(context.succeeding(response -> context.verify(() ->

			context.assertEquals(200, response.statusCode());

			response.bodyHandler(body -> {
				context.assertEquals("<xml>HELLO!</xml>", body.toString());
				async.complete();
			});
		}).putHeader("Accept", "application/xml").end();
	}

	@Test
	public void echoJsonTest(VertxTestContext context) {

		final Async async = context.async();
		client.get("/multi/consume").as(BodyCodec.string())
                .send(context.succeeding(response -> context.verify(() ->

			context.assertEquals(200, response.statusCode());

			response.bodyHandler(body -> {
				context.assertEquals("{\"text\": \"HELLO!\"}", body.toString());
				async.complete();
			});
		}).putHeader("Accept", "application/json").end();
	}
}
*/
