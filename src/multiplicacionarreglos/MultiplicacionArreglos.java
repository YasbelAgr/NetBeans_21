import javax.swing.JOptionPane;
public class MultiplicacionArreglos {
    public static void main(String[] args) {
        String filas[] = {" ", "0 ", "1 ", "2 "};
        String columnas[] = {"0", "1", "2"};
        byte numeros[][] = new byte[3][3];
        byte numerosx[][]= new byte[3][3];
        byte resultado[][] = new byte[3][3];
        int o, m;

        for (o=0; o<3; o++) {
            for (m=0; m<3; m++) {
                numeros[o][m] = Byte.parseByte(JOptionPane.showInputDialog("Ingrese "
                        + "un numero del 1 al 9 para la tabla 1 "));
            }
        }

        for (o=0; o<3; o++) {
            for (m=0; m<3; m++) {
                numerosx[o][m]= Byte.parseByte(JOptionPane.showInputDialog("Ingrese"
                        + " un numero del 1 al 9 para la tabla 2 "));
            }
        }

        for (String encabezado: filas) {
            System.out.print(encabezado + "\t");
        }
        System.out.print("\t");
        for (String encabezado : filas) {
            System.out.print(encabezado + "\t");
        }
        System.out.print("\t");
        for (String encabezado : filas) {
            System.out.print(encabezado + "\t");
        }
        System.out.println();

        for (o=0; o<3; o++) {
            System.out.print(columnas[o] + "\t");
            for (m=0; m<3; m++) {
                System.out.print(numeros[o][m] + "\t");
            }
            System.out.print("\t");
            System.out.print(columnas[o] + "\t");
            for (m=0; m<3; m++) {
                System.out.print(numerosx[o][m] + "\t");
            }

            System.out.print("\t");
            System.out.print(columnas[o] + "\t");
            for (m=0; m<3; m++) {
                resultado[o][m] = (byte) (numeros[o][m] * numerosx[2 - o][2 - m]);
                System.out.print(resultado[o][m] + "\t");
            }
            System.out.println();
        }
    }
}
