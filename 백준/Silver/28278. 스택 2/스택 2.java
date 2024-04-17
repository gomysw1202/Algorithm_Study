import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());

                switch (st.nextToken()) {
                    case "1":
                        while(st.hasMoreTokens()){
                            stack.push(Integer.parseInt(st.nextToken()));
                        }
                        break;
                    case "2":
                        sb.append((stack.isEmpty() ? -1 : stack.pop())+"\n");
                        break;
                    case "3":
                        sb.append(stack.size()+"\n");
                        break;
                    case "4":
                        sb.append((stack.isEmpty()? 1 : 0) +"\n");
                        break;
                    case "5":
                        sb.append((stack.isEmpty() ? -1 : stack.peek()) +"\n");
                        break;
              }


        }
        System.out.println(sb);
    }


}