# TAGLINE

ESP32-C6 alias of the esp32sim instruction-level emulator

# TLDR

**Build** the release binaries (same crate as **esp32sim**)

```cargo build --release```

Boot unmodified **ESP-IDF C6** firmware from the mask ROM

```esp32sim-c6 --boot rom --flash-mb [4] --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [hello_world.bin] --elf [hello_world.elf] --max-seconds [26]```

Same run on the **main binary**

```esp32sim --chip c6 --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --max-seconds [26]```

Run the **Waveshare C6 LCD** board

```esp32sim-c6 --board waveshare-c6-lcd147 --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --max-seconds [10]```

Speak **Cooja-NG** lock-step on stdin/stdout (802.15.4 mote)

```esp32sim-c6 --cooja --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin]```

# SYNOPSIS

**esp32sim-c6** [**--boot** **rom**|**app**] [**--bootloader** _file_] [**--ptable** _file_] [**--app** _file_] [**--elf** _file_]... [_options_]

**esp32sim-c6** is **esp32sim --chip c6**.

# PARAMETERS

Flags are the same as **esp32sim**. Defaults that differ on this chip:

**--boot**
> Default **rom** (single-core SoC).

**--console**
> Default **uart0**.

**--flash-mb**
> Default **4**.

**--board**
> **none** (bare module; the S3 default **atech14** is remapped to this) or **waveshare-c6-lcd147** (ST7789 172×320 over SPI+DMA, WS2812).

**--cooja**
> Run as a Cooja-NG external mote: NDJSON on stdin/stdout, guest console as `log` events, 802.15.4 frames as `tx`/`rx`. C6 only. Use **--max-seconds**, not **--max-insns**. Related: **--cooja-slice-us** (default **100**), **--cooja-rx-timing** **start**|**end**, **--cooja-verbose**.

Refused on C6: **--cam-image**, **--cam-stream**, **--cam-size**, **--psram-mb**, **--efuse-regs**, **--regs-init**, **--regstat**. **--ble full** requires C3.

# DESCRIPTION

**esp32sim-c6** is a third binary from the **esp32sim** crate (`cli/src/bin/esp32sim-c6.rs`). It calls the same CLI with default chip **c6**: a single RISC-V **RV32IMAC** core at 160 MHz, the C6 unified memory map and MMU, interrupt matrix with PLIC/INTPRI, L1 cache, PCR, low-power blocks, and 802.15.4 plus Wi-Fi MAC stand-ins. UART, USB-Serial/JTAG, timers, GPIO, SPI flash, GDMA, and crypto models are shared with the S3.

It boots the real C6 mask ROM, second-stage bootloader, and an unmodified application image. The interpreter has no block cache or JIT yet. Wi-Fi uses the same virtual AP as the other chips (**--wifi**, **--net**). **--ble** on C6 uses the native NimBLE transport and is gated to ESP-IDF **5.5.x**; the board image then needs **--flash-mb 8**.

**--cooja** replaces the normal run loop with csim's lock-step protocol so the emulated C6 can sit on a simulated 802.15.4 medium.

# CAVEATS

Upstream calls the C6 port a draft. Camera, PSRAM, and S3 board models are absent. Approximate timing flags require **--chip s3**. **--ble full** is C3-only. See **esp32sim** for the full flag list, ROM search path, and virtual network.

# SEE ALSO

[esp32sim](/man/esp32sim)(1), [esp32sim-c3](/man/esp32sim-c3)(1), [esp32sim-p4](/man/esp32sim-p4)(1), [esptool](/man/esptool)(1), [qemu-system-riscv64](/man/qemu-system-riscv64)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/mikroverk/esp32sim)```

```[Homepage](https://mikroverk.github.io/esp32sim/)```

```[Documentation](https://github.com/mikroverk/esp32sim/blob/main/docs/cli.md)```

<!-- verified: 2026-10-18 -->
