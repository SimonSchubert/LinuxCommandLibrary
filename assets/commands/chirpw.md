# TAGLINE

amateur radio programming tool

# TLDR

**Launch CHIRP radio programming software**

```chirpw```

**Open a saved radio image or CSV file**

```chirpw [file.img]```

**Launch with a specific radio driver**

```chirpw --onlydriver [driver_name]```

**Start with download action**

```chirpw --action download```

**Restore previous session tabs**

```chirpw --restore```

**Run with verbose output**

```chirpw -v```

**Display version information**

```chirpw --version```

# SYNOPSIS

**chirpw** [**--module** _module_] [**--onlydriver** _driver_...] [**--action** _action_] [**--restore**] [**--page** _page_] [**--force-language** _code_] [**--config-dir** _dir_] [**-q**|**-v**] [**--log** _file_] [**--log-level** _level_] [_file_...]

# PARAMETERS

_file_
> Radio image or other supported file to open.

**--module** _module_
> Load specified module on startup.

**--onlydriver** _driver_...
> Include only the specified radio drivers while loading.

**--action** _action_
> Start UI action immediately: upload, download, query_rr, query_mg, query_rb, query_dm, new.

**--restore**
> Restore previous session tabs.

**--profile**
> Enable profiling.

**--inspect**
> Show wxPython inspector.

**--page** _PAGE_
> Select this page of the default editor at start.

**--force-language** _CODE_
> Force locale to this ISO language code.

**--config-dir** _DIR_
> Use an alternate directory for configuration and other profile data.

**--compat-linux-gdk-backend**, **--no-compat-linux-gdk-backend**
> Linux only: force or do not force **GDK_BACKEND=x11** for compatibility. Forced by default.

**--install-desktop-app**, **--no-install-desktop-app**
> Linux only: control whether a desktop icon is installed.

**-q**, **--quiet**
> Decrease verbosity. May be repeated.

**-v**, **--verbose**
> Increase verbosity. May be repeated.

**--log** _file_
> Write log to specified file.

**--log-level** _level_
> Set log file verbosity (critical, error, warn, info, debug). Default: debug.

**--version**
> Print version and exit.

# DESCRIPTION

**chirpw** is the graphical interface for CHIRP, a free and open-source tool for programming amateur (ham) radio transceivers. It allows users to manage radio memory channels, configure settings, and transfer data between computer and radio via serial or USB connections.

CHIRP supports hundreds of radio models from manufacturers including Baofeng, Yaesu, Kenwood, Icom, and others. The software can import/export various file formats and query online repeater databases.

# CAVEATS

Upstream's Python package installs this program as **chirp**; distribution packages such as Debian's still provide it as **chirpw**, alongside the **chirpc** command-line tool.

Serial port access requires appropriate permissions. Add your user to the serial port group:
```
sudo usermod -a -G $(stat -c %G /dev/ttyUSB0) $USER
```
Log out and back in after group changes.

The radio port is typically **/dev/ttyUSB0** on Linux systems.

# HISTORY

**CHIRP** was created by Dan Smith (KK7DS) and has been actively developed since 2008. It began as a tool for Icom IC-91/92 radios and expanded to support hundreds of radio models across multiple manufacturers.

# RESOURCES

```[Source code](https://github.com/kk7ds/chirp)```

```[Homepage](https://chirpmyradio.com)```

<!-- verified: 2026-11-09 -->
