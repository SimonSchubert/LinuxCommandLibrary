# TAGLINE

Record and replay terminal sessions

# TLDR

**Record** terminal session (filename required in 3.0+)

```asciinema rec [recording.cast]```

**Play** recorded session

```asciinema play [recording.cast]```

**Upload** to asciinema.org

```asciinema upload [recording.cast]```

Record with **title**

```asciinema rec -t "[My recording]" [recording.cast]```

Record with **idle time limit**

```asciinema rec --idle-time-limit=[2] [recording.cast]```

**Live stream** a terminal session

```asciinema stream -l```

# SYNOPSIS

**asciinema** _rec_|_play_|_cat_|_convert_|_upload_|_stream_|_session_|_auth_ [_options_] [_file_]

# DESCRIPTION

**asciinema** records and replays terminal sessions. It captures terminal output with timing information, creating lightweight recordings that can be shared or embedded on websites.

Unlike video screen recording, asciinema recordings are text-based, allowing copy-paste from playback and producing small file sizes.

# PARAMETERS

**rec** _file_
> Record terminal session. In 3.0+ the filename is required, and rec no longer uploads (use the upload command).

**play** _file_
> Playback recorded session

**cat** _file..._
> Concatenate two or more recordings into one (3.0+).

**convert** _input_ _output_
> Convert a recording to another asciicast format (3.0+).

**upload** _file_
> Upload recording to asciinema.org

**stream**
> Live stream the terminal session (3.0+).

**session**
> Generic session that can record, stream, or both (3.0+).

**auth**
> Authenticate this install with your asciinema server account

**-t** _title_, **--title** _title_
> Recording title

**-c** _cmd_, **--command** _cmd_
> Command to record (default: $SHELL)

**--idle-time-limit** _sec_
> Maximum idle time between frames

**-i** _sec_
> Shorthand for --idle-time-limit

**-s** _speed_, **--speed** _speed_
> Playback speed multiplier

**--cols** _n_ / **--rows** _n_
> Override terminal dimensions

# CONFIGURATION

**~/.config/asciinema/config.toml**
> User configuration file (TOML) in CLI 3.0+ for default recording settings, server URL, and authentication. Earlier 2.x releases used **~/.config/asciinema/config**.

# CAVEATS

Recordings capture exactly what appears in terminal, including sensitive data. Review before uploading. Playback requires terminal with same capabilities as recording.

# HISTORY

**asciinema** was created by Marcin Kulik, with the first version released around **2011**. It has become the standard tool for terminal recording and sharing.

# INSTALL

```dnf: sudo dnf install asciinema```

```pacman: sudo pacman -S asciinema```

```apk: sudo apk add asciinema```

```zypper: sudo zypper install asciinema```

```brew: brew install asciinema```

```nix: nix profile install nixpkgs#asciinema```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[script](/man/script)(1), [ttyrec](/man/ttyrec)(1), [agg](/man/agg)(1)

# RESOURCES

```[Source code](https://github.com/asciinema/asciinema)```

```[Homepage](https://asciinema.org)```

```[Documentation](https://docs.asciinema.org)```

<!-- verified: 2026-06-17 -->
