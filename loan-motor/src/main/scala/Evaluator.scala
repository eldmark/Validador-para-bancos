package loanmotor.evaluador;
import loanmotor.rules._
object Evaluator {
  /**
   * Evalúa una lista de reglas para determinar si se aprueba un préstamo.
   *
   * @param reglas Una lista de reglas que representan los criterios de evaluación.
   * @return true si todas las reglas son válidas o si existe una garantía activa; false en caso contrario.
  */
   def evaluarReglas(reglas: List[Rule]): Boolean = {
    val resultado = reglas.map {
      case MinimumAge(edad)           => edad >= 21
      case CleanHistory(tiempo)       => tiempo >= 5
      case SufficientIncome(ingreso)  => ingreso >= 1500.0
      case ReasonableDebt(deudaTotal, ingreso) => (deudaTotal / ingreso) <= 0.4
      case CreditScore(puntaje)       => puntaje > 700
      case ActiveCollateral(tieneGarantia) => tieneGarantia
    }
    
    if (resultado.forall(_ == true)) true
    else reglas.exists {
      case ActiveCollateral(tieneGarantia) => tieneGarantia
      case _ => false
    }
   }

  }