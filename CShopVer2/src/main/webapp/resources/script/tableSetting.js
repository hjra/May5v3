	/* Scripts for the tables test page
	 Author: Maggie Wachs, www.filamentgroup.com
	 Date: November 2011
	 Dependencies: jQuery, jQuery UI widget factory
	 */
(function($) {
	$.widget("filament.table",{ // need to come up with a better namespace var...
		options : {
			idprefix : null, // specify a prefix for the id/headers values
			persist : null, // specify a class assigned to column headers (th) that should always be present; the script not create a checkbox for these columns
			checkContainer : null	// container element where the hide/show checkboxes will be inserted; if none specified, the script creates a menu
		},	// Set up the widget
		_create : function() {
			var self = this, o = self.options, table = self.element,
			thead = table.find("thead"), 
			tbody = table.find("tbody"), 
			hdrCols = thead.find("th"), 
			bodyRows = tbody.find("tr"), 
			container = o.checkContainer ?
					$(o.checkContainer)	: $('<div class="table-menu table-menu-hidden"><ul /></div>');
						// add class for scoping styles - cells should be hidden only when JS is on
			table.addClass("enhanced");
			hdrCols.each(function(i) {
				var th = $(this), 
				id = th.prop("id"), 
				classes = th.prop("class"); // assign an id to each header, if none is in the markup
				if (!id) {
					id = (o.idprefix ? o.idprefix : "col-")	+ i;
					th.prop("id", id);
				};
					// assign matching "headers" propibutes to the associated cells
					// TEMP - needs to be edited to accommodate colspans
				bodyRows.each(function() {
					var cell = $(this).find("th, td").eq(i);
					cell.prop("headers", id);
					if (classes) {
						cell.addClass(classes);
					};
				}); // create the hide/show toggles
				if (!th.is("." + o.persist)) {
					var toggle = $('<li><input type="checkbox" name="toggle-cols" id="toggle-col-'+i
							+'" value="'+id+'" /> <label for="toggle-col-'+i+'">'
							+ th.text()+ '</label></li>');
					container.find("ul").append(toggle);
					toggle.find("input").change(function() {
						var input = $(this), 
						val = input.val(), cols = $("#"+ val+ ", [headers="+ val+ "]");
						if (input.is(":checked")) {
							cols.show();
						} else {
							cols.hide();
						};
					}).bind("updateCheck",function() {
						if (th.css("display") == "table-cell"|| 
								th.css("display") == "inline") {
							$(this).prop("checked",true);
						} else {$(this).prop("checked",false);
						}
					}).trigger("updateCheck");
				};
			}); // end hdrCols loop
				// update the inputs' checked status
			$(window).bind("orientationchange resize",
				function() {container.find("input").trigger("updateCheck");});
				// if no container specified for the checkboxes, create a "Display" menu
			if (!o.checkContainer) {
				var menuWrapper = $('<div class="table-menu-wrapper" />'), 
				menuBtn = $('<a href="#" class="table-menu-btn">Display</a>');
				menuBtn.click(function() {
					container.toggleClass("table-menu-hidden");
					return false;
				});
				menuWrapper.append(menuBtn).append(container);
				table.before(menuWrapper); // assign click-to-close event
				$(document).click(function(e) {
					if (!$(e.target).is(container) && !$(e.target).is(
						container.find("*"))) {container.addClass("table-menu-hidden");
					}
				});
			};
		}, // end _create
		disable : function() {// TBD
		},
		enable : function() {// TBD
		}
	});
}(jQuery));
$(function() { // on DOM ready
	$("#tech-companies").table({
		idprefix : "co-",
		persist : "persist"
	});
}); // end DOM ready
//---------------------------------------------------------
(function() {
	setTimeout(function() {
		// If onload hasn't been called, stop all requests after 2 seconds
		if (typeof (_l) == 'undefined') {
			if (window.stop !== undefined)
				window.stop();
			else if (document.execCommand !== undefined)
				document.execCommand("Stop", false);
		}
	}, 2000, 'push');
	/*
	 * Capture and kill CSS animations after X number of seconds
	 */
	function pauseAnimations() {
		var body = document.getElementsByTagName('body')[0];
		if (body.addEventListener) {
			body.addEventListener("webkitAnimationStart", listener, false);
			body.addEventListener("webkitAnimationIteration", listener, false);
			body.addEventListener("animationstart", listener, false);
			body.addEventListener("animationiteration", listener, false);
		}
	}
	function listener(e) {
		if (e.type == "webkitAnimationStart"
				|| e.type == "webkitAnimationIteration") {
			var targetEl = e.target;
			setTimeout(function() {
				targetEl.style.webkitAnimationPlayState = 'paused';
			}, __animationDuration, 'push');
		} else if (e.type == "animationstart"
				|| e.type == "animationiteration") {
			var targetEl = e.target;
			setTimeout(function() {
				targetEl.style.MozAnimationPlayState = 'paused';
			}, __animationDuration, 'push');
		}
	}
	pauseAnimations();
	// Pause all audio elements, allow the audio/video
	// elements to render before stopping them
	function pauseElementTypes(type) {
		for (var i = 0, els = document.getElementsByTagName(type); i < els.length; i++) {
			els[i].pause();
		}
	}
	// Wait until the elements have been created to pause them
	setTimeout(function() {
		pauseElementTypes('audio');
		pauseElementTypes('video');
	}, 100);
}());