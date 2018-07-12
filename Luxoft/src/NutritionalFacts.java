public class NutritionalFacts {
	
	public static void main(String[] args) {
		new NutritionalFacts().new Builder(1);
	}
	
	public NutritionalFacts(){
		
	}
	
    private int sodium;
    private int fat;
    private int carbo;

    public class Builder {
        private int sodium;
        private int fat;
        private int carbo;

        public Builder(int s) {
            this.sodium = s;
        }

        public Builder fat(int f) {
            this.fat = f;
            return this;
        }

        public Builder carbo(int c) {
            this.carbo = c;
            return this;
        }

        public NutritionalFacts build() {
            return new NutritionalFacts(this);
        }
    }

    private NutritionalFacts(Builder b) {
        this.sodium = b.sodium;
        this.fat = b.fat;
        this.carbo = b.carbo;
    }
}