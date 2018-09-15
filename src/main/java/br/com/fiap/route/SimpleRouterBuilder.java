package br.com.fiap.route;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouterBuilder extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		from("file:/home/andre/Trabalho/InputFolder").split().tokenize("\n").to("jms:queue:fiap31csjTrabalho");
	}
}
