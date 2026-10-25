# TAGLINE

ESP32-P4 alias of the esp32sim instruction-level emulator

# TLDR

**Build** the release binaries (same crate as **esp32sim**)

```cargo build --release```

Boot unmodified **ESP-IDF P4** firmware from the mask ROM

```esp32sim-p4 --flash-mb [2] --bootloader [p4-bootloader.bin] --ptable [p4-ptable.bin] --app [hello_world.bin] --max-seconds [27]```

Same run on the **main binary**

```esp32sim --chip p4 --boot rom --bootloader [p4-bootloader.bin] --ptable [p4-ptable.bin] --app [hello_world.bin] --max-seconds [27]```

Attach a **copy-on-write SD card** image

```esp32sim-p4 --sd [card.img] --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --max-seconds [10]```

Drive the high-speed **USB** port from a host script

```esp32sim-p4 --usb-host [host.txt] --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --max-seconds [20]```

Run an **ESP32-C6** co-processor for Wi-Fi (native builds only)

```esp32sim-p4 --bootloader [p4-bootloader.bin] --ptable [p4-ptable.bin] --app [wifi_station.bin] --coproc [c6:app=network_adapter.bin] --wifi [ssid=esp32sim,psk=esp32sim-pass] --max-seconds [6]```

# SYNOPSIS

**esp32sim-p4** [**--boot** **rom**|**app**] [**--bootloader** _file_] [**--ptable** _file_] [**--app** _file_] [**--elf** _file_]... [_options_]

**esp32sim-p4** is **esp32sim --chip p4**.

# PARAMETERS

Flags are the same as **esp32sim**, plus the P4-only flags below. Defaults that differ on this chip:

**--boot**
> Default **rom**.

**--console**
> Default **uart0**.

**--flash-mb**
> Default **16**.

**--sd** _image_, **--sd-rw** _image_
> SD card in the reference-board socket (CLK 43, CMD 44, D0–D3 39–42). The image size is rounded down to 512 KiB. **--sd** is copy-on-write (writes stay in memory). **--sd-rw** writes through to the file.

**--sd-prg-us** _n_, **--sd-serial** _hex_
> Programming time after a write or erase, in microseconds of emulated time (default **0**). CID serial defaults from the image size.

**--sd-timing**
> Commands and data take bus time at the slot's clock and width. Default is instant. With **--coproc**, the SDIO link is timed too.

**--usb-host** _file_
> High-speed USB-OTG host. Runs _file_ one command per line from power-up, then continues until **--max-seconds**. A line starting with `?` logs a failure and continues; any other failure stops the file.

**--coproc** _c6:key=value,..._
> ESP32-C6 on SDIO slot 1, lock-stepped with the P4. **app** is required. **--wifi** and **--net** then use the C6 radio. Native only; the browser build has no co-processor.

# DESCRIPTION

**esp32sim-p4** is a fourth alias binary from the **esp32sim** crate (`cli/src/bin/esp32sim-p4.rs`). It calls the same CLI with default chip **p4**: two RISC-V **RV32IMAFC** cores (hart id is the core index), silicon **rev before 3**, CLIC interrupts, and the P4 memory map. UART, USB, timers, GPIO, SPI flash, and the SDMMC host are modelled. The port is a draft. Boards in the table are console-only.

It boots the real P4 mask ROM, second-stage bootloader, and an unmodified application image built for rev before 3. An image built for rev 3 or later is refused. The ROM file searched like the other chips is:

```
esp32p4_rev0_rom.elf
```

That ELF is ECO0. IDF images for v1.x boards link against its jump table; the first console lines are ECO0's, not the board's.

Wi-Fi is not on the P4 die here. **--coproc** runs an ESP32-C6 slave (ESP-Hosted wiring: CLK 18, CMD 19, D0–D3 14–17, EN on GPIO 54) in the same process. Both consoles share stdout in slice order; the C6 lines are prefixed with `[c6] `. **--max-seconds** rounds up to a whole slice. **--max-insns** does not apply to that co-sim.

**--usb-host** speaks the firmware's USB device from a text script: attach, mass-storage reads and writes, FAT files, UART injection, and fault injection. What each command did is logged on stderr as `[usb-host]`.

# CAVEATS

Upstream calls the P4 port a draft. There is no published ROM for the ECO2 silicon on v1.x boards. Camera, PSRAM, and S3 board models are not this chip's. Approximate timing flags require **--chip s3**. **--ble full** is C3-only. **--cooja** is C6-only. **--coproc** is absent from the browser build.

See **esp32sim** for the shared flag list, ROM search path, and virtual network.

# SEE ALSO

[esp32sim](/man/esp32sim)(1), [esp32sim-c3](/man/esp32sim-c3)(1), [esp32sim-c6](/man/esp32sim-c6)(1), [esptool](/man/esptool)(1), [qemu-system-riscv64](/man/qemu-system-riscv64)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/mikroverk/esp32sim)```

```[Homepage](https://mikroverk.github.io/esp32sim/)```

```[Documentation](https://github.com/mikroverk/esp32sim/blob/main/docs/cli.md)```

<!-- verified: 2026-10-25 -->
