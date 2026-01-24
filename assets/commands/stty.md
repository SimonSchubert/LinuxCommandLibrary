# TLDR

**Show all settings**

```stty -a```

**Show settings for device**

```stty -a -F [/dev/ttyUSB0]```

**Set baud rate**

```stty -F [/dev/ttyUSB0] [115200]```

**Disable echo**

```stty -echo```

**Enable raw mode**

```stty raw```

**Reset to sane defaults**

```stty sane```

**Set terminal size**

```stty rows [24] cols [80]```

# SYNOPSIS

**stty** [_options_] [_settings_...]

# DESCRIPTION

**stty** displays or changes terminal line settings. It controls various aspects of terminal I/O including baud rate, character processing, and signal handling.

The tool is essential for configuring serial ports and customizing terminal behavior.

# PARAMETERS

**-a**, **--all**
> Print all settings.

**-g**, **--save**
> Print in stty-readable form.

**-F** _device_
> Specify device.

**sane**
> Reset to sane values.

**raw**
> Raw mode (no processing).

**cooked**
> Normal mode.

**echo/-echo**
> Enable/disable echo.

**rows** _n_
> Set terminal rows.

**cols** _n_
> Set terminal columns.

**speed** _baud_
> Set baud rate.

# CAVEATS

Settings affect current terminal. Some require appropriate privileges. Raw mode disables many features. Changes may not persist.

# HISTORY

**stty** (set tty) is a traditional Unix utility dating back to early Unix versions. It remains essential for serial communication and terminal configuration.

# SEE ALSO

[tty](/man/tty)(1), [setserial](/man/setserial)(8), [getty](/man/getty)(8), [termios](/man/termios)(3)
