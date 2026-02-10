# TAGLINE

microPython remote control tool

# TLDR

**Connect to device**

```mpremote```

**Run Python code**

```mpremote exec "[print('hello')]"```

**Copy file to device**

```mpremote cp [local.py] :[remote.py]```

**Copy file from device**

```mpremote cp :[remote.py] [local.py]```

**Run script on device**

```mpremote run [script.py]```

**Enter REPL**

```mpremote repl```

**List files on device**

```mpremote ls```

**Mount local directory**

```mpremote mount [.]```

# SYNOPSIS

**mpremote** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Operation to perform.

**connect** _DEVICE_
> Connect to specific device.

**exec** _CODE_
> Execute Python code.

**cp** _SRC_ _DST_
> Copy files (: prefix for device).

**run** _FILE_
> Run local script on device.

**repl**
> Enter interactive REPL.

**--help**
> Display help information.

# DESCRIPTION

**mpremote** is the MicroPython remote control tool. It manages MicroPython devices.

The tool copies files, runs code, and provides REPL access. Works over USB serial.

# CAVEATS

Requires MicroPython device. Serial connection needed. Python 3 required.

# HISTORY

mpremote was developed by the **MicroPython** project as the official device management tool.

# SEE ALSO

[rshell](/man/rshell)(1), [ampy](/man/ampy)(1), [python](/man/python)(1)

