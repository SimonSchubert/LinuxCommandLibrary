# TAGLINE

digital audio workstation

# TLDR

**Start LMMS**

```lmms```

**Open project**

```lmms [project.mmp]```

**Render to audio**

```lmms -r [project.mmp] -o [output.wav]```

**Render to MP3**

```lmms -r [project.mmp] -o [output.mp3] -f mp3```

**Import MIDI**

```lmms --import [file.mid]```

**Headless render**

```lmms -r [project.mmp] -o [output.wav] --loop```

# SYNOPSIS

**lmms** [_options_] [_file_]

# PARAMETERS

_FILE_
> Project file to open.

**-r** _FILE_
> Render project to audio.

**-o** _FILE_
> Output file for rendering.

**-f** _FORMAT_
> Output format (wav, ogg, mp3).

**--import** _FILE_
> Import MIDI file.

**--help**
> Display help information.

# DESCRIPTION

**lmms** is a digital audio workstation. It creates music with virtual instruments, samples, and effects.

The tool provides piano roll, step sequencer, and automation. It supports VST and LADSPA plugins.

# CAVEATS

GUI-based primarily. Plugin support varies by platform. Resource intensive.

# HISTORY

LMMS (Linux MultiMedia Studio) was created to provide a free, cross-platform alternative to commercial DAWs like FL Studio.

# SEE ALSO

[ardour](/man/ardour)(1), [audacity](/man/audacity)(1), [jack](/man/jack)(1)

