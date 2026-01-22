# TLDR

**Open MuseScore**

```mscore```

**Open score file**

```mscore [score.mscz]```

**Convert to PDF**

```mscore [score.mscz] -o [output.pdf]```

**Export to MIDI**

```mscore [score.mscz] -o [output.mid]```

**Export to audio**

```mscore [score.mscz] -o [output.mp3]```

**Run in headless mode**

```mscore --no-gui [score.mscz] -o [output.pdf]```

# SYNOPSIS

**mscore** [_options_] [_files_]

# PARAMETERS

_FILES_
> Score files to open.

**-o** _FILE_
> Output file (format from extension).

**--no-gui**
> Run without graphical interface.

**-S** _STYLE_
> Use style file.

**-r** _DPI_
> Set image resolution.

**--help**
> Display help information.

# DESCRIPTION

**mscore** is the MuseScore music notation software. It creates and edits sheet music.

The tool supports MIDI, MusicXML, and audio export. Professional notation features.

mscore is MuseScore notation editor.

# CAVEATS

GUI application. Large dependency footprint. Soundfont needed for audio.

# HISTORY

MuseScore was created as **open-source notation** software, first released in 2002.

# SEE ALSO

[musescore](/man/musescore)(1), [lilypond](/man/lilypond)(1), [timidity](/man/timidity)(1)

