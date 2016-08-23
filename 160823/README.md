**[날짜 선택화면](../README.md)**

## jQuery를 이용한 Ajax 통신

### 설정

설정하는 정보가 
서버랑 통신을 해야하는데 서버에 url정보를 집어넣어야 한다.

$.ajax();

서버에서 json포맷 데이터 주면 통신하는 컨텐츠 타입이 xml인지 json인지  정보 줘야하고
폼태그 쓰면서 서블릿 요청하면서 get인지 post인지  정보도 줘야한다.

이런 정보 줄 설정을 해줘야 한다.

-----------------------------------------------------------------------------------------------------

javascript에 object 표현

````javascript

var obj = { key1 : value1, key2 : value2, key3 : value3, key4: function(arg){} }

// 키에 맵핑되는 자리에 값이 들어갈수 있고 function이 들어갈수 있다.

````
obj.key1을 출력하면 밸류 값이 출력된다.

````javascript

$.ajax(obj);

$.ajax({  type:'GET',
              URL: 'listjson.do', 
              contentType: 'application/json; charset=utf-8',
              error: function(xhr, status, message){
                console.log("상태값:" +status + "에러메세지:" + message);
              }
              success : showResult}
            ); 
// 정상적으로 받았을때 success라는 값이 있다.


````

````javascript

$.ajax(obj); 

// 서버에서 받은 json 데이터를 parsing하는 것.
function showResult(.jsondata){
 //  data 받아오면서 밑에는 헤더만 만들어 놓고 
 //  $('<tr>') tr태그를 생성한다.
 //  $('tr') tr의 선택자 가져와라
 // $('.active');
 $('<tr>');
}

````

## 선택자(selector)를 부름.

-  $('tr');
  
-  $('.active');

-  $('#m_5');

--------------------------------------------------------------------------------------


json 포맷으로 data 주기 위해 jackson mapper 씀.

잭손 매퍼는 매퍼 라이브러리

myBatis가 orm 표현 쓴다. 자바 객체를 맵핑해준다.

Object Relational Mapping  

객체와 rdb 테이블 맵핑해주는것.

java object를 json 포맷으로 변환해주는 역할이 jackson 맵퍼이다.

List<UserVO> 를 map에다 담았다. map에 키값에 "jsondata" 밸류에 list객체 넣음.

자바객체를 json 포맷으로 변환했었음.

자바객체를 xml 포맷으로 변경하는 것을 할것이다.

##JAXB(Java API XML Binding)

- java object -> XML
  + xml태그로 만들어 줌.

- XML -> java object

J2EE 라이브러리에 JAXB가 있다.


- UserVOXML.java 생성

````java

@XmlRootElement(name="users") // users라는 root 태그 생성
public class UserVOXML {
  List<uservo> userList;
  @XmlElement(name="user") // user라는 태그 생성
  public void setUserList(List<uservo> user){
      this.userList = user;
  } 
}

// <users> -> root Tag가 생김
//    <user> -> tag 생김
//      <userId></userId>
//      <name></name>
//      <age></age>
//      <dob></dob>
//   </user>
// <users>

````

UserVOXML.java

````java

package user.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="users")
public class UserVOXML {
  private String status;
  private List<UserVO> userList;
  
  public UserVOXML(){
    
  }

  public UserVOXML(String status, List<UserVO> userList) {
    super();
    this.status = status;
    this.userList = userList;
  }

  public String getStatus() {
    return status;
  }
  
  @XmlElement
  public void setStatus(String status) {
    this.status = status;
  }

  public List<UserVO> getUserList() {
    return userList;
  }

  @XmlElement(name="user")
  public void setUserList(List<UserVO> userList) {
    this.userList = userList;
  }
  
}

````

UserSpringController.java

````java

  // xml 포맷 변경 실습
  
  @RequestMapping("/listXml.do")
  @ResponseBody
  public UserVOXML listXml(){
    List<UserVO> list = dao.listUser();
    UserVOXML xml = new UserVOXML("success", list);
    return xml;
  }

````
userListXml.html

````java

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
<script type="text/javascript">
  $(function(){
    $.ajax({
      type: 'get',
      url: 'listXml.do',
      contentType: 'application/xml; charset=utf-8',
      dataType: 'xml',
      error:function(xhr,status,msg){
        alert("상태값 :" + status + "Http에러메세지 :" + msg);
      },
      success:showResult // 함수호출
    }); 
  });
  
  function showResult(data){
    console.log(data);
    if($(data).find("status").text() == 'success'){
      $(data).find("user").each(function(idx,item){
        $('<tr>')
        .append($('<td>').html($(item).find("userId").text()))
        .append($('<td>').html($(item).find("name").text()))
        .append($('<td>').html($(item).find("age").text()))
        .append($('<td>').html($(item).find("dob").text()))
        .appendTo('tbody');
    });
  }
} // showResult
</script>
</head>
<body>
  <table id="dataTable">
    <caption>사용자 목록</caption>
    <thead>
      <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>나이</th>
        <th>생일</th>
      </tr>
    </thead>
    <tbody></tbody>
  </table>
</body>
</html>

````