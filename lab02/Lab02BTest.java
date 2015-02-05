package lab02;

public class Lab02BTest{
	public static void main(String[] args) {
		int[] nums = new int[args.length];
		for(int i=0;i < args.length;i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		Lab02B l = new Lab02B(nums);
		System.out.println(l);
		System.out.println(l.area());
	}
}