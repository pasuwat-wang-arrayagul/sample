This is sample for build and run the springboot with docker.

Prerequire
1. Install docker on your running computer

Step to run
1. Build docker ( Before build docker , have to finish to package program as jar first)
-> docker build -t demo-springboot-docker:1.0 .

2. Run docker
-> docker run -d -p 8080:8080 -t demo-springboot-docker:1.0
