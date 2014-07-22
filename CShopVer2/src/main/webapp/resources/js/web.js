$(function(){
	//mobile menu open toggle
	$(document).on('click','#mobile-menu-toggle',function(){
		if( $('#gnb').hasClass('active') ) {
			$('#gnb').removeClass('active');
		} else {
			$('#gnb').addClass('active');
		}
	});
	
	$('nav a').click(function(event) {
		var id = $(this).attr('href');
		var offset = 70;
		var target = $(id).offset().top - offset;
		$('html, body').animate({
			scrollTop: target
		}, 500);
		event.preventDefault();
	});
});

window.viewChange = function(targetFrame,href){
	$(targetFrame).load(href);
}