# TLDR

**Start** interactive Python

```bpython```

**Run** with specific Python version

```bpython3```

**Execute** file

```bpython [script.py]```

# SYNOPSIS

**bpython** [_options_] [_file_]

# DESCRIPTION

**bpython** is an enhanced Python REPL (Read-Eval-Print-Loop) with features like syntax highlighting, auto-completion, automatic indentation, and inline documentation. It provides a user-friendly interface for interactive Python development.

The tool improves the standard Python interactive interpreter experience with modern IDE-like features.

# PARAMETERS

**-i**
> Run file then interactive mode

**-q**
> Quiet mode (no banner)

**-c** _command_
> Execute command

**--config** _file_
> Configuration file

# FEATURES

- Syntax highlighting
- Auto-completion as you type
- Expected parameter list
- Inline documentation (F1)
- Rewind/replay execution (Ctrl+R)
- Save session to file (F2)
- Undo (Ctrl+C)
- Pastebin integration (F8)
- vi/emacs key bindings

# KEYBINDINGS

- **F1** - Show documentation
- **F2** - Save to file
- **F8** - Send to pastebin
- **Ctrl+R** - Rewind/replay
- **Ctrl+C** - Undo last input
- **Tab** - Auto-completion
- **Ctrl+D** - Exit

# CONFIGURATION

~/.config/bpython/config:
```ini
[general]
auto_display_list = True
syntax = True
color_scheme = default
```

# CAVEATS

Not a drop-in replacement for complex scripts. Some extensions may not work. Slower startup than standard Python. Replay feature has limitations. Not suitable for production use.

# HISTORY

**bpython** was created by Bob Farrell and others around **2008** to provide a more user-friendly Python REPL experience.

# SEE ALSO

[python](/man/python)(1), [ipython](/man/ipython)(1), [ptpython](/man/ptpython)(1)
