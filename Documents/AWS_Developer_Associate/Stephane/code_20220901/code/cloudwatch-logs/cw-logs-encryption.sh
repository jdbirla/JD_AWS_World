# associate with existing log group
aws logs associate-kms-key --log-group-name /aws/lambda/hello-world --kms-key-id arn:aws:kms:eu-west-2:387124123361:key/0509dc31-00a4-4ef6-a739-3d77b2e011f5 --region eu-west-2

# create new log group
aws logs create-log-group --log-group-name /example-encrypted --kms-key-id arn:aws:kms:eu-west-2:387124123361:key/0509dc31-00a4-4ef6-a739-3d77b2e011f5 --region eu-west-2
