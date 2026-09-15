Test trên postman các kịch bản sau:
1. Thêm loại phòng (RoomType): POST : http://localhost:8080/api/roomtypes
2. Lấy roomtype theo ID: GET : http://localhost:8080/api/roomtypes/{id}	
3. Tạo phòng với roomTypeId tồn tại: POST : http://localhost:8080/api/rooms
4. Tạo phòng với roomTypeId không tồn tại: POST : http://localhost:8080/api/rooms
5. Lấy danh sách các phòng: GET : http://localhost:8080/api/rooms