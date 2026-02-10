# TAGLINE

KDE Advanced Text Editor, a feature-rich text editor with syntax

# TLDR

**Open file in Kate**

```kate [file]```

**Open file at specific line**

```kate -l [25] [file]```

**Open file at line and column**

```kate -l [25] -c [15] [file]```

**Start with specific session**

```kate -s [sessionname]```

**Open from stdin**

```cat [file] | kate -i```

**Block until editor closes**

```kate -b [file]```

# SYNOPSIS

**kate** [_options_] [_file_...]

# PARAMETERS

**-l**, **--line** _line_
> Navigate to line number.

**-c**, **--column** _column_
> Navigate to column number.

**-s**, **--start** _name_
> Start with given session.

**-n**, **--new**
> Force new Kate instance.

**-b**, **--block**
> Block until editor exits.

**-i**, **--stdin**
> Read document from stdin.

**-e**, **--encoding** _name_
> Set file encoding.

**--tempfile**
> Delete file after closing.

# DESCRIPTION

**kate** is the KDE Advanced Text Editor, a feature-rich text editor with syntax highlighting, code folding, terminal integration, and multi-document support. Suitable for programmers and power users who need advanced editing capabilities.

# SEE ALSO

[kwrite](/man/kwrite)(1), [nano](/man/nano)(1), [vim](/man/vim)(1)

