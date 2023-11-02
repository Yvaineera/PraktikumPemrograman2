package PRAK301_2210817220022_RayfhaZafiraAzzahra;
import java.util.Random;

public class Dadu {
        private int nilai;

        public Dadu() {
            Random rand = new Random();
            nilai = rand.nextInt(6) + 1;
        }

        public int getNilai() {
            return nilai;
        }
}
