# TLDR

**Turn on NumLock LED**

```setleds +num```

**Turn off CapsLock LED**

```setleds -caps```

**Turn on ScrollLock LED**

```setleds +scroll```

**Set NumLock as default** (persists after reset)

```setleds -D +num```

**Report current LED status**

```setleds```

**Change LEDs only** without affecting key state

```setleds -L +num```

**Set LEDs for a specific TTY**

```setleds -D +num < /dev/tty1```

# SYNOPSIS

**setleds** [_-v_] [_-L_] [_-D_] [_-F_] [{_+|-_}**num**] [{_+|-_}**caps**] [{_+|-_}**scroll**]

# PARAMETERS

**+num** / **-num**
> Set or clear NumLock

**+caps** / **-caps**
> Set or clear CapsLock

**+scroll** / **-scroll**
> Set or clear ScrollLock

**-F**
> Only change VT flags (default); LEDs may reflect the change

**-D**
> Change flags and defaults; changes persist after console reset

**-L**
> Only change LEDs without affecting VT flags

**-v**
> Verbose mode; report changes

# DESCRIPTION

**setleds** controls the keyboard LED indicators (NumLock, CapsLock, ScrollLock) on Linux virtual consoles. Without arguments, it reports the current LED and flag settings.

The command manipulates both the virtual terminal flags (which affect keyboard behavior) and the physical LED states. Use **-F** to change only VT behavior, **-L** to change only LEDs, or **-D** to set persistent defaults.

This is commonly used in /etc/rc scripts to set the initial NumLock state for console logins.

# CAVEATS

setleds affects only virtual consoles (TTYs), not graphical environments (X11/Wayland) where the desktop environment manages keyboard LEDs. Requires appropriate permissions for the target terminal device. Part of the **kbd** package.

# HISTORY

setleds is part of the **kbd** package, a collection of keyboard utilities for Linux console management. It provides low-level control over keyboard indicators that predates modern desktop environments.

# SEE ALSO

[showkey](/man/showkey)(1), [loadkeys](/man/loadkeys)(1), [dumpkeys](/man/dumpkeys)(1)
