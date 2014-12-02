function fetchCustomerPanel() {
	$( "#customerListingTable" ).html( "" );

	$.getJSON( 'service/customers',
		function( data ) {
	  		console.log( "success" );
	  		drawTable( data );
    	})
 	  	.fail( function( jqXHR, textStatus, errorThrown ) {
      		alert('getJSON request failed! ' + textStatus);
    	  } )
      	.always(function() {
        	console.log( "complete" );
      });
}

function addCustomerEntry () {
	console.log( $("#newCustomerFieldsEntryName").val() );

	$.post('service/addCustomer',
		{ name: $("#newCustomerFieldsEntryName").val(), address: $("#newCustomerFieldsEntryName").val() },
		function(response) {
    		console.log(response);
		},
	'json');

}

function drawTable(data) {
	if ( data.length > 0 ) {
		var row = $("<tr />");

		var keys = [];
		for(var key in data[0]){

		    $("#customerListingTable").append(row);
		    var rowData = data[0];
		    row.append($("<th>" + rowData[key] + "</th>"));
		    keys.push(key);
		}


	    for (var i = 1; i < data.length; i++) {
	        drawRow(data[i], keys, i%2);
	    }
	}
}

function drawRow(rowData, keys, odd) {
    var row;

    if ( odd == 0 ) {
    	row = $("<tr />", { 'class': 'odd' });
    }
    else {
    	row = $("<tr />", { 'class': 'even' });
    }


    $("#customerListingTable").append(row);
    for(var i = 0 ; i < keys.length; i++ ){
    	row.append($("<td>" + rowData[keys[i]] + "</td>"));
	}
}

