import java.util.Random;

public class FalloutCalculador {
    public static double numberDTDam(double min, double max){
        double x = (float)(Math.random()*((max-min)+1))+min;
        return x;
    }
    public static void main(String[] args){
        float dam, dmgbase, cond, power, bonus;
        double skill, DR;
        int isCrit;
        float damadj, DTadj, damadj2, critdmg, critperks,  DT, ammoDTmult, ammoDT;
        int SA, special;
        float finaldam,LM, AM,DM, perks, chems;

        dmgbase= 36;
        cond = 1; //Puede ir de 0.5 a 1
        skill = 0.7; //Puede ir de 0.5 a 1
        power = 1; //Es 2 si es cuerpo a cuerpo 1 si no
        bonus = 0;
        special = 1; //1 si no es cuerpo a cuerpo, cada arma tiene el suyo
        isCrit = 0; //1 si es critico 0 si no lo es
        critdmg = 40;
        critperks = 2; //Varia dependiendo de el Perk
        DR = 0.9; //Varia dependiendo el objetivo
        DT = 15;
        ammoDTmult = 1;
        ammoDT = 3;
        SA = 2; //1 si no es sigiloso, 2 si es a distancia, 5 si es cuerpo a cuerpo
        LM = 1; //Depende de a donde se le ataque al enemigo
        AM = 1; //Cada municion tiene el suyo propio
        DM = (float)(0.5); //2 si facil 1 si normal 0.5 si es dificil
        perks = 1; //Depende si el jugador tiene Perks que aumentan el daño
        chems = 1; //Depende si el jugador usa quimicos


        dam = (float)(dmgbase*skill*cond*power+bonus);
        damadj = (float)((dam*special+isCrit*critdmg*critperks)*DR);
        DTadj = (float)(numberDTDam(0, DT*ammoDTmult-ammoDT));
        damadj2 = (float)(numberDTDam(damadj*0.2, damadj-DT));
        finaldam = damadj2*SA*LM*AM*DM*perks*chems;
        //finaldam = Math.round((finaldam*100) * 100)/100;
        System.out.println("El daño ocasionado es de "+finaldam+" HP");

    }
}
