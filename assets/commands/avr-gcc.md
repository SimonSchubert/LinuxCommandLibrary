# TLDR

**Compile C code** for an AVR microcontroller

```avr-gcc -mmcu=[atmega328p] -o [output.elf] [source.c]```

**Compile with optimization** for size

```avr-gcc -mmcu=[atmega328p] -Os -o [output.elf] [source.c]```

**Compile with debugging** symbols

```avr-gcc -mmcu=[atmega328p] -g -O0 -o [output.elf] [source.c]```

**Generate hex file** for flashing

```avr-gcc -mmcu=[atmega328p] -Os -o [output.elf] [source.c] && avr-objcopy -O ihex [output.elf] [output.hex]```

**Compile with warnings** and link relaxation

```avr-gcc -mmcu=[atmega328p] -Wall -Os -Wl,--relax -o [output.elf] [source.c]```

**Compile for freestanding** environment (no hosted library)

```avr-gcc -mmcu=[atmega328p] -ffreestanding -Os -o [output.elf] [source.c]```

# SYNOPSIS

**avr-gcc** [_options_] _file_...

# PARAMETERS

**-mmcu=**_mcu_
> Target MCU (atmega328p, attiny85, atmega2560, etc.); required for correct code generation

**-Os**
> Optimize for size (recommended for embedded)

**-O0**, **-O1**, **-O2**, **-O3**
> Optimization levels (0=none, 3=maximum)

**-g**
> Include debugging information

**-Wall**
> Enable all common warnings

**-ffreestanding**
> Assume freestanding environment (no standard library assumptions)

**-fno-jump-tables**
> Disable jump tables (required for bootloaders on >64KB devices)

**-mrelax**
> Enable linker relaxation to use shorter instructions when possible

**-Wl,--relax**
> Pass relaxation option to linker

**-Wl,-gc-sections**
> Remove unused code sections to reduce binary size

**-mcall-prologues**
> Use subroutines for function prologues/epilogues (saves space)

**-DF_CPU=**_freq_
> Define CPU frequency in Hz (e.g., -DF_CPU=16000000)

**-I**_path_
> Add include directory

**-L**_path_
> Add library search directory

**-l**_library_
> Link with library

# DESCRIPTION

**avr-gcc** is the GNU Compiler Collection configured for AVR 8-bit microcontrollers. It compiles C and C++ code into machine code for Atmel/Microchip AVR chips used in Arduino and embedded systems.

The **-mmcu** option is essential as it configures code generation, memory layout, and available instructions for the specific target MCU. Common targets include atmega328p (Arduino Uno), atmega2560 (Arduino Mega), and attiny85.

Output is typically an ELF file, which is converted to Intel HEX format using **avr-objcopy** for flashing to hardware via tools like **avrdude**.

The **-Os** optimization is preferred for embedded development as it minimizes code size while maintaining reasonable performance. The **-ffreestanding** flag is appropriate since AVR programs run without an operating system.

AVR-GCC is typically installed as part of the **avr-libc** toolchain, which includes the C library, header files, and additional tools.

# CAVEATS

The **-mmcu** option must match the target hardware exactly. Optimization level **-O3** often increases code size significantly on AVR. Programs should avoid heavy stack usage due to limited RAM. Integer math defaults to 16-bit; use explicit types for larger values.

# HISTORY

**AVR-GCC** emerged from the GCC project's support for the AVR architecture, initially developed by **Denis Chertykov** in the late **1990s**. Combined with **AVR-LibC**, it became the standard open-source toolchain for AVR development. The toolchain gained widespread adoption through the Arduino project starting in **2005**, making AVR programming accessible to hobbyists and educators.

# SEE ALSO

[gcc](/man/gcc)(1), [avr-objcopy](/man/avr-objcopy)(1), [avrdude](/man/avrdude)(1), [arduino-cli](/man/arduino-cli)(1)
