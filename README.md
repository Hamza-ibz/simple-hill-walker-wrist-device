# Simple-Hill-Walker-Wrist-Device

<img width="709" alt="Screenshot 2022-11-11 at 17 43 51" src="https://user-images.githubusercontent.com/93152488/201398874-40815e75-6952-4f67-af83-ee88f8c513a8.png">

The device only has two buttons: one for ‘mode’, and one for ‘set’. The FSM essentially represents the set of states that the device can be in, with 
transitions resulting from events and actions produced by one of the two buttons being pressed. Note that when the device is in ‘altimeter’ mode,
pressing the ‘set’ button has no effect and the device remains in altimeter mode (this is sometimes referred to as a null transition).
As part of this program, I design and implement (as a minimum) a Java class that represents the wrist device. User interaction IS text-based at the NetBeans console.For this 
simulation, the User interaction must support all state transition depicted in Figure 5 and allow the User to exit the program. For the purposes of this
task you can assume the altimeter mode is fixed at value 1500 (metres).
