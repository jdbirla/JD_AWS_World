# 1. install the CDK
sudo npm install -g aws-cdk

# directory name must be cdk-app/ to go with the rest of the tutorial, changing it will cause an error
mkdir cdk-app
cd cdk-app/

# initialize the application
cdk init --language javascript

# verify it works correctly
cdk ls

# install the necessary packages
npm install @aws-cdk/aws-s3 @aws-cdk/aws-iam @aws-cdk/aws-lambda @aws-cdk/aws-lambda-event-sources @aws-cdk/aws-dynamodb


# 2. copy the content of cdk-app-stack.js into lib/cdk-app-stack.js


# 3. setup the Lambda function
mkdir lambda && touch index.py

# 4. bootstrap the CDK application
cdk bootstrap

# 5. (optional) synthesize as a CloudFormation template
cdk synth


# 6. deploy the CDK stack
cdk deploy

# 7. empty the s3 bucket
# 8. destroy the stack
cdk destroy