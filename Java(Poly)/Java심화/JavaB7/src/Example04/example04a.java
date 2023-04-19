package Example04;

public class example04a {

	public static void main(String[] args) throws Exception {
		numberouthan nh = new numberouthan();
		//경기도 성남시_인구및세대_현황_20230228 데이터 자료 csv파일을 메모장으로켜서 배열로 저장
		String[] k05_OneRec = {"구별,동,인구수_계,인구수_남,인구수_여,19세 이상_계,19세 이상_남,19세 이상_여,65세 이상_계,65세 이상_남자,65세 이상_여자,세대수,재외국민,데이터기준일자",
				"수정구,신흥1동         ,13116,6907,6209,12166,6424,5742,2732,1151,1581,7931,14,2023-02-28",
				"수정구,신흥2동         ,19858,9643,10215,16836,8131,8705,3083,1422,1661,7622,27,2023-02-28",
				"수정구,신흥3동         ,11190,5974,5216,10342,5540,4802,2265,1020,1245,6536,9,2023-02-28",
				"수정구,태평1동         ,14973,7783,7190,13977,7254,6723,3302,1465,1837,8774,23,2023-02-28",
				"수정구,태평2동         ,14906,7507,7399,13475,6767,6708,3006,1270,1736,7912,21,2023-02-28",
				"수정구,태평3동         ,12922,6667,6255,11725,6068,5657,2682,1179,1503,6854,19,2023-02-28",
				"수정구,태평4동         ,12704,6470,6234,11304,5747,5557,2417,1052,1365,6562,12,2023-02-28",
				"수정구,수진1동         ,11950,6277,5673,11192,5888,5304,2876,1254,1622,7179,12,2023-02-28",
				"수정구,수진2동         ,15518,7878,7640,14063,7131,6932,3475,1604,1871,7802,33,2023-02-28",
				"수정구,단대동          ,15076,7388,7688,13126,6394,6732,2877,1228,1649,6622,21,2023-02-28",
				"수정구,산성동          ,4919,2486,2433,4282,2146,2136,1024,445,579,2252,16,2023-02-28",
				"수정구,양지동          ,9623,4775,4848,8470,4192,4278,1929,833,1096,4343,5,2023-02-28",
				"수정구,복정동          ,10712,6015,4697,9770,5521,4249,1198,580,618,6749,29,2023-02-28",
				"수정구,위례동          ,42887,20910,21977,34800,16867,17933,5543,2617,2926,17228,116,2023-02-28",
				"수정구,신촌동          ,4614,2468,2146,3732,2015,1717,527,247,280,2020,13,2023-02-28",
				"수정구,고등동          ,10794,5340,5454,8966,4398,4568,1459,651,808,4766,21,2023-02-28",
				"수정구,시흥동          ,3401,1793,1608,3128,1648,1480,617,289,328,1970,13,2023-02-28",
				"중원구,성남동          ,33148,17298,15850,30305,15880,14425,6125,2799,3326,18470,41,2023-02-28",
				"중원구,중앙동          ,16769,8610,8159,14364,7382,6982,2824,1294,1530,7683,12,2023-02-28",
				"분당구,정자동          ,19033,9544,9489,16199,8106,8093,2627,1222,1405,8209,73,2023-02-28",
				"분당구,정자1동         ,30136,14218,15918,25421,11871,13550,3963,1850,2113,13926,320,2023-02-28",
				"분당구,정자2동         ,14855,7032,7823,13022,6028,6994,2627,1002,1625,7423,60,2023-02-28",
				"분당구,정자3동         ,16969,8220,8749,13773,6592,7181,2235,957,1278,6685,64,2023-02-28",
				"분당구,서현1동         ,31249,15139,16110,25343,12119,13224,3965,1758,2207,12627,162,2023-02-28",
				"분당구,서현2동         ,17866,8818,9048,14738,7196,7542,2336,1076,1260,6642,63,2023-02-28",
				"분당구,이매1동         ,24962,12227,12735,20271,9804,10467,3470,1614,1856,8987,80,2023-02-28",
		"분당구,이매2동         ,13228,6444,6784,10800,5179,5621,2179,1053,1126,4450,54,2023-02-28"};


		String[] k05_fieldname = k05_OneRec[0].split(","); // 첫번째 줄을 항목으로 ,단위로 끊어서 저장
		for(int k05_i = 1; k05_i < k05_OneRec.length - 1; k05_i++) {
			String[] k05_field = k05_OneRec[k05_i].split(","); // 두번째줄 이하인 내용을 , 단위로 저장
			int []k05_fieldint = new int[k05_field.length]; //int로 바꿔줄 배열저장
			for(int k05_k = 0; k05_k < k05_field.length; k05_k++) {
				try {
					k05_fieldint[k05_k] = Integer.parseInt(k05_field[k05_k]);
					k05_field[k05_k] = nh.han(k05_fieldint[k05_k]);
					// 정수형으로 바꿀수있는 항목만 숫자로 바꿔서 han함수를이용해 한글로 다시 저장
				} catch(Exception e) {
				
				}
			}
			System.out.printf("***********************************************************************\n");
			for(int k05_j = 0; k05_j < k05_fieldname.length; k05_j++) {
				System.out.printf("%s : %s\n", k05_fieldname[k05_j], k05_field[k05_j]); // 필드이름과 필드 내용을 출력
			}
			System.out.printf("***********************************************************************\n");
		}






	}

}
