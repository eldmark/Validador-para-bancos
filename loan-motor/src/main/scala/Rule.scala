package loanmotor.rules;

sealed trait Rule
case class MinimumAge(edad: Int) extends Rule
case class CleanHistory(tiempo: Int) extends Rule
case class SufficientIncome(ingreso: Double) extends Rule
case class ReasonableDebt(deudaTotal: Double, ingreso: Double) extends Rule
case class CreditScore(puntaje: Int) extends Rule
case class ActiveCollateral(tieneGarantia: Boolean) extends Rule
