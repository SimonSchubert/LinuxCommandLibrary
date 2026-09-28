# TAGLINE

configures input method framework for Linux desktops

# TLDR

**Configure input method** interactively

```im-config```

Configure using a **console dialog** instead of a GUI

```im-config -c```

**List installed** input method frameworks

```im-config -l```

**Set input method** framework non-interactively

```im-config -n [ibus|fcitx5|xim|none]```

**Show current** configuration values

```im-config -m```

**Remove** the user configuration file

```im-config -n REMOVE```

# SYNOPSIS

**im-config** [_options_]

# PARAMETERS

**-a**
> List all possible input method frameworks, even if their packages are not installed.

**-c**
> Use console dialog (whiptail).

**-x**
> Use X dialog with zenity.

**-s**
> Simulate; show what would happen without changing configuration files.

**-l**
> List available input method frameworks to stdout (only installed ones unless **-a** is given).

**-m**
> List configuration values: active system/user configuration and automatic/override choice for the current locale.

**-n** _METHOD_
> Set the input method framework. **none** activates nothing and uses the desktop default; **REMOVE** deletes the configuration file.

**-o** _METHOD_
> Print the localized description of an input method.

**-h**
> Display help information.

# DESCRIPTION

**im-config** configures the input method framework for Linux desktops. It selects between IBus, Fcitx 5, XIM and other input systems and writes the choice to **~/.xinputrc** (or **/etc/X11/xinit/xinputrc** system-wide).

Without options it shows a dialog listing available frameworks, marking the automatic choice for the current locale. The selected framework is started by **im-launch** when the X session starts, setting variables such as **GTK_IM_MODULE**, **QT_IM_MODULE** and **XMODIFIERS**.

# CAVEATS

Debian/Ubuntu tool. A logout or session restart is needed for changes to take effect. **im-config 1.0** (July 2026) dropped Wayland support and replaced the options with a debugging-oriented set: **-p** (list possible), **-i** (list installed), **-d** (defaults), **-r** (report current values), **-w** _METHOD_ (write configuration), **-c**, **-q**, **-v**. On Wayland sessions (GNOME, KDE Plasma) the desktop usually configures the input method itself. Problems can be inspected with **journalctl -b -t im-config**.

# HISTORY

im-config was written by **Osamu Aoki** for Debian as a replacement for the older **im-switch** tool, and is maintained by the Debian Input Method Team.

# SEE ALSO

[im-launch](/man/im-launch)(1), [ibus](/man/ibus)(1), [fcitx5](/man/fcitx5)(1), [fcitx](/man/fcitx)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/input-method-team/im-config)```

<!-- verified: 2026-09-29 -->
