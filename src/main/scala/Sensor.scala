case class Sensor(val id: String, val location: String, val validRange: OperatingRange):
  override def toString(): String =
    s"Id: $id, Location: $location"

object Sensor:
  private var _sensorCount = 0
  def apply(id: String, location: String, validRange: OperatingRange) =
    _sensorCount += 1
    new Sensor(id, location, validRange)

  def sensorCount = _sensorCount

  def resetSensorCount() =
    _sensorCount = 0