
function userAction(value,row,index) {
	return "<a href='javascript:void(0);' onclick='delById(\"user\",\"execute/user/deleteById\","+row.id+");' class='easyui-linkbutton' iconCls='icon-cut' plain='true'>删除</a>";
}


function assignRole() {
	$("#dialogDiv").dialog({
	    title: '分配角色',
	    resizable:true,
	    modal:true,
	    closed: false,
	    cache: false,
	    modal: true,
	    href: 'forward/system/role/find',
	}).dialog('open');
}