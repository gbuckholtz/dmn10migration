package ca.queensu.jsonschemagen;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

import ca.queensu.beans.sror.tAdjunct;
import ca.queensu.beans.sror.tCourse;

public class GenerateJsonSchema {

    public static void main(String[] args){
     try {
            // Create an instance of the POJO
            tCourse course = new tCourse();
            course.setAcademic_year_taught(2022);
            course.setCourse_code("CHEM-103");
            course.setDelivery_format("In Person");
            course.setResponsibility_percentage(100);
            course.setUnits(3);


            // Generate JSON schema using Jackson module
            ObjectMapper mapper = new ObjectMapper();
            // configure mapper, if necessary, then create schema generator
            JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
            JsonSchema schema = schemaGen.generateSchema(tAdjunct.class);
      

            // Convert JSON schema to a JSON string and print it
            String schemaJson = mapper.writeValueAsString(schema);
            System.out.println("JSON Schema: " + schemaJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
