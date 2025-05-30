package base.Monitor

import org.sireum._
import base.Monitor._

// This file will not be overwritten so is safe to edit
class Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Test extends Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_ScalaTest {

  test("Example Unit Test for Initialise Entry Point"){
    // Initialise Entry Point doesn't read input port values, so just proceed with
    // launching the entry point code
    testInitialise()
    // use get_XXX methods and check_concrete_output() from test/util/../YYY_TestApi
    // retrieve values from output ports and check against expected results
  }

  test("Example Unit Test for Compute Entry Point"){
    // use put_XXX methods from test/util/../YYY_TestApi to seed input ports with values
    testCompute()
    // use get_XXX methods and check_concrete_output() from test/util/../YYY_TestApi
    // retrieve values from output ports and check against expected results
  }
}
