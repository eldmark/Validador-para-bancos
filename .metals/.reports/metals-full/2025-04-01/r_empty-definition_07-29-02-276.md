error id: `<none>`.
file:///C:/Users/marco/OneDrive/Escritorio/Tareas%20Universidad/Segundo%20año/Algoritmos%20y%20estructuras%20de%20datos/trabajos/java/Validador%20para%20bancos/loan-motor/src/main/scala/Rule.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 85
uri: file:///C:/Users/marco/OneDrive/Escritorio/Tareas%20Universidad/Segundo%20año/Algoritmos%20y%20estructuras%20de%20datos/trabajos/java/Validador%20para%20bancos/loan-motor/src/main/scala/Rule.scala
text:
```scala
package loan-motor.reglas;

sealed trait Regla
case class EdadMinima(edad: Int) ex@@tends Regla
case class HistorialLimpio(tiempo: Int) extends Regla
case class IngresosSuficientes(ingreso: Double) extends Regla
case class DeudaRazonable(deudaTotal: Double, ingreso: Double) extends Regla
case class PuntajeCredito(puntaje: Int) extends Regla
case class GarantiaActiva(tieneGarantia: Boolean) extends Regla

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.