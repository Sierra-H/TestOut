// #Sireum

package base.Monitor

import org.sireum._
import base._

// This file will not be overwritten so is safe to edit
object Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure {

  def initialise(api: Detect_Monitor_Failure_impl_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_internal_failure(Isolette_Data_Model.Failure_Flag_impl.example())
  }

  def timeTriggered(api: Detect_Monitor_Failure_impl_Operational_Api): Unit = {
    // example api usage


  }

  def finalise(api: Detect_Monitor_Failure_impl_Operational_Api): Unit = { }
}
