# TAGLINE

DJ mixing software

# TLDR

**Start Mixxx**

```mixxx```

**Open specific file**

```mixxx [music.mp3]```

**Full screen mode**

```mixxx --fullScreen```

**Specify settings path**

```mixxx --settingsPath [/path/to/config]```

**Debug mode**

```mixxx --debugAssertBreak```

# SYNOPSIS

**mixxx** [_options_] [_file_]

# PARAMETERS

_FILE_
> Music file to load.

**--fullScreen**
> Start full screen.

**--settingsPath** _DIR_
> Configuration directory.

**--midiDebug**
> Enable MIDI debugging.

**--resourcePath** _DIR_
> Resource path.

**--help**
> Display help information.

# DESCRIPTION

**mixxx** is DJ mixing software. It provides digital DJ features with controller support.

The tool offers beat detection, effects, and library management. Supports MIDI controllers.

# CAVEATS

Audio latency varies. Controller mapping needed. Resource intensive.

# HISTORY

Mixxx started in 2001 as an open-source alternative to commercial **DJ software** like Traktor.

# INSTALL

```apt: sudo apt install mixxx```

```dnf: sudo dnf install mixxx```

```pacman: sudo pacman -S mixxx```

```apk: sudo apk add mixxx```

```zypper: sudo zypper install mixxx```

```nix: nix profile install nixpkgs#mixxx```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[audacity](/man/audacity)(1), [ardour](/man/ardour)(1)

