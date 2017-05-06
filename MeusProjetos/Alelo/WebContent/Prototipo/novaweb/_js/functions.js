$(document).ready(function() {
	var heightDefine = 0;
	//Verifica cada item da columa de uma table e define a variável com a que tem o maior tamanho
	$('table.display tbody tr td').each(function(index) {
		if(heightDefine < $(this).find('p').height()){
			heightDefine = $(this).find('p').height();
		}
	});
	$('table.display tbody tr td p').height(heightDefine);
/*	try{
	//Aplica o input chechbox personalizado para cada item
	 $("input[name=checkbox]").imageTick({ 
		tick_image_path: "../_img/check.gif", 
		no_tick_image_path: "../_img/no_check.gif"
	});
	}catch(e){}*/
	// Aplica ação do tooltip que mostra a relação de pedidos efetuados	
	$('.alertOver').hide();
	$('p a.pedidos').click(function(){
		$('.alertOver').attr("style","left:70px; top:505px; z-index:99999");
		$('.alertOver').show('fast');
		$('.alertOver a.fechar').click(function(){
			$('.alertOver').hide();
		})
	})
	$('.alertOver2').hide();
	$('p a.pedidos2').click(function(){
		$('.alertOver2').attr("style","left:300px; top:650px; z-index:99999");
		$('.alertOver2').show('fast');
		$('.alertOver2 a.fechar').click(function(){
			$('.alertOver2').hide();
		})
		$('.alertOver2 a#bt_ok_tooltip').click(function(){
			$('.alertOver2').hide();
		})
	})
	$('.alertOver3').hide();
	$('p a.pedidos3').click(function(){
		$('.alertOver3').attr("style","left:0px; top:410px; z-index:99999");
		$('.alertOver3').show('fast');
		$('.alertOver3 a.fechar').click(function(){
			$('.alertOver3').hide();
		})
		$('.alertOver3 a#bt_ok_tooltip').click(function(){
			$('.alertOver3').hide();
		})
	})
	$('.alertOver33').hide();
	$('p a.pedidos33').click(function(){
		$('.alertOver33').attr("style","left:0px; top:640px; z-index:99999");
		$('.alertOver33').show('fast');
		$('.alertOver33 a.fechar').click(function(){
			$('.alertOver33').hide();
		})
		$('.alertOver33 a#bt_ok_tooltip').click(function(){
			$('.alertOver33').hide();
		})
	})
	$('.alertOver333').hide();
	$('p a.pedidos333').click(function(){
		$('.alertOver333').attr("style","left:0px; top:860px; z-index:99999");
		$('.alertOver333').show('fast');
		$('.alertOver333 a.fechar').click(function(){
			$('.alertOver333').hide();
		})
		$('.alertOver333 a#bt_ok_tooltip').click(function(){
			$('.alertOver333').hide();
		})
	})
	$('.alertOver31').hide();
	$('p a.pedidos31').click(function(){
		$('.alertOver31').attr("style","left:20px; top:450px; z-index:99999");
		$('.alertOver31').show('fast');
		$('.alertOver31 a.fechar').click(function(){
			$('.alertOver31').hide();
		})
		$('.alertOver3 a#bt_ok_tooltip').click(function(){
			$('.alertOver3').hide();
		})
	})
	$('.alertOver331').hide();
	$('p a.pedidos331').click(function(){
		$('.alertOver331').attr("style","left:20px; top:670px; z-index:99999");
		$('.alertOver331').show('fast');
		$('.alertOver331 a.fechar').click(function(){
			$('.alertOver33').hide();
		})
		$('.alertOver331 a#bt_ok_tooltip').click(function(){
			$('.alertOver331').hide();
		})
	})
	$('.alertOver3331').hide();
	$('p a.pedidos3331').click(function(){
		$('.alertOver3331').attr("style","left:20px; top:900px; z-index:99999");
		$('.alertOver3331').show('fast');
		$('.alertOver3331 a.fechar').click(function(){
			$('.alertOver3331').hide();
		})
		$('.alertOver3331 a#bt_ok_tooltip').click(function(){
			$('.alertOver3331').hide();
		})
	})
	if($('.rounded.with.title.and.shadow').html()!=null){
		var roundedAttrs = $('.rounded.with.title.and.shadow').attr('class');
		var wIndex = roundedAttrs.indexOf('width')+5;
		var hIndex = roundedAttrs.indexOf(' height');
			wIndex = roundedAttrs.substring(wIndex,hIndex);
			hIndex = roundedAttrs.substring(hIndex+7)
			$('.rounded.with.title.and.shadow').prepend('<span class="title"><span>&nbsp;</span></span>')
			$('.rounded.with.title.and.shadow').append('<span class="body"><span class="top">&nbsp;</span><span class="left"><span>&nbsp;</span></span><span class="right"><span>&nbsp;</span></span><span class="bottom">&nbsp;</span></span>')
			
			$('.rounded.with.title.and.shadow').attr('style','width:'+wIndex+'px; height:'+hIndex+'px');
			$('.rounded.with.title.and.shadow').find('span.title').attr('style','width:'+(wIndex-44)+'px;');
			$('.rounded.with.title.and.shadow').find('span.body').attr('style','width:'+wIndex+'px;')
			$('.rounded.with.title.and.shadow span.body').find('span.top').attr('style','width:'+(wIndex-60)+'px;');
			$('.rounded.with.title.and.shadow span.body').find('span.bottom').attr('style','width:'+(wIndex-60)+'px; top:'+(hIndex-50)+'px;');
			$('.rounded.with.title.and.shadow span.body').find('span.left').attr('style','height:'+(hIndex-50)+'px;');
			$('.rounded.with.title.and.shadow span.body').find('span.right').attr('style','height:'+(hIndex-50)+'px;');
	}
});    

function retira_acentos(palavra) {
	com_acento = "áàãâäéèêëíìîïóòõôöúùûüçÁÀÃÂÄÉÈÊËÍÌÎÏÓÒÕÖÔÚÙÛÜÇ<strong></strong>\(\)";
	sem_acento = "aaaaaeeeeiiiiooooouuuucAAAAAEEEEIIIIOOOOOUUUUC|strong||/strong|aa";
	nova="";
	for(i=0;i<palavra.length;i++) {
		if (com_acento.search(palavra.substr(i,1))>=0) {
		nova+=sem_acento.substr(com_acento.search(palavra.substr(i,1)),1);
	}
	else {
		nova+=palavra.substr(i,1);
	}
	}
	return nova;
}
function clearFilters(){
	$(".filterConfig input").each(function(){
		$(this).val('');
	})
	$(".filterConfig select").each(function(){
		$(this).val('');
	})
	$(".filterConfig a.button.search").click();
	$(".search-filters input, .search_filters input").each(function(){
		$(this).val('');
	})
	$(".search-filters select, .search_filters select").each(function(){
		$(this).val('');
	})
	$(".search-filters a.button.search, .search_filters .search").click();
	$('.search-result-header').hide();
}
function filterMoreOptions(){
	var filterConfigOffsetTop = $(".filterConfig").offset().top;
	$(".filterConfig li").each(function(){
		if( ($(this).offset().top - filterConfigOffsetTop) > 70){
			if( $(this).attr('class') == undefined ){
				$(this).attr('class','toHide');
			}
		}
	})
	$(".toHide").hide();
		
	if($('.filterConfig li.btn_search_to_right a.textoMenor').html()==null){
		$("li.btn_search_to_right").append('<a href="javascript:void(0);" class="textoMenor" title="mais opções">mais opções</a>');
	}
	$(".rounded_box span.aux_01").height('51%'); //Tratamento para o IE 7
	$(".filterConfig li.btn_search_to_right a.textoMenor").click(function(){
		$(".filterConfig li").show();
		$(this).html('menos opções');
		$(this).unbind('click');
		$(this).click(function(){
			$(this).html('mais opções');
			filterMoreOptions();
		});
	});

}

