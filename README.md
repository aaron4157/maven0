# maven0
 Struts framework on Maven

# FullStackDeveloping
巨匠產學就業班課堂練習，有課程檔案與預習檔案。
*在外國，全端工程師由資深工程師擔任。在這裡，"全端"並非揭示一個好高騖遠的目標，而是藉由一個小系統、練習前端與後端的相互整合，模擬組織互動情形，形成全觀思維視角。*

## 專案大架構如下
* web system 採用 Struts framework (一種MVC framework)
* front end 採用 jQuery、OGNL與Struts EL技術
* model 採用Spring framework 的 bean factory pattern
* 重複使用的功能包裝成service 採用 Jersey framework (一種RESTful service)

## 開發環境配置
測試Web container 是 Tomcat EE8.0.3 成品也可以佈署到其它引擎如 glassfish；
開發環境是 JRE8 

## 自行調整執行環境(Eclipse w/o MyEclipse)
* 在Maven基礎上引入Struts框架：struts.xml, pom.xml, applicationContext.xml
* 編譯回報package import錯誤：檢查pom.xml的dependencies然後執行Maven update project