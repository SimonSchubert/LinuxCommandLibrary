# TLDR

**Record** terminal session

```asciinema rec [recording.cast]```

**Play** recorded session

```asciinema play [recording.cast]```

**Upload** to asciinema.org

```asciinema upload [recording.cast]```

Record with **title**

```asciinema rec -t "[My recording]" [recording.cast]```

Record with **idle time limit**

```asciinema rec --idle-time-limit=[2] [recording.cast]```

# SYNOPSIS

**asciinema** _rec_|_play_|_upload_|_auth_ [_options_] [_file_]

# DESCRIPTION

**asciinema** records and replays terminal sessions. It captures terminal output with timing information, creating lightweight recordings that can be shared or embedded on websites.

Unlike video screen recording, asciinema recordings are text-based, allowing copy-paste from playback and producing small file sizes.

# PARAMETERS

**rec** [_file_]
> Record terminal session

**play** _file_
> Playback recorded session

**upload** _file_
> Upload recording to asciinema.org

**auth**
> Authenticate with asciinema.org

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

# CAVEATS

Recordings capture exactly what appears in terminal, including sensitive data. Review before uploading. Playback requires terminal with same capabilities as recording.

# HISTORY

**asciinema** was created by Marcin Kulik, with the first version released around **2011**. It has become the standard tool for terminal recording and sharing.

# SEE ALSO

[script](/man/script)(1), [ttyrec](/man/ttyrec)(1), [agg](/man/agg)(1)
