# TLDR

**Launch Ardour** with the graphical interface

```ardour```

**Open a specific session**

```ardour [path/to/session]```

**Create a new session** from command line

```ardour -N [session-name]```

**Create a new session** using a template

```ardour -N [session-name] -T [template-name]```

**Launch in safe mode** with all plugins disabled

```ardour -d [path/to/session]```

**Bypass all plugins** in an existing session

```ardour -B [path/to/session]```

**Show all available key bindings**

```ardour -b```

# SYNOPSIS

**ardour** [_OPTIONS_] [_SESSION-NAME_]

# PARAMETERS

**-a**, **--no-announcements**
> Do not contact website for announcements.

**-A**, **--actions**
> Print all possible menu action names.

**-b**, **--bindings**
> Display all current key bindings.

**-B**, **--bypass-plugins**
> Bypass all plugins in an existing session.

**-c**, **--name** _NAME_
> Use a specific backend client name (default: ardour).

**-d**, **--disable-plugins**
> Disable all plugins (safe mode).

**-D**, **--debug** _OPTIONS_
> Set debug flags. Use -D list for available options.

**-h**, **--help**
> Display help message.

**-k**, **--keybindings** _FILE_
> Load key bindings from specified file.

**-m**, **--menus** _FILE_
> Define menus using specified file.

**-n**, **--no-splash**
> Suppress splash screen display.

**-N**, **--new** _SESSION-NAME_
> Create a new session via command line.

**-O**, **--no-hw-optimizations**
> Disable hardware-specific optimizations.

**-P**, **--no-connect-ports**
> Skip automatic port connections at startup.

**-S**, **--sync**
> Draw GUI synchronously.

**-T**, **--template** _NAME_
> Apply template to new session.

**-v**, **--version**
> Display version information and exit.

# DESCRIPTION

**Ardour** is a multichannel hard disk recorder (HDR) and digital audio workstation (DAW) for professional audio production. It provides complete multitrack recording, editing, mixing, and mastering capabilities comparable to commercial DAW software.

Ardour uses JACK (JACK Audio Connection Kit) for all audio I/O, enabling perfect sample-sync data exchange with other applications and hardware audio interfaces. It is capable of simultaneously recording 24 or more channels of 32-bit audio at 48kHz. The software supports LADSPA, LV2, VST, and AudioUnit plugins for effects processing and virtual instruments.

Sessions are stored as directories containing all project data including audio files, edits, automation, and settings. Ardour supports non-destructive editing with unlimited undo history.

# CAVEATS

Ardour requires JACK or PipeWire for audio I/O. Real-time audio performance depends on proper system configuration including kernel settings for low-latency operation. Plugin compatibility varies by format and platform.

# HISTORY

Ardour was created by Paul Davis, who is also responsible for the JACK Audio Connection Kit. Development began in **1999** and the first public release occurred in **2005**. It has become one of the most capable open-source DAWs available, used by professional studios and musicians worldwide. The project is funded through subscriptions and donations.

# SEE ALSO

[jackd](/man/jackd)(1), [qjackctl](/man/qjackctl)(1), [audacity](/man/audacity)(1), [lmms](/man/lmms)(1)
