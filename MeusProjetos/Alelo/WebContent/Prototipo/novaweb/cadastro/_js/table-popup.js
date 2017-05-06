$(document).ready(function(){
	$('a[rel="details"]').click(
		function(){
			$(this).next('div').css('display','block');
		}
	);
	$('.subtotal-details a').click(
		function(){
			$(this).parent().css('display','none');
		}
	);
	$('.pop-close').click(
		function(){
			$(this).parent().css('display','none');
		}
	);	
});