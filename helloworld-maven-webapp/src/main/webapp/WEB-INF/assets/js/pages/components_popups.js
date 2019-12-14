/* ------------------------------------------------------------------------------
*
*  # Tooltips and popovers
*
*  Specific JS code additions for components_popups.html page
*
*  Version: 1.0
*  Latest update: Aug 1, 2015
*
* ---------------------------------------------------------------------------- */

$(function() {


    // Popovers
    // ------------------------------

	//
	// Styling
	//

	// Custom color
	$('[data-popup=popover-custom]').popover({
		template: '<div class="popover border-teal-400"><div class="arrow"></div><h3 class="popover-title bg-teal-400"></h3><div class="popover-content"></div></div>'
	});

	// Custom solid color
	$('[data-popup=popover-solid]').popover({
		template: '<div class="popover bg-primary"><div class="arrow"></div><h3 class="popover-title"></h3><div class="popover-content"></div></div>'
	});


	//
	// Popover events
	//

	// onShow event
	$('#popover-show').popover({
		title: 'Popover title',
		content: 'And here\'s some amazing content. It\'s very engaging. Right?',
		trigger: 'click'
	}).on('show.bs.popover', function() {
		alert('Show event fired.')
	});

	// onShown event
	$('#popover-shown').popover({
		title: 'Popover title',
		content: 'And here\'s some amazing content. It\'s very engaging. Right?',
		trigger: 'click'
	}).on('shown.bs.popover', function() {
		alert('Shown event fired.')
	});

	// onHide event
	$('#popover-hide').popover({
		title: 'Popover title',
		content: 'And here\'s some amazing content. It\'s very engaging. Right?',
		placement: 'top',
		trigger: 'click'
	}).on('hide.bs.popover', function() {
		alert('Hide event fired.')
	});

	// onHidden event
	$('#popover-hidden').popover({
		title: 'Popover title',
		content: 'And here\'s some amazing content. It\'s very engaging. Right?',
		trigger: 'click'
	}).on('hidden.bs.popover', function() {
		alert('Hidden event fired.')
	});


	//
	// Popover methods
	//

	// Show method
	$('#show-popover-method').on('click', function() {
		$('#show-popover-method-target').popover('show')
	})

	// Hide method
	$('#hide-popover-method-target').on('mouseenter', function() {
		$(this).popover('show')
	});
	$('#hide-popover-method').on('click', function() {
		$('#hide-popover-method-target').popover('hide')
	});

	// Toggle method
	$('#toggle-popover-method').on('click', function() {
		$('#toggle-popover-method-target').popover('toggle')
	})

	// Destroy method
	$('#destroy-popover-method').on('click', function() {
		$('#destroy-popover-method-target').popover('destroy')
	});
	
});
