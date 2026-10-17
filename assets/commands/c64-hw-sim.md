# TAGLINE

Pin-level simulator of the Commodore 64 ASSY 250407 motherboard

# TLDR

**Build** the simulator (Linux needs X11 and OpenGL)

```make```

Open the **board, monitor, control panel, and oscilloscope**

```c64-hw-sim```

Load a **.prg** after BASIC is ready

```c64-hw-sim [program.prg]```

Run **headless** for four seconds, print the on-screen text, and save the monitor picture

```c64-hw-sim --headless [200] --text --shot [out.png] --fault [U17:removed]```

**Break a pin while the machine is running**, then repair everything

```c64-hw-sim --headless [300] --text --at [150:U6.17:open] --at [300:repair]```

List **nets where outputs fought**

```c64-hw-sim --headless [200] --nets```

Type BASIC after boot (RETURN is a newline in the string)

```C64HW_TYPE=$'PRINT 1+1\n' c64-hw-sim --headless [200] --text```

# SYNOPSIS

**c64-hw-sim** [_program.prg_] [_options_]

**c64-hw-sim** **--headless** _FRAMES_ [**--shot** _file.png_] [**--text**] [**--fault** _SPEC_]... [_program.prg_]

# PARAMETERS

_program.prg_
> Optional Commodore 64 program. In graphical mode the control panel loads it. In headless mode it is written into DRAM at frame 150 (about 3 s), as a freezer cartridge would.

**--headless** _FRAMES_
> Run without a window for this many video frames (50 per second on a PAL C64), then exit. Prints emulated versus wall time and the CPU registers.

**--shot** _file.png_
> In headless mode, save the monitor picture (what the VIC produced), not the whole window.

**--text**
> In headless mode, print the text read from the monitor picture by matching 8×8 cells against the character ROM. Unrecognised cells become `?`. This looks at pixels, not screen memory.

**--fault** _SPEC_
> Apply a fault at power-on. Repeatable. Forms are _REF:what_ or _REF.PIN:what_. Examples: `U17:removed`, `U21.14:gnd`, `U12.14:vcc`, `U9.2:open`, `R51:open`, `RP4:short`.

**--fault-after** _N_
> In headless mode, apply the **--fault** list after _N_ frames instead of at power-on.

**--at** _N:SPEC_
> Apply one fault at frame _N_. _SPEC_ `repair` clears every fault. Repeatable. Works in graphical and headless runs.

**--nets**
> After a headless run, print nets that spent time in contention and which pins drove them.

**--screenshot** _file.png_
> In graphical mode, save the whole window after **--frames** frames (default 60) and quit.

**--record** _N:DIR_
> In graphical mode, from emulated frame _N_, save the window every 4 emulated frames (12.5 per second) as `DIR/00000.png` and so on, **--frames** times (default 60), then quit.

**--frames** _N_
> Frame count for **--screenshot** and **--record**. Default **60**.

# DESCRIPTION

**c64-hw-sim** simulates the Commodore 64 ASSY 250407 motherboard pin by pin. It knows the PCB netlist and how each chip behaves at its pins. It does not encode repair lore: a lifted pin, a short to ground or +5 V, a pulled chip, or an open resistor produces whatever the circuit computes, including a garbage picture.

The graphical window shows the board, the monitor, a control panel, and an oscilloscope. Chips are boxes named by role: **RAM1**–**RAM8** are the 4164 DRAMs (each holds one bit of every byte), **VRAM** is the 2114 colour RAM, **BASIC**, **KERNAL**, and **CHAR** are the ROMs, and **PLA** is the address decoder. Pin colours follow a logic probe: red high, blue low, yellow pulsing, gray floating, magenta when two outputs fight.

Click a pin to probe it and to break it (floating, shorted to GND, or shorted to +5 V). Click a chip to pull it out. Click a resistor, ferrite bead, or the crystal to open it. The control panel lists faults with a repair button and can load `.prg` files straight into the DRAM chips, so loading still works on a broken board.

Type on the host keyboard as on a C64. **Esc** is RUN/STOP, **PgUp** is RESTORE, **Tab** is CTRL, and left **Alt** is C=.

The 6510, VIC-II, CIAs, and SID are cycle-accurate cores from Andre Weissflog's (floooh) **chips**. Glue logic, ROMs, DRAMs, colour RAM, and the PLA (real 82S100 equations) are modelled at their pins. The board netlist comes from bwack's C64-250407-Replica-KiCad via `tools/kicad2c.py`. Each half cycle settles the whole board in three steps: row address, **/RAS** falling, **/CAS** falling.

Build with **make**. On Linux the binary links **X11**, **Xi**, **Xcursor**, and **OpenGL** (`-lX11 -lXi -lXcursor -lGL`). On macOS it uses Cocoa, QuartzCore, and OpenGL. The graphics library is **sokol**; the interface library is **nuklear**.

# CONFIGURATION

**C64HW_TYPE**
> Text typed after boot in headless mode. A newline is RETURN. Letters are shifted to uppercase. Typing starts at frame 160, one character every 4 frames.

**C64HW_CHECK**
> Set to **1** to check every KERNAL read and every VIC fetch against the ideal memory map. After a headless run the self-check error count is printed.

# CAVEATS

This is a hardware simulator, not a game emulator. Even on fast machines a real C64 runs at a fraction of wall-clock speed (the README quotes about 31% on an Apple M3 Max, 39% on an AMD Ryzen AI Max+ PRO 495, 48% on an Apple M5 Max) because every pin of every chip is simulated.

The floating-bus and power-fault numbers (thresholds, drift times, crosstalk) are guesses in `src/sim.c`. These analog parts are not simulated: the video output chain, the SID filter, the power supply, and the dot clock PLL. Faults inside a chip (bad DRAM cells, slow parts) and bridges between two nets are not implemented.

A matching on-screen symptom is a clue for repair, not a proof: different faults can look the same.

# HISTORY

Written by **Salvatore Sanfilippo** (antirez). The idea came from observing floooh's pin-level 6502, VIC-II, CIA, and SID cores; those cores are taken from **c64-llm**. The board comes from **bwack**'s C64-250407-Replica-KiCad. The PLA equations come from the 82S100 read-out by Mark Smith and Marko Mäkelä.

# SEE ALSO

[make](/man/make)(1), [gcc](/man/gcc)(1), [cc](/man/cc)(1)

# RESOURCES

```[Source code](https://github.com/antirez/c64-hw-simulator)```

<!-- verified: 2026-10-18 -->
