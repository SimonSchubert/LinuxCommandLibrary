# TLDR

**Start brltty daemon**

```brltty```

**Start with specific braille driver**

```brltty -b [driver]```

**Start with specific device**

```brltty -d [usb:]```

**Run in foreground (no daemon)**

```brltty -n```

**Use specific text table**

```brltty -t [en-us-g2]```

**Enable speech support**

```brltty -e```

**Set verbosity level**

```brltty -v [5]```

**Display help**

```brltty -h```

# SYNOPSIS

**brltty** [_options_]

# DESCRIPTION

**brltty** is a background daemon that provides access to the Linux/Unix console for blind users via refreshable braille displays. It drives the braille display and provides complete screen review functionality with some speech capability.

The daemon supports connections via serial port, USB, or Bluetooth and works with dozens of braille display models.

# PARAMETERS

**-b** _driver_
> Braille display driver code

**-d** _device_
> Device specification (usb:, bluetooth:, serial port)

**-t** _table_
> Text translation table

**-c** _table_
> Contraction table

**-e**
> Enable speech support

**-s** _driver_
> Speech synthesizer driver

**-n**
> Run in foreground (no daemonize)

**-f** _file_
> Configuration file path

**-v** _level_
> Verbosity level (0-9)

**-l** _level_
> Log level

**-V**
> Print version information

**-h**
> Display help summary

# CONFIGURATION

Default configuration file is **/etc/brltty.conf**. Text tables are stored in **/etc/brltty/Text/**. The device specification format is **qualifier:data** with defaults of **usb:,bluetooth:**.

# CAVEATS

Must be run as root or with appropriate permissions for device access. The braille display must be connected and powered on before starting. Supports 70+ braille display models from various manufacturers.

# SEE ALSO

[orca](/man/orca)(1), [espeak](/man/espeak)(1), [screen](/man/screen)(1)
