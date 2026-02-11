# TAGLINE

Record terminal sessions as GIF

# TLDR

**Start recording**

```terminalizer record [filename]```

**Play recording**

```terminalizer play [filename.yml]```

**Render to GIF**

```terminalizer render [filename.yml]```

**Configure settings**

```terminalizer config```

**Share recording**

```terminalizer share [filename.yml]```

**Generate link**

```terminalizer generate [filename.yml]```

# SYNOPSIS

**terminalizer** _command_ [_options_] [_file_]

# PARAMETERS

**record**
> Record session.

**play**
> Play recording.

**render**
> Generate GIF.

**config**
> Edit config.

**share**
> Share online.

**-d** _MS_
> Frame delay.

# DESCRIPTION

**terminalizer** records terminal sessions and renders them as GIF animations for sharing in documentation, README files, and tutorials. It captures both keystrokes and terminal output, storing recordings in an editable YAML format.

Recordings can be played back in the terminal, rendered to GIF, or shared online via terminalizer.com. The YAML format allows editing timing, removing mistakes, and customizing the appearance including colors, fonts, window frame style, and dimensions before rendering the final animation.

# CAVEATS

Node.js required. Large GIF files. Render time varies.

# HISTORY

**Terminalizer** was created to record and share terminal sessions as GIF animations.

# SEE ALSO

[asciinema](/man/asciinema)(1), [script](/man/script)(1), [ttyrec](/man/ttyrec)(1)
