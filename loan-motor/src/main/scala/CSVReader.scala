package loanmotor.csvreader

import scala.io.Source

object CSVReader {
  def readClients(ruta: String): List[List[String]] = {
    import scala.util.Using

    Using(Source.fromFile(ruta)) { bufferedSource =>
      val lines = bufferedSource.getLines()
      val dataWithoutHeader = lines.drop(1)
      val parsedData = dataWithoutHeader.map(_.split(",").map(_.trim).toList)
      parsedData.toList
    }.get
  }
}
