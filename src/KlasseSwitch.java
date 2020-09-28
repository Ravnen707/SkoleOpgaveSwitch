import java.util.Scanner;

public class KlasseSwitch {

    public static void main(String[] args) {

        Personer st1 = new Personer();
        st1.navn ="Anders";
        st1.alder =20;
        st1.by ="Naestved";
    //    st1.retning = "Data";

        Personer st2 = new Personer();
        st2.navn ="Gustav";
        st2.alder =24;
        st2.by ="Haslev";
     //   st2.retning = "Data";

        Personer st3 = new Personer();
        st3.navn ="Chilas";
        st3.alder =20;
        st3.by ="Naestved";
     //   st3.retning = "Data";

        Personer st4 = new Personer();
        st4.navn ="Andreas";
        st4.alder =23;
        st4.by ="Naestved";
    //    st4.retning = "Data";

        System.out.println("Gruppe");

        Scanner scanncer = new Scanner(System.in);
        System.out.println("Who ya looking for?");
        String FindingName = scanncer.next();
        switch (FindingName) {
            case "Anders":
                System.out.println(st1.alder);
                break;
            case "Gustav":
                System.out.println(st2.alder);
                break;
            case "Chilas":
                System.out.println(st3.alder);
                break;
            case "Andreas":
                System.out.println(st4.alder);
                break;
            default:
                System.out.println(FindingName + "Findes ikke i gruppen");
        }
    }
}
/*
The code here is to make it a litle more automatic to search for the one your looking for.
in our case it's my own school grp.
So this work by typing in the name of the person you want to fine of em. it gives you their age.
as it's only directed to do that for now.
but by changign "alder" in the Sout to "by" it will say where one lives instead.

 */