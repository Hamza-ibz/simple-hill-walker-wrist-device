# Simple-Hill-Walker-Wrist-Device

The device only has two buttons: one for ‘mode’, and one for ‘set’. The FSM essentially represents the set of states that the device can be in, with 
transitions resulting from events and actions produced by one of the two buttons being pressed. Note that when the device is in ‘altimeter’ mode,
pressing the ‘set’ button has no effect and the device remains in altimeter mode (this is sometimes referred to as a null transition).
As part of this program, I design and implement (as a minimum) a Java class that represents the wrist device. User interaction IS text-based at the NetBeans console.For this 
simulation, the User interaction must support all state transition depicted in Figure 5 and allow the User to exit the program. For the purposes of this
task you can assume the altimeter mode is fixed at value 1500 (metres).
