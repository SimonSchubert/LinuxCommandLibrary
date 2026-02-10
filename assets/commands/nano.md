# TAGLINE

simple text editor

# TLDR

**Open file**

```nano [file.txt]```

**Open at specific line**

```nano +[10] [file.txt]```

**Open read-only**

```nano -v [file.txt]```

**Enable line numbers**

```nano -l [file.txt]```

**Disable line wrapping**

```nano -w [file.txt]```

**Open with backup**

```nano -B [file.txt]```

**Set tab size**

```nano -T [4] [file.txt]```

# SYNOPSIS

**nano** [_options_] [_file_]

# PARAMETERS

_FILE_
> File to edit.

**+** _LINE_
> Start at line number.

**-v**
> View mode (read-only).

**-l**
> Show line numbers.

**-w**
> Don't wrap long lines.

**-B**
> Create backup files.

**-T** _NUM_
> Tab size.

**--help**
> Display help information.

# DESCRIPTION

**nano** is a simple text editor. It provides an easy-to-use terminal editor.

The tool shows shortcuts at bottom. Beginner-friendly alternative to vi/vim.

# CAVEATS

Less powerful than vim/emacs. Ctrl-based shortcuts. Config in ~/.nanorc.

# HISTORY

nano was created as a **free replacement** for the Pico editor, part of the GNU project since 2001.

# SEE ALSO

[vim](/man/vim)(1), [emacs](/man/emacs)(1), [pico](/man/pico)(1)

