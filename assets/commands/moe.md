# TAGLINE

modeless text editor

# TLDR

**Edit file**

```moe [file.txt]```

**Open multiple files**

```moe [file1.txt] [file2.txt]```

**Read-only mode**

```moe -r [file.txt]```

**Set tab width**

```moe -t [4] [file.txt]```

# SYNOPSIS

**moe** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to edit.

**-r**
> Read-only mode.

**-t** _WIDTH_
> Tab width.

**--help**
> Display help information.

# DESCRIPTION

**moe** is a modeless text editor. It provides a simpler alternative to vi/emacs.

The tool uses common keybindings. No mode switching required.

# CAVEATS

Less powerful than vim/emacs. Simpler learning curve. ncurses interface.

# HISTORY

moe was created as a simple, **modeless** text editor for those who prefer no mode switching.

# SEE ALSO

[nano](/man/nano)(1), [micro](/man/micro)(1), [joe](/man/joe)(1)

