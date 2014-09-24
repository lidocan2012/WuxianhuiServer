<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<meta charset="UTF-8">

<!--引入easyui的css和js包 -->
<link rel="stylesheet" type="text/css" href="../css/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../css/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../css/themes/color.css">
<link rel="stylesheet" type="text/css" href="../demo/demo.css">
<script type="text/javascript" src="../js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="../js/ProJson.js"></script>
<script type="text/javascript" src="../js/CityJson.js"></script>
<script type="text/javascript" src="../js/DistrictJson.js"></script>


<title>无标题文档</title>

<body>

<h3 align="center">更新无线慧用户</h3>
<div id="box" style="width: 800px; height: 450px; margin: 0 auto 0 auto;"  align="center">
<div id="bar" class="easyui-panel" title="请输入以下信息" style="width: 550px; padding: 10px 15px;margin: auto;">
<form id="registrate" name="registrate" method="post" novalidate>
	<table width="510" height="350" border ="0px" cellspacing="6px" align="center">
		<tr>
			<td width="291">
				<div style=" margin: auto;">
				<input id="userID2" name="userID2" type="hidden"> 
					<span class="text">用户名:</span>&nbsp <input
					    name="username" class="easyui-validatebox textbox" data-options="required:true,validType:'length[3,15]'"
						value=<%=new String(request.getParameter("username").getBytes("ISO8859_1"),"UTF-8")%> style="width: 150px; height: 15px">
				</div>
			</td>
		</tr>
		<tr>
			<td width="104">
				<div style=" margin: auto;">
					<span class="text">请输入密码:</span>&nbsp<input
						id="password" name="password" type="password" class="easyui-validatebox textbox" data-options="required:true,validType:'length[6,20]'" 
						value=<%=request.getParameter("password")%> style="width: 150px; height: 15px">
				</div>
			</td>
		</tr>
		<tr>
			<td width="104">
				<div style=" margin: auto;">
					<span class="text">再次输入密码:</span>&nbsp<input
						id="repassword" name="repassword" type=password class="easyui-validatebox textbox" data-options="required:true,validType:'length[6,20]'" 
						value=<%=request.getParameter("password")%> style="width: 150px; height: 15px">
				</div>
			</td>
		</tr>
		<tr>
			<td width="104">
				<div style=" margin: auto;">
					<span class="text">电话号码:</span>&nbsp<input
					    name="phonenumber" class="easyui-validatebox textbox" data-options="required:true" 
						value=<%=request.getParameter("phonenumber")%> style="width: 150px; height: 15px">
				</div>
			</td>
		</tr>
		<tr>
			<td width="104">
				<div style=" margin: auto;">
					<span class="text">电子邮件:</span>&nbsp<input
						name="email" class="easyui-validatebox textbox" data-options="required:true,validType:'email'"
						value=<%=request.getParameter("email")%> style="width: 150px; height: 15px"><font color="#FF0000">&nbsp(请准确填写可用于找回密码)</font>
				</div>
			</td>
		</tr>		
		<tr>
		    <td width="104">
		       <div style=" margin: auto;">
				<select id="selProvince">
					<option value="0">--请选择省份--</option>
				</select> <select id="selCity" >
					<option value="0">--请选择城市--</option>
				</select> <select id="selDistrict">
					<option value="0">--请选择区/县--</option>
				</select>
	             <!-- 下面定义这三个隐藏input标签为了传输js选择的省市区名称使用 -->
	             <input type="hidden" id="province" name="province" value=<%=new String(request.getParameter("province").getBytes("ISO8859_1"),"UTF-8")%>/>
	             <input type="hidden" id="city" name="city" value=<%=new String(request.getParameter("city").getBytes("ISO8859_1"),"UTF-8")%>/>
	             <input type="hidden" id="district" name="district" value=<%=new String(request.getParameter("district").getBytes("ISO8859_1"),"UTF-8")%>/>
	           </div>
	        </td>	
		</tr>
		<tr>
			<td width="104">
				<div style="margin: auto;">
					<span class="text">详细地址:</span>&nbsp<input
						id="detailaddress"  name="detailaddress" class="easyui-validatebox textbox" data-options="required:true" 
						value=<%=new String(request.getParameter("detailaddress").getBytes("ISO8859_1"),"UTF-8")%> style="width: 280px; height: 15px"><font color="#FF0000">&nbsp(省市县/区不再重复填写)</font>
				</div>
			</td>
		</tr>		
		<tr>
		    <td width="104">
		       <div style=" margin: auto;">
                  <span class="text">业务类型:</span>&nbsp
                  <select id="businesstype" name="businesstype" style="width: 100px" data-options="required:true">
                     <option value ="餐饮">餐饮</option>
                     <option value ="娱乐">娱乐</option>
                     <option value="购物">购物</option>                     
                     <option value="博物馆">博物馆</option>
                     <option value="停车场">停车场</option>
                     <option value="教育">教育</option>
                     <option value="其它">其它</option>
                  </select>
                  <input type="hidden" id="business-type" name="business-type" value=<%=new String(request.getParameter("businesstype").getBytes("ISO8859_1"),"UTF-8")%>/>
	           </div>
	        </td>	
		</tr>

		<tr>
		    <td width="250">
		        <div style="margin: auto;">
		           <a href="javascript:void(0)" class="easyui-linkbutton" style="width: 100px; height: 20px" onclick="submitForm()">注册</a>
                   &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp    
		           <a href="javascript:void(0)" class="easyui-linkbutton" style="width: 100px; height: 20px" onclick="cancel()">返回</a>
		        </div>
            </td>
		</tr>
			
	</table>
          
	</form>
</div>
</div>


<script>
    //区域选择
	$(function() {
		//设置businesstype的选中项
		var bustype = document.getElementById("business-type").value;
		//alert(bustype);
		var options = document.getElementById("businesstype").options;
		for(var i=0;i<options.length;i++){
			if(options[i].value==bustype){
				$("#businesstype").get(0).selectedIndex = i;
			}
		}

		$.each(province, function(k, p) {
			var option = "<option value='" + p.ProID + "'>" + p.ProName
					+ "</option>";
			$("#selProvince").append(option);
		});
		//根据传过来的参数值设置select标签的选中项
		//$("#selProvince option:contains('天津市')").attr("selected", true);
		var provincename = document.getElementById("province").value;
		var cityname = document.getElementById("city").value;
		var districtname = document.getElementById("district").value;
		
		$.each(province, function(k, p) {
			//alert(p.ProName+","+provincename);
			if (p.ProName == provincename) {
			  $("#selProvince").get(0).selectedIndex = p.ProID;  
			  //加载地市选项
			  $.each(city, function(l, q) {
				 if (q.ProID == p.ProID) {
					  var option = "<option value='" + q.CityID + "'>"
									+ q.CityName + "</option>";
					  $("#selCity").append(option);
				 }
			 });
			  //判断地市选中项
			 var j=0;
			 $.each(city, function(k, r) {
				 //alert(r.CityName+","+cityname);
				 var j=0;
				 if (r.ProID == p.ProID) {
						j = j + 1;//j用于selectedIndex的索引，不是 p.ProID
						//alert(j);
						 if (r.CityName == cityname) {
							 //alert(r.CityID);
							 $("#selCity").get(0).selectedIndex = j; 
							 //加载区县
							 $.each(District, function(k, s) {
							 if (s.CityID == r.CityID) {
									 var option = "<option value='" + s.Id + "'>"
												+ s.DisName + "</option>";
									 $("#selDistrict").append(option);
							     }
						     });
							 //判断区县选中项
							 j=0;
							 $.each(District, function(k, p) {
								 //alert(p.DisName+","+districtname);
								 if(p.CityID==r.CityID){
									 j = j + 1;
									 //alert(j);
									 if (p.DisName == districtname) {
										 $("#selDistrict").get(0).selectedIndex = j; 
										 return false;
									 }
								 }
							  });							 
							  return false;
						  }					 
				   }
			  });
              return false;
		    }
		});
		$("#selProvince").change(
				function() {
					var selValue = $(this).val();
					$("#selCity option:gt(0)").remove();

					$.each(city, function(k, p) {
						if (p.ProID == selValue) {
							var option = "<option value='" + p.CityID + "'>"
									+ p.CityName + "</option>";
							$("#selCity").append(option);
						}
					});

				});
		$("#selCity").change(
				function() {
					var selValue = $(this).val();
					$("#selDistrict option:gt(0)").remove();

					$.each(District, function(k, p) {
						if (p.CityID == selValue) {
							var option = "<option value='" + p.Id + "'>"
									+ p.DisName + "</option>";
							$("#selDistrict").append(option);
						}
				});
		});
	});
	
	function submitForm(){
		var provinceid = document.getElementById("selProvince").value;
		var cityid = document.getElementById("selCity").value;
		var districtid = document.getElementById("selDistrict").value;
		//alert(provinceid+","+cityid+","+districtid);		
		var provincename;
		var cityname;
		var districtname;		
		if(provinceid==0){
			provincename="";
		}
		else{
			provincename=province[provinceid-1].ProName;
		}
		if(cityid==0){
			cityname="";
		}
		else{
			cityname=city[cityid-1].CityName;
		}
		if(districtid==0){
			districtname="";
		}
		else{
			districtname=District[districtid-1].DisName;
		}		
		//alert(provincename+","+cityname+","+districtname);
		document.getElementById("province").value = provincename;
		document.getElementById("city").value = cityname;
		document.getElementById("district").value = districtname;
		
		var password = document.getElementById("password").value;
		var repassword = document.getElementById("repassword").value;
		if(password!=repassword){
			alert("两次输入的密码不一样，请重新输入密码！");
			return false;
		}
		//获取省市区选择框的值
		var provinceid = document.getElementById("selProvince").value;
		var cityid = document.getElementById("selCity").value;
		var areaid = document.getElementById("selArea").value;

		var provincename = _ds_data[provinceid].name;
		var cityname =  _ds_data[provinceid].city[cityid-1].name;
		var areaname = _ds_data[provinceid].city[cityid-1].area[areaid-1].name;
        alert(provincename+","+cityname+","+areaname);
		document.getElementById("province").value=provincename;
		document.getElementById("city").value=cityname;
		document.getElementById("district").value=areaname;
		var url = "wspusermanage_newwspuser.action";
		document.registrate.action = url;
		document.registrate.submit();
		cancel();
    }
	
	function cancel(){
		window.opener=null;
		window.open('','_self');
		window.close();		
	}
	
</script>

</body>
</html>