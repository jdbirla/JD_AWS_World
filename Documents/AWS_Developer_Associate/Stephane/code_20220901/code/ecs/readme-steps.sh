# build a docker image
docker build -t demo .

# login to ECR (AWS CLI Version 1) - included for legacy purposes (the exam may still ask you)
# $(aws ecr get-login --no-include-email --region eu-west-1)

# Login to ECR (AWS CLI Version 2) - MAC / LINUX
aws ecr get-login-password --region eu-west-1 | docker login --username AWS --password-stdin 1234567890.dkr.ecr.eu-west-1.amazonaws.com

# For Windows, see instructions here: http://docs.aws.amazon.com/AmazonECR/latest/userguide/getting-started-cli.html

# tag image (change aws account number)
docker tag demo:latest 1234567890.dkr.ecr.eu-west-1.amazonaws.com/demo:latest

# push image
docker push 1234567890.dkr.ecr.eu-west-1.amazonaws.com/demo:latest

# pull image
docker pull 1234567890.dkr.ecr.eu-west-1.amazonaws.com/demo:latest