# TAGLINE

ESP32-C3 alias of the esp32sim instruction-level emulator

# TLDR

**Build** the release binaries (same crate as **esp32sim**)

```cargo build --release```

Boot unmodified **ESP-IDF C3** firmware from the mask ROM

```esp32sim-c3 --boot rom --flash-mb [4] --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [hello_world.bin] --elf [hello_world.elf] --max-seconds [26]```

Same run on the **main binary**

```esp32sim --chip c3 --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --max-seconds [26]```

Print **RISC-V** disassembly at exit

```esp32sim-c3 --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --elf [app.elf] --disasm [0x42000000,16] --max-seconds [2]```

Enable the experimental **register-level BLE** controller

```esp32sim-c3 --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --ble full --ble-observe --max-seconds [5]```

# SYNOPSIS

**esp32sim-c3** [**--boot** **rom**|**app**] [**--bootloader** _file_] [**--ptable** _file_] [**--app** _file_] [**--elf** _file_]... [_options_]

**esp32sim-c3** is **esp32sim --chip c3**.

# PARAMETERS

Flags are the same as **esp32sim**. Defaults that differ on this chip:

**--boot**
> Default **rom** (single-core SoC).

**--console**
> Default **uart0**.

**--flash-mb**
> Default **4**.

**--ble full**
> Experimental C3 link-controller model (advertising on channels 37–39, optional **--ble-scan** / **--ble-observe**). Exclusive with **--ble**. Only this chip accepts **--ble full**.

Refused on C3: **--board** other than **atech14**/**none**, **--cam-image**, **--cam-stream**, **--cam-size**, **--psram-mb**, **--efuse-regs**, **--regs-init**, **--regstat**. There is no display board; output is the console.

# DESCRIPTION

**esp32sim-c3** is a second binary from the **esp32sim** crate (`cli/src/bin/esp32sim-c3.rs`). It calls the same CLI with default chip **c3**: a single RISC-V **RV32IMC** core at 160 MHz, the C3 memory map, interrupt matrix, and cache controller, and the UART, USB-Serial/JTAG, systimer, timer groups, GPIO, SPI flash, GDMA, and SHA/AES/RSA models shared with the S3.

It boots the real C3 mask ROM, second-stage bootloader, and an unmodified application image. The interpreter has no block cache or JIT yet. **--trace**, **--break**, **--watch**, **--peek**, **--disasm**, and **--log-periph** print RISC-V mnemonics with symbols when **--elf** is given.

Wi-Fi station mode uses the same virtual AP as the other chips (**--wifi**, **--net**). HCI-style **--ble** still needs the application ELF; **--ble full** runs the guest controller without those hooks.

# CAVEATS

Upstream calls the C3 port a draft. Camera, PSRAM, and S3 board models are absent. Approximate timing flags require **--chip s3**. See **esp32sim** for the full flag list, ROM search path, and virtual network.

# SEE ALSO

[esp32sim](/man/esp32sim)(1), [esp32sim-c6](/man/esp32sim-c6)(1), [esptool](/man/esptool)(1), [qemu-system-riscv64](/man/qemu-system-riscv64)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/mikroverk/esp32sim)```

```[Homepage](https://mikroverk.github.io/esp32sim/)```

```[Documentation](https://github.com/mikroverk/esp32sim/blob/main/docs/cli.md)```

<!-- verified: 2026-10-18 -->
