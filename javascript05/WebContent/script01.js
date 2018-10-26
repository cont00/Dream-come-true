/**
 * 
 */
window.onload=function()
{
	var num = 2;
	var targetdiv = document.getElementById("printdiv");
	
	for(var i=2; i<9; i=i+2)
	{
		targetdiv.innerHTML += num+"*"+i+"="+(num*i)+"&nbsp;";
		targetdiv.innerHTML += (num+1)+"*"+i+"="+((num+1)*i)+"&nbsp;";
		targetdiv.innerHTML += (num+2)+"*"+i+"="+((num+2)*i)+"<br>";
	}
}