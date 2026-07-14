# TAGLINE

Espressif chip firmware flashing utility

# TLDR

**Flash firmware** at a given offset

```esptool --port [/dev/ttyUSB0] write-flash 0x00000 [firmware.bin]```

**Read chip information**

```esptool --port [/dev/ttyUSB0] chip-id```

**Erase flash memory**

```esptool --port [/dev/ttyUSB0] erase-flash```

**Read flash to file**

```esptool --port [/dev/ttyUSB0] read-flash 0 0x400000 [backup.bin]```

**Flash at specific baud rate**

```esptool --port [/dev/ttyUSB0] --baud [921600] write-flash 0x0 [firmware.bin]```

**Read the MAC address**

```esptool --port [/dev/ttyUSB0] read-mac```

# SYNOPSIS

**esptool** [_options_] _command_ [_args_]

# PARAMETERS

**--port** _port_, **-p** _port_
> Serial port device.

**--baud** _rate_, **-b** _rate_
> Baud rate (default 115200).

**--chip** _name_, **-c** _name_
> Target chip: esp8266, esp32, esp32s3, etc. Auto-detected by default.

**--before** _action_ / **--after** _action_
> Reset behavior before connecting and after finishing (e.g. default-reset, hard-reset, no-reset).

**chip-id**
> Read the chip ID.

**flash-id**
> Read the flash chip ID and size.

**read-mac**
> Read the MAC address.

**write-flash** _addr_ _file_
> Write a binary to flash at the given address.

**read-flash** _addr_ _size_ _file_
> Read flash contents to a file.

**erase-flash**
> Erase the entire flash.

**erase-region** _addr_ _size_
> Erase a region of flash.

**verify-flash** _addr_ _file_
> Compare flash contents against a file.

# DESCRIPTION

**esptool** is the official tool for flashing firmware to Espressif chips (ESP8266, ESP32, ESP32-S2, ESP32-S3, ESP32-C3, and others). It communicates over serial to read, write, and verify flash memory.

The tool is essential for ESP32/ESP8266 development, used to upload Arduino sketches, MicroPython, ESPHome, and other firmware. It auto-detects the chip type and flash parameters in most cases.

# CAVEATS

Requires Python and pyserial. The device must be in bootloader mode (GPIO0 held low on reset, or auto-reset via the RTS/DTR lines on boards with a USB-serial bridge). Write access to the serial port is needed, which on Linux usually means membership of the dialout group. A bad flash can leave the device unbootable, but it is recoverable by re-entering the bootloader.

Since **esptool v5** all commands and options use hyphens instead of underscores (`write-flash`, not `write_flash`), and the preferred invocation is `esptool` without the `.py` suffix. The old `esptool.py` name and underscore forms still work but print deprecation warnings and are slated for removal. The `--verify` option of write-flash was dropped because verification now runs automatically.

# HISTORY

esptool began as **esptool.py**, developed by **Espressif Systems** as the official flashing utility for their ESP8266 and ESP32 series of WiFi/Bluetooth microcontrollers. It is open source and actively maintained alongside the ESP-IDF framework.

# SEE ALSO

[python](/man/python)(1), [platformio](/man/platformio)(1), [arduino-cli](/man/arduino-cli)(1)

# RESOURCES

```[Source code](https://github.com/espressif/esptool)```

```[Documentation](https://docs.espressif.com/projects/esptool/)```

<!-- verified: 2026-07-14 -->
