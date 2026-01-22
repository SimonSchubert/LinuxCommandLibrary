# TLDR

**Launch CHIRP radio programming software**

```chirpw```

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

**chirpw** [**--module** _module_] [**--onlydriver** _driver_] [**--action** _action_] [**--restore**] [**-q**|**-v**] [**--log** _file_] [**--log-level** _level_]

# DESCRIPTION

**chirpw** is the graphical interface for CHIRP, a free and open-source tool for programming amateur (ham) radio transceivers. It allows users to manage radio memory channels, configure settings, and transfer data between computer and radio via serial or USB connections.

CHIRP supports hundreds of radio models from manufacturers including Baofeng, Yaesu, Kenwood, Icom, and others. The software can import/export various file formats and query online repeater databases.

# PARAMETERS

**--module** _module_
> Load specified module on startup

**--onlydriver** _driver_
> Include only the specified radio driver

**--action** _action_
> Start UI action immediately: upload, download, query_rr, query_mg, query_rb, query_dm, new

**--restore**
> Restore previous session tabs

**-q**
> Quiet mode (less output)

**-v**
> Verbose mode (more output)

**--log** _file_
> Write log to specified file

**--log-level** _level_
> Set logging verbosity level

**--version**
> Print version and exit

# CAVEATS

Serial port access requires appropriate permissions. Add your user to the serial port group:
```
sudo usermod -a -G $(stat -c %G /dev/ttyUSB0) $USER
```
Log out and back in after group changes.

The radio port is typically **/dev/ttyUSB0** on Linux systems.

# HISTORY

**CHIRP** was created by Dan Smith (KK7DS) and has been actively developed since 2008. It began as a tool for Icom IC-91/92 radios and expanded to support hundreds of radio models across multiple manufacturers.

# SEE ALSO

[chirpc](/man/chirpc)(1)
