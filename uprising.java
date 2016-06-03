import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class uprising {
    public static void main(String[] arrstring) {
	new uprising();
    }

    public boolean menuValid(char c) {
	if (c == 'y') {
	    return true;
	}
	if (c == 'Y') {
	    return true;
	}
	return false;
    }

    public boolean playagainValid(char c) {
	if (c == 'y') {
	    return true;
	}
	if (c == 'Y') {
	    return true;
	}
	if (c == 'n') {
	    return true;
	}
	if (c == 'N') {
	    return true;
	}
	return false;
    }

    public void beginningASCII() {
	this.printSlow4("\n\n\n\n\n");
	this.printSlow4("               sdSS_SSSSSSbs   .S    S.     sSSs         .S       S.    .S_sSSs     .S_sSSs     .S    sSSs   .S   .S_sSSs      sSSSSs  ");
	this.printSlow4("               YSSS~S%SSSSSP  .SS    SS.   d%%SP        .SS       SS.  .SS~YS%%b   .SS~YS%%b   .SS   d%%SP  .SS  .SS~YS%%b    d%%%%SP  ");
	this.printSlow4("                    S%S       S%S    S%S  d%S'          S%S       S%S  S%S   `S%b  S%S   `S%b  S%S  d%S'    S%S  S%S   `S%b  d%S'      ");
	this.printSlow4("                    S%S       S%S    S%S  S%S           S%S       S%S  S%S    S%S  S%S    S%S  S%S  S%|     S%S  S%S    S%S  S%S       ");
	this.printSlow4("                    S&S       S%S SSSS%S  S&S           S&S       S&S  S%S    d*S  S%S    d*S  S&S  S&S     S&S  S%S    S&S  S&S       ");
	this.printSlow4("                    S&S       S&S  SSS&S  S&S_Ss        S&S       S&S  S&S   .S*S  S&S   .S*S  S&S  Y&Ss    S&S  S&S    S&S  S&S       ");
	this.printSlow4("                    S&S       S&S    S&S  S&S~SP        S&S       S&S  S&S_sdSSS   S&S_sdSSS   S&S  `S&&S   S&S  S&S    S&S  S&S       ");
	this.printSlow4("                    S&S       S&S    S&S  S&S           S&S       S&S  S&S~YSSY    S&S~YSY%b   S&S    `S*S  S&S  S&S    S&S  S&S sSSs  ");
	this.printSlow4("                    S*S       S*S    S*S  S*b           S*b       d*S  S*S         S*S   `S%b  S*S     l*S  S*S  S*S    S*S  S*b `S%%  ");
	this.printSlow4("                    S*S       S*S    S*S  S*S.          S*S.     .S*S  S*S         S*S    S%S  S*S    .S*P  S*S  S*S    S*S  S*S   S%  ");
	this.printSlow4("                    S*S       S*S    S*S   SSSbs         SSSbs_sdSSS   S*S         S*S    S&S  S*S  sSS*S   S*S  S*S    S*S   SS_sSSS  ");
	this.printSlow4("                    S*S       SSS    S*S    YSSP          YSSP~YSSY    S*S         S*S    SSS  S*S  YSS'    S*S  S*S    SSS    Y~YSSY  ");
	this.printSlow4("                    SP               SP                                SP          SP          SP           SP   SP                    ");
	this.printSlow4("                    Y                Y                                 Y           Y           Y            Y    Y");
	this.printSlow4("");
	this.printSlow4("                                                         ,.----,  ,  /^\\|__,/^\\   .  ,--'''-,");
	this.printSlow4("                                                    ,'``       '' \\/__/    \\__\\/` ''        `,");
	this.printSlow4("                                                   ,'   ,--''''-. `. `\\       /  .   ,.-'``'-. `,");
	this.printSlow4("                                                  /   ,','^````^\\`,` <`>     <\\    ,`,-'`^^`',`, .");
	this.printSlow4("                                                  |  | /         ||  |`       `/  / /         ||  |");
	this.printSlow4("                                                  |  ||          \\\\__/        (__/_/          ||  |");
	this.printSlow4("                                                  \\  \\\\           | \\         |  |            //  /");
	this.printSlow4("                                                   \\  \\)          / \\         `| \\           //  /");
	this.printSlow4("                                                    `<`._     _,.'_/`          `| `._      _.> /");
	this.printSlow4("                                                      `-.``-``_,.'              `\\._ ```-`` _,'`");
	this.printSlow4("                                                         ``--`                      ``-----`");
	this.printSlow4("");
    }

    public void printSlow(String string) {
	int n = 0;
	while (n < string.length()) {
	    System.out.print("" + string.charAt(n));
	    try {
		Thread.sleep(30);
	    }
	    catch (InterruptedException var3_3) {
		// empty catch block
	    }
	    ++n;
	}
	System.out.println();
    }

    public void printSlow2(String string) {
	int n = 0;
	while (n < string.length()) {
	    System.out.print("" + string.charAt(n));
	    try {
		Thread.sleep(300);
	    }
	    catch (InterruptedException var3_3) {
		// empty catch block
	    }
	    ++n;
	}
	System.out.println();
    }

    public void printSlow3(String string) {
	int n = 0;
	while (n < string.length()) {
	    System.out.print("" + string.charAt(n));
	    try {
		Thread.sleep(5);
	    }
	    catch (InterruptedException var3_3) {
		// empty catch block
	    }
	    ++n;
	}
	System.out.println();
    }

    public void printSlow4(String string) {
	int n = 0;
	while (n < string.length()) {
	    System.out.print("" + string.charAt(n));
	    try {
		Thread.sleep(1);
	    }
	    catch (InterruptedException var3_3) {
		// empty catch block
	    }
	    ++n;
	}
	System.out.println();
    }

    public void gameover() {
	System.out.println("\n\n\n");
	System.out.println("                                                                                                                                                            ");
	System.out.println("                 ,ad8888ba,         db         88b           d88  88888888888       ,ad8888ba,   8b           d8  88888888888  88888888ba   ");
	System.out.println("                d8\"'    `\"8b       d88b        888b         d888  88               d8\"'    `\"8b  `8b         d8'  88           88      \"8b  ");
	System.out.println("               d8'                d8'`8b       88`8b       d8'88  88              d8'        `8b  `8b       d8'   88           88      ,8P  ");
	System.out.println("               88                d8'  `8b      88 `8b     d8' 88  88aaaaa         88          88   `8b     d8'    88aaaaa      88aaaaaa8P'  ");
	System.out.println("               88      88888    d8YaaaaY8b     88  `8b   d8'  88  88\"\"\"\"\"         88          88    `8b   d8'     88\"\"\"\"\"      88\"\"\"\"88'    ");
	System.out.println("               Y8,        88   d8\"\"\"\"\"\"\"\"8b    88   `8b d8'   88  88              Y8,        ,8P     `8b d8'      88           88    `8b    ");
	System.out.println("                Y8a.    .a88  d8'        `8b   88    `888'    88  88               Y8a.    .a8P       `888'       88           88     `8b   ");
	System.out.println("                 `\"Y88888P\"  d8'          `8b  88     `8'     88  88888888888       `\"Y8888Y\"'         `8'        88888888888  88      `8b  ");
	System.out.println("                                                                                                                             ");
	System.out.println("                                                                                                                             ");
	System.out.println("                                            n                                                                 :.");
	System.out.println("                                            E%                                                                :\"5");
	System.out.println("                                           z  %                                                              :\" `");
	System.out.println("                                           K   \":                                                           z   R");
	System.out.println("                                           ?     %.                                                       :^    J");
	System.out.println("                                            \".    ^s                                                     f     :~");
	System.out.println("                                             '+.    #L                                                 z\"    .*");
	System.out.println("                                               '+     %L                                             z\"    .~");
	System.out.println("                                                 \":    '%.                                         .#     +");
	System.out.println("                                                   \":    ^%.                                     .#`    +\"");
	System.out.println("                                                     #:    \"n                                  .+`   .z\"");
	System.out.println("                                                       #:    \":                               z`    +\"");
	System.out.println("                                                         %:   `*L                           z\"    z\"");
	System.out.println("                                                           *:   ^*L                       z*   .+\"");
	System.out.println("                                                             \"s   ^*L                   z#   .*\"");
	System.out.println("                                                               #s   ^%L               z#   .*\"");
	System.out.println("                                                                 #s   ^%L           z#   .r\"");
	System.out.println("                                                                   #s   ^%.       u#   .r\"");
	System.out.println("                                                                     #i   '%.   u#   .@\"");
	System.out.println("                                                                       #s   ^%u#   .@\"");
	System.out.println("                                                                         #s x#   .*\"");
	System.out.println("                                                                          x#`  .@%.");
	System.out.println("                                                                        x#`  .d\"  \"%.");
	System.out.println("                                                                      xf~  .r\" #s   \"%.");
	System.out.println("                                                                u   x*`  .r\"     #s   \"%.  x.");
	System.out.println("                                                                %Mu*`  x*\"         #m.  \"%zX\"");
	System.out.println("                                                                :R(h x*              \"h..*dN.");
	System.out.println("                                                              u@NM5e#>                 7?dMRMh.");
	System.out.println("                                                            z$@M@$#\"#\"                 *\"\"*@MM$hL");
	System.out.println("                                                          u@@MM8*                          \"*$M@Mh.");
	System.out.println("                                                        z$RRM8F\"                             \"N8@M$bL");
	System.out.println("                                                       5`RM$#                                  'R88f)R");
	System.out.println("                                                       'h.$\"                                     #$x*");
    }

    public void prologue() {
	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("\n");
	this.printSlow3(" _____   ______  _____          _____   ______ _     _ _______");
	this.printSlow3("|_____] |_____/ |     | |      |     | |  ____ |     | |______");
	this.printSlow3("|       |    \\_ |_____| |_____ |_____| |_____| |_____| |______");
	this.printSlow("\nTimes have changed since the corrupted totalitarian government that call themselves the HQ has taken over the land");
	this.printSlow("through the use of propaganda and sheer firepower. They ravaged through, stealing our resources and leaving the citizens");
	this.printSlow("to scramble for the leftovers in order to survive. They built a seemingly impenetrable fortress in the middle of all the");
	this.printSlow("villages to quickly notice any suspicious activity and also to imply their total dominance over every citizen. Life is very");
	this.printSlow("hard for the unfortunate and extremely poor citizens because the HQ makes sure of this. However, while the HQ's use of corrupt");
	this.printSlow("and absolute power over their own citizens has lead to mass famine and sometimes genocide, it also gave the citizens a deep");
	this.printSlow("resisting nature and an enduring thirst for freedom.");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	System.out.println("____________________________________________________________________________________________________________________________________________________________________");
    }

    public void intro() {
	int n = 0;
	this.printSlow2("\nMay 12th 2134:");
	this.printSlow("You wake up in an inferno. The hut that is your home is being burned down, but the exit still seems safe enogh to use.");
	String string = IBIO.inputString((String)"\nDo you want to escape now (type \"escape\") or try and extinguish the flames (type \"extinguish\")? ");
	while (!this.introValid(string)) {
	    string = IBIO.inputString((String)"\nThe input is invalid, please enter a valid input (either \"escape\" or \"extinguish\")>> ");
	}
	if (string.equals("escape")) {
	    this.fireEscape(++n);
	} else if (string.equals("Escape")) {
	    this.fireEscape(++n);
	} else if (string.equals("ESCAPE")) {
	    this.fireEscape(++n);
	} else {
	    this.death1(--n);
	}
    }

    public boolean introValid(String string) {
	if (string.equals("ESCAPE")) {
	    return true;
	}
	if (string.equals("Escape")) {
	    return true;
	}
	if (string.equals("escape")) {
	    return true;
	}
	if (string.equals("EXTINGUISH")) {
	    return true;
	}
	if (string.equals("Extinguish")) {
	    return true;
	}
	if (string.equals("extinguish")) {
	    return true;
	}
	return false;
    }

    public void death1(int n) {
	this.printSlow("\nAs you try to put out the inferno that is engulfing your home, the supports of the house start to give away until they crumble");
	this.printSlow("and you are buried in a smoldering mass.");
	System.out.println("\nDeath by fire!");
	System.out.println("You finished with a point score of: " + n);
	System.out.println("                                                               (  .      )");
	System.out.println("                                                           )           (              )");
	System.out.println("                                                                 .  '   .   '  .  '  .");
	System.out.println("                                                        (    , )       (.   )  (   ',    )");
	System.out.println("                                                         .' ) ( . )    ,  ( ,     )   ( .");
	System.out.println("                                                      ). , ( .   (  ) ( , ')  .' (  ,    )");
	System.out.println("                                                     (_,) . ), ) _) _,')  (, ) '. )  ,. (' )");
	System.out.println("                                                   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public void fireEscape(int n) {
	this.printSlow("\nYou run as fast as you can through the smoking doorframe and as you start to take a deep breath of fresh air outside, you start choking");
	this.printSlow("and you realize that the air outside is filled with smoke too. You hear nothing but screaming and explosions. The rest of the huts in");
	this.printSlow("your village are also burning. As leader of the village it is your sworn duty to help the village as much as you can in times of great peril.");
	this.printSlow("But with this much danger everywhere, it will be difficult to keep yourself safe as well.");
	String string = IBIO.inputString((String)"\nAre you going to help your village (type \"help\") or are you going to hide until the danger has subsided (type \"hide\")? ");
	while (!this.fireValid(string)) {
	    string = IBIO.inputString((String)"\nThe input is invalid, please enter a valid input (either \"help\" or \"hide\")>> ");
	}
	if (string.equals("help")) {
	    this.thetab(n += 10);
	} else if (string.equals("Help")) {
	    this.thetab(n += 10);
	} else if (string.equals("HELP")) {
	    this.thetab(n += 10);
	} else {
	    this.exile(n += 10);
	}
    }

    public boolean fireValid(String string) {
	if (string.equals("HELP")) {
	    return true;
	}
	if (string.equals("Help")) {
	    return true;
	}
	if (string.equals("help")) {
	    return true;
	}
	if (string.equals("HIDE")) {
	    return true;
	}
	if (string.equals("Hide")) {
	    return true;
	}
	if (string.equals("hide")) {
	    return true;
	}
	return false;
    }

    public void thetab(int n) {
	this.printSlow("\nYou go from hut to hut, trying to rescue anyone trapped inside and you manage to rescue many people without sustaining any mortal wounds.");
	this.printSlow("Soon the sound of explosions and screaming stop and as you look into the distance at a spot where the neighboring village once was, you see");
	this.printSlow("a large black crater in the ground with thick plumes of dark grey smoke emrging from the village. One of the people from that village must have");
	this.printSlow("tried to come within 100 metres of the HQ fortress and break in as many others have died trying. The HQ exterminates any village who tries to");
	this.printSlow("rebel and severely punishes the other villages as they have done to your own. But you are thankful that most of the villagers survived the attack.");
	this.printSlow("Now all the survivors are gathering in the centre of the remaining village to discuss further actions. One group of people are made to try and");
	this.printSlow("salvage any useful items from the wreckage and another group is going to tend to the wounded. The few remaining are the defenders of the village,");
	this.printSlow("they have fought valiantly but were no match against the advanced technology of the HQ. Before any discussion could commence, you notice a shiny");
	this.printSlow("rectangular object on the ground. Out of curiosity, you crouch down and touch the smooth glass surface on it and immediately jump back when it");
	this.printSlow("lights up. The HQ symbol loads up on the screen.");
	this.hq();
	this.printSlow("\n");
	Object[] arrobject = new Object[]{"HQ", "Proceed"};
	JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning! Property of HQ", -1, 2, null, arrobject, arrobject[0]);
	JOptionPane.showMessageDialog(null, "HQ Is Watching You", "Alert!", 0);
	this.printSlow("This is the big break that you and your people need. The information contained in this technology could be enough to get inside the HQ fortress.");
	this.printSlow("Everyone agrees that you should try to get inside as you are the smartest. When you touch the HQ screen again, a password prompt appears with only");
	this.printSlow("two character spaces available. Thinking hard, you reaize the password is probably something to do with HQ.");
	int n2 = this.password();
	if (n2 == 0) {
	    this.boom(n -= 5);
	} else {
	    this.tab2(n += 10);
	}
    }

    public void boom(int n) {
	this.printSlow("\nBefore you can drop the tablet, it explodes with enough energy to flatten the village.");
	System.out.println("\nDeath by explosion!");
	System.out.println("You finished with a point score of: " + n);
	System.out.println("                                                                              ________________");
	System.out.println("                                                                         ____/ (  (    )   )  \\___");
	System.out.println("                                                                        /( (  (  )   _    ))  )   )\\");
	System.out.println("                                                                      ((     (   )(    )  )   (   )  )");
	System.out.println("                                                                    ((/  ( _(   )   (   _) ) (  () )  )");
	System.out.println("                                                                   ( (  ( (_)   ((    (   )  .((_ ) .  )_");
	System.out.println("                                                                  ( (  )    (      (  )    )   ) . ) (   )");
	System.out.println("                                                                 (  (   (  (   ) (  _  ( _) ).  ) . ) ) ( )");
	System.out.println("                                                                 ( (  (   ) (  )   (  ))     ) _)(   )  )  )");
	System.out.println("                                                                ( (  ( \\ ) (    (_  ( ) ( )  )   ) )  )) ( )");
	System.out.println("                                                                 (  (   (  (   (_ ( ) ( _    )  ) (  )  )   )");
	System.out.println("                                                                ( (  ( (  (  )     (_  )  ) )  _)   ) _( ( )");
	System.out.println("                                                                 ((  (   )(    (     _    )   _) _(_ (  (_ )");
	System.out.println("                                                                  (_((__(_(__(( ( ( |  ) ) ) )_))__))_)___)");
	System.out.println("                                                                  ((__)        \\\\||lll|l||///          \\_))");
	System.out.println("                                                                           (   /(/ (  )  ) )\\   )");
	System.out.println("                                                                         (    ( ( ( | | ) ) )\\   )");
	System.out.println("                                                                          (   /(| / ( )) ) ) )) )");
	System.out.println("                                                                        (     ( ((((_(|)_)))))     )");
	System.out.println("                                                                         (      ||\\(|(|)|/||     )");
	System.out.println("                                                                       (        |(||(||)||||        )");
	System.out.println("                                                                         (     //|/l|||)|\\\\ \\     )");
	System.out.println("                                                                       (/ / //  /|//||||\\\\  \\ \\  \\ _)");
    }

    public void tab2(int n) {
	this.printSlow("\nThe screen is then replaced with another one prompting you to unscramble a word. It seems you must pass through a series of taxing tasks before");
	this.printSlow("you can get to the vital information.");
	int n2 = this.unscramble();
	if (n2 == 0) {
	    this.boom(n -= 5);
	} else {
	    this.tab3(n += 10);
	}
    }

    public void tab3(int n) {
	this.printSlow("\nOne final task stands in between you and the information.");
	int n2 = this.math();
	if (n2 == 0) {
	    this.boom(n -= 5);
	} else {
	    this.theplan(n += 10);
	}
    }

    public void theplan(int n) {
	this.printSlow("\nEveryone gathers around the bright screen as blueprints of the HQ fortress appear. Almost all the the information regarding the fortress is now in");
	this.printSlow("your hands. You and the villagers are discussing how infiltrating the HQ fortress can cause a mass revolution in this land and perhaps the so called");
	this.printSlow("\"other countries\" that you have heard peole speak of. This is the greatest chance of freedom yet beacause the other villages that tried to break in");
	this.printSlow("the fortress did not have this invaluable information. The only thing left now is to plan...");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow2(".");
	this.printSlow("After a few days of planning in a hut that is void of the seemingly omniscient eyes of HQ, you and the villagers have come up with a plan. A party of five");
	this.printSlow("people including you, the leader, will trek towards the fortress in the blindspots of the cameras that was outlined in the HQ tablet. Then you will go to");
	this.printSlow("the smallest entrance at the side that is used for emergencies to get inside the fortress. Once inside, you will alert the other villages and open all the");
	this.printSlow("gates while turning off all security in the fortress. A mass uprising will then occur as every village storms inside the fortress, outnumbering the soldiers");
	this.printSlow("20 to 1.");
	this.printSlow("\nWasting no time, you and your team start trekking towards the fortress making sure that everyone is in the blindspot. After a while, you reach a piece of");
	this.printSlow("land that contains very soft dirt with many deep and dark holes. You raise your hand to stop the others. The earth starts to tremble as if it knows you are");
	this.printSlow("above. This could be where the bronzebacks lurk. Enormous genetically mutated centipedes with scaly bronze backs and venomous pincers that can cut through");
	this.printSlow("dirt like water. And sure enough, with an almighty \"BOOM\" the soft earth in front of you and your team explodes and when the dirt has settled, a giant");
	this.printSlow("bronzeback made to protect the HQ, looms in front of you. Everyone draws their weapons at once.");
	this.bossbattle(n);
    }

    public void bossbattle(int n) {
	int n2 = 200;
	int n3 = 200;
	while (n2 > 0 && n3 > 0) {
	    System.out.println("\nYou have " + n2 + " health points.");
	    System.out.println("The bronzeback has " + n3 + " health points.");
	    int n4 = (int)(Math.random() * (double)3) + 1;
	    if (n4 == 1) {
		this.printSlow("\nThe bronzeback has used Pincer Strike!");
		n2 -= 25;
		System.out.println("You have taken 25 damage.");
	    } else if (n4 == 2) {
		this.printSlow("\nThe bronzeback has used Pounce Attack!");
		n2 -= 20;
		System.out.println("You have taken 20 damage.");
	    } else {
		this.printSlow("\nThe bronzeback has used Poison Spray!");
		n2 -= 15;
		System.out.println("You have taken 15 damage.");
	    }
	    int n5 = IBIO.inputInt((String)"\nWhat attack do you choose (\"1\" for Sword Slash, \"2\" for Knife Throw and \"3\" for Arrow Shot)? ");
	    int n6 = (int)(Math.random() * (double)4) + 1;
	    n6 = n6 == 1 ? 40 : (n6 == 2 ? 35 : (n6 == 3 ? 25 : 10));
	    while (!this.aValid(n5)) {
		n5 = IBIO.inputInt((String)"\nThe input is invalid, please enter a valid input (either \"1\", \"2\" or \"3\")>> ");
	    }
	    int n7 = (int)(Math.random() * 10.0) + 1;
	    if (n7 == 1) {
		System.out.println("\nThe bonzeback has dodged your attack and has not recieved any damage!");
		continue;
	    }
	    if (n5 == 1) {
		this.printSlow("\nYou use Sword Slash on the bronzeback");
		n3 -= n6;
		System.out.println("The bonzeback has taken " + n6 + " damage");
		continue;
	    }
	    if (n5 == 2) {
		this.printSlow("\nYou use Knife Throw on the bronzeback");
		n3 -= n6;
		System.out.println("The bonzeback has taken " + n6 + " damage");
		continue;
	    }
	    this.printSlow("\nYou use Arrow Shot on the bronzeback");
	    n3 -= n6;
	    System.out.println("The bonzeback has taken " + n6 + " damage");
	}
	if (n2 > 0) {
	    this.printSlow("\nThe bronzeback sways on the spot looking dazed, and then collapses from all the attacks. You have killed the bronzeback!");
	    this.fortress(n += 15);
	} else {
	    System.out.println("\nThe bronzeback has killed you!");
	    System.out.println("You finished with a point score of " + (n -= 15));
	    this.skull();
	}
    }

    public void fortress(int n) {
	this.printSlow("\nYour team passes the dead bronzeback and continue on towards the windowless HQ fortress that becomes more intimidating by the second. At last, you reach the emergency");
	this.printSlow("door while staying in the blindspot. As you try to push the door, an error message appears on a control panel beside the door:");
	this.printSlow("\"You must first complete the tasks.\"");
	JOptionPane.showMessageDialog(null, "You must first complete the tasks.", "Alert!", 0);
	this.printSlow("\nIt seems that the door to the HQ fortress has similar security features as the tablet. Your team agrees that you should try to complete the tasks as you are");
	this.printSlow("only one in the group to have done it before.");
	int n2 = this.guessinggame();
	if (n2 == 0) {
	    this.fail(n -= 5);
	} else {
	    this.ftask2(n += 10);
	}
    }

    public void fail(int n) {
	this.printSlow("\nIn a blink of an eye, you are surrounded by HQ soldiers and then you are no more...");
	System.out.println("\nDeath by HQ!");
	System.out.println("You finished with a point score of " + n);
	this.skull();
    }

    public void ftask2(int n) {
	this.printSlow("\nTask 2:");
	String string = IBIO.inputString((String)"True or false, the brightest star in the night sky is Sirius>> ");
	while (!this.tfValid(string)) {
	    string = IBIO.inputString((String)"\nInvalid input, please enter either \"true\" or \"false\">> ");
	}
	if (string.equals("TRUE")) {
	    this.printSlow("\"Correct, please continue.\"");
	    this.ftask3(n += 10);
	} else if (string.equals("True")) {
	    this.printSlow("\"Correct, please continue.\"");
	    this.ftask3(n += 10);
	} else if (string.equals("true")) {
	    this.printSlow("\"Correct, please continue.\"");
	    this.ftask3(n += 10);
	} else if (string.equals("t")) {
	    this.printSlow("\"Correct, please continue.\"");
	    this.ftask3(n += 10);
	} else if (string.equals("T")) {
	    this.printSlow("\"Correct, please continue.\"");
	    this.ftask3(n += 10);
	} else {
	    this.printSlow("\"\nIncorrect, HQ has been alerted!\"");
	    this.fail(n -= 5);
	}
    }

    public void ftask3(int n) {
	this.printSlow("\nThe final task: ");
	this.printSlow("There is an ancient invention still used in some parts of the world today that allows people to see through walls.");
	String string = IBIO.inputString((String)"\n\tWhat is it? ");
	if (string.equals("A WINDOW")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else if (string.equals("A window")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else if (string.equals("a window")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else if (string.equals("WINDOW")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else if (string.equals("Window")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else if (string.equals("window")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else if (string.equals("WINDOWS")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else if (string.equals("Windows")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else if (string.equals("windows")) {
	    this.printSlow("\"Correct.\"");
	    this.inside(n += 25);
	} else {
	    this.printSlow("\"\nIncorrect, HQ has been alerted!\"");
	    this.fail(n -= 15);
	}
    }

    public void inside(int n) {
	this.printSlow("\nYou and your team rush inside but then a blinding white light hits everyone's eyes. At first it seems like a spotlight but then you realize the that empty hallways are");
	this.printSlow("made out of pure white marble with tiny intricate carvings of HQ propaganda filled in with gold. But no one stops to admire the HQ's handiwork. Following the tablet's");
	this.printSlow("blueprints, you lead your team to the master control room which turns out to be empty. All of the HQ personnel must be in a meeting in the centre of the fortress. You enter");
	this.printSlow("the room and bar the door shut with a thick metal rod found in the tool cabinet, once your team is inside. After pressing the \"GATE\" button, you hear a loud reverberating");
	this.printSlow("screech as the huge gates of each of the four sides of the fortress open and you know that as you think, every single villager in every single village is now charging towards");
	this.printSlow("the fortress. But then it dawns on you. What if there won't be enough resources for everyone once the HQ is overpowered? What if the overpopulation that caused the greed of the");
	this.printSlow("once fair HQ causes your own people to turn against you and bring you down? Or maybe something can be worked out, somehow, so that everyone who wants and deserves freedom can");
	this.printSlow("have it at last? All you have to do is press \"GATE\" button one more time to close all of the gates and stop anyone from entering. The number of people already inside is more");
	this.printSlow("than enough to overthrow the small number of HQ soldiers. Or you could follow the original plan and let the people that supported you all your life inside.");
	this.printSlow("\n\nThe choice is yours...");
	int n2 = IBIO.inputInt((String)"\nDo you want to close the gates (enter \"1\") or do you want to leave them open (enter \"2\")? ");
	while (!this.eValid(n2)) {
	    n2 = IBIO.inputInt((String)"\nThe input is invalid, please enter a valid input (either \"1\" or \"2\")>> ");
	}
	if (n2 == 1) {
	    this.inFamous(n += 50);
	} else {
	    this.Hero(n += 50);
	}
    }

    public void inFamous(int n) {
	this.printSlow("\nYou press the button and watch the cameras as the gates crash shut. The villagers outside are climbing on top of each other, desperately trying to somehow get inside. The scene is pitiful");
	this.printSlow("but you feel no remorse because you know that the same people you watch would betray you in a heartbeat. You live the rest of your life luxuriously, and the people who managed to make it");
	this.printSlow("inside the fortress worship you out of fear. You keep a watchful eye on the petty villagers who sometimes try to get inside, but you have become the one thing that you once tried to stop.");
	this.printSlow4("\n\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	this.printSlow("\nCongratulations! You have successfully completed \"The Uprising\" with " + n + " inFamous points.");
	System.out.println("\n\n\n");
	this.printSlow2("\tGame Created By: Adarsh Pala");
    }

    public void Hero(int n) {
	this.printSlow("\nYou let the events unfold. The villagers take the HQ fortress and everyone hails you for your courage and for finally bringing freedom to the land. But there is not enough space or resources in");
	this.printSlow("the fortress for everyone. You manage to find out that you can communicate with other \"countries\" through the use of something called a \"phone\". Once the other countries hear about your");
	this.printSlow("situation, relief comes from everywhere and many villagers choose to immigrate to another country to forget their old life ad start a new one. But you travel the world creating awareness");
	this.printSlow("about your story so that no one else will ever have to go through what you and your people went through.");
	this.printSlow4("\n\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	this.printSlow("\nCongratulations! You have successfully completed \"The Uprising\" with " + n + " Hero points.");
	System.out.println("\n\n\n");
	this.printSlow2("\tGame Created By: Adarsh Pala");
    }

    public boolean tfValid(String string) {
	if (string.equals("TRUE")) {
	    return true;
	}
	if (string.equals("True")) {
	    return true;
	}
	if (string.equals("true")) {
	    return true;
	}
	if (string.equals("t")) {
	    return true;
	}
	if (string.equals("T")) {
	    return true;
	}
	if (string.equals("FALSE")) {
	    return true;
	}
	if (string.equals("False")) {
	    return true;
	}
	if (string.equals("false")) {
	    return true;
	}
	if (string.equals("f")) {
	    return true;
	}
	if (string.equals("F")) {
	    return true;
	}
	return false;
    }

    public int guessinggame() {
	int n = 0;
	this.printSlow("\nTask 1:");
	this.printSlow("HQ has picked a number between 1 and 100. Try to guess it.");
	int n2 = (int)(Math.random() * 100.0) + 1;
	int n3 = 0;
	while (n3 < 7 && n != n2) {
	    if (n2 > (n = IBIO.inputInt((String)("\nGuess #" + ++n3 + ">> ")))) {
		System.out.println("\tThat is too low");
		if (n3 < 6) {
		    this.printSlow("\n\tYou have " + (7 - n3) + " tries left");
		    continue;
		}
		if (n3 == 6) {
		    this.printSlow("\n\tYou have " + (7 - n3) + " try left");
		    continue;
		}
		System.out.print("");
		continue;
	    }
	    if (n2 < n) {
		System.out.println("\tThat is too high");
		if (n3 < 6) {
		    this.printSlow("\n\tYou have " + (7 - n3) + " tries left");
		    continue;
		}
		if (n3 == 6) {
		    this.printSlow("\n\tYou have " + (7 - n3) + " try left");
		    continue;
		}
		System.out.print("");
		continue;
	    }
	    System.out.print("");
	}
	if (n3 > 6 && n != n2) {
	    this.printSlow("\n\"Too many incorrect attempts. HQ has been alerted!\"");
	    return 0;
	}
	this.printSlow("\n\"Correct, please continue.\"");
	return 1;
    }

    public int math() {
	double d = Math.pow(11.0, 2);
	double d2 = 0.0;
	int n = 0;
	while (d2 != d && n < 3) {
	    d2 = IBIO.inputInt((String)"\nWhat is 11 squared? ");
	    if (d2 == d) continue;
	    if (++n < 2) {
		this.printSlow("\nIncorrect answer. " + (3 - n) + " tries left");
		continue;
	    }
	    if (n == 2) {
		this.printSlow("\nIncorrect answer. " + (3 - n) + " try left");
		continue;
	    }
	    System.out.print("");
	}
	if (n > 2) {
	    this.printSlow("\n\"Too many incorrect attempts. Self-destruct mode activated!\"");
	    return 0;
	}
	this.printSlow("\n\"Correct, please continue.\"");
	return 1;
    }

    public int unscramble() {
	String string = "power";
	String string2 = "";
	int n = 0;
	while (!string2.equals(string) && n < 6) {
	    string2 = IBIO.inputString((String)"\nUnscramble: rowpe >> ");
	    if (string2.equals(string)) continue;
	    if (++n < 5) {
		this.printSlow("\nIncorrect answer. " + (6 - n) + " tries left");
		continue;
	    }
	    if (n == 5) {
		this.printSlow("\nIncorrect answer. " + (6 - n) + " try left");
		continue;
	    }
	    System.out.print("");
	}
	if (n > 5) {
	    this.printSlow("\n\"Too many incorrect attempts. Self-destruct mode activated!\"");
	    return 0;
	}
	this.printSlow("\n\"Correct, please continue.\"");
	return 1;
    }

    public int password() {
	String string = "HQ";
	String string2 = "";
	int n = 0;
	while (!string2.equals(string) && n < 6) {
	    string2 = IBIO.inputString((String)"\nEnter the password>> ");
	    if (string2.equals(string)) continue;
	    if (++n < 5) {
		this.printSlow("\nIncorrect password. " + (6 - n) + " tries left");
		continue;
	    }
	    if (n == 5) {
		this.printSlow("\nIncorrect password. " + (6 - n) + " try left");
		continue;
	    }
	    System.out.print("");
	}
	if (n > 5) {
	    this.printSlow("\n\"Too many incorrect attempts. Self-destruct mode activated!\"");
	    return 0;
	}
	this.printSlow("\n\"Correct, please continue.\"");
	return 1;
    }

    public void hq() {
	this.printSlow3("\n\n");
	this.printSlow3("                                                 HHHHHHHHH     HHHHHHHHH     QQQQQQQQQ      ");
	this.printSlow3("                                                 H:::::::H     H:::::::H   QQ:::::::::QQ    ");
	this.printSlow3("                                                 H:::::::H     H:::::::H QQ:::::::::::::QQ  ");
	this.printSlow3("                                                 HH::::::H     H::::::HHQ:::::::QQQ:::::::Q ");
	this.printSlow3("                                                   H:::::H     H:::::H  Q::::::O   Q::::::Q ");
	this.printSlow3("                                                   H:::::H     H:::::H  Q:::::O     Q:::::Q ");
	this.printSlow3("                                                   H::::::HHHHH::::::H  Q:::::O     Q:::::Q ");
	this.printSlow3("                                                   H:::::::::::::::::H  Q:::::O     Q:::::Q ");
	this.printSlow3("                                                   H:::::::::::::::::H  Q:::::O     Q:::::Q ");
	this.printSlow3("                                                   H::::::HHHHH::::::H  Q:::::O     Q:::::Q ");
	this.printSlow3("                                                   H:::::H     H:::::H  Q:::::O  QQQQ:::::Q ");
	this.printSlow3("                                                   H:::::H     H:::::H  Q::::::O Q::::::::Q ");
	this.printSlow3("                                                 HH::::::H     H::::::HHQ:::::::QQ::::::::Q ");
	this.printSlow3("                                                 H:::::::H     H:::::::H QQ::::::::::::::Q  ");
	this.printSlow3("                                                 H:::::::H     H:::::::H   QQ:::::::::::Q   ");
	this.printSlow3("                                                 HHHHHHHHH     HHHHHHHHH     QQQQQQQQ::::QQ ");
	this.printSlow3("                                                                                     Q:::::Q");
	this.printSlow3("                                                                                      QQQQQQ");
    }

    public void exile(int n) {
	this.printSlow("\nYou go to the edge of your village and open up the trapdoor to the food storage area. You should be safe here until the sound of screaming and");
	this.printSlow("explosions stop. After a while when everything becoms much quieter you decide to leave, but right before you could do so the");
	this.printSlow("trapdoor starts to creak open. You fear the worst, maybe a soldier of the HQ because it was surely them who set fire to your village.");
	this.printSlow("Probably because someone from the neighboring villages decided to come within 100 metres of the HQ fortress and break in as many others");
	this.printSlow("have died trying. The HQ exterminates any village who tries to rebel and severely punishes the other villages. But when the trapdoor");
	this.printSlow("finally opened all the way, it was not a soldier who comes down but a fellow villager with countless burns on his exposed skin. When he");
	this.printSlow("comes down and sees you sitting in a corner looking terrified, he does not look happy. Every survivor of the fire has come to see the leader");
	this.printSlow("who betrayed them and hide away while every other person was risking their own life to save the others. Soon, the decision of exiling the");
	this.printSlow("traitorous leader becomes final. You are left with only  2 choices.");
	int n2 = IBIO.inputInt((String)"\nDo you want to head towards another village (enter \"1\") or away from civilization (enter \"2\")? ");
	while (!this.eValid(n2)) {
	    n2 = IBIO.inputInt((String)"\nThe input is invalid, please enter a valid input (either \"1\" or \"2\")>> ");
	}
	if (n2 == 1) {
	    this.village(n += 10);
	} else {
	    this.solo(n += 10);
	}
    }

    public boolean eValid(int n) {
	if (n == 1 || n == 2) {
	    return true;
	}
	return false;
    }

    public void village(int n) {
	this.printSlow("\nWith your back to the village you called home for all your life, you set off towards another village that is barely visible in the horizon.");
	this.printSlow("After a while, with the village still barely discernible, you decide to look for some ground water because of your unrelenting thirst. But as");
	this.printSlow("soon as you started digging the parched dirt for some sign of water, the ground around you starts to shake violently. You fall to your knees because");
	this.printSlow("of the huge vibrations emanating from the ground. And then with a ferocious \"BOOM\", the dried earth in front of you erupts and when the dust has");
	this.printSlow("settled, a huge monster is now in front of you. It looks exactly like the bronzebacks found around the HQ fortress, some of them must");
	this.printSlow("have tunneled themselves away from their designated area. It is said that the Bronzeback is a genetically altered centipede, made to");
	this.printSlow("be larger, more venomous an altogether more intimidating. This is definitely true and as you see the bronzeback rear its head and");
	this.printSlow("prepare to attack, you know you must take some sort of action.");
	int n2 = IBIO.inputInt((String)"\nDo you want to fight (enter \"1\") or flee (enter \"2\")? ");
	while (!this.eValid(n2)) {
	    n2 = IBIO.inputInt((String)"\nThe input is invalid, please enter a valid input (either \"1\" or \"2\")>> ");
	}
	if (n2 == 1) {
	    this.fight(n -= 5);
	} else {
	    this.flee(n -= 5);
	}
    }

    public void solo(int n) {
	this.printSlow("\nWith your back to the village you called home for all your life, you set off towards the vast expanse of dry and seemingly endless land");
	this.printSlow("that the villagers called \"The Deadlands\". There are many legends about dangerous The Deadlands are for few have ever ventured here.");
	this.printSlow("Those who have never came back. But hopefully you can find some resources to to spend the night. As soon as you started digging the");
	this.printSlow("parched dirt for some sign of water, the ground around you starts to shake violently. You fall to your knees because of the huge ");
	this.printSlow("vibrations emanating from the ground. And then with a ferocious \"BOOM\", the dried earth in front of you erupts and when the dust has");
	this.printSlow("settled, a huge monster is now in front of you. It looks exactly like the bronzebacks found around the HQ fortress, some of them must");
	this.printSlow("have tunneled themselves away from their designated area. It is said that the Bronzeback is a genetically altered centipede, made to");
	this.printSlow("be larger, more venomous an altogether more intimidating. This is definitely true and as you see the bronzeback rear its head and");
	this.printSlow("prepare to attack, you know you must take some sort of action.");
	int n2 = IBIO.inputInt((String)"\nDo you want to fight (enter \"1\") or flee (enter \"2\")? ");
	while (!this.eValid(n2)) {
	    n2 = IBIO.inputInt((String)"\nThe input is invalid, please enter a valid input (either \"1\" or \"2\")>> ");
	}
	if (n2 == 1) {
	    this.fight(n -= 5);
	} else {
	    this.flee(n -= 5);
	}
    }

    public void fight(int n) {
	this.printSlow("\nYou draw your sword. If you're going to die, you're going to die fighting.");
	this.boss(n);
    }

    public void boss(int n) {
	int n2 = 100;
	int n3 = 200;
	while (n2 > 0) {
	    System.out.println("\nYou have " + n2 + " health points.");
	    System.out.println("The bronzeback has " + n3 + " health points.");
	    int n4 = (int)(Math.random() * (double)3) + 1;
	    if (n4 == 1) {
		this.printSlow("\nThe bronzeback has used Pincer Strike!");
		n2 -= 50;
		System.out.println("You have taken 50 damage.");
	    } else if (n4 == 2) {
		this.printSlow("\nThe bronzeback has used Pounce Attack!");
		n2 -= 30;
		System.out.println("You have taken 30 damage.");
	    } else {
		this.printSlow("\nThe bronzeback has used Poison Spray!");
		n2 -= 25;
		System.out.println("You have taken 25 damage.");
	    }
	    int n5 = IBIO.inputInt((String)"\nWhat attack do you choose (\"1\" for Sword Slash, \"2\" for Knife Throw and \"3\" for Arrow Shot)? ");
	    int n6 = (int)(Math.random() * (double)4) + 1;
	    n6 = n6 == 1 ? 20 : (n6 == 2 ? 15 : (n6 == 3 ? 10 : 5));
	    while (!this.aValid(n5)) {
		n5 = IBIO.inputInt((String)"\nThe input is invalid, please enter a valid input (either \"1\", \"2\" or \"3\")>> ");
	    }
	    if (n5 == 1) {
		this.printSlow("\nYou use Sword Slash on the bronzeback");
		n3 -= n6;
		System.out.println("The bonzeback has taken " + n6 + " damage");
		continue;
	    }
	    if (n5 == 2) {
		this.printSlow("\nYou use Knife Throw on the bronzeback");
		n3 -= n6;
		System.out.println("The bonzeback has taken " + n6 + " damage");
		continue;
	    }
	    this.printSlow("\nYou use Arrow Shot on the bronzeback");
	    n3 -= n6;
	    System.out.println("The bonzeback has taken " + n6 + " damage");
	}
	System.out.println("\nThe bronzeback has killed you!");
	System.out.println("You finished with a point score of " + --n);
	this.skull();
    }

    public boolean aValid(int n) {
	if (n == 1 || n == 2 || n == 3) {
	    return true;
	}
	return false;
    }

    public void flee(int n) {
	this.printSlow("\nAs you run for your life, the bronzeback unexpectedly sinks back into the ground. It probably thinks you are not worth the time and");
	this.printSlow("effort. You stop running and place your hands on your knees, panting. Then the ground around you starts to slowly rise, but before");
	this.printSlow("you can so much as move your legs, the ground beneath you breaks apart and you fall into the pincers of a bronzeback.");
	System.out.println("\nDeath by beast!");
	System.out.println("You finished with a point score of: " + n);
	this.skull();
    }

    public void skull() {
	System.out.println("                                                                      .ed\"\"\"\" \"\"\"$$$$be.");
	System.out.println("                                                                    -\"           ^\"\"**$$$e.");
	System.out.println("                                                                  .\"                   '$$$c");
	System.out.println("                                                                 /                      \"4$$b");
	System.out.println("                                                                d  3                      $$$$");
	System.out.println("                                                                $  *                   .$$$$$$");
	System.out.println("                                                               .$  ^c           $$$$$e$$$$$$$$.");
	System.out.println("                                                               d$L  4.         4$$$$$$$$$$$$$$b");
	System.out.println("                                                               $$$$b ^ceeeee.  4$$ECL.F*$$$$$$$");
	System.out.println("                                                   e$\"\"=.      $$$$P d$$$$F $ $$$$$$$$$- $$$$$$");
	System.out.println("                                                  z$$b. ^c     3$$$F \"$$$$b   $\"$$$$$$$  $$$$*\"      .=\"\"$c");
	System.out.println("                                                 4$$$$L        $$P\"  \"$$b   .$ $$$$$...e$$        .=  e$$$.");
	System.out.println("                                                 ^*$$$$$c  %..   *c    ..    $$ 3$$$$$$$$$$eF     zP  d$$$$$");
	System.out.println("                                                   \"**$$$ec   \"   %ce\"\"    $$$  $$$$$$$$$$*    .r\" =$$$$P\"\"");
	System.out.println("                                                         \"*$b.  \"c  *$e.    *** d$$$$$\"L$$    .d\"  e$$***\"");
	System.out.println("                                                           ^*$$c ^$c $$$      4J$$$$$% $$$ .e*\".eeP\"");
	System.out.println("                                                              \"$$$$$$\"'$=e....$*$$**$cz$$\" \"..d$*\"");
	System.out.println("                                                                \"*$$$  *=%4.$ L L$ P3$$$F $$$P\"");
	System.out.println("                                                                   \"$   \"%*ebJLzb$e$$$$$b $P\"");
	System.out.println("                                                                     %..      4$$$$$$$$$$ \"");
	System.out.println("                                                                      $$$e   z$$$$$$$$$$%");
	System.out.println("                                                                       \"*$c  \"$$$$$$$P\"");
	System.out.println("                                                                        .\"\"\"*$$$$$$$$bc");
	System.out.println("                                                                     .-\"    .$***$$$\"\"\"*e.");
	System.out.println("                                                                  .-\"    .e$\"     \"*$c  ^*b.");
	System.out.println("                                                           .=*\"\"\"\"    .e$*\"          \"*bc  \"*$e..");
	System.out.println("                                                         .$\"        .z*\"               ^*$e.   \"*****e.");
	System.out.println("                                                         $$ee$c   .d\"                     \"*$.        3.");
	System.out.println("                                                         ^*$E\")$..$\"                         *   .ee==d%");
	System.out.println("                                                            $.d$$$*                           *  J$$$e*");
	System.out.println("                                                             \"\"\"\"\"                              \"$$$\"");
    }

    public uprising() {
	Date date = new Date();
	DateFormat dateFormat = DateFormat.getDateInstance();
	String string = dateFormat.format(date);
	System.out.println("                                                                                                                                  Game started on " + string);
	char c = IBIO.inputChar((String)"\nPress \" y \" to start the game>> ");
	while (!this.menuValid(c)) {
	    System.out.println("\nSorry, but this is an invalid input, please try again:");
	    c = IBIO.inputChar((String)"Press \" y \" to start the game>> ");
	}
	while (this.menuValid(c)) {
	    this.beginningASCII();
	    this.prologue();
	    this.intro();
	    c = IBIO.inputChar((String)"\nDo you want to play again (y/n)? ");
	    while (!this.playagainValid(c)) {
		System.out.println("\nSorry, but this is invalid an input, please try again:");
		c = IBIO.inputChar((String)"\nDo you want to play again (y/n)? ");
	    }
	}
	this.gameover();
    }
}
