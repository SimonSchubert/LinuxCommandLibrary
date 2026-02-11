# TAGLINE

Record terminal sessions as GIFs

# TLDR

**Record terminal**

```vhs [script.tape]```

**Create new tape**

```vhs new [script.tape]```

**Validate tape**

```vhs validate [script.tape]```

**Output to specific format**

```vhs [script.tape] --output [demo.gif]```

**Record with theme**

```vhs [script.tape] --theme [Dracula]```

# SYNOPSIS

**vhs** [_command_] [_options_] [_file.tape_]

# PARAMETERS

**new** _FILE_
> Create tape file.

**validate** _FILE_
> Check tape syntax.

**--output** _FILE_
> Output file.

**--theme** _NAME_
> Terminal theme.

**--shell** _SHELL_
> Shell to use.

# TAPE COMMANDS

**Type** _TEXT_ - Type text
**Enter** - Press enter
**Sleep** _DURATION_ - Wait
**Set** _OPTION_ _VALUE_ - Configure
**Output** _FILE_ - Set output
**Hide** / **Show** - Control visibility

# DESCRIPTION

**vhs** creates terminal recordings as GIFs, WebM, or MP4 files from declarative script files called tapes. Tape files define a sequence of actions such as typing text, pressing keys, and waiting, producing reproducible recordings that can be regenerated consistently.

The tool renders a virtual terminal and captures frames, so recordings look clean regardless of the actual terminal environment. Themes, font sizes, and window dimensions are configurable within the tape file. This makes VHS ideal for creating documentation demos, README GIFs, and tutorial content.

# EXAMPLE TAPE

```
Output demo.gif
Set FontSize 20
Type "echo Hello"
Enter
Sleep 2s
```

# CAVEATS

Requires ffmpeg for encoding. Large recordings take time. Complex interactions need scripting.

# HISTORY

**VHS** was created by **Charm** for terminal recording. It provides reproducible, high-quality terminal GIFs.

# SEE ALSO

[asciinema](/man/asciinema)(1), [ttyrec](/man/ttyrec)(1), [terminalizer](/man/terminalizer)(1)
