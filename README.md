# market-it-backend-test

database 정보
tb_order
  order_idx (주문번호 고유값)
  order_id  (주문ID 고유값)
  order_name (주문명)
  status    (상태 0:접수, 1:완료)

주문 접수처리: /api/orders/{id}/accept
requestrequest
localhost:8080/api/orders/A0000001/accept?orderName=주문01
response
success

주문 완료처리: /api/orders/{id}/complete
request
localhost:8080/api/orders/A0000001/complete
response
success

단일 주문조회: /api/orders/{id}
request
localhost:8080/api/orders/A0000001
response
{"orderIdx":2,"orderId":"A0000001","orderName":"주문02","status":1}

주문 목록조회: /api/orders
request
localhost:8080/api/orders
response
[{"orderIdx":1,"orderId":null,"orderName":"결재1","status":0},{"orderIdx":2,"orderId":"A0000001","orderName":"주문02","status":1}]
