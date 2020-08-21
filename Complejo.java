import java.util.Scanner;
import java.util.InputMismatchException;

public class Complejo {
  private float real;
  private float imag;
  
  public Complejo suma(Complejo c1){
  Complejo res=new Complejo();
  res.real=this.real+c1.real;
  res.imag=this.imag+c1.imag;
  return res;
  }
  public Complejo resta(Complejo c1){
  Complejo res=new Complejo();
  res.real=this.real-c1.real;
  res.imag=this.imag-c1.imag;
  return res; 
  }
  public Complejo mult(Complejo c1){
  Complejo res=new Complejo();
  res.real=(this.real*c1.real)-(this.imag*c1.imag);
  res.imag=(this.real*c1.imag)+(this.imag*c1.real);
  return res;
  }

  public Complejo conjugado(){
  Complejo res=new Complejo();
  res.real=this.real;
  res.imag=this.imag*-1;
  return res;
  }

  public Complejo division(Complejo c1){
    Complejo num,den,res=new Complejo();
    num=this.mult(c1.conjugado());
    den=c1.mult(c1.conjugado());
    res.real=num.real/den.real;
    res.imag=num.imag/den.real;
  return res;
  } 
  public Complejo mod(Complejo c1){
    Complejo res=new Complejo();
    res.real=(float)Math.sqrt(this.real*this.real +       this.imag*this.imag);
  return res;
  }
  public void setReal(float real){
    this.real=real;
  }

  public float getReal(){
    return this.real;
  }
 public void leer(){
    System.out.print("ingrese los dos numeros separados por un espacio: ");
    Scanner s=new Scanner(System.in);
    try
    {
      Complejo c=new Complejo();
      this.real=s.nextFloat();
      this.imag=s.nextFloat();
    }
    catch(InputMismatchException ex)
    {
      System.out.println("\n(No es un numero, por defecto se asigo un 1 ");
      this.real=1;
      this.imag=1;
    }
  }
  public void imprimir(){
    if(real==0){
      if(imag==0){
        System.out.println(0);
    }else{
     System.out.println(imag+"i");
    }
  }else if(imag==0){
    System.out.println(real);
  }else if(imag<0){
    System.out.println(real+""+imag+"i");
  }else{
   System.out.println(real+"+"+imag+"i");
    }
  }
}
