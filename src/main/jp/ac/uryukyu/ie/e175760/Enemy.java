

package jp.ac.uryukyu.ie.e175760;

    public class Enemy extends LivingThing {
        public Enemy(String name, int maximumHP, int attack) {

            super(name, maximumHP, attack);
            this.name = name;
            this.attack = attack;

        }



    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}
