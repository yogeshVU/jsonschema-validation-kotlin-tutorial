package com.goalabs.SchemaValidation

import com.goalabs.SchemaValidation.utils.JSONSchemaValidator
import com.goalabs.SchemaValidation.utils.ResourceSourceType
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.nio.file.FileSystems
import kotlin.io.path.pathString



@SpringBootApplication
class SchemaValidationApplication(
	private val objTestJSON: JSONSchemaValidator,

	){
	private val log = LoggerFactory.getLogger(SchemaValidationApplication::class.java)

//	init{
//		log.info("Inside the App Validate Method")
//		val schemaPath = "https://raw.githubusercontent.com/mscharhag/blog-examples/master/json-schema-validation/src/main/resources/example-schema.json"
//		val metadataPath= FileSystems.getDefault().getPath("").toAbsolutePath().pathString + "/src/main/resources/example.json"
////		objTestJSON.validate(ResourceSourceType.RESOURCE,"example-schema.json",ResourceSourceType.FILE,metadataPath)
//		objTestJSON.validate(ResourceSourceType.URL,schemaPath,ResourceSourceType.FILE,metadataPath)
//	}
}

fun main(args: Array<String>) {
	runApplication<SchemaValidationApplication>(*args)
}
