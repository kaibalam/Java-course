import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas,claseHistoria,claseLenguaje;
        double sumNotasMatemáticas=0, sumNotasHistoria=0, sumNotasLenguaje=0;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese 7 notas para la clase Matemáticas: ");
        for (int i = 0; i<claseMatematicas.length;i++){
            claseMatematicas[i] = sc.nextDouble();
        }
        System.out.println(" Ingrese 7 notas para la clase Historia: ");
        for (int i = 0; i<claseHistoria.length;i++){
            claseHistoria[i] = sc.nextDouble();
        }
        System.out.println(" Ingrese 7 notas para la clase Lenguaje: ");
        for (int i = 0; i<claseLenguaje.length;i++){
            claseLenguaje[i] = sc.nextDouble();
        }

        for (int i= 0; i<7;i++){
            sumNotasMatemáticas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }
        double promMatemáticas = sumNotasMatemáticas/claseMatematicas.length;
        double promLenguaje = sumNotasLenguaje/claseLenguaje.length;
        double promHistoria = sumNotasHistoria/claseHistoria.length;

        System.out.println("Suma notas matemáticas: " + promMatemáticas);
        System.out.println("Suma notas lenguaje: " + promLenguaje);
        System.out.println("Suma notas historia: " + promHistoria);
        System.out.println("Promedio total del curso" + (promHistoria + promMatemáticas+ promLenguaje)/3);

        System.out.println("Ingrese identificador del alumno, de 0 a 6");
        int index = sc.nextInt();
        double promedioAlumno = (claseHistoria[index] + claseMatematicas[index] + claseLenguaje[index])/3;
        System.out.println("promedio alumno No."+ index + " : "+ promedioAlumno);

    }
}
