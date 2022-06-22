package com.goalabs.SchemaValidation

import com.fasterxml.jackson.databind.ObjectMapper
import com.goalabs.SchemaValidation.utils.JSONSchemaValidator
import com.goalabs.SchemaValidation.utils.ResourceSourceType
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.io.File
import java.nio.file.FileSystems
import kotlin.io.path.pathString

@SpringBootTest
class SchemaValidationApplicationTests {
	@Autowired
	lateinit var objTestJSON:JSONSchemaValidator

	@Test
	fun contextLoads() {
	}


	@Test
	fun testReadFromURL(){

		val schemaPath = "https://raw.githubusercontent.com/mscharhag/blog-examples/master/json-schema-validation/src/main/resources/example-schema.json"
		val metadataPath= FileSystems.getDefault().getPath("").toAbsolutePath().pathString + "/src/main/resources/example.json"
//		objTestJSON.validate(ResourceSourceType.RESOURCE,"example-schema.json",ResourceSourceType.FILE,metadataPath)
		objTestJSON.validate(ResourceSourceType.URL,schemaPath, ResourceSourceType.FILE,metadataPath)

	}

	@Test
	fun testReadFromFile(){

		val schemaPath = "https://raw.githubusercontent.com/mscharhag/blog-examples/master/json-schema-validation/src/main/resources/example-schema.json"
//		val metadataPath= FileSystems.getDefault().getPath("").toAbsolutePath().pathString + "/src/main/resources/example.json"
		val metadataPath = "https://raw.githubusercontent.com/mscharhag/blog-examples/master/json-schema-validation/src/main/resources/example.json"
//
//		objTestJSON.validate(ResourceSourceType.RESOURCE,"example-schema.json",ResourceSourceType.FILE,metadataPath)
		objTestJSON.validate(ResourceSourceType.URL,schemaPath, ResourceSourceType.URL,metadataPath)

	}
}
