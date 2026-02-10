# TAGLINE

open-source text editor inspired by Sublime Text

# TLDR

**Start Lime text editor**

```lime```

**Open file**

```lime [file.txt]```

**Open multiple files**

```lime [file1.txt] [file2.txt]```

**Open file at specific line**

```lime [file.txt]:[line_number]```

# SYNOPSIS

**lime** [_options_] [_files_...]

# PARAMETERS

**-h**, **--help**
> Show help message.

**-v**, **--version**
> Show version.

**--debug**
> Enable debug mode.

# DESCRIPTION

**lime** (Lime Text) is an open-source text editor inspired by Sublime Text. It aims to provide a Sublime Text compatible editor with an open-source codebase.

Lime supports multiple cursors, split editing, command palette, and is extensible through Python plugins. The backend is written in Go.

# KEY FEATURES

```
- Sublime Text compatibility
- Multiple cursors
- Split editing
- Command palette
- Python plugin system
- Cross-platform
```

# CAVEATS

Development has slowed significantly. Not feature-complete compared to Sublime Text. Frontend implementations vary in maturity.

# HISTORY

Lime was started by **Fredrik Ehnbom** in **2013** as an attempt to create an open-source clone of Sublime Text with a Go backend.

# SEE ALSO

[sublime](/man/sublime)(1), [vim](/man/vim)(1), [nano](/man/nano)(1), [code](/man/code)(1)
