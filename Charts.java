import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Charts {
	
	static Scanner entrada;

		public static void main(String[] args) {

			entrada = new Scanner(System.in);
		
		
		int voto;
		int votos[] = new int [2];
		boolean ok = true;
		
		
		while(ok) {
			
			System.out.println("Vote no melhor presidente para república do Brasil. Digite o número correspondente:");
			System.out.println("1- Haddad ");
			System.out.println("2- Bolsonaro ");
			System.out.println("0 -> Apurar votos.");
			voto = entrada.nextInt();
			
			if (voto != 0) {
			votos[voto - 1] += 1;
			} else {
				ok = false;
			}
		}
	/*	
		
		String comeco = "\"<html>\\r\\n\" + \r\n" + 
				"		    		\"  <head>\\r\\n\" + \r\n" + 
				"		    		\"    <script type=\\\"text/javascript\\\" src=\\\"https://www.gstatic.com/charts/loader.js\\\"></script>\\r\\n\" + \r\n" + 
				"		    		\"    <script type=\\\"text/javascript\\\">\\r\\n\" + \r\n" + 
				"		    		\"      google.charts.load('current', {'packages':['bar']});\\r\\n\" + \r\n" + 
				"		    		\"      google.charts.setOnLoadCallback(drawStuff);\\r\\n\" + \r\n" + 
				"		    		\"\\r\\n\" + \r\n" + 
				"		    		\"      function drawStuff() {\\r\\n\" + \r\n" + 
				"		    		\"        var data = new google.visualization.arrayToDataTable([\"";
 */
	/*	
		
		String fim = "\" ]);\\r\\n\" + \r\n " + 
				"		    		\"\\r\\n\" + \r\n" + 
				"		    		\"        var options = {\\r\\n\" + \r\n" + 
				"		    		\"          width: 800,\\r\\n\" + \r\n" + 
				"		    		\"          legend: { position: 'none' },\\r\\n\" + \r\n" + 
				"		    		\"          chart: {\\r\\n\" + \r\n" + 
				"		    		\"            title: 'Chess opening moves',\\r\\n\" + \r\n" + 
				"		    		\"            subtitle: 'popularity by percentage' },\\r\\n\" + \r\n" + 
				"		    		\"          axes: {\\r\\n\" + \r\n" + 
				"		    		\"            x: {\\r\\n\" + \r\n" + 
				"		    		\"              0: { side: 'top', label: 'White to move'} // Top x-axis.\\r\\n\" + \r\n" + 
				"		    		\"            }\\r\\n\" + \r\n" + 
				"		    		\"          },\\r\\n\" + \r\n" + 
				"		    		\"          bar: { groupWidth: \\\"90%\\\" }\\r\\n\" + \r\n" + 
				"		    		\"        };\\r\\n\" + \r\n" + 
				"		    		\"\\r\\n\" + \r\n" + 
				"		    		\"        var chart = new google.charts.Bar(document.getElementById('top_x_div'));\\r\\n\" + \r\n" + 
				"		    		\"        // Convert the Classic options to Material options.\\r\\n\" + \r\n" + 
				"		    		\"        chart.draw(data, google.charts.Bar.convertOptions(options));\\r\\n\" + \r\n" + 
				"		    		\"      };\\r\\n\" + \r\n" + 
				"		    		\"    </script>\\r\\n\" + \r\n" + 
				"		    		\"  </head>\\r\\n\" + \r\n" + 
				"		    		\"  <body>\\r\\n\" + \r\n" + 
				"		    		\"    <div id=\\\"top_x_div\\\" style=\\\"width: 800px; height: 600px;\\\"></div>\\r\\n\" + \r\n" + 
				"		    		\"  </body>\\r\\n\" + \r\n" + 
				"		    		\"</html>\"";
				*/

String comeco = "<html>\r\n" + 
				"  <head>\r\n" + 
				"    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
				"    <script type=\"text/javascript\">\r\n" + 
				"      google.charts.load('current', {'packages':['bar']});\r\n" + 
				"      google.charts.setOnLoadCallback(drawStuff);\r\n" + 
				"\r\n" + 
				"      function drawStuff() {\r\n" + 
				"        var data = new google.visualization.arrayToDataTable([\r\n";

String fim = "]);\r\n" + 
			"\r\n" + 
			"        var options = {\r\n" + 
			"          width: 800,\r\n" + 
			"          legend: { position: 'none' },\r\n" + 
			"          chart: {\r\n" + 
			"            title: 'Eleição',\r\n" + 
			"            subtitle: '' },\r\n" + 
			"          axes: {\r\n" + 
			"            x: {\r\n" + 
			"              0: { side: 'top', label: 'número de votos'} // Top x-axis.\r\n" + 
			"            }\r\n" + 
			"          },\r\n" + 
			"          bar: { groupWidth: '90%%' }\r\n" + 
			"        };\r\n" + 
			"\r\n" + 
			"        var chart = new google.charts.Bar(document.getElementById('top_x_div'));\r\n" + 
			"        // Convert the Classic options to Material options.\r\n" + 
			"        chart.draw(data, google.charts.Bar.convertOptions(options));\r\n" + 
			"      };\r\n" + 
			"    </script>\r\n" + 
			"  </head>\r\n" + 
			"  <body>\r\n" + 
			"    <div id=\"top_x_div\" style"
			+ "=\"width: 800px; height: 600px;\"></div>\r\n" + 
			"  </body>\r\n" + 
			"</html>";
		
		try {
			FileWriter arq = new FileWriter("googleCharts.html");
			PrintWriter gravarArq = new PrintWriter(arq);
			
			
		    

			gravarArq.printf(comeco);   
		    gravarArq.printf("['Presidente', 'Quantidade de votos'],\r\n" + 
					"          [\"Haddad\","+ String.valueOf(votos[0])+"],\r\n" + 
					"          [\"Bolsonaro\","+ String.valueOf(votos[1])+"],\r\n");
		   gravarArq.printf(fim);
		    
		    
		    arq.close(); 
		} catch ( java.io.IOException e) {
			// log erro
			

		}
		    
}	 
}
	

