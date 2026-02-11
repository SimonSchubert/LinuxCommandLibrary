# TAGLINE

Show duration of ttyrec recordings

# TLDR

**Show duration of a recording**

```ttytime [recording.tty]```

**Show duration of multiple recordings**

```ttytime [file1.tty] [file2.tty] [file3.tty]```

**Show duration of all recordings in directory**

```ttytime [*.tty]```

# SYNOPSIS

**ttytime** _file_ [_file_...]

# DESCRIPTION

**ttytime** displays the total playback duration of ttyrec recordings in seconds. It reads the timing information embedded in ttyrec files and calculates the total elapsed time from start to finish.

The output shows the duration followed by the filename for each file specified. This is useful for quickly checking recording lengths without playing them back, organizing recordings, or scripting based on session duration.

Multiple files can be specified to get durations for a batch of recordings at once.

# OUTPUT FORMAT

Output consists of duration in seconds followed by the filename:

```
173 session1.tty
42 session2.tty
1832 longdemo.tty
```

# CAVEATS

Only works with ttyrec format files. Duration reflects timing data, not actual content length. Corrupted recordings may report incorrect times.

# HISTORY

**ttytime** was created as a companion utility to ttyrec and ttyplay to provide quick duration information without requiring full playback. It's part of the ttyrec package commonly used in the Unix community for recording and sharing terminal sessions.

# SEE ALSO

[ttyrec](/man/ttyrec)(1), [ttyplay](/man/ttyplay)(1), [script](/man/script)(1)
