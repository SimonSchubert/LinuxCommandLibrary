# TAGLINE

File cut, copy, and paste for terminal

# TLDR

**Cut files**

```xcv x [file1] [file2]```

**Copy files**

```xcv c [file1] [file2]```

**Paste files**

```xcv v```

**List clipboard**

```xcv l```

**Paste to directory**

```xcv v [directory/]```

# SYNOPSIS

**xcv** _x_|_c_|_v_|_l_ [_options_] [_files_]

# PARAMETERS

**x**
> Cut files (uses mv).

**c**
> Copy files (uses cp).

**v**
> Paste files to current directory.

**l**
> List files in clipboard.

# DESCRIPTION

**xcv** provides clipboard-style cut, copy, and paste operations for files in the terminal. Files are staged in the ~/.xcv directory, acting as a persistent clipboard between operations. The x command cuts (moves) files to the staging area, c copies them, v pastes them to the current or specified directory, and l lists the current clipboard contents.

The tool wraps the standard cp and mv commands, providing a simple and intuitive workflow for moving files around without needing to type full source and destination paths.

# CAVEATS

Files stored in ~/.xcv. Bash required. Install via npm.

# HISTORY

**xcv** was created as a simple bash tool to provide cut, copy, and paste functionality for files in the terminal.

# SEE ALSO

[cp](/man/cp)(1), [mv](/man/mv)(1), [xclip](/man/xclip)(1)
