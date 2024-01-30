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

### AWS SDK for Java V2:
- https://www.baeldung.com/spring-data-dynamodb
- https://medium.com/linkit-intecs/getting-started-with-crud-operations-in-spring-boot-and-dynamodb-a-beginners-guide-75ecad3b0452
![DynamoDB _ Medium_00001](https://github.com/jdbirla/JD_AWS_World/assets/69948118/12b1b8f9-798c-4f0a-ab5d-5dedbc687b0b)
![DynamoDB _ Medium_00002](https://github.com/jdbirla/JD_AWS_World/assets/69948118/350d89f1-9445-4b8b-87d8-54801d0e0baf)
![DynamoDB _ Medium_00003](https://github.com/jdbirla/JD_AWS_World/assets/69948118/8bb2faf3-e98d-4883-973b-c818fdde790d)
![DynamoDB _ Medium_00004](https://github.com/jdbirla/JD_AWS_World/assets/69948118/ed5e52e8-a664-4875-8bde-95d1a81d4f25)
![DynamoDB _ Medium_00005](https://github.com/jdbirla/JD_AWS_World/assets/69948118/c362f155-339e-4c44-bf08-6c2663d99832)
![DynamoDB _ Medium_00006](https://github.com/jdbirla/JD_AWS_World/assets/69948118/85eff2b7-d949-4a1f-a350-5aea71ca5ca0)
![DynamoDB _ Medium_00007](https://github.com/jdbirla/JD_AWS_World/assets/69948118/608d3914-1951-4c50-9bdb-0d09cf51b572)
![DynamoDB _ Medium_00008](https://github.com/jdbirla/JD_AWS_World/assets/69948118/6856953d-b0c0-4e16-a617-5aec99f30dbd)
![DynamoDB _ Medium_00009](https://github.com/jdbirla/JD_AWS_World/assets/69948118/61604d23-9b28-4d30-acdd-21dccb38b668)
![DynamoDB _ Medium_00010](https://github.com/jdbirla/JD_AWS_World/assets/69948118/78bb1a59-4e6a-4029-97a2-772966795dff)
![DynamoDB _ Medium_00011](https://github.com/jdbirla/JD_AWS_World/assets/69948118/bbd3f8d1-b720-4c75-8639-0b9681a576a5)
![DynamoDB _ Medium_00012](https://github.com/jdbirla/JD_AWS_World/assets/69948118/035fbf48-aa2e-4bd6-ba33-4e22474f583d)
![DynamoDB _ Medium_00013](https://github.com/jdbirla/JD_AWS_World/assets/69948118/6dd85496-92c5-486e-930e-f43e1c4909e6)
![DynamoDB _ Medium_00014](https://github.com/jdbirla/JD_AWS_World/assets/69948118/4fe87a84-a85f-4ec5-81fe-563445194d43)
![DynamoDB _ Medium_00015](https://github.com/jdbirla/JD_AWS_World/assets/69948118/70f1ba01-08bc-4d2d-af53-1ae9af79c540)
![DynamoDB _ Medium_00016](https://github.com/jdbirla/JD_AWS_World/assets/69948118/2e6b3ac2-1691-42d8-8e31-916da5f6cb52)
![DynamoDB _ Medium_00017](https://github.com/jdbirla/JD_AWS_World/assets/69948118/c48d214d-4edf-4714-b948-3af41396df04)
![DynamoDB _ Medium_00018](https://github.com/jdbirla/JD_AWS_World/assets/69948118/ae8a91ca-7b3d-4c42-b5f1-74568b36b3dc)
![DynamoDB _ Medium_00019](https://github.com/jdbirla/JD_AWS_World/assets/69948118/a5cfceae-41ba-4900-a872-cbf491756c10)
![DynamoDB _ Medium_00020](https://github.com/jdbirla/JD_AWS_World/assets/69948118/cc7fe57f-8129-4162-8138-4bdc01ea3221)
![DynamoDB _ Medium_00021](https://github.com/jdbirla/JD_AWS_World/assets/69948118/884a1d7b-8cc1-4cfd-8b54-83694e478a1a)
![DynamoDB _ Medium_00021](https://github.com/jdbirla/JD_AWS_World/assets/69948118/884a1d7b-8cc1-4cfd-8b54-83694e478a1a)
![DynamoDB _ Medium_00022](https://github.com/jdbirla/JD_AWS_World/assets/69948118/1d4e32ad-7a1d-4ef5-9d97-00e71b963974)
![DynamoDB _ Medium_00023](https://github.com/jdbirla/JD_AWS_World/assets/69948118/9bdfa818-75b0-4e60-8a0c-f9e9a17a6893)
![DynamoDB _ Medium_00024](https://github.com/jdbirla/JD_AWS_World/assets/69948118/524b49b2-1b54-49fd-9343-3761ddc9cb67)
![DynamoDB _ Medium_00025](https://github.com/jdbirla/JD_AWS_World/assets/69948118/344bbeb9-0ed1-4312-af75-e94f897d3842)

### Spring Data Synamodb
- https://howtodoinjava.com/spring-boot/access-dynamodb-with-spring/

![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00001](https://github.com/jdbirla/JD_AWS_World/assets/69948118/ba77f334-4588-4e43-bd7d-c7e5a5ed89c7)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00002](https://github.com/jdbirla/JD_AWS_World/assets/69948118/b367e7a3-0781-4051-9776-7dc6ecf35550)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00003](https://github.com/jdbirla/JD_AWS_World/assets/69948118/2dff4ccb-1655-467e-8cfb-ca68ea7a0d1f)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00004](https://github.com/jdbirla/JD_AWS_World/assets/69948118/9eb9882e-cdee-4424-ad52-f3e20993b46b)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00005](https://github.com/jdbirla/JD_AWS_World/assets/69948118/dca472c6-2ab2-4dc9-baa9-9891f929d71c)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00006](https://github.com/jdbirla/JD_AWS_World/assets/69948118/f40d9317-3c26-4e3f-9970-2782956d3615)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00007](https://github.com/jdbirla/JD_AWS_World/assets/69948118/e9ff1f59-249b-49da-92e9-eb24a48f9ff7)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00008](https://github.com/jdbirla/JD_AWS_World/assets/69948118/9a04d7d1-0d51-41d1-bcf7-4c5641a85a1c)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00009](https://github.com/jdbirla/JD_AWS_World/assets/69948118/1cc26c10-a494-4fbf-9638-69fb4741d724)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00010](https://github.com/jdbirla/JD_AWS_World/assets/69948118/70b0c2f5-adea-4609-9409-af21c90718d8)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00011](https://github.com/jdbirla/JD_AWS_World/assets/69948118/358878d7-f0fa-45af-ad15-e2bded531414)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00012](https://github.com/jdbirla/JD_AWS_World/assets/69948118/84b3f10d-4dc6-41b1-a74f-3a39e9ffa704)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00013](https://github.com/jdbirla/JD_AWS_World/assets/69948118/fcf6e432-c1c3-4d69-9bf0-9a6c33f0f523)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00014](https://github.com/jdbirla/JD_AWS_World/assets/69948118/b41f456a-736c-4682-8227-ec206ae7f714)
![DynamoDB with Spring Boot - DynamoDBMapper and JPA_00015](https://github.com/jdbirla/JD_AWS_World/assets/69948118/e919cfcf-b0f2-4208-90d6-eddd59636883)

