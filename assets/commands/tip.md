# TAGLINE

Connect to a remote system over a serial line

# TLDR

**Connect** to a system defined in /etc/remote

```tip [system_name]```

**Connect** at a specific baud rate

```tip -[115200] [system_name]```

**Connect** directly to a serial device

```tip [/dev/ttyUSB0]```

**Connect** with verbose output

```tip -v [system_name]```

**Connect** with tilde escape sequences disabled

```tip -n [system_name]```

# SYNOPSIS

**tip** [**-v**] [**-**_speed_] {_system_ | _phone-number_ | _device_}

# DESCRIPTION

**tip** establishes a full-duplex terminal connection to a remote host over a serial line, modem, or directly attached serial device. It is one of the classic Unix ways to talk to a serial console, a microcontroller, a router's management port, or a dial-up system.

Connection targets are usually named entries in the **/etc/remote** database, which records the device, baud rate, and other settings for each system. A target may also be given as a bare device path or, with a modem, a phone number to dial.

While connected, **tip** is mostly transparent: keystrokes are sent to the remote side and remote output is shown locally. Commands to the local **tip** process are entered through tilde (**~**) escape sequences typed at the start of a line, for example **~.** to disconnect, **~p** to send a file, or **~C** to fork a local shell.

# PARAMETERS

**-v**

> Verbose mode: echo commands from a script file as they run.

**-**_speed_

> Set the connection baud rate (for example **-115200** or **-9600**), overriding the value from /etc/remote.

**-n**

> Disable interpretation of tilde escape sequences for the session.

# ESCAPE SEQUENCES

**~.**

> Drop the connection and exit.

**~c** _dir_

> Change the local working directory.

**~!**

> Fork an interactive shell on the local host.

**~p** _from_ [_to_]

> Send (put) a file to the remote host.

**~t** _from_ [_to_]

> Receive (take) a file from the remote host.

**~#**

> Send a BREAK to the remote system.

# CAVEATS

**tip** is a BSD utility and is not installed by default on most Linux distributions, where **cu**, **minicom**, or **picocom** are more common. The exact set of supported escape sequences and options varies between implementations; consult the local manual page.

# HISTORY

**tip** originated in Berkeley Unix (BSD) alongside the **cu** (call Unix) utility and the UUCP suite. It remains part of the base system on the BSDs and is one of the oldest tools for serial terminal access.

# SEE ALSO

[cu](/man/cu)(1), [minicom](/man/minicom)(1), [picocom](/man/picocom)(1), [screen](/man/screen)(1), [stty](/man/stty)(1)

# RESOURCES

```[Source code](https://github.com/freebsd/freebsd-src/tree/main/usr.bin/tip)```

<!-- verified: 2026-06-16 -->
