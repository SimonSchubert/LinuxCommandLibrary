# TAGLINE

Run a remote shell on an Android device

# TLDR

**Open** an interactive shell on the device

```adb shell```

**Run** a single command

```adb shell [ls /sdcard]```

Run command as **root** (if available)

```adb shell su -c "[command]"```

**List** files with details

```adb shell ls -la [/system/]```

# SYNOPSIS

**adb shell** [_-e escape_] [_-n_] [_-T|-t_] [_-x_] [_command_]

# DESCRIPTION

**adb shell** provides shell access to a connected Android device. Without arguments, it opens an interactive shell session. With arguments, it executes the specified command and returns the output.

The shell is a limited Unix environment with access to Android-specific commands like **am** (activity manager), **pm** (package manager), **dumpsys**, and **content**. Available commands depend on the device and whether root access is available.

# PARAMETERS

**-e** _char_
> Set escape character (default: ~)

**-n**
> Don't read from stdin

**-T**
> Disable PTY allocation

**-t**
> Force PTY allocation

**-x**
> Disable remote exit codes

# CAVEATS

Shell commands run as the "shell" user with limited permissions. Root access requires an unlocked bootloader or rooted device. Not all standard Unix commands are available. The shell environment may vary between Android versions and manufacturers.

# HISTORY

**adb shell** has been part of the Android SDK since its initial release in **2008**. The shell has evolved from a basic Toolbox implementation to the more capable Toybox on modern Android versions.

# SEE ALSO

[adb](/man/adb)(1), [adb-shell-pm](/man/adb-shell-pm)(1), [toybox](/man/toybox)(1)
