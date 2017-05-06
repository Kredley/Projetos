/* Altura do <p> */
function clearFilters(){
	$(".filters input").each(function(){
		$(this).val('');
		$(this).blur();
	})
	$(".filters select").each(function(){
		$(this).val('');
	})
	$(".filtering").click();

	$(".filterConfig a.button.search").click();
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


function retira_acentos(palavra) {
	com_acento = "áàãâäéèêëíìîïóòõôöúùûüçÁÀÃÂÄÉÈÊËÍÌÎÏÓÒÕÖÔÚÙÛÜÇ<strong></strong>";
	sem_acento = "aaaaaeeeeiiiiooooouuuucAAAAAEEEEIIIIOOOOOUUUUC|strong||/strong|";
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
