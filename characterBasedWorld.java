import java.util.Scanner;

public class characterBasedWorld{
    public static void main(String[] args){
        String worldTemplate = "__________\n__________\n__________\n__________\n__________\n__________";
        char[] worldOutput = worldTemplate.toCharArray();
        boolean playing = true;
        Scanner userInput = new Scanner(System.in);
        String nextAction;
        int playerX = 0;
        int playerY = 5;
        while(playing){
			//STARTUP
			worldOutput[(playerX+(playerY*11))] = 'd';
            System.out.println(worldOutput);
			//END STARTUP
			
            nextAction = userInput.nextLine();
	
            //PRIMARY MOVEMENT START
            //Up
            if(nextAction.equals("w")){
                if(playerY>0){
                    worldOutput[(playerX+(playerY*11))] = '_';
                    playerY--;
                }
            }
            //Down
            else if(nextAction.equals("s")){
                if(playerY<6){
                    worldOutput[(playerX+(playerY*11))] = '_';
                    playerY++;
                }
            }
            //Left
            else if(nextAction.equals("a")){
                if(playerX>0){
                    worldOutput[(playerX+(playerY*11))] = '_';
                    playerX--;
                }
            }
            //Right
            else if(nextAction.equals("d")){
                if(playerX<10){
                    worldOutput[(playerX+(playerY*11))] = '_';
                    playerX++;
                }
            }
            //PRIMARY MOVEMENT END

			//PROGRAM END START
			if(nextAction.equals("end")){
				playing = false;
			}
			//PROGRAM END END
        }
    }
}