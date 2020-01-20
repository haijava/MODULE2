

$(function() {

	$('.n11').click(function() {
		$('html').animate({scrollTop:$('#sanpham').offset().top},1500,"easeInOutExpo");
		return false;
	})

	$('.n22').click(function() {
		$('html').animate({scrollTop:$('#gioithieu').offset().top},1500,"easeInBack");
		return false;
	})
	$('.n33').click(function() {
		$('html').animate({scrollTop:$('#lienlac').offset().top},1500,"easeInBack");
		return false;
	})

	$(window).scroll(function() {
		vitri = $(document).scrollTop();
		console.log(vitri);


		if(vitri>650){
			$('.menuu').addClass('showsp');
		}
		else if ((vitri<700)||(vitri>900)){
			$('.menuu').removeClass('showsp');
		}
		if (vitri>765){
			$('.protofilo').addClass('hienthisp');
		}else if (vitri<600) {
			$('.protofilo').removeClass('hienthisp');
		}
	});
})
