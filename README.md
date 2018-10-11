
Vấn đề:
       Khi chuyển dịch ngôn ngữ của Project A, Project A sẽ chứa các file Json ngôn ngữ như hình dưới.
       File json ngôn ngữ tiếng Anh sẽ có định dạng
       
       File json ngôn ngữ tiếng Việt sẽ có định dạng
       
       Để dễ dàng trong việc quản lý các file json ngôn ngữ, ta tạo 1 file Json chung chứa cả tất cả các ngôn ngữ 
       
       
       Khi đó nảy sinh vấn đề: khi thêm 1 key mới sẽ phải update cho từng file json ngôn ngữ.

Khả năng:
	Phần mềm này có mục đích là :
- Xem file JSON
- Lưu file JSON
- Thêm/ Sửa/ xóa key
- Tách file ngôn ngữ chung ra từng file ngôn ngữ riêng biệt.

Kỹ thuật:
- Đọc file JSON
- Ghi file JSON
- Merge JSONObject
- Tìm Key/Value trong JSONObject
- So sánh charset UTF-8

Công nghệ:
- Swing 
- Netbean
- Maven
- Lib: JSON, log4j, common-io


