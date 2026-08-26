# TAGLINE

terminal Music Player Daemon client with album art

# TLDR

Start the **TUI**

```rmpc```

Connect to a specific **MPD** address

```rmpc -a [host:port]```

Print a starter **config**

```rmpc config```

**Scan** the music directory

```rmpc update```

Save current **album art** to a file

```rmpc albumart -o [path/to/cover.jpg]```

Toggle **playback** without opening the TUI

```rmpc togglepause```

Show the **current song**

```rmpc song```

# SYNOPSIS

**rmpc** [_options_] [_command_]

# PARAMETERS

**-a**, **--address** _host:port_
> MPD address (overrides config).

**-p**, **--password** _password_
> MPD password.

**-c**, **--config** _file_
> Config file path.

**-t**, **--theme** _file_
> Theme file path.

**--partition** _name_
> MPD partition to use.

**--autocreate**
> Create the partition if it does not exist (requires **--partition**).

# COMMANDS

With no command, rmpc opens the TUI. Headless commands include **play**, **pause**, **unpause**, **togglepause**, **stop**, **next**, **prev**, **volume**, **repeat**, **random**, **single**, **consume** and their **toggle*** variants, **seek**, **clear**, **add**, **status**, **song**, **update**, **rescan**, **albumart**, **config**, **theme**, **outputs**, **sticker**, and **remote**.

**remote** talks to a running TUI instance (`keybind`, `switchtab`, `status`, `query`). Pass **--pid** to target one process.

# DESCRIPTION

**rmpc** is a Rust TUI client for **mpd**. It shows the queue, library, lyrics, and album art, and also works as a scripting CLI so you do not need **mpc** for play/pause/next. Commands available on the CLI are the same as TUI command mode (`:`).

Default config can be printed with **rmpc config** and used as a starting point.

# CAVEATS

Requires a running MPD instance. Album art and some extras depend on optional runtime libraries; **rmpc debuginfo** lists them. **albumart** exit codes: 0 success, 1 error, 2 no art, 3 nothing playing.

# HISTORY

Written by mierak as a modern MPD client with sixel/kitty image support.

# INSTALL

```pacman: sudo pacman -S rmpc```

```apk: sudo apk add rmpc```

```zypper: sudo zypper install rmpc```

```brew: brew install rmpc```

```nix: nix profile install nixpkgs#rmpc```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[mpd](/man/mpd)(1), [mpc](/man/mpc)(1), [ncmpcpp](/man/ncmpcpp)(1)

# RESOURCES

```[Source code](https://github.com/mierak/rmpc)```

```[Documentation](https://rmpc.mierak.dev/reference/cli-command-mode/)```

```[Homepage](https://rmpc.mierak.dev/)```

<!-- verified: 2026-08-26 -->
