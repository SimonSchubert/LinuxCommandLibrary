# TAGLINE

Record terminal sessions as GIF

# TLDR

**Start recording** to a YAML file

```terminalizer record [filename]```

**Record with a custom config** file

```terminalizer record [filename] -c [config.yml]```

**Record with a custom command** instead of the default shell

```terminalizer record [filename] -d "[bash -l]"```

**Play a recording**

```terminalizer play [filename.yml]```

**Render recording** to an animated GIF

```terminalizer render [filename.yml] -o [output.gif]```

**Generate global config** file

```terminalizer init```

**Share recording online**

```terminalizer share [filename.yml]```

**Generate a web player** page for the recording

```terminalizer generate [filename.yml]```

# SYNOPSIS

**terminalizer** _command_ [_options_] [_file_]

# PARAMETERS

**record** _FILE_
> Record a terminal session into a YAML file.

**play** _FILE_
> Replay a recorded session in the terminal.

**render** _FILE_
> Render a recording to an animated GIF.

**generate** _FILE_
> Generate a shareable HTML web player link.

**share** _FILE_
> Upload the recording and share it on terminalizer.com.

**init**
> Create a global config file at `~/.terminalizer/config.yml`.

**config**
> Print the default config to stdout.

**-c** _FILE_, **--config** _FILE_
> Use a custom config file.

**-d** _COMMAND_, **--command** _COMMAND_
> Command to run instead of the default shell (record).

**-k**, **--skip-sharing**
> Skip the sharing prompt after recording.

**-o** _FILE_, **--output** _FILE_
> Output file path (render).

**-q** _NUM_, **--quality** _NUM_
> GIF quality 1-100 (render).

**-s** _NUM_, **--step** _NUM_
> Frame step count; higher values reduce GIF size (render).

**-r** _NUM_, **--real-timing**
> Play using original recording speeds (play).

**-h**, **--help**
> Display help information.

# DESCRIPTION

**terminalizer** records terminal sessions and renders them as animated GIFs for sharing in documentation, README files, and tutorials. It captures both keystrokes and terminal output, storing recordings in an editable YAML format.

Recordings can be played back in the terminal, rendered to GIF locally, or shared online via terminalizer.com. The YAML format allows editing timing, removing mistakes, and customizing the appearance including colors, fonts, window frame style, and dimensions before rendering the final animation.

# CAVEATS

Requires **Node.js** (installed via `npm install -g terminalizer`). GIF rendering uses Electron and can be CPU- and memory-intensive. Resulting GIFs may be large; tune `quality` and `step` in the config or via flags to balance size and smoothness.

# HISTORY

**Terminalizer** was created by **Mohammad Fares (faressoft)** and first released in **2017** as an npm package. It provides an alternative to asciinema with the benefit of producing shareable GIF animations without needing a dedicated player.

# SEE ALSO

[asciinema](/man/asciinema)(1), [script](/man/script)(1), [ttyrec](/man/ttyrec)(1)
