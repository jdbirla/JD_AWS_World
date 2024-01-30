# Spring Boot DynamoDB
- Here are some ways to use DynamoDB in a Spring Boot project:
#### AWS SDK for Java V2:
- You can directly use the AWS SDK for Java V2 to interact with DynamoDB. This involves using the DynamoDbClient from the SDK to perform CRUD operations.
You need to handle the low-level details of interacting with DynamoDB, including request and response handling.
#### Spring Data DynamoDB:
- Spring Data DynamoDB is an extension of the Spring Data project that provides a higher-level abstraction for interacting with DynamoDB.
It allows you to define repositories and entities similar to how you would with other Spring Data modules.
Spring Data DynamoDB simplifies the integration and reduces boilerplate code.
#### AWS Amplify:
- AWS Amplify is a set of tools and services for building scalable and secure cloud-powered serverless applications. It provides a client library for accessing DynamoDB from a Spring Boot application.
Amplify simplifies the integration process and abstracts away some of the low-level details.
