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

# SYNOPSIS

**esptool.py** [_options_] _command_ [_args_]

# PARAMETERS

_COMMAND_
> Operation: write_flash, read_flash, erase_flash, chip_id, flash_id, read_mac, etc.

**--port** _PORT_
> Serial port device (e.g., /dev/ttyUSB0, COM3).

**--baud** _RATE_
> Serial baud rate (default: 115200).

**--chip** _CHIP_
> Target chip type (auto, esp8266, esp32, esp32s2, esp32s3, esp32c3, etc.).

**--before** _ACTION_
> Action before connecting: default_reset, no_reset, no_reset_no_sync.

**--after** _ACTION_
> Action after operation: hard_reset (default), soft_reset, no_reset, no_reset_stub.

**--no-stub**
> Disable stub loader; communicate directly with ROM bootloader.

**write_flash** _ADDR_ _FILE_ [_ADDR_ _FILE_ ...]
> Write one or more binaries to flash at specified addresses.

**read_flash** _ADDR_ _SIZE_ _FILE_
> Read flash contents to file.

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

**merge_bin** _-o_ _OUTPUT_ _ADDR_ _FILE_ [_ADDR_ _FILE_ ...]
> Merge multiple binaries into a single flashable file.

**--help**
> Display help information.

# DESCRIPTION

**esptool.py** is the official flashing tool for Espressif ESP8266, ESP32, ESP32-S2, ESP32-S3, ESP32-C3, and other chips in the ESP series. It communicates over serial to program firmware, read/write flash, and manage the boot process.

The tool handles bootloader communication, flash layout, and various chip-specific requirements. It supports multiple flash sizes, frequencies, and modes (qio, qout, dio, dout). By default, data is compressed during transfer for better performance.

esptool.py is essential for ESP development, used by Arduino IDE, PlatformIO, and ESP-IDF for firmware deployment.

# CAVEATS

Requires serial driver for USB adapter (e.g., CP210x, CH340). Boot mode may need manual GPIO0 control on some boards. Flash addresses are chip-specific. Higher baud rates increase speed but may reduce reliability. The erase_region address and size must be aligned to 4096-byte sector boundaries.

# HISTORY

esptool.py was developed by **Espressif Systems** as the official tool for their ESP8266 and ESP32 series of WiFi/Bluetooth microcontrollers, widely used in IoT projects. It is open-source and available via PyPI (`pip install esptool`).

# SEE ALSO

[platformio](/man/platformio)(1), [arduino-cli](/man/arduino-cli)(1)
