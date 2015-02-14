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

		//Testing for question 4 and 5
		Lab02B[] bs = new Lab02B[4];
		bs[0] = l;
		bs[1] = new Lab02B(new int[]{0,0,0,4});
		bs[2] = null;
		bs[3] = new Lab02B(new int[]{1,2,3,42});
		System.out.println(Assig2A.largestArea(bs));
		System.out.println(Assig2A.topLeftMost(bs));
	}
}