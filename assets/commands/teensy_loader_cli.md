# TAGLINE

Command-line Teensy microcontroller firmware loader

# TLDR

**Program** a Teensy 3.2/3.1 hex file (wait for button)

```teensy_loader_cli --mcu=mk20dx256 -w [blink.hex]```

**Program** using a board name alias

```teensy_loader_cli --mcu=TEENSY32 -w [firmware.hex]```

**Program Teensy 4.0**

```teensy_loader_cli --mcu=TEENSY40 -w [firmware.hex]```

**Soft reboot** then program (Linux)

```teensy_loader_cli --mcu=TEENSY32 -s -w [firmware.hex]```

**Program without rebooting** into application

```teensy_loader_cli --mcu=TEENSY32 -n -w [firmware.hex]```

**Verbose** programming

```teensy_loader_cli --mcu=TEENSY32 -v -w [firmware.hex]```

# SYNOPSIS

**teensy_loader_cli** **--mcu=**_MCU_ [**-w**] [**-r**] [**-s**] [**-n**] [**-v**] *file.hex*

# DESCRIPTION

**teensy_loader_cli** is the command-line Teensy Loader from PJRC for automating firmware uploads (typically from a Makefile). Most interactive users prefer the graphical loader in Automatic Mode; this CLI is for advanced/CI workflows.

You must specify the target MCU with **--mcu=**. Values match gcc-style chip names or logical board names such as **TEENSY32**, **TEENSY40**, **TEENSY41**, **TEENSYLC**, and others listed in the project README.

On Linux, non-root access usually needs the Teensy udev rules from https://www.pjrc.com/teensy/00-teensy.rules. Building from source requires **gcc** and often **libusb** development packages (**libusb-dev** on Debian/Ubuntu).

# PARAMETERS

**--mcu=**_MCU_

> Required. Target processor or board alias (for example **mk20dx256**, **TEENSY32**, **TEENSY40**, **imxrt1062**, **mkl26z64**, **atmega32u4**).

**-w**

> Wait for the device to appear (HalfKay / button press). Hex is read before waiting and again after detect.

**-r**

> Hard reboot via a second Teensy running rebootor code (pin C7 to reset). Enables fully unattended programming.

**-s**

> Soft reboot request on Linux: finds a Teensy running Teensyduino USB Serial and asks it to reboot into the bootloader.

**-n**

> Do not reboot into the application after programming; leave HalfKay running.

**-v**

> Verbose status output.

*file.hex*

> Intel HEX firmware image to program.

# CAVEATS

Programming a HEX built for the wrong chip can hang USB PLL init and confuse the host USB port; recovery may need holding the reset button before connecting USB. Use matching udev rules. Graphical loader is easier for one-off flashing.

# SEE ALSO

[avrdude](/man/avrdude)(1), [dfu-util](/man/dfu-util)(1), [openocd](/man/openocd)(1)

# RESOURCES

```[Source code](https://github.com/PaulStoffregen/teensy_loader_cli)```

```[Homepage](https://www.pjrc.com/teensy/loader_cli.html)```

<!-- verified: 2026-07-19 -->
