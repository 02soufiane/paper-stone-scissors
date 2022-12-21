import java.util.Random;
import java.util.Scanner;

public class st {
    public static void main(String[] args)
    {
        int player,pc,N=0,playerscore=0,pcscore=0,pcw=0,plw=0;
        String[] choice = {"paper" , "stone" , "scissors"};
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.println("0 is paper");
        System.out.println("1 is stone");
        System.out.println("0 is scissors");
        while(N!=3)
        {
            System.out.println("play:");
            player=s.nextInt();
            if(player<3)
            {
                pc= random.nextInt(3);
                System.out.println("player:"+choice[player]+ " pc:"+choice[pc]);
                if(pc==1 && player==0)
                    playerscore++;
                if(pc==0 && player==1)
                    pcscore++;
                if(pc==2 && player==1)
                    player++;
                if(pc==1 && player==2)
                    pcscore++;
                if(pc==0 && player==2)
                    playerscore++;
                if(pc==2 && player==0)
                    pcscore++;
                if(pc==player)
                    System.out.println("the same");

                if(pcscore > playerscore)
                {
                    System.out.println("pc win");
                    pcw++;
                }else {
                    System.out.println("player win");
                    plw++;
                }
                N+=1;
            }else{
                System.out.println("please choose an integer between 0 and 3 !");
            }
        }

        if(pcw > plw)
            System.out.print("-pc win in this match-");
        else
            System.out.print("-player win in this match-");
    }
}
