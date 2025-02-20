#
# 카프카 메시지 자동 실행을 위한 스크립트
#

# Zookeeper 시작
bin/zookeeper-server-start.sh config/zookeeper.properties

# Kafka 브로커 시작
bin/kafka-server-start.sh config/server.properties

# 테스팅
curl -X POST http://localhost:8080/send -H "Content-Type: application/josn" -d '"Hello Kafka!"'