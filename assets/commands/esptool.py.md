# TAGLINE

ESP8266 and ESP32 series flashing tool

# TLDR

**Flash firmware to** ESP board

```esptool.py --port [/dev/ttyUSB0] write_flash 0x0 [firmware.bin]```

**Read chip info** and MAC address

```esptool.py --port [/dev/ttyUSB0] chip_id```

**Erase entire** flash

```esptool.py --port [/dev/ttyUSB0] erase_flash```

**Read flash to** file

```esptool.py --port [/dev/ttyUSB0] read_flash 0x0 0x100000 [backup.bin]```

**Identify the SPI** flash chip

```esptool.py --port [/dev/ttyUSB0] flash_id```

**Set baud rate** for faster flashing

```esptool.py --port [/dev/ttyUSB0] --baud [921600] write_flash 0x0 [firmware.bin]```

**Read the MAC** address

```esptool.py --port [/dev/ttyUSB0] read_mac```

**Flash using** the esptool v5 command names

```esptool --port [/dev/ttyUSB0] write-flash 0x0 [firmware.bin]```

**Verify flash** against a file

```esptool.py --port [/dev/ttyUSB0] verify_flash 0x0 [firmware.bin]```

# SYNOPSIS

**esptool.py** [_options_] _command_ [_args_]

# PARAMETERS

_COMMAND_
> Operation: write_flash, read_flash, erase_flash, chip_id, flash_id, read_mac, etc. Since v5 the names use hyphens (write-flash).

**-p**, **--port** _PORT_
> Serial port device (e.g., /dev/ttyUSB0, COM3). Also settable with **ESPTOOL_PORT**. If omitted, connected ports are tried in turn.

**-b**, **--baud** _RATE_
> Serial baud rate used when flashing and reading (default: 115200). Also settable with **ESPTOOL_BAUD**.

**-c**, **--chip** _CHIP_
> Target chip type (auto, esp8266, esp32, esp32s2, esp32s3, esp32c3, etc.). Also settable with **ESPTOOL_CHIP**.

**--before** _ACTION_
> Action before connecting: default-reset (default), usb-reset, no-reset, no-reset-no-sync. Versions before v5 use underscores (default_reset).

**-a**, **--after** _ACTION_
> Action after operation: hard-reset (default), soft-reset, no-reset, no-reset-stub, watchdog-reset. Versions before v5 use underscores (hard_reset).

**--connect-attempts** _N_
> Number of connection attempts, 0 or negative for infinite.

**-t**, **--trace**
> Enable trace-level output of esptool interactions.

**-v**, **--verbose**
> Print all output, without collapsing output stages (v5).

**-s**, **--silent**
> Silence all output except errors (v5).

**--no-stub**
> Disable stub loader; communicate directly with ROM bootloader.

**write_flash** _ADDR_ _FILE_ [_ADDR_ _FILE_ ...]
> Write one or more binaries to flash at specified addresses.

**-e**, **--erase-all**
> Erase all flash before writing (write_flash).

**-z**, **--compress** / **-u**, **--no-compress**
> Force compressed or uncompressed transfer (write_flash).

**-fm**, **--flash-mode** / **-ff**, **--flash-freq** / **-fs**, **--flash-size** _VALUE_
> Override the SPI flash mode, frequency, or size (write_flash).

**read_flash** _ADDR_ _SIZE_ _FILE_
> Read flash contents to file.

**verify_flash** _ADDR_ _FILE_ [_ADDR_ _FILE_ ...]
> Compare flash contents with binary files.

**erase_flash**
> Erase entire flash.

**erase_region** _ADDR_ _SIZE_
> Erase a specific flash region (must be sector-aligned to 4096 bytes).

**chip_id**
> Read chip ID.

**flash_id**
> Read SPI flash manufacturer and device ID.

**read_mac**
> Display the MAC address burned into the chip.

**image_info** _FILE_
> Display metadata about a binary image file.

**merge_bin** **-o** _OUTPUT_ _ADDR_ _FILE_ [_ADDR_ _FILE_ ...]
> Merge multiple binaries into a single flashable file.

**elf2image** _ELF_
> Convert an ELF file into a flashable firmware image.

**get_security_info**
> Display security information such as secure boot and flash encryption state.

**--help**
> Display help information.

# DESCRIPTION

**esptool.py** is the official flashing tool for Espressif ESP8266, ESP32, ESP32-S2, ESP32-S3, ESP32-C3, and other chips in the ESP series. It communicates over serial to program firmware, read/write flash, and manage the boot process.

The tool handles bootloader communication, flash layout, and various chip-specific requirements. It supports multiple flash sizes, frequencies, and modes (qio, qout, dio, dout). By default, data is compressed during transfer for better performance.

esptool.py is essential for ESP development, used by Arduino IDE, PlatformIO, and ESP-IDF for firmware deployment.

Since v5 the preferred command is **esptool**, without the .py suffix, and command and option names use hyphens instead of underscores. The old names still work but print deprecation warnings, and the .py scripts are scheduled for removal in the next major release.

# CAVEATS

Requires serial driver for USB adapter (e.g., CP210x, CH340). Boot mode may need manual GPIO0 control on some boards. Flash addresses are chip-specific. Higher baud rates increase speed but may reduce reliability. The erase_region address and size must be aligned to 4096-byte sector boundaries. On Linux, serial port access usually requires membership in the **dialout** group. The write_flash **--verify** option is deprecated in v5 because verification happens automatically.

# HISTORY

esptool.py was started by **Fredrik Ahlberg** in **2014** and is now maintained by **Espressif Systems** as the official tool for their ESP8266 and ESP32 series of WiFi/Bluetooth microcontrollers, widely used in IoT projects. It is open-source and available via PyPI as the **esptool** package.

# SEE ALSO

[esptool](/man/esptool)(1), [platformio](/man/platformio)(1), [arduino-cli](/man/arduino-cli)(1)

# RESOURCES

```[Source code](https://github.com/espressif/esptool)```

```[Documentation](https://docs.espressif.com/projects/esptool/en/latest/esp32/)```

<!-- verified: 2026-11-09 -->
