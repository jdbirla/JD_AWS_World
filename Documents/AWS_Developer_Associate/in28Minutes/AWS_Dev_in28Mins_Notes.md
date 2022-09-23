# AWS_DEVLOPER_IN28Mins
## Section 3 : Getting up and running with virtual servers in AWS - EC2
## Ec2 Instance connect
1. Inbound rule should be there
![image](https://user-images.githubusercontent.com/69948118/185294117-47cc624e-a533-49c6-8120-a1fb474c5069.png)
![image](https://user-images.githubusercontent.com/69948118/185294217-0de265c9-4003-4117-87fb-91f77cd5f788.png)

```sh
sudo su
yum update -y
yum install httpd
systemctl start httpd
systemctl enable httpd
echo "Hello World" > /var/www/html/index.html
 
curl http://169.254.169.254/latest/meta-data
curl http://169.254.169.254/latest/meta-data/ami-id
curl http://169.254.169.254/latest/meta-data/hostname
curl http://169.254.169.254/latest/meta-data/instance-id
curl http://169.254.169.254/latest/meta-data/instance-type
 
curl http://169.254.169.254/latest/dynamic
curl http://169.254.169.254/latest/dynamic/instance-identity
curl http://169.254.169.254/latest/dynamic/instance-identity/document
 
curl -s http://169.254.169.254/latest/dynamic/instance-identity/document > /var/www/html/index.html
```

![image](https://user-images.githubusercontent.com/69948118/185295174-415b6437-e458-45db-b326-85e15ba552a1.png)
![image](https://user-images.githubusercontent.com/69948118/185295189-98495a85-6726-405e-9714-bf128fb4898b.png)
![image](https://user-images.githubusercontent.com/69948118/185295274-435294a2-e741-4000-914f-a03d7d73f3f8.png)

### Instance meta data and Dynamic Data
curl http://169.254.169.254/latest/meta-data
curl http://169.254.169.254/latest/dynamic
![image](https://user-images.githubusercontent.com/69948118/185316508-7dd79691-de71-4b0e-ad1a-a9a8e4c6a8b5.png)

### EC2 Hands-on : Setting up a HTTP server
![image](https://user-images.githubusercontent.com/69948118/185319343-58e1ebde-fdb8-494b-ac96-65b64c1f0068.png)
![image](https://user-images.githubusercontent.com/69948118/185319344-9aeca9bf-45d6-48ad-8f66-ce0b76ba01ec.png)
![image](https://user-images.githubusercontent.com/69948118/185322279-10cfb7b3-81b8-46d0-b016-1b792da5f57c.png)
![image](https://user-images.githubusercontent.com/69948118/185322277-b5988a2a-45f0-4f27-bcb6-9c3566223e7b.png)

### Bootstrapping with Userdata
```
#!/bin/bash
yum update -y
yum install -y httpd
systemctl start httpd
systemctl enable httpd
curl -s http://169.254.169.254/latest/dynamic/instance-identity/document > /var/www/html/index.html
```

### Step11 : Launch Template
 
### Step12 : Creating customized AMI for EC2 instance

### Step15 : EC2 Secutiry keys
![image](https://user-images.githubusercontent.com/69948118/190059606-d1f19088-b42e-4675-9c6d-7a19604fb31f.png)
![image](https://user-images.githubusercontent.com/69948118/190060254-487b292b-e3ed-4a76-89ae-df30ace05578.png)

- Connecting from windows
- https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/putty.html
- To convert your private .pem key to .ppk folllow above link instructions
- ![image](https://user-images.githubusercontent.com/69948118/190062188-b34d117e-e074-4cfd-ac4e-68aabaddf887.png)

## Section 4 : Take care of billing on the cloud

## Section 5 : Distribusing Load usinf AWS load Balancing
![image](https://user-images.githubusercontent.com/69948118/190298235-29350bad-9c12-49df-90ad-4fcb7d4f74f8.png)
![image](https://user-images.githubusercontent.com/69948118/190298690-e6209bf3-c178-4e7b-99af-72385fbedf57.png)
![image](https://user-images.githubusercontent.com/69948118/190299257-57f5761f-9acb-4580-ae6c-2dd56eba4161.png)

## Aplication Load Balancer

![image](https://user-images.githubusercontent.com/69948118/190304065-3d6d545d-e536-460b-b93e-5093780763a6.png)
![image](https://user-images.githubusercontent.com/69948118/190304121-c3745c85-3ef3-4756-8be4-fec23449f7f6.png)
- Change existing security group of EC2 instance , remove inbound rule from anywhere to allow from ALB-SG only in this case we can't access EC2 direclty using public IP rahter we have to use only ALB
- 

![image](https://user-images.githubusercontent.com/69948118/190305316-4d99bac0-4e75-47ee-bf0e-eb9297f0df86.png)

## Using multiple Target Groups for microservices Architectures

```sh
#!/bin/bash
curl -s http://169.254.169.254/latest/dynamic/instance-identity/document > /var/www/html/index.html
mkdir /var/www/html/a
echo “Microservice A” > /var/www/html/a/test.html
```
![image](https://user-images.githubusercontent.com/69948118/190366871-91382481-ea2d-4265-a734-47089402066a.png)

## Section 6 : Serverles : Lambda
![image](https://user-images.githubusercontent.com/69948118/191644406-e702433f-aba6-461d-9abd-db45dfdaa1c3.png)
![image](https://user-images.githubusercontent.com/69948118/191645096-fcfd8e7e-3642-4ba6-b26f-43f85c8f20d3.png)
![image](https://user-images.githubusercontent.com/69948118/191645147-30e1c79d-24de-40bc-8981-12d2c3540382.png)
![image](https://user-images.githubusercontent.com/69948118/191647063-77ed30c7-8c1c-4dbe-bba8-dfa2759bc115.png)
![image](https://user-images.githubusercontent.com/69948118/191647077-8a602841-4ddd-4b1a-aa4d-b5e5945ca2d3.png)

  ```js
  exports.handler = async (event, context) => {
    // TODO implement
    
    console.log(event);
    
   console.log(context.functionname);
   console.log(context.logGroupName);
   console.log(context.memoryLimitInMB);
   console.log(context.logStreamName);
   console.log(context.getRemainingTimeInMillis());

    const response = {
        statusCode: 200,
        body: JSON.stringify('Hello from jd Lambda!'),
    };
    return response;
};
```

```
A function update is still in progress so the invocation went to the previously deployed code and configuration.

Test Event Name
HelloWorldTestEven1

Response
{
  "statusCode": 200,
  "body": "\"Hello from jd Lambda!\""
}

Function Logs
START RequestId: 5968d059-f982-4d6a-8270-20da9b9930af Version: $LATEST
2022-09-22T02:52:19.107Z	5968d059-f982-4d6a-8270-20da9b9930af	INFO	{ key1: 'value1', key2: 'value2', key3: 'value3' }
2022-09-22T02:52:19.107Z	5968d059-f982-4d6a-8270-20da9b9930af	INFO	undefined
2022-09-22T02:52:19.107Z	5968d059-f982-4d6a-8270-20da9b9930af	INFO	/aws/lambda/helloworld
2022-09-22T02:52:19.107Z	5968d059-f982-4d6a-8270-20da9b9930af	INFO	128
2022-09-22T02:52:19.107Z	5968d059-f982-4d6a-8270-20da9b9930af	INFO	2022/09/22/[$LATEST]4e0672091caf4e90af5d653ce7ef8f70
2022-09-22T02:52:19.107Z	5968d059-f982-4d6a-8270-20da9b9930af	INFO	2980
END RequestId: 5968d059-f982-4d6a-8270-20da9b9930af
REPORT RequestId: 5968d059-f982-4d6a-8270-20da9b9930af	Duration: 40.08 ms	Billed Duration: 41 ms	Memory Size: 128 MB	Max Memory Used: 57 MB	Init Duration: 134.86 ms

Request ID
5968d059-f982-4d6a-8270-20da9b9930af
```
  
## API Gateway
![image](https://user-images.githubusercontent.com/69948118/191885717-92a82b20-a83f-46c2-9c56-d88e485600c1.png)
![image](https://user-images.githubusercontent.com/69948118/191885852-0694c962-5a5d-454d-ab5c-328451d417b8.png)
![image](https://user-images.githubusercontent.com/69948118/191886056-790e42f7-fcb2-443f-8636-aaef85e75063.png)
![image](https://user-images.githubusercontent.com/69948118/191886161-797d6d70-4302-4e30-8abe-462f84f11873.png)
![image](https://user-images.githubusercontent.com/69948118/191887154-130b0165-854b-451e-97e8-2a018ba82147.png)
![image](https://user-images.githubusercontent.com/69948118/191887178-cfa0ea64-4f5f-4c39-bcad-01e90cab1465.png)
![image](https://user-images.githubusercontent.com/69948118/191887221-f20c1ecd-53b4-4375-b690-070f15f030a4.png)
![image](https://user-images.githubusercontent.com/69948118/191887831-4604ee45-6799-4ee2-b57b-2d0f566e3d51.png)
![image](https://user-images.githubusercontent.com/69948118/191887931-30e788d2-4be2-4a58-8d78-09dae8436585.png)
![image](https://user-images.githubusercontent.com/69948118/191887997-a2b13de5-c81a-4753-9259-8ce338355bd4.png)
![image](https://user-images.githubusercontent.com/69948118/191888029-9b78ecca-ff09-4e0f-b8ec-6046d20b4f87.png)
![image](https://user-images.githubusercontent.com/69948118/191888641-d3896c69-27af-4984-9538-167706f46add.png)
### Request Mapping template
```
##  See http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html
##  This template will pass through all parameters including path, querystring, header, stage variables, and context through to the integration endpoint via the body/payload
#set($allParams = $input.params())
{
"body-json" : $input.json('$'),
"params" : {
#foreach($type in $allParams.keySet())
    #set($params = $allParams.get($type))
"$type" : {
    #foreach($paramName in $params.keySet())
    "$paramName" : "$util.escapeJavaScript($params.get($paramName))"
        #if($foreach.hasNext),#end
    #end
}
    #if($foreach.hasNext),#end
#end
},
"stage-variables" : {
#foreach($key in $stageVariables.keySet())
"$key" : "$util.escapeJavaScript($stageVariables.get($key))"
    #if($foreach.hasNext),#end
#end
},
"context" : {
    "account-id" : "$context.identity.accountId",
    "api-id" : "$context.apiId",
    "api-key" : "$context.identity.apiKey",
    "authorizer-principal-id" : "$context.authorizer.principalId",
    "caller" : "$context.identity.caller",
    "cognito-authentication-provider" : "$context.identity.cognitoAuthenticationProvider",
    "cognito-authentication-type" : "$context.identity.cognitoAuthenticationType",
    "cognito-identity-id" : "$context.identity.cognitoIdentityId",
    "cognito-identity-pool-id" : "$context.identity.cognitoIdentityPoolId",
    "http-method" : "$context.httpMethod",
    "stage" : "$context.stage",
    "source-ip" : "$context.identity.sourceIp",
    "user" : "$context.identity.user",
    "user-agent" : "$context.identity.userAgent",
    "user-arn" : "$context.identity.userArn",
    "request-id" : "$context.requestId",
    "resource-id" : "$context.resourceId",
    "resource-path" : "$context.resourcePath"
    }
}

```
### Request Mapping values
```
2022-09-23T03:52:15.654Z	edda7f85-0778-4bc5-9bfd-7ecfa7a7199a	INFO	{
  'body-json': {},
  params: {
    path: {},
    querystring: { query1: 'query-value1', query2: 'query-value2' },
    header: { header2: 'header-value2', header1: 'header-value1' }
  },
  'stage-variables': {},
  context: {
    'account-id': '619024142453',
    'api-id': '56tamyhnta',
    'api-key': 'test-invoke-api-key',
    'authorizer-principal-id': '',
    caller: 'AIDAZAIFW2B26ALSC5FCI',
    'cognito-authentication-provider': '',
    'cognito-authentication-type': '',
    'cognito-identity-id': '',
    'cognito-identity-pool-id': '',
    'http-method': 'GET',
    stage: 'test-invoke-stage',
    'source-ip': 'test-invoke-source-ip',
    user: 'AIDAZAIFW2B26ALSC5FCI',
    'user-agent': 'aws-internal/3 aws-sdk-java/1.12.284 Linux/5.4.207-126.363.amzn2int.x86_64 OpenJDK_64-Bit_Server_VM/25.342-b07 java/1.8.0_342 vendor/Oracle_Corporation cfg/retry-mode/standard',
    'user-arn': 'arn:aws:iam::619024142453:user/jdbirla_dev',
    'request-id': '08b87d20-85bf-48c1-8517-16b3f3290ee6',
    'resource-id': 'uve4yt',
    'resource-path': '/hello-world'
  }
}

```


                                                             

