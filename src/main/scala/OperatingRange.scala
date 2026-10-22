case class OperatingRange(val min: Double, val max: Double):
  override def toString(): String =
    s"[$min, $max]"

  def validateReading(reading: Reading): Boolean =
    reading.value < min || reading.value > max
