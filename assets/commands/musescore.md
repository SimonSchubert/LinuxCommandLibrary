# TLDR

**Open MuseScore**

```musescore```

**Open score file**

```musescore [score.mscz]```

**Export to PDF**

```musescore [score.mscz] -o [output.pdf]```

**Export to audio**

```musescore [score.mscz] -o [output.mp3]```

**Batch convert files**

```musescore -j [job.json]```

**Run without GUI**

```musescore --no-gui [score.mscz] -o [output.pdf]```

# SYNOPSIS

**musescore** [_options_] [_files_]

# PARAMETERS

_FILES_
> Score files to open.

**-o** _FILE_
> Output file.

**-j** _FILE_
> Batch job file (JSON).

**--no-gui**
> Headless mode.

**-S** _FILE_
> Style file to use.

**--help**
> Display help information.

# DESCRIPTION

**musescore** is free music notation software. It creates, plays, and prints sheet music.

The tool supports many formats. MIDI, MusicXML, PDF export. Professional features.

musescore is music notation editor.

# CAVEATS

GUI application. Soundfont required for playback. Resource intensive for large scores.

# HISTORY

MuseScore was first released in **2002** as open-source alternative to commercial notation software.

# SEE ALSO

[mscore](/man/mscore)(1), [lilypond](/man/lilypond)(1), [abc2midi](/man/abc2midi)(1)

