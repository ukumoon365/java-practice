public class MidtermPractice001 {
    public static void main(String[] args) {

        // 1. 기본 자료형과 형변환
        int x = 10;
        long y = x;
        double z = 3.14;
        char ch = 65;
        boolean result = true;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(ch);
        System.out.println(result);

        // 2. 연산자
        int a = 5;
        int b = ++a;
        System.out.println(a); // 6
        System.out.println(b); // 6

        int c = 5;
        int d = c++;
        System.out.println(c); // 6
        System.out.println(d); // 5

        System.out.println(10 / 3);    // 3
        System.out.println(10 % 3);    // 1
        System.out.println(10 / 3.0);  // 3.333...

        // 3. 조건문
        // 제일 처음 만족되는 조건만 실행
        int score = 85;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B"); // B 출력 (조건 만족)
        } else {
            System.out.println("C");
        }

        // 4. switch
        // 만족되는 모든 조건 실행 / break문 실행시 종료
        int menu = 2;

        switch (menu) {
            case 1:
                System.out.println("조회");
                break;
            case 2:
                System.out.println("수정"); // 수정 (조건 만족 및 break문 실행)
                break;
            default: // 모든 조건 충족되지 않을 경우 실행
                System.out.println("잘못된 선택");
        }

        // 5. 반복문
        for (int i = 1; i <= 3; i++) {
            System.out.println(i); // 1 / 2 / 3
        }

        // 6. 배열
        int[] numbers = {10, 20, 30};

        numbers[0] = 100;

        System.out.println(numbers[0]); // 100
        System.out.println(numbers.length); // 3 (길이)

        int[] values = new int[3];
        values[0] = 7;
        values[1] = 8;
        values[2] = 9;

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]); // i = 2 -> 9
        }

        // 7. 다차원 배열
        int[][] matrix = new int[2][2];

        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[1][0] = 30;
        matrix[1][1] = 40;

        System.out.println(matrix[1][0]); // 30

        // 8. String과 문자열 비교
        String str1 = "ABC";
        String str2 = "ABC"; //java에선 같은 내용물은 객체를 공유
        String str3 = new String("ABC"); // 새로운 문자열 생성

        System.out.println(str1 == str2); // 주소값 비교 -> true
        System.out.println(str1 == str3); // 주소값 비교 -> false
        System.out.println(str1.equals(str3)); // 내용 비교 -> true

        str1 = str1 + "D"; // 문자열은 불변 -> 새로운 문자열 생성 -> str1에 새로운 문자열 주소값 저장
        System.out.println(str1); // ABCD

        // 9. 객체 생성과 참조 변수
        Person p1 = new Person("민수", 20); // 객체화
        Person p2 = p1; // 같은 주소값을 공유 p1, p2 값을 수정시 서로 영향을 줌

        p2.setAge(25); // p1의 값도 수정됨

        System.out.println(p1.getName()); // 민수
        System.out.println(p1.getAge()); // 25

        // 10. 생성자 오버로딩과 this()
        Person p3 = new Person();
        // 1. Person() 호출 -> this("김길동", 20)이 Person(String, int) 호출 -> this.name = name, this.age = age
        Person p4 = new Person(30, "영희");
        // 1. Person(int age, String name) 호출 ->  this(name, age)으로 Person(String, int) 호출 -> this.name = name, this.age = age

        p3.introduce(); // 김길동, 20
        p4.introduce(); // 영희, 30

        // 11. static
        System.out.println(Person.getCount()); // p1, p3, p4 총 3번 호출됨 -> count = 3

        // 12. 상속, super(), 오버라이딩
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("바둑이", 5);

        dog1.introduce(); // 동물 이름: 초코 / 나이: 3
        dog2.introduce(); // 동물 이름: 바둑이 / 나이: 5

        // 13. 부모 타입 참조 변수
        Animal animal = new Dog("초코", 3);
        animal.introduce(); // 동물 이름: 초코 / 나이: 3

        // 14. 부모의 멤버 접근
        dog2.showParentName(); // 바둑이
        // dog1과는 별개의 주소값을 가지니까 dog1의 값은 영향을 주지 않음

        // 15. static 메서드 호출
        Animal.showCount(); // dog1, dog2, animal 총 3번 호출됨 -> count = 3
    }
}

class Person {
    private String name;
    private int age;

    static int count = 0;

    Person() {
        this("김길동", 20);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    Person(int age, String name) {
        this(name, age);
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void introduce() {
        System.out.println(name + ", " + age);
    }

    static int getCount() {
        return count;
    }
}

class Animal {
    String name;

    static int count = 0;

    Animal() {
        this("이름 없음");
    }

    Animal(String name) {
        this.name = name;
        count++;
    }

    void introduce() {
        System.out.println("동물 이름: " + name);
    }

    static void showCount() {
        System.out.println("생성된 동물 수: " + count);
    }
}

class Dog extends Animal {
    private int age;

    Dog() {
        this("초코", 3);
    }

    Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("나이: " + age);
    }

    void showParentName() {
        System.out.println(super.name);
    }
}
