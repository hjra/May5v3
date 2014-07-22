jQuery(function(){
    //GNB 링크 excution
	$("#gnb > menu").on("click","*",function(e){
        var href = $(this).attr("href");
        if(!!href){
            location.href = href;
        } else {
            var hrefEl = $(this).parents().filter("#gnb > menu [href]").eq(0);
            if(hrefEl.length){
                location.href = hrefEl.attr("href");
            }
        }
        e.stopPropagation();
	});
	
	//모바일 메뉴
	$("body").on("touchend",".folder",function(e){
		var gnb = $(".master-main .context-gnb");
		if(gnb.length){
			switch(gnb.css("display")){
				case "none":
					gnb.css("display","block");
					break;
				case "block":
					gnb.css("display","none");
					break;
			}
			e.preventDefault();
		}
	});
	
});