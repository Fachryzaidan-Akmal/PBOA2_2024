public class Titik{
	
        private double absis;
        private double ordinat;
        static int counterTitik;
		    //static int jarakPusat;

        public Titik(){
                this(0,0);
        }

        public Titik(double x, double y){
                this.absis = x;
                this.ordinat = y;
                counterTitik++;
        }

        public void setAbsis(double x){
                this.absis = x;
        }

        public void setOrdinat(double y){
                this.ordinat = y;
        }

        public double getAbsis(){
                return this.absis;
        }

        public double getOrdinat(){
                return this.ordinat;
        }

        static double getCounterTitik(){
                return counterTitik;
        }
			
}
