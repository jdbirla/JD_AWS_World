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



