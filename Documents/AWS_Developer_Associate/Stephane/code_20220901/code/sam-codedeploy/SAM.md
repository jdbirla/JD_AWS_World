From: https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-getting-started-hello-world.html

# Step 1 - Download a sample application
sam init --runtime python3.9

# Step 2 - Build your application
cd sam-app
sam build

# Step 3 - Package your application
sam deploy --guided