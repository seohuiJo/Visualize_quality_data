$(document).ready(function(){
	load_winelist();
})

function load_winelist(){
	var wineList;
    var html;
    $("#load_wineList").click(function(){  
    
        var url="/visualize_quality_data/restex";  
        //var params="param1="+param1+"¶m2="+param1;  
  
        $.ajax({      
            type:"bar",  
            url:url,      
            //data:params,      
            success:function(args){
                wineList = args;
                for(var i=0;i<args.length;i++){
                    html = "<tr>"
                            + "<td>" + args[i].product_seq + "</td>" 
                            + "<td>" + args[i].quality + "</td>"
                            "</tr>";
                    $("#wineList").append(html);
                }
                
                console.log(args);
            },   
            beforeSend:function(){
                $("#wineList").empty();  
            },
            error:function(e){  
                alert(e.responseText);  
            }  
        });  
      
    });
}
