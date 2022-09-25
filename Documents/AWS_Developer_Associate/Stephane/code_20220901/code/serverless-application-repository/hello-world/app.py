import json
import os


def lambda_handler(event, context):
    return {
        "statusCode": 200,
        "body": json.dumps({
            "message": "hello world " + os.environ['CUSTOM_NAME'],
        }),
    }