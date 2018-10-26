function doA()
{
	var i=0;
	while(i<5)
	{
		alert(i + "경고창");
		i++;
	}
}

function doB()
{
	var arr = ["망고","바나나","사과","멜론"];
	var targetdiv = document.getElementById("printdiv");
	targetdiv.innerHTML = "";
	
	for(var i in arr)
	{
		targetdiv.innerHTML += arr[i]+"<br>";
	}
}

function doC()
{
	var output = '';

	for(var i = 0; i < 15; i++){
		for(var j = 15; j > i; j--){
			output += ' ';
		}
		for(var k = 0; k < 2 * i - 1; k++){
			output += '*';
		}
		output += '\n'
	}
	alert(output);
}

