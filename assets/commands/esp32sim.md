# TAGLINE

Instruction-level emulator for ESP32, ESP32-S3, ESP32-C3, and ESP32-C6 firmware

# TLDR

**Build** the release binaries

```cargo build --release```

Boot an **ESP-IDF ESP32-S3** image from the mask ROM through the bootloader

```esp32sim --board none --boot rom --console uart0 --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [hello_world.bin] --elf [hello_world.elf] --max-seconds [26]```

Skip ROM and jump straight to the **app image**

```esp32sim --boot app --app [firmware.bin] --max-seconds [5]```

Pick another SoC on this binary (**esp32sim-c3** / **esp32sim-c6** are aliases)

```esp32sim --chip [c3] --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --max-seconds [26]```

Attach a **virtual WPA2 access point** with NAT onto the host network

```esp32sim --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --wifi [ssid=demo,chan=6,psk=demo-password] --max-seconds [10]```

Serve the **browser board UI**

```esp32sim --boot rom --bootloader [bootloader.bin] --ptable [partition-table.bin] --app [app.bin] --web [8080]```

# SYNOPSIS

**esp32sim** [**--chip** **esp32**|**s3**|**c3**|**c6**] [**--boot** **rom**|**app**] [**--bootloader** _file_] [**--ptable** _file_] [**--app** _file_] [**--elf** _file_]... [_options_]

**esp32sim** **-h** | **--help**

# PARAMETERS

**--chip** _name_
> SoC: **esp32** (classic dual LX6), **s3** / **esp32s3** (default), **c3** / **esp32c3**, **c6** / **esp32c6**. **esp32sim-c3** and **esp32sim-c6** are the same CLI with a different default.

**--boot** **rom**|**app**
> **rom** starts at the mask ROM reset vector (real boot chain). **app** loads the app image segments and jumps to its entry. Default **app** on dual-core chips (S3, classic ESP32), **rom** on single-core chips (C3, C6).

**--bootloader** _file_, **--ptable** _file_, **--app** _file_
> Written to flash at **0x0**, **0x8000**, and **0x10000**.

**--flash-image** _file_
> Whole flash dump written at offset 0.

**--flash-at** _OFFSET=FILE_
> Write a file into flash at a hex offset. Repeatable.

**--rom** _file_
> Mask ROM ELF. Default: `$ESP32SIM_ROM_DIR/<name>`, then the newest `~/.espressif/tools/esp-rom-elfs/*/<name>` (ESP-IDF). Required for **--boot rom**.

**--elf** _file_
> Symbols for logs, profiles, stubs, and **--ble**. Repeatable (app ELF, bootloader ELF).

**--board** _name_
> Board model. S3 (default **atech14**): **atech14**, **waveshare-cam**, **waveshare-lcd4b**, **waveshare-amoled18-v2**, **none**. C6: **waveshare-c6-lcd147** or **none**. Classic ESP32: **ttgo-tdisplay** (alias **tdisplay**), **esp32dev-loopback**, **none** / **esp32dev**. C3 is console only (**none**).

**--flash-mb** _N_, **--psram-mb** _N_
> Flash size in MiB (JEDEC capacity follows it) and octal PSRAM size. S3 defaults **8** / **2**. C3, C6, and classic ESP32 default flash **4**. PSRAM flags are S3-only.

**--console** **usb**|**uart0**|**both**|**all**|**none**
> Which consoles to print. Default **both** on dual-core chips, **uart0** on C3/C6.

**--max-seconds** _S_
> Stop after this much emulated time, including reboots. Prefer this over **--max-insns**.

**--wifi** _SPEC_
> Virtual access point plus a virtual network (DHCP/ARP/ICMP/DNS/SNTP; station **10.0.2.15**, gateway **10.0.2.2**). Example: `ssid=demo,chan=6,psk=demo-password`. Open and WPA2-PSK.

**--net** **nat**|**none**
> What the virtual network does with traffic it is not answering. Default **nat** (alias **user**): TCP/UDP to the host through ordinary sockets.

**--web** _PORT_
> Browser UI on `http://127.0.0.1:PORT/` (implies real time). **--web-dir** _DIR_ selects the static files.

**--no-reboot**
> Stop at the first chip reset instead of rebooting from ROM.

**--mac** _xx:xx:xx:xx:xx:xx_
> Station MAC the eFuses report.

**--script** _file_
> Host actions at emulated times (button presses, UART input, touch, ADC, BLE). See the CLI docs.

**-h**, **--help**
> Print usage and exit 2.

# DESCRIPTION

**esp32sim** runs unmodified ESP32 firmware in an instruction-level emulator: the real mask ROM, the real second-stage bootloader, and an unmodified application image. One CLI covers four SoCs. **esp32sim** defaults to the **ESP32-S3** (dual Xtensa LX7). **--chip esp32** selects the classic dual LX6 ESP32. **esp32sim-c3** and **esp32sim-c6** are alias binaries for **--chip c3** and **--chip c6** (RISC-V).

The S3 model is the most complete: GPIO, UART, USB-Serial/JTAG, timers, SPI flash/PSRAM, SHA/AES/RSA, GDMA, I2S, LCD_CAM, RMT, I2C, a virtual Wi-Fi access point, and several boards with displays, cameras, and WS2812. On AArch64 hosts, basic blocks compile to native code by default (**--no-jit** keeps the interpreter, which must match). C3 and C6 reuse the shared peripheral models with their own memory maps; they are documented as draft relative to the S3.

`--boot rom` needs the chip's mask ROM ELF (shipped with ESP-IDF as `esp32s3_rev0_rom.elf` and friends, or fetched into `web/wasm/fw/`). Chip resets restart from the ROM with the right reset cause unless **--no-reboot**. `--boot app` maps the app and jumps to its entry; a firmware-requested reset ends that run because there is no ROM.

A browser demo of the same machines lives at the project homepage. The CLI also has **--web** for a local board UI with console, audio, and camera.

# CONFIGURATION

**ESP32SIM_ROM_DIR**
> Directory of mask ROM ELF files. Checked before `~/.espressif/tools/esp-rom-elfs/`.

**ESP_EMU_DEBUG**
> Comma-separated debug areas, same as repeating **--debug** (for example `wifi,spi,net`). Older names such as `ESP_EMU_DEBUG_SPI` still work as aliases.

**ESP32SIM_CACHE_FILL**, **ESP32SIM_CACHE_WRITEBACK**
> Cycle counts for **--approximate-cache** (S3 only).

# CAVEATS

Not a cycle-accurate RTL sim. Approximate timing (**--approximate-timing**, **--approximate-memory**, **--approximate-cache**) is S3-only, requires **--boot rom** for the memory model, and is unvalidated. C3 and C6 still use a plain interpreter. **--ble** substitutes controller/VHCI symbols and needs an unstripped application ELF; C6 BLE is gated to ESP-IDF **5.5.x**. **--ble full** is C3-only and exclusive with **--ble**. **--cooja** is C6-only.

The S3 default board is **atech14**. On C6 and classic ESP32 that name is treated as a bare module (**none**). Camera, PSRAM, and register-preset flags are refused on chips that have nothing behind them.

# SEE ALSO

[esp32sim-c3](/man/esp32sim-c3)(1), [esp32sim-c6](/man/esp32sim-c6)(1), [esptool](/man/esptool)(1), [cargo](/man/cargo)(1), [qemu-system-riscv64](/man/qemu-system-riscv64)(1), [platformio](/man/platformio)(1)

# RESOURCES

```[Source code](https://github.com/mikroverk/esp32sim)```

```[Homepage](https://mikroverk.github.io/esp32sim/)```

```[Documentation](https://github.com/mikroverk/esp32sim/blob/main/docs/cli.md)```

<!-- verified: 2026-10-18 -->
