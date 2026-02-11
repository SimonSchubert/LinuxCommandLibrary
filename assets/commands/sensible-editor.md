# TAGLINE

Open user's preferred text editor

# TLDR

Open a **file** in the default editor

```sensible-editor path/to/file```

Open with cursor at **end of file**

```sensible-editor + path/to/file```

Open with cursor at **line 10**

```sensible-editor +10 path/to/file```

Open **multiple files** in split windows

```sensible-editor -O3 path/to/file1 path/to/file2 path/to/file3```

# SYNOPSIS

**sensible-editor** [_options_] [_file_...]

# PARAMETERS

**+**
> Position cursor at end of file

**+**_N_
> Position cursor at line N

**-O**_N_
> Open N files in vertical split

# DESCRIPTION

**sensible-editor** opens files in the user's preferred text editor. It checks environment variables (VISUAL, EDITOR) and system defaults to determine which editor to launch.

Options are passed through to the underlying editor (typically vim, nano, or emacs).

# CAVEATS

Behavior depends on environment configuration and which editor is default. Some options may not work with all editors.

# HISTORY

Part of **sensible-utils** package, providing Debian policy-compliant default application launchers.

# SEE ALSO

[editor](/man/editor)(1), [update-alternatives](/man/update-alternatives)(8)
