class Palindrome {
	private String text;
	
	public Palindrome(String text){
		this.text=text;
	}
	public boolean checkPalindrome (){
		int left =0;
		int right = text.length()-1;
		while(left<right){
			if(text.charAt(left)!=text.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	
	
	public static void main(String[] args){
		Palindrome text1 = new Palindrome("abccba");
		boolean result= text1.checkPalindrome();
		System.out.println("The text is palindrome ?"+result);
	}
}
/*
input = abccba
output = the text is palindrome? true */