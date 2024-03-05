/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */







import java.util.*;




public class daireAlani {

    public static void main(String[] args)
    {
        int a, r;
        double pi=3.14;
        double aci_alan;

        Scanner input=new Scanner(System.in);

        System.out.println("Dairenin yari capi=");
        r=input.nextInt();
        System.out.println("Dairenin merkez acisi=");
        a=input.nextInt();

        aci_alan = (pi * (r*r) * a)/360;

        System.out.println("Merkez acisi "+a+" olan daire diliminin alani="+aci_alan);


        





    }

}
