# TLDR

**Start the SuperCollider interpreter**

```sclang```

**Run a SuperCollider script**

```sclang [script.scd]```

**Start in daemon mode** (no input)

```sclang -D```

**Run Main.run on startup**

```sclang -r [script.scd]```

**Set initial heap size**

```sclang -m [8m]```

**Set UDP listening port**

```sclang -u [57120]```

**Set runtime directory**

```sclang -d [/path/to/runtime]```

# SYNOPSIS

**sclang** [_options_] [_file_]

# PARAMETERS

**-d** _path_
> Set runtime directory.

**-D**
> Enter daemon mode (no user input).

**-g** _size_
> Set heap growth size (default 256k). Suffix with k or m.

**-h**
> Display help information.

**-l** _path_
> Set library configuration file.

**-m** _size_
> Set initial heap size (default 2m). Suffix with k or m.

**-r**
> Call Main.run on startup.

**-s**
> Call Main.stop on shutdown.

**-u** _port_
> Set UDP listening port (default 57120).

# DESCRIPTION

**sclang** is the SuperCollider programming language interpreter. SuperCollider is a platform for audio synthesis and algorithmic composition, used by musicians, artists, and researchers for real-time audio processing and sound design.

The interpreter acts as a client for **scsynth**, the SuperCollider audio synthesis server. It interprets SuperCollider code and sends OSC (Open Sound Control) messages to the synthesis server to control audio generation.

SuperCollider scripts (.scd files) can be executed directly from the command line for headless audio processing or batch operations. The daemon mode allows running SuperCollider without a terminal for server deployments.

On Linux, sclang can run without a display server by setting the environment variable QT_QPA_PLATFORM=offscreen.

# CAVEATS

Requires scsynth audio server for audio synthesis. The SuperCollider IDE provides a more integrated development experience. Script files must be structured as single executable blocks when run from command line. Memory settings may need tuning for complex compositions.

# HISTORY

**SuperCollider** was developed by James McCartney starting in 1996. It was initially proprietary software for Macintosh but was released as free software under the GPL in 2002. The language has become a standard tool in the computer music community, used for live coding performances and academic research.

# SEE ALSO

[scsynth](/man/scsynth)(1), [jack](/man/jack)(1), [csound](/man/csound)(1), [puredata](/man/puredata)(1)
