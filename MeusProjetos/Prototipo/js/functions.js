var contScrollBW;
var indexScrollBW;
var nOL;
var pageHeight = 0;

function getLightViewBg(pageName,isLightView){
	$('body').prepend('<div class="BglightView">&nbsp;</div>');
	htmlContent = '<div class="contentLightView"></div>';
	$('.siteContainer .mainContainer .middleContainer').append(htmlContent);
	$('.contentLightView').append('<div class="container"></div>');
	$('.contentLightView .container').append('<span class="top">&nbsp;</span>').append('<div class="content"></div>').append('<span class="bottom"></span>');
	$('.BglightView').css('height',$('.siteContainer').height()+'px');
	$('.BglightView').hide();
	$('.contentLightView').hide();
}
$(document).ready(function(){
	
	$('#mainMenu ul li').first().attr('style','background:url(imgs/bg_corners_menu_.png) top left;')
	$('#mainMenu ul li').first().find('a').attr('style','padding:3px 5px 3px 15px;')
	$('#mainMenu ul li').last().attr('style','background:url(imgs/bg_corners_menu.png) top right;')
	$('#mainMenu ul li').last().find('a').attr('style','padding:3px 15px 3px 5px; background:none;')
	$('.rodape ul li').last().attr('style','border:none;')
	
	var htmlContent = $(".modalCorner").html();
	$(".modalCorner").html('');
	$(".modalCorner").append('<span class="top">&nbsp;</span>');
	$(".modalCorner").append('<span class="middle">&nbsp;</span>');
	$(".modalCorner").append('<span class="bottom">&nbsp;</span>');
	$(".modalCorner .middle").append(htmlContent);
	
})
