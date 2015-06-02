<%@page import="java.util.List"%>
<%@page pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/common/base_path.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<link href="themes/default/easyui.css" rel="stylesheet"  type="text/css"/>
<link href="themes/icon.css" rel="stylesheet"  type="text/css"/>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script src="js/jquery.easyui.min.js" type="text/javascript"></script>

<script type="text/javascript">
$(function(){
$("input.easyui-datebox").datebox({
   		 formatter: function(date){
		   	var y = date.getFullYear();
			var m = date.getMonth()+1;
			var d = date.getDate();
			return y+"-"+m+"-"+d;
   		 },
   		 parse:function(date){
   		 	 var t=Date.parse(date);
			if (!isNaN(t)){
				return new Date(t);
			} else {
				return new Date();
			}
   		 }
	});
$("#part_category_list").datagrid({
		title:'配件信息列表',
		fit:true,
		fitColumns:true,
		url:'basedata/ManageBasePartCategoryServlet',
		idField:'code',
		singleSelect:false,
		pagination:true,
		pageList:[3,5,10,20],
		toolbar:"#part_category_tb",
		columns:[[
		{field:'ck',checkbox:true},
		{field:'code',title:'编号'},
		{field:'categoryname',title:'类型名称',width:100},
		{field:'adddate',title:'添加日期',width:100},
		{field:'remarks',title:'备注',width:60},
		{field:'adduser',title:'操作员',width:50},
		{field:'isshow',title:'显示状态',width:50,formatter:function(val,row,idx){
			if(val=='1'){
				return "显示";
			}else{
				return "不显示";
			}
		}},	
		{field:'opt',title:'操作',width:50,formatter:function(val,row,idx){
			var content="<a href='#'>删除</a>";
			content+="<a href=\"update_category('"+row.code+"')\">修改</a>";
			return content;
		}}]]
});


$("#delsel").click(function(){
	var selRows=$("#part_category_list").datagrid("getSelections");
	if(selRows.length==0){
		$.messager.alert('消息框',"请选择一条记录");
		return;
	}
	$.messager.confirm("批量删除提醒","确认要执行删除操作吗",function(r){
		if(r){
			var ids="";
			for(var i=0;i<selRows.length;i++){
				if(i!=selRows.length-1)ids+=selRows[i].id+",";
				else ids+=selRows[i].id;
			}
			$("#idsel").val(ids);
			$("#delFrm").submit();
		}
	});
	
});
});
function update_category(code){
	
}
function delRow(nid){
	$.messager.confirm("删除提醒","确认要执行删除操作吗?",function(r){
		if(r){
			window.location.href="?nid="+nid;
		}
	});
	
}
function showNews(nid){
	$("#part_category_list").datagrid("clearChecked");
	parent.addTabs("新闻预览","news/show_news.html");
	
}
function showComment(nid){
	var url="news/news_comment_list.html?nid="+nid;
	parent.addTabs('评论列表',url);
}
function getRowIndex(target){
	var tr=$(target).closest("tr.datagrid-row");	
	return parseInt(tr.attr('datagrid-row-index'));
}
function search_category(){
	var v_code=$("form[name='searchForm'] input[name='code']").val();
	var v_pcode=$("form[name='searchForm'] input[name='pcode']").val();
	$("#part_category_list").datagrid("reload",{
		code:v_code,
		pcode:v_pcode
	});
}
</script>
</head>
<body>

<div id="part_category_list" >

</div>
<div id="part_category_tb"  style="padding:3px">
<form  method="post" name="searchForm" >
<a href="#" id="delsel" class="easyui-linkbutton" data-options="iconCls:'icon-search'">批量删除</a>
<input type="hidden" value="1" name="status"/>
<span>类别编号：</span><input type="text"  class="txt" name="code"/>
<span>类别类型：</span>
 	<select name="pcode">
 	  <option value=''>--请选择--</option>        		
     </select>
<a href="#" onclick="search_category();" class="easyui-linkbutton" 
data-options="iconCls:'icon-search'">查询</a>
</form>
</div>
<div id="categoryDialog  style="padding:10px" class="easyui-dialog" >
	<form  name="updateFrm">
		<table>
		<tr><td>*所属类别:</td><td><select name="pcode">
		<option value="0">一级类别</option>
		</select></td>
		<td>*类别编号:</td>
		<td><input type="text" value="" size="20" disabled="disabled"/></td>
		</tr>
		<tr>
		<td>*类别名称：</td>
		<td><input type="text" value="" size="20" name="categoryname"/></td>
		<td>显示状态：</td>
		<td><input type="radio" value="0"  name="isshow" checked="checked">显示<input type="radio" value="0"  name="isshow"/>隐藏</td>
		</tr>
		<tr>
			<td></td>
		</tr>
		
		</table>
	</form>		
</div>
</body>
</html>