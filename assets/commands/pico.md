# TLDR

**Open a file** for editing

```pico [path/to/file]```

**Open a file** at a specific line number

```pico +[10] [path/to/file]```

**Open a file in read-only mode**

```pico -v [path/to/file]```

**Enable mouse support** in xterm

```pico -m [path/to/file]```

**Disable line wrapping**

```pico -w [path/to/file]```

**Use an alternate spell checker**

```pico -s [aspell] [path/to/file]```

# SYNOPSIS

**pico** [_options_] [_file_]

**pico** +_line_ [_options_] [_file_]

# PARAMETERS

**+**_n_
> Start with cursor at line n

**-a**
> Show hidden files (starting with .) in file browser

**-d**
> Rebind delete key to delete character under cursor

**-e**
> Enable filename completion

**-f**
> Use function keys for commands

**-g**
> Show cursor position in file browser

**-h**
> Display help and exit

**-j**
> Enable Goto command in file browser

**-k**
> Cut from cursor to end of line instead of whole line

**-m**
> Enable mouse support (in xterm)

**-n** _SECS_
> Enable new mail notification (default: 180 seconds)

**-o** _DIR_
> Restrict operation to specified directory

**-s** _PROG_
> Use alternate spell checker program

**-t**
> Tool mode for use within other programs

**-v**
> View mode (read-only)

**-w**
> Disable word wrap; long lines extend off screen

**-x**
> Disable bottom command menu

**-z**
> Enable suspend with Ctrl+Z

# KEYBOARD COMMANDS

**Ctrl+G**
> Display help

**Ctrl+X**
> Exit (prompts to save)

**Ctrl+O**
> Write out (save file)

**Ctrl+R**
> Read/insert file

**Ctrl+W**
> Search (Where Is)

**Ctrl+K**
> Cut line

**Ctrl+U**
> Paste (Uncut)

**Ctrl+J**
> Justify paragraph

**Ctrl+T**
> Spell check

**Ctrl+C**
> Show cursor position

**Ctrl+Y**
> Previous page

**Ctrl+V**
> Next page

# DESCRIPTION

**pico** is a simple, user-friendly text editor originally developed as the composer for the Pine email client. Commands are displayed at the bottom of the screen, making it accessible for beginners. Context-sensitive help is available with **Ctrl+G**.

The editor provides basic features including search, cut/paste, spell checking, and paragraph justification. It uses a modeless interface where keystrokes insert text directly, and commands use Control key combinations.

On most modern Linux distributions, **pico** is a symbolic link to **nano**, which is a free software reimplementation with additional features. Both editors share the same interface style and keyboard commands.

# CAVEATS

Pico was originally part of the Pine email suite which had licensing restrictions. The **nano** editor was created as a free replacement and is more commonly available. Files are saved with Unix line endings. When disconnected (SIGHUP), pico saves work to filename.save or pico.save.

# HISTORY

Pico was developed at the **University of Washington** as part of the **Pine** email client, first released in **1992**. The name stands for "**P**ine **I**nternal **CO**mposer" or "**P**rogram for **I**nternet **CO**mmunications". Due to Pine's restrictive license, the GNU project created **nano** in **1999** as a free replacement. Nano eventually superseded pico in most distributions, though the pico command often remains as an alias.

# SEE ALSO

[nano](/man/nano)(1), [vi](/man/vi)(1), [emacs](/man/emacs)(1), [pine](/man/pine)(1)
