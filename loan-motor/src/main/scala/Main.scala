package loanmotor
import loanmotor.rules._;
import loanmotor.csvreader._;
import scala.io.StdIn
import loanmotor.evaluador._;
import scala.util.{Try, Success, Failure}

object Main extends App {
  val clientes = CSVReader.readClients("./data/clientes.csv")

  clientes.foreach { cliente =>
    val nombre         = cliente(0)
    val edad          = cliente(1).toInt
    val historial     = cliente(2).toInt
    val ingreso       = cliente(3).toDouble
    val deudaTotal    = cliente(4).toDouble
    val puntaje       = cliente(5).toInt
    val tieneGarantia = cliente(6).toBoolean

    val reglasCliente = List(
      MinimumAge(edad),
      CleanHistory(historial),
      SufficientIncome(ingreso),
      ReasonableDebt(deudaTotal, ingreso),
      CreditScore(puntaje),
      ActiveCollateral(tieneGarantia)
    )

    val aprobado = Evaluator.evaluarReglas(reglasCliente)
    println(s"Cliente: $nombre - Aprobado: $aprobado")
  }
}
