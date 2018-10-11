# Vấn đề:

- Khi chuyển dịch ngôn ngữ của Project A, Project A sẽ chứa các file Json ngôn ngữ như hình dưới.
	   
       |_languages
	       |_locale
			|_en
				|_Language.json
			|_vi
				|_Language.json
       
    
- File json ngôn ngữ tiếng Anh sẽ có định dạng
	
		{"deleteCaption":"Delete.","addgeoCaption":"Add new location",
		"disconnect":"Disconnected","generatorAddSucc_Msg":"Add new generator success.",
		"errorCaption":"Error","btCancel":"Cancel","radiustxt":"Radius ( m )"}
		
 - File json ngôn ngữ tiếng Việt sẽ có định dạng
	  
		{"deleteCaption":"Xóa.","addgeoCaption":"Thêm địa điểm",
		"disconnect":"Mất kết nối","generatorAddSucc_Msg":"Thêm máy phát thành công.",
		"errorCaption":"Thông báo","btCancel":"Bỏ qua","radiustxt":"Bán kính ( m )"}
    
  - Để dễ dàng trong việc quản lý các file json ngôn ngữ, ta tạo 1 file Json chung chứa cả tất cả các ngôn ngữ 
			   
	       {
		    "btSave": {
			"en": "Save",
			"vi": "Lưu"
		    },
		    "btCancel": {
			"en": "Cancel",
			"vi": "Bỏ qua"
		    },    
		    "btView": {
			"en": "Find",
			"vi": "Xem"
		    },
		    "btClose": {
			"en": "Close",
			"vi": "Đóng"
		    }
		}
       
   => Khi đó nảy sinh vấn đề: khi thêm 1 key mới sẽ phải update cho từng file json ngôn ngữ.

## Khả năng: 

	Phần mềm này có mục đích là :
- Xem file JSON
- Lưu file JSON
- Thêm/ Sửa/ xóa key
- Tách file ngôn ngữ chung ra từng file ngôn ngữ riêng biệt.

## Kỹ thuật:
- Đọc file JSON
- Ghi file JSON
- Merge JSONObject
- Tìm Key/Value trong JSONObject
- So sánh charset UTF-8

## Công nghệ:
- Swing 
- Netbean
- Maven
- Lib: JSON, log4j, common-io