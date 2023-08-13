# 1000번 문제
Scanner 사용 방법을 알지 못함.
1. 먼저 Scanner 객체명 = new Scanner(System.in) 선언해야하며 System.in 필수로 넣어줘야함
2. System.in 은 사용자로부터 입력을 받기 위한 입력 스트림이다.
그렇기 때문에 Scanner 뿐만 아니라 다른 입력 방식들도 사용자로부터 입력을 받기 위해서는 System.in 이 들어간다.


# 1008번 문제
형변환과 데이터 타입의 크기를 잘 인지하지 못함
1. result를 float 타입으로 지정시에는 실패 double는 성공
2. float 9자리를 정확히 표현할 수 없으며 6자리 정도가 한계이다.


# 10951번 문제
EOF(End Of File)을 알지 못함
1. EOF란 End Of File로 데이터 소스로부터 더 이상 읽을 수 잇는 데이터가 없을을 나타내는 용어이다.
2. 알고리즘 문제에서 주로 입력값을 얼마나 받을지 명시하지 않을 경우 사용한다.

# 11718번 문제
SCANNER의 next와 nextLine의 차이, hasNext(), hasNextLine()의 차이를 알지 못함
1. next()는 공백을 기준으로 문자열을 구분한다.(개행 문자를 무시)
2. nextLine()은 개행문자를 기준으로 문자열을 구분한다.(개항문자를 포함)
3. hasNext()는 입력값이 있으면 true, 없으면 false를 반환한다.
4. hasNextLine()은 입력값이 있으면 true, 없으면 false를 반환한다.

# 2438번 문제
첫 BufferedReader 사용 read(), readLine()의 차이를 알지 못함
1. read()는 입력된 문자 읽어 그에 해당하는 ASCII 10진수 정수를 반환한다. 즉 입력값이 0-9라면 ASCII 10진수 int값인 48-57을 반환한다.
2. 숫자를 입력받고 싶다면 redaLine()으로 String을 입력받은은후 Integer.parseInt() 메서드를 이용하여 타입변환을 해야한다.
