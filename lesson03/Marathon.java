class Marathon {
	
	public static void faster(String[] names, int[] times){
		int fi = 0;
		for (int i = 0; i < names.length ; i ++) {
			if (times[i] < times[fi]) {fi = i;}
			}
		System.out.println(names[fi] + "---" + times[fi]);
	}

	public static void second(String[] names, int[] times){
		int fi = 0;
		int se = 0;
		for (int i = 0; i < names.length ; i ++) {
			if (times[i] < times[fi]) {
				fi = i;	
			}
		}
		for (int i = 0; i < names.length ; i ++) {
			if (i == fi) {continue;}
			if (times[i] < times[se]) {
				se = i;	
			}
		}
		
		System.out.println(names[se] + "===" + times[se]);
	}
		

    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
		faster(names, times);
		second(names, times);
    }
} 
