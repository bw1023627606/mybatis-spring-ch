  
//树形结构菜单
$(function(){
	$.get("treeMenu",function(jsonTree){
		$('#treeMenu').treeview({data: jsonTree});
	});
	$.get("userslist",function(json){
		console.log(json);
	})
	
	$("#tableUser").DataTable({	
		serverSide:true,
		ajax:{
			type:"get",
			url:"userslist"
		},
		columns:[
			{data:'userId'},
			{data:'userName'},
			{data:'passWord'},
			{data:'userFlag'},
			{data:'userDelete'},
			{data:'updateTime'},
			{data:'updateBy'}
		]
	});

});








