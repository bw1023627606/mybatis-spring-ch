$(function() {
	$('input').iCheck({
		checkboxClass : 'icheckbox_square-blue',
		radioClass : 'iradio_square-blue',
		increaseArea : '20%' /* optional */
	});
	
	
	 $('#accept').click(function(){
         if($("#accept").prop('checked')){
        	 $('#btn').attr("disabled","disabled");
         }else{
        	 $('#btn').removeAttr("disabled"); 
        	
         }
     });


});