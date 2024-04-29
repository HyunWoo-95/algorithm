package simulation.아기상어;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_16236 {

  static int N;
  static int map[][];
  static boolean visited[][];
  static int dx[] = {-1, 0, 1, 0}; // 상하좌우 4방향
  static int dy[] = {0, 1, 0, -1};
  static int count_eat = 0;
  static int shark_size = 2;
  static int total_dist = 0;
  static int shark_x = 0, shark_y = 0;

  class Node implements Comparable<Node> {

    int x, y, size, dist;

    Node(int x, int y, int size, int dist) {
      this.x = x;
      this.y = y;
      this.size = size;
      this.dist = dist;
    }

    // 1. 이동거리가 가장 적은 순으로
    // 2. 이동거리가 같으면 가장 위의 물고기 순으로
    // 3. 그 다음은 왼쪽의 물고기 순으로 오름차순 정렬
    @Override
    public int compareTo(Node o) {
      if (this.dist != o.dist) {
        return this.dist - o.dist;
      } else if (this.x != o.x) {
        return this.x - o.x;
      } else {
        return this.y - o.y;
      }
    }
  }

  Node BFS(Node start) {
    Queue<Node> Q = new LinkedList<>();
    ArrayList<Node> list = new ArrayList<>();
    Q.add(start);
    visited[start.x][start.y] = true; // 시작점 방문처리

    while (!Q.isEmpty()) {
      Node now = Q.poll();
      for (int i = 0; i < 4; i++) {
        int nx = now.x + dx[i];
        int ny = now.y + dy[i];
        // 가지치기
        if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
          continue; // 맴 범위를 벗어나면 패스
        }
        if (visited[nx][ny]) {
          continue; // 방문한 곳이면 패스
        }
        if (now.size < map[nx][ny]) {
          continue; // 큰 물고기면 패스
        }
        // 큐에 넣기
        visited[nx][ny] = true; // 방문처리
        Q.add(new Node(nx, ny, now.size, now.dist + 1));
        // 먹을 수 있는 물고기 발견하면 일단 list에 넣기
        if (map[nx][ny] != 0 && now.size > map[nx][ny]) { // 0이 아니고, 상어보다 작으면
          list.add(new Node(nx, ny, now.size, now.dist + 1));
        }
      }
    }
    // 먹을 물고기 위치 정하기
    Collections.sort(list);
    if (!list.isEmpty()) {
      return list.get(0);
    } else {
      return null;
    }
  }

  boolean foundSmallFish(int size) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == 0 || map[i][j] == 9) {
          continue;
        }
        if (map[i][j] < size) {
          return true;
        }
      }
    }
    return false;
  }

  void Solve() {
    // 아기상어 첫 위치 찾기
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == 9) {
          shark_x = i;
          shark_y = j;
          map[i][j] = 0;
        }
      }
    }

    // 작은 물고기가 남아있으면 계속 탐색
    while (foundSmallFish(shark_size)) {
      visited = new boolean[N][N]; // 방문배열 초기화
      Node move = BFS(new Node(shark_x, shark_y, shark_size, total_dist));
      // 물고기를 못 찾았으면
      if (move == null) {
        System.out.println(total_dist);
        return;
      }
      // 물고기를 찾았으면
      // 상어위치를 물고기 위치로 저장
      shark_x = move.x;
      shark_y = move.y;
      // 물고기 위치는 0으로 갱신
      map[move.x][move.y] = 0;
      count_eat++; // 물고기 먹은 수 증가
      if (count_eat == move.size) { // 먹은 수와 상어사이즈가 같으면
        shark_size = move.size + 1; // 상어사이즈 증가
        count_eat = 0; // 먹은횟수 초기화
      } else {
        shark_size = move.size;
      }
      total_dist = move.dist; // 이동거리 업데이트
    }
    System.out.println(total_dist);
  }

  void inputData() throws Exception {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(reader);
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    map = new int[N][N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }
  }

  public static void main(String[] args) throws Exception {
    Main_16236 m = new Main_16236();
    m.inputData();
    m.Solve();
  }
}