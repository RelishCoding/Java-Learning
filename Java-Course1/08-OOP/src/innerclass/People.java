package innerclass;

public class People {
    private int heartBeat = 100;

    public class Heart {
        private int heartBeat = 80;

        public void show() {
            int heartBeat = 120;
            System.out.println(heartBeat); // 120
            System.out.println(this.heartBeat); // 80
            System.out.println(People.this.heartBeat); // 100
        }
    }
}
