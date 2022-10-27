# Microservice-Restful-Kafka-Producer
This repository it's aims to send restful api  from kafka producer to kafka consumer.

# Getting Starting:

* Download _Spring Tool Suite_ from here https://spring.io/tools
* Install-ubuntu-on-wsl2-on-windows from here https://ubuntu.com/tutorials/install-ubuntu-on-wsl2-on-windows-10#1-overview
* Download  _confluent_ from here https://www.confluent.io/get-started/ for _ubuntu os_

# Run confluent 

* Run this command from _ubuntu terminal_ [```confluent local services start```] 

![1](https://user-images.githubusercontent.com/28531166/185616175-e6e33ed1-4bd2-49a7-9b61-f3952ad1770a.PNG)

* Run this command from _ubuntu terminal_ [``` ifconfig``` ] to get ip address.

![image](https://user-images.githubusercontent.com/28531166/185617053-665d2373-595e-4d17-844c-6d0bfc0701fc.png)



* Run this command from windows _cmd prompet_ [``` netsh interface portproxy add v4tov4 listenport =9092 listenaddress=0.0.0.0 connectport =9092 connectaddress= YOUR_IP_ADDRESS```]

* Run this command from _ubuntu terminal_  [```  kafka-topics --create --topic users --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4 ```]
to create topic users.

* Run Spring Application

* Run postman to send api from apache kafka from Producer to kafka Consumer.

* Run this command from _ubuntu terminal_ to show data that sended from producer [``` kafka-console-consumer --bootstrap-server 0.0.0.0:9092 --topic users --from-beginning --property print.key=true --property key.separator=":" ```]

* Try Sending data ``` {"topic":"users","key": "101", "value": "Montaser Mahadi"} ```

![image](https://user-images.githubusercontent.com/28531166/185619337-a89b66ca-ab88-49ef-a6ff-4f221095c721.png)

101 => key
Montaser Mahadi => Value
