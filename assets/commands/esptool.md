# TAGLINE

Espressif chip firmware flashing utility

# TLDR

**Flash firmware**

```esptool.py --port [/dev/ttyUSB0] write_flash 0x00000 [firmware.bin]```

**Read chip information**

```esptool.py --port [/dev/ttyUSB0] chip_id```

**Erase flash memory**

```esptool.py --port [/dev/ttyUSB0] erase_flash```

**Read flash to file**

```esptool.py --port [/dev/ttyUSB0] read_flash 0 0x400000 [backup.bin]```

**Flash at specific baud rate**

```esptool.py --port [/dev/ttyUSB0] --baud [921600] write_flash 0x0 [firmware.bin]```

**Verify flash contents**

```esptool.py --port [/dev/ttyUSB0] verify_flash 0x0 [firmware.bin]```

# SYNOPSIS

**esptool.py** [_options_] _command_ [_args_]

# PARAMETERS

**--port** _port_
> Serial port device.

**--baud** _rate_
> Baud rate (default 115200).

**--chip** _name_
> Target chip: esp8266, esp32, etc.

**chip_id**
> Read chip ID.

**flash_id**
> Read flash chip ID.

**read_mac**
> Read MAC address.

**write_flash** _addr_ _file_
> Write binary to flash at address.

**read_flash** _addr_ _size_ _file_
> Read flash contents.

**erase_flash**
> Erase entire flash.

**erase_region** _addr_ _size_
> Erase flash region.

**verify_flash** _addr_ _file_
> Verify flash contents.

# DESCRIPTION

**esptool.py** is the official tool for flashing firmware to Espressif chips (ESP8266, ESP32, ESP32-S2, etc.). It communicates over serial to read, write, and verify flash memory.

The tool is essential for ESP32/ESP8266 development, used to upload Arduino sketches, MicroPython, ESPHome, and other firmware. It auto-detects chip type and flash parameters in most cases.

# CAVEATS

Requires Python and pyserial. Device must be in bootloader mode (GPIO0 low on boot, or auto-reset via RTS/DTR). Write permissions needed for serial port. Incorrect flash may brick device (recoverable via bootloader).

# HISTORY

esptool.py was developed by **Espressif Systems** as the official flashing utility for their ESP8266 and ESP32 series of WiFi/Bluetooth microcontrollers. It's open source and actively maintained as part of the ESP-IDF framework.

# SEE ALSO

[python](/man/python)(1), [platformio](/man/platformio)(1), [arduino-cli](/man/arduino-cli)(1)
