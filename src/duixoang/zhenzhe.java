package duixoang;



class zhenzhe {

	public static void main(String[] args) {

	
	String st = "abc123fdafas64g64ag68";
	String re = "[0-9]";
	String[] array = st.split(re);
System.out.println(array.length);
st = st.replaceAll("\\d+", "java");
System.out.println(st);
//	for(String temp : array)
//	{
//		System.out.println(temp);
//	}
	
}
}
