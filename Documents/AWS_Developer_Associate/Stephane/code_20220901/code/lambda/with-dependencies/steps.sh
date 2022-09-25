#!/bin/bash

# You need to have nodejs / npm installed beforehand
npm install aws-xray-sdk

# Set proper permissions for project files
chmod a+r * 

# You need to have the zip command available
zip -r function.zip .

# create the Lambda function using the CLI
aws lambda create-function --zip-file fileb://function.zip --function-name lambda-xray-with-dependencies --runtime nodejs14.x --handler index.handler --role arn:aws:iam::001736599714:role/DemoLambdaWithDependencies