# AWS_DEVLOPER_IN28Mins
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



