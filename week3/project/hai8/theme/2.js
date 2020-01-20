$(function() {
	var docao=$(window).height();
	$('.top1').css({'heght':docao})
	$(window).resize(function() {
		var docao=$(window).height();
		$('.top1').css({'height':docao})
	});

		$('.nutmenu').click(function() {
			$('.menuphai').addClass('ra');
			return false;
		});

		$('.tats').click(function() {
			$('.menuphai').removeClass('ra');
			return false;
		});

});