package UserInterface;


public class Data {
	
	
	public static String[] data = {"--SELECT--","DELHI [DEL]","MUMBAI [BOM]","BANGALORE [BLR]","HYDERABAD [HYD]","KOLKATA [CCU]","CHENNAI [MAA]","AHMEDABAD [AMD]","PANAJI [GOI]","PATNA [PAT]","COCHIN [COK]","LUCKNOW [LKO]","GUWAHATI [GAU]","`PUNE [PNQ]","JAIPUR [JAI]","SRINAGAR [SXR]","BHUBANESHWAR [BBI]","BAGDOGRA [IXB]","VARANASI [VNS]",
			"CHANDIGHAR [IXC]","RANCHI [IXR]"};
	
	public static int[] xco = {0,211,109,211,238,458,277,107,130,398,182,288,540,156,182,162,413,460,336,206,392};
	public static int[] yco = {0,190,390,524,427,318,530,301,466,249,586,222,227,405,223,63,355,223,259,143,297};
	
	
//    public static int[][] cost = {{0,0,7781,9688,8925,8467,9611,0,9611,0,0,0,0,0,0,0,0,0,0,0},
//                    {0,0,0,9937,0,0,0,6475,0,0,0,0,0,7939,16419,10502,0,0,0,0},
//                    {12784,0,0,0,0,6307,0,10481,0,0,12210,6490,0,0,0,0,0,0,0,0},
//                    {9960,0,0,0,0,0,9843,0,0,9965,0,0,0,0,0,0,0,0,12420,13640},
//                    {0,0,0,0,0,9031,12817,0,0,0,0,0,16265,10567,18289,0,0,0,0,0},
//                    {12613,0,6356,0,0,0,0,0,11461,0,0,11996,9060,0,0,0,0,0,0,0},
//                    {10320,0,0,0,0,11934,0,0,0,0,0,15924,0,7262,0,0,0,0,10973,0},
//                    {12937,5718,6984,0,13388,9354,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                    {9777,0,10651,0,0,0,0,0,0,0,4082,0,10662,8033,0,0,0,0,0,0},
//                    {11142,10539,5560,8800,0,8266,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                    {0,0,0,0,0,0,9049,12349,0,0,0,9217,10391,7354,0,0,0,0,0,0},
//                    {9294,11588,12688,0,0,0,0,0,0,0,0,0,11133,13430,0,0,0,0,0,0},
//                    {11253,0,0,0,0,9875,0,0,0,0,0,10732,0,0,0,0,0,0,11748,9222},
//                    {0,0,0,0,0,0,7090,7560,0,0,0,13430,9747,0,0,0,0,13430,0,0},
//                    {12469,21973,23258,31659,0,0,0,0,0,0,11396,0,0,0,0,0,0,0,0,0},
//                    {0,0,10143,0,8558,0,0,0,7620,0,0,0,10671,0,0,0,0,0,0,9731},
//                    {9870,17628,13772,0,9742,16066,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                    {10218,0,13202,12525,7875,15629,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                    {0,0,0,0,20199,13950,0,12856,0,0,7915,0,0,9383,0,0,0,0,0,0},
//                    {10834,0,10270,0,4645,0,0,0,0,13167,5335,0,0,0,0,0,0,0,0,0} };
	public static int[][] cost = {{0,7781,9688,8925,8496,9611,0,9611,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,9937,0,0,0,6475,0,0,0,0,0,0,7939,16419,10502,0,0,0,0},
			{12784,0,0,0,0,6307,0,0,10481,0,0,12210,6490,0,0,0,0,0,0,0},
			{9960,0,0,0,0,0,9843,0,0,0,9965,0,0,0,0,0,0,12420,13640,0},
			{0,0,0,0,0,9031,12817,0,0,0,0,0,16265,10567,18289,0,0,0,0,0},
			{12613,0,6356,0,0,0,0,0,11461,0,0,11996,9060,0,0,0,0,0,0,0},
			{10320,0,0,0,0,11934,0,0,0,0,0,15924,0,7262,0,0,0,0,10973,0},
			{12937,5718,6984,0,13388,9354,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{9777,0,10651,0,0,0,0,0,0,0,4082,0,10662,8033,0,0,0,0,0,0},
			{11142,10539,5560,8800,0,8266,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,9049,12349,0,0,0,9217,10391,7354,0,0,0,0,0,0},
			{9294,11588,12688,0,0,0,0,0,0,0,0,0,11133,13430,0,0,0,0,0,0},
			{11253,0,0,0,0,9875,0,0,0,0,0,10732,0,0,0,0,0,0,11748,9222},
			{0,0,0,0,0,0,7090,7560,0,0,0,13430,9747,0,0,0,0,7088,0,0},
			{12469,21973,23258,31659,0,0,0,0,0,0,11397,0,0,0,0,0,0,0,0,0},
			{0,0,10143,0,8558,0,0,0,7620,0,0,0,10671,0,0,0,0,0,0,9731},
			{9870,17628,13772,0,9742,16066,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{10218,0,13202,12525,7875,15629,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,20199,13950,0,12856,0,0,7915,0,0,9383,0,0,0,0,0,0},
			{10834,0,10270,0,4645,0,0,0,0,13167,5235,0,0,0,0,0,0,0,0,0}
			};
//
//    public static int[][] time = {{0,130,170,150,150,185,0,160,0,0,0,0,0,0,0,0,0,0,0,0},
//                        {0,0,105,0,0,0,70,0,0,0,0,0,0,110,170,135,0,0,0,0},
//                        {155,0,0,0,0,90,0,0,160,0,0,175,90,0,0,0,0,0,0,0},
//                        {135,0,0,0,0,0,95,0,0,0,130,0,0,0,0,0,0,120,150,0},
//                        {0,0,0,0,0,145,160,0,0,0,0,0,165,255,285,0,0,0,0,0},
//                        {165,0,55,0,0,0,0,0,155,0,0,180,105,0,0,0,0,0,0,0},
//                        {95,0,0,0,0,125,0,0,0,0,0,250,0,70,0,0,0,0,110,0},
//                        {160,80,70,0,155,90,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                        {110,0,155,0,0,0,0,0,0,0,55,0,125,130,0,0,0,0,0,0},
//                        {180,125,85,95,0,75,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                        {0,0,0,0,0,0,110,150,0,0,0,120,115,95,0,0,0,0,0,0},
//                        {165,160,195,0,0,0,0,0,0,0,0,0,195,165,0,0,0,0,0,0},
//                        {130,0,0,0,0,105,0,0,0,0,0,200,0,0,0,0,0,0,155,140},
//                        {0,0,0,0,0,0,80,130,0,0,0,150,95,0,0,0,0,105,0,0},
//                        {95,150,285,175,0,0,0,0,0,0,245,0,0,0,0,0,0,0,0,0},
//                        {0,0,125,0,60,0,0,0,90,0,0,0,105,0,0,0,0,0,0,80},
//                        {135,180,170,0,70,160,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                        {90,0,140,115,80,145,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                        {0,0,0,0,150,200,0,140,0,0,75,0,0,80,0,0,0,0,0,0},
//                        {105,0,135,0,80,0,0,0,0,240,145,0,0,0,0,0,0,0,0,0} };
//    
    public static int[][] distance = {{0,1138,1709,1267,1312,1760,0,1504,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,834,0,0,0,444,0,0,0,0,0,0,911,1667,1361,0,0,0,0},
                        {1709,0,0,0,0,267,0,0,1579,0,0,2039,722,0,0,0,0,0,0,0},
                        {1267,0,0,0,0,0,887,0,0,0,1089,0,0,0,0,0,0,1022,1503,0},
                        {0,0,0,0,0,1385,1619,0,0,0,0,0,1577,1356,1834,0,0,0,0,0},
                        {1760,0,267,0,0,0,0,0,1492,0,0,1883,9060,0,0,0,0,0,0,0},
                        {756,0,0,0,0,1374,0,0,0,0,0,1943,0,525,0,0,0,0,939,0},
                        {1504,424,482,0,1734,733,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {856,0,1579,0,0,0,0,0,0,0,438,0,1388,935,0,0,0,0,0,0},
                        {2048,1063,367,455,0,512,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,927,1461,0,0,0,1067,1156,503,0,0,0,0,0,0},
                         {1455,2070,2039,0,0,0,0,0,0,0,0,0,1997,1571,0,0,0,0,0,0},
                         {1156,0,0,0,0,912,0,0,0,0,0,517,0,0,0,0,0,0,1375,1296},
                         {0,0,0,0,0,0,1356,1288,0,0,0,1571,936,0,0,0,0,719,0,0},
                        {642,1667,2330,1898,0,0,0,0,0,0,994,0,0,0,0,0,0,0,0,0},
                        {0,0,1165,0,381,0,0,0,599,0,0,0,1261,0,0,0,0,0,0,345},
                        {1125,1792,1863,0,447,1743,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {666,0,1465,1022,7875,1414,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,1460,1996,0,1726,0,0,590,0,0,438,0,0,0,0,0,0},
                        {1007,0,1381,0,328,0,0,0,0,1743,588,0,0,0,0,0,0,0,0,0} };
    
    public static int[][] time = {{0,130,170,150,150,185,0,160,0,0,0,0,0,0,0,0,0,0,0,0}, //0
    		{0,0,105,0,0,0,70,0,0,0,0,0,0,110,170,135,0,0,0,0}, //0
    		{155,0,0,0,0,90,0,0,160,0,0,175,90,0,0,0,0,0,0,0}, //0
    		{135,0,0,0,0,0,95,0,0,0,130,0,0,0,0,0,0,120,150,0}, //0
    		{0,0,0,0,0,145,107,0,0,0,0,0,165,255,285,0,0,0,0,0}, //0
    		{175,0,55,0,0,0,0,0,155,0,0,180,105,0,0,0,0,0,0,0}, //0
    		{95,0,0,0,0,125,0,0,0,0,0,250,0,70,0,0,0,0,110,0}, //0
    		{160,80,70,0,155,90,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //0
    		{110,0,155,0,0,0,0,0,0,0,55,0,125,130,0,0,0,0,0,0}, //0
    		{180,125,85,95,0,75,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //0
    		{0,0,0,0,0,0,110,150,0,0,0,120,115,95,0,0,0,0,0,0},//0
    		{165,160,95,0,0,0,0,0,0,0,0,0,195,165,0,0,0,0,0,0}, //0
    		{130,0,0,0,0,105,0,0,0,0,0,200,0,0,0,0,0,0,155,140},//0
    		{0,0,0,0,0,0,80,130,0,0,0,150,95,0,0,0,0,105,0,0},//0
    		{95,150,285,175,0,0,0,0,0,0,245,0,0,0,0,0,0,0,0,0}, //0
    		{0,0,125,0,60,0,0,0,90,0,0,0,105,0,0,0,0,0,0,80}, //0
    		{135,180,170,0,70,160,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//0
    		{90,0,140,115,80,145,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//0
    		{0,0,0,0,150,200,0,140,0,0,75,0,0,80,0,0,0,0,0,0},//0
    		{105,0,135,0,80,0,0,0,0,240,145,0,0,0,0,0,0,0,0,0},//0
    		
             };
    
	
	
	public static String[] random = {"DEL","CCU","MAA","BOM"};
	
	public static String[] shortestDistance()
	{
		String[] answer = {"0000","0000","0000"};
		return answer;
	}
	
	public static String[] shortestCost()
	{
		String[] answer = {"0000","0000","0000"}; 
		return answer;
	}
	
	public static String[] shortestTime()
	{
		String[] answer = {"0000","0000","0000"}; 
		return answer;
	}

}
