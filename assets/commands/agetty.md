# TAGLINE

Open a terminal and prompt for login

# TLDR

Connect stdin to a **port** with an optional baud rate

```agetty [tty] [115200]```

Set a **timeout** for the login

```agetty -t [timeout_in_seconds] -```

Assume the tty is **8-bit clean** and override the TERM variable

```agetty -8 - [term_var]```

Skip the login and invoke **another login program**

```agetty -n -l [login_program] [tty]```

Do not display the **pre-login issue** file

```agetty -i -```

# SYNOPSIS

**agetty** [_options_] _port_ [_baud_rate_...] [_term_]

# DESCRIPTION

**agetty** opens a tty port, prompts for a login name, and invokes the /bin/login command. It is normally invoked by **init**(8). The command provides features useful for hardwired and dial-in connections, including automatic parity detection, baud rate deduction from modem messages, and optional hardware flow control.

# PARAMETERS

**-8, --8bits**
> Disable parity detection for 8-bit clean terminals

**-a, --autologin username**
> Automatic login without prompting for username

**-h, --flow-control**
> Enable RTS/CTS hardware flow control

**-i, --noissue**
> Skip displaying /etc/issue

**-J, --noclear**
> Don't clear screen before login prompt

**-l, --login-program program**
> Use alternative login executable

**-L, --local-line**
> Control carrier detect requirement

**-m, --extract-baud**
> Extract baud rate from modem status messages

**-n, --skip-login**
> Don't prompt for login name

**-r, --chroot directory**
> Change the root directory

**-H, --host hostname**
> Write a specific fake host into the utmp file

**-t, --timeout seconds**
> Terminate if no input within timeout

# CONFIGURATION

**/etc/issue**
> Pre-login message displayed before the login prompt. Supports escape codes for system information.

**/etc/os-release**
> Operating system identification data used by agetty for \S escape in /etc/issue.

# CAVEATS

The baud rate is the speed of data transfer between a terminal and a device over a serial connection. Default is 9600 for serial terminals.

# HISTORY

Part of **util-linux** package. Alternative to the traditional **getty** command with additional features for modern Linux systems.

# SEE ALSO

[login](/man/login)(1), [init](/man/init)(8), [getty](/man/getty)(8)
