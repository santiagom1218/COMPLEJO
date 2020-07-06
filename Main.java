class Main{
public static void main (String[] args) {
Complejo c=new Complejo();
Complejo c1=new Complejo();
Complejo res=new Complejo();
c.leer();
c1.leer();
res=c.suma(c1);
System.out.print("suma: ");
res.imprimir();
res=c.resta(c1);
System.out.print("resta: ");
res.imprimir();
res=c.mult(c1);
System.out.print("mult: ");
res.imprimir();
res=c.division(c1);
System.out.print("div: ");
res.imprimir();
res=c.conjugado();
System.out.print("conjugado1: ");
res.imprimir();
res=c1.conjugado();
System.out.print("conjugado2: ");
res.imprimir();
System.out.print("modulo 1: ");
res=c.mod(c1);
res.imprimir();
System.out.print("modulo 2: ");
res=c1.mod(c1);
res.imprimir();
}
}