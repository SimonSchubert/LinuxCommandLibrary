# TLDR

**Replay** a typescript at original speed

```scriptreplay path/to/timing_file path/to/typescript```

Replay at **double speed**

```scriptreplay path/to/timing_file path/to/typescript 2```

Replay at **half speed**

```scriptreplay path/to/timing_file path/to/typescript 0.5```

# SYNOPSIS

**scriptreplay** _timing_file_ _typescript_ [_divisor_]

# PARAMETERS

_timing_file_
> File containing timing information from script

_typescript_
> File containing recorded terminal output

_divisor_
> Speed multiplier (2 = double, 0.5 = half)

# DESCRIPTION

**scriptreplay** replays a terminal session recorded by the script command. It displays the output with the original timing preserved, useful for demonstrations and reviewing sessions.

The timing file contains delay information between each output block, allowing accurate replay.

# CAVEATS

Only displays output; does not execute commands. Requires both timing and typescript files from script recording.

# HISTORY

Part of **util-linux** package, complementing script for terminal session recording and playback.

# SEE ALSO

[script](/man/script)(1), [scriptlive](/man/scriptlive)(1)
