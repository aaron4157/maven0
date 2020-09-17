MVC on struts
 在Strust 框架中， controller的角色基本由struts.xml (或是struts-config.xml)負責
 工程師只要專注在model與view的撰寫
 	BI的體現就在model
 	用action來響應Controller passed 請求
 	用domain作為資料容器
 	這些類別都是POJO，由DD檔組織起來協作 	
View直接面對使用者，放在webapp下

Spring MVC
... 

Struts action
action class在struts.xml(POJO)或是annotation註冊(action/supportAction)，有兩種用法
設定namespace作為網頁上層目錄的，透過query string或是form提交調用。namespace與真實資料夾結構不相關
不設定namespace的，透過標籤<s: action>調用。做為渲染用途。
問題：annotation註冊actions失敗，原因未知。