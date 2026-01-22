# TLDR

**Flash firmware to** ESP board

```esptool.py --port [/dev/ttyUSB0] write_flash 0x0 [firmware.bin]```

**Read chip info**

```esptool.py --port [/dev/ttyUSB0] chip_id```

**Erase flash**

```esptool.py --port [/dev/ttyUSB0] erase_flash```

**Read flash to** file

```esptool.py --port [/dev/ttyUSB0] read_flash 0x0 0x100000 [backup.bin]```

**Verify flash** contents

```esptool.py --port [/dev/ttyUSB0] verify_flash 0x0 [firmware.bin]```

**Set baud rate**

```esptool.py --port [/dev/ttyUSB0] --baud [921600] write_flash 0x0 [firmware.bin]```

# SYNOPSIS

**esptool.py** [_options_] _command_ [_args_]

# PARAMETERS

_COMMAND_
> Operation: write_flash, read_flash, erase_flash, chip_id, etc.

**--port** _PORT_
> Serial port device.

**--baud** _RATE_
> Serial baud rate.

**write_flash** _ADDR_ _FILE_
> Write binary to flash at address.

**read_flash** _ADDR_ _SIZE_ _FILE_
> Read flash to file.

**erase_flash**
> Erase entire flash.

**chip_id**
> Read chip ID.

**--help**
> Display help information.

# DESCRIPTION

**esptool.py** is the official flashing tool for Espressif ESP8266 and ESP32 microcontrollers. It communicates over serial to program firmware, read/write flash, and manage the boot process.

The tool handles bootloader communication, flash layout, and various chip-specific requirements. It supports multiple flash sizes, frequencies, and modes.

esptool.py is essential for ESP development, used by Arduino IDE, PlatformIO, and ESP-IDF for firmware deployment.

# CAVEATS

Requires serial driver for USB adapter. Boot mode may need manual GPIO control. Flash addresses are chip-specific. Baud rate affects reliability vs speed.

# HISTORY

esptool.py was developed by **Espressif Systems** as the official tool for their ESP8266 and ESP32 series of WiFi/Bluetooth microcontrollers, widely used in IoT projects.

# SEE ALSO

[platformio](/man/platformio)(1), [arduino-cli](/man/arduino-cli)(1)
