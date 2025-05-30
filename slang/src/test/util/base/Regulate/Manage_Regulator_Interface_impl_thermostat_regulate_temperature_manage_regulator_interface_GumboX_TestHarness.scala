// #Sireum

package base.Regulate

import org.sireum._
import base._
import base.GumboXUtil.GumboXResult

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
@msig trait Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX_TestHarness extends Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_TestApi {
  def verbose: B

  /** Contract-based test harness for the initialise entry point
    */
  def testInitialiseCB(
      ): GumboXResult.Type = {

    if (verbose) {
      println(st"""Pre State Values:
                  """.render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testInitialise()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_displayed_temp: Isolette_Data_Model.Temp_impl = get_displayed_temp().get
    val api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = get_interface_failure().get
    val api_lower_desired_temp: Isolette_Data_Model.Temp_impl = get_lower_desired_temp().get
    val api_regulator_status: Isolette_Data_Model.Status.Type = get_regulator_status().get
    val api_upper_desired_temp: Isolette_Data_Model.Temp_impl = get_upper_desired_temp().get

    if (verbose) {
      println(st"""Post State Values:
                  |  api_displayed_temp = ${api_displayed_temp.string}
                  |  api_interface_failure = ${api_interface_failure.string}
                  |  api_lower_desired_temp = ${api_lower_desired_temp.string}
                  |  api_regulator_status = ${api_regulator_status.string}
                  |  api_upper_desired_temp = ${api_upper_desired_temp.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = base.Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX.inititialize_IEP_Post(api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }

  def testComputeCBJ(json: String): GumboXResult.Type = {
    base.JSON.toRegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container(json) match {
      case Either.Left(o) => return testComputeCBV(o)
      case Either.Right(msg) => halt(msg.string)
    }
  }

  def testComputeCBV(o: Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container): GumboXResult.Type = {
    return testComputeCB(o.api_current_tempWstatus, o.api_lower_desired_tempWstatus, o.api_regulator_mode, o.api_upper_desired_tempWstatus)
  }

  /** Contract-based test harness for the compute entry point
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    */
  def testComputeCB(
      api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_lower_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl,
      api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type,
      api_upper_desired_tempWstatus: Isolette_Data_Model.TempWstatus_impl): GumboXResult.Type = {

    // [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    //   manage_regulator_interface does not have incoming ports or state variables

    // [CheckPre]: check/filter based on pre-condition.
    val CEP_Pre_Result: B = base.Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX.compute_CEP_Pre (api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus)
    if (!CEP_Pre_Result) {
      return GumboXResult.Pre_Condition_Unsat
    }

    // [PutInPorts]: put values on the input ports
    put_current_tempWstatus(api_current_tempWstatus)
    put_lower_desired_tempWstatus(api_lower_desired_tempWstatus)
    put_regulator_mode(api_regulator_mode)
    put_upper_desired_tempWstatus(api_upper_desired_tempWstatus)

    if (verbose) {
      println(st"""Pre State Values:
                  |  api_current_tempWstatus = ${api_current_tempWstatus.string}
                  |  api_lower_desired_tempWstatus = ${api_lower_desired_tempWstatus.string}
                  |  api_regulator_mode = ${api_regulator_mode.string}
                  |  api_upper_desired_tempWstatus = ${api_upper_desired_tempWstatus.string}""".render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_displayed_temp: Isolette_Data_Model.Temp_impl = get_displayed_temp().get
    val api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = get_interface_failure().get
    val api_lower_desired_temp: Isolette_Data_Model.Temp_impl = get_lower_desired_temp().get
    val api_regulator_status: Isolette_Data_Model.Status.Type = get_regulator_status().get
    val api_upper_desired_temp: Isolette_Data_Model.Temp_impl = get_upper_desired_temp().get

    if (verbose) {
      println(st"""Post State Values:
                  |  api_displayed_temp = ${api_displayed_temp.string}
                  |  api_interface_failure = ${api_interface_failure.string}
                  |  api_lower_desired_temp = ${api_lower_desired_temp.string}
                  |  api_regulator_status = ${api_regulator_status.string}
                  |  api_upper_desired_temp = ${api_upper_desired_temp.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = base.Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX.compute_CEP_Post(api_current_tempWstatus, api_lower_desired_tempWstatus, api_regulator_mode, api_upper_desired_tempWstatus, api_displayed_temp, api_interface_failure, api_lower_desired_temp, api_regulator_status, api_upper_desired_temp)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }
}
