package january2024.study0125;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.solution("10000002", "23"));
	}

}
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int min = Integer.parseInt(p);
        int l = p.length();
        for(int i= 0; i <= t.length()-l;i++){
            int v = Integer.parseInt(t.substring(i,i+l));
            if(v <=min)answer++;
            
        
    }
        return answer;
    }
}