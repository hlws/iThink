package game03;



class Hunter {
    String name;
    boolean isLive;
    int maxLife;
    int curLife;
    String weapon;
    int exp;
    int level;
    //增加攻击力和防御力，损失生命是攻击力-防御力+7
    int attack;
    int defend;
    //增加敏捷和躲避几率
    int agile;
    int hideRate;
    //写一个带有两个参数的构造函数String name , String weapon
    public Hunter(String name,String weapon){
        this.name=name;
        this.weapon=weapon;
        maxLife=200;
        curLife=maxLife;
        isLive=true;
        attack=50;
        defend=8;
        exp=0;
        level=1;
        agile=35;
        hideRate=60;
    }
    public void fight(Monster monster){
        if (!isLive){
            return;
        }
        if (!monster.isLive){
            return;
        }
        System.out.println(name+"挥舞着"+weapon+"杀向"+monster.type);
        //this表示自己，monster受伤需要知道是哪个对象将其打伤，传递this表示是自己这个对象将其打伤
        monster.injured(this);
        if (!monster.isLive){
            this.expAdd(monster);
        }

    }
    public void fight(Vampire vampire){
        if (!isLive){
            return;
        }
        if (!vampire.isLive){
            return;
        }
        System.out.println(name+"挥舞着"+weapon+"杀向"+vampire.type);
        //this表示自己，monster受伤需要知道是哪个对象将其打伤，传递this表示是自己这个对象将其打伤
        vampire.injured(this);
        if (!vampire.isLive){
            this.expAdd(vampire);
        }

    }
    //躲避的方法
    //躲避的方法
    public boolean hidden(){
        //增加躲避判断
        return game02.GameUtil.isHide(this.hideRate,this.agile);

    }
    public void injured(Monster monster){
        if (hidden()){
            System.out.println(name+":打不到我");
            return;
        }
        System.out.println(name+"小样，敢打我");
        int lostLife= game02.GameUtil.calLostLife(monster.attack,this.defend);
        curLife-=lostLife;
        if (curLife<=0){
            dead();
            return;
        }
        show();
    }
    public int injured(Vampire vampire){
        if (hidden()){
            System.out.println(name+":打不到我");
            return 0;
        }
        System.out.println(name+"小样，敢打我");
        int lostLife= GameUtil.calLostLife(vampire.attack,this.defend);
        vampire.getLife(lostLife);
        curLife-=lostLife;
        if (curLife<=0){
            dead();
        }
        show();
        return lostLife;
    }
    public void dead(){
        System.out.println(name+":天妒英才");
        isLive=false;
    }
    public void show(){
        System.out.println("["+name+",生命:"+curLife+";最大生命"+maxLife+",isLife:"+isLive+
                ",weaper:"+weapon+"]"+";攻击力"+attack+";防御力"+defend+";经验"+exp+";等级"+level);

    }
    //经验值增加的方法
    public void expAdd(Monster monster){
        this.exp+=monster.maxLife;
        int needexp=0;
        for (int i=1;i<=level;i++){
            needexp+=i*50;
        }
        if (exp>=needexp){
            upgrade();
        }
    }
    public void expAdd(Vampire vampire){
        this.exp+=vampire.maxLife;
        int needexp=0;
        for (int i=1;i<=level;i++){
            needexp+=i*50;
        }
        if (exp>=needexp){
            upgrade();
        }
    }
    public void upgrade(){
        System.out.println(name+"当当"+"升级了");
        level+=1;
        attack+=4;
        defend+=3;
        maxLife+=20;
        curLife=maxLife;
        show();
    }
}
