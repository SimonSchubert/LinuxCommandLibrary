# TAGLINE

Play MIDI files through ALSA sequencer

# TLDR

**Play** MIDI file

```aplaymidi -p [hw:1,0] [file.mid]```

**List** available MIDI ports

```aplaymidi -l```

Play with **delay** after the end of each file

```aplaymidi -p [hw:1,0] -d [2] [file.mid]```

# SYNOPSIS

**aplaymidi** [_-p port_] [_-d delay_] _files_

# DESCRIPTION

**aplaymidi** plays MIDI files through ALSA sequencer ports. It sends MIDI events to connected hardware synthesizers, software synths, or other MIDI applications.

Unlike audio players, aplaymidi only sends MIDI messages; actual sound generation depends on the receiving device or software.

# PARAMETERS

**-p** _client:port_, **--port** _client:port_
> Set the sequencer port(s) to which MIDI events are sent. A client can be specified by number, name, or name prefix.

**-l**, **--list**
> List available MIDI ports

**-d** _seconds_, **--delay** _seconds_
> Delay after the end of each MIDI file, to allow the last notes to die away.

**-h**, **--help**
> Print a list of options.

**-V**, **--version**
> Print the current version.

# CAVEATS

Requires a connected MIDI synthesizer (hardware or software) to produce sound. Port numbers may change if MIDI devices are reconnected. Only plays Standard MIDI Files (SMF).

# HISTORY

**aplaymidi** is part of the ALSA utilities, providing basic MIDI file playback since ALSA became the standard Linux audio architecture in the early **2000s**.

# INSTALL

```apt: sudo apt install alsa-utils```

```dnf: sudo dnf install alsa-utils```

```pacman: sudo pacman -S alsa-utils```

```apk: sudo apk add alsa-utils```

```zypper: sudo zypper install alsa-utils```

```nix: nix profile install nixpkgs#alsa-utils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[arecordmidi](/man/arecordmidi)(1), [aconnect](/man/aconnect)(1), [timidity](/man/timidity)(1), [fluidsynth](/man/fluidsynth)(1)
