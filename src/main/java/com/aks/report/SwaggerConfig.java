package com.aks.report;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerConfig {

    Contact contact = new Contact(
            "Ambrish Singh",
            "http://www.ambrish.com",
            "ambrish@gmail.com"
    );

    List<VendorExtension> vendorExtensions = new ArrayList<>();

	ApiInfo apiInfo = new ApiInfo(
			"Photo App RESTful Web Service documentation",
			"This pages documents Photo app RESTful Web Service endpoints",
			"1.0",
			"http://www.ambrish.com/service.html",
			contact,
			"Apache 2.0",
			"http://www.apache.org/licenses/LICENSE-2.0",
			vendorExtensions);

	@Bean
	public Docket apiDocket() {

		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.select()
				.apis(RequestHandlerSelectors.any()).paths(PathSelectors.any())
				.build();

		return docket;

	}

}
