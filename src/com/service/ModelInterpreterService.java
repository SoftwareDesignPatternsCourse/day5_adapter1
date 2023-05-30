package com.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;

public class ModelInterpreterService {

	public void parse(JsonParser parser) throws JsonParseException, IOException {
		while (parser.nextToken() != null) {
            String fieldName = parser.getCurrentName();

            if ("name".equals(fieldName)) {
                parser.nextToken();
                String nameValue = parser.getValueAsString();
                System.out.println("Name: " + nameValue);
            }

            if ("age".equals(fieldName)) {
                parser.nextToken();
                int ageValue = parser.getValueAsInt();
                System.out.println("Age: " + ageValue);
            }
        }
		
	}
	
}
