# Initialize the Application
sam init --runtime python3.9

# Choose 1
# Which template source would you like to use?
# 	1 - AWS Quick Start Templates
# 	2 - Custom Template Location
# Choice: 

# Choose 1
# What package type would you like to use?
# 	1 - Zip (artifact is a zip uploaded to S3)	
# 	2 - Image (artifact is an image uploaded to an ECR image repository)
# Package type:

# Project name [sam-app]: [Enter]

# Choose 1
# AWS quick start application templates:
# 	1 - Hello World Example
# 	2 - EventBridge Hello World
# 	3 - EventBridge App from scratch (100+ Event Schemas)
# 	4 - Step Functions Sample App (Stock Trader)
# Template selection:



# 2. update the code and template.yaml

# 3. deploy

# Create an S3 bucket
aws s3 mb s3://bucketname

# Edit S3 bucket policy, allowing AWS SAR read from this bucket
aws s3api put-bucket-policy --bucket bucketname --policy file://policy.json


# 4. package the application

# This command does the following:
	# - Zips the contents of hello_world/ dir and uploads it to our bucket
	# - Outputs a new template file packaged.yaml, same as template.yaml but has a difference CodeUri (reference to packaged artifacts on S3)
sam package --template-file template.yaml --output-template-file packaged.yaml --s3-bucket <bucketname>

# 5. publish the application
sam publish --template packaged.yaml --region us-east-1

# Created new application with the following metadata:
# {
#   "Name": "my-app",
#   "Description": "Hello World",
#   "Author": "Stephane",
# 	"SemanticVersion": "0.0.1"
# }

# 6. deploy in AWS console

# 7. clean up
# - Delete the Deployed Application
#     - Open the [AWS CloudFormation console](https://console.aws.amazon.com/cloudformation/home?region=us-east-1#/stacks?filteringStatus=active&filteringText=&viewNested=true&hideStacks=false)
#     - Select and delete the stack
# - Delete the Published Application
#     - Open the [AWS Serverless Application Repository Published Applications](https://console.aws.amazon.com/serverlessrepo/home?region=us-east-1#/published-applications)
#     - Select and delete the application

# First empty the S3 bucket
aws s3 rm s3://bucketname --recursive

# Delete the bucket
aws s3 rb s3://bucketname