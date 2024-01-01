import java.util.*;

class BeautifulPath {
    static int n, m;
    static int[] indegree;
    static List<Integer>[] adj;
    static int[] frequency;
    public static String s;
    static int maxBeauty;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
//        String s ;
        s = sc.next();
        frequency = new int[26];
        indegree = new int[n];
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            frequency[s.charAt(i) - 'a']++;
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            adj[x].add(y);
            indegree[y]++;
        }
        maxBeauty = -1;
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                int beauty = dfs(i);
                if (beauty == -1) {
                    System.out.println(-1);
                    return;
                }
                maxBeauty = Math.max(maxBeauty, beauty);
            }
        }
        System.out.println(maxBeauty);
    }

    static int dfs(int c) {
        int[] f = Arrays.copyOf(frequency, 26);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int x=s.charAt(i) - 'a';
            if (f[x] == 1) {
                q.add(i);
            }
        }
        int beauty = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            beauty = Math.max(beauty, size);
            if (beauty > n) {
                return -1;
            }
            while (size-- > 0) {
                int u = q.poll();
                f[s.charAt(u) - 'a']--;
                for (int v : adj[u]) {
                    indegree[v]--;
                    if (indegree[v] == 0) {
                        q.add(v);
                    }
                }
            }
        }
        return beauty;
    }
}