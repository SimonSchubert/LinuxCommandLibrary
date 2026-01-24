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

**xcv** cuts, copies, and pastes files. It's like clipboard for terminal.

File clipboard. Terminal based.

Uses ~/.xcv directory. Staging area.

Wraps cp and mv. Familiar options.

Simple workflow. x, c, v, l.

# CAVEATS

Files stored in ~/.xcv. Bash required. Install via npm.

# HISTORY

**xcv** was created as a simple bash tool to provide cut, copy, and paste functionality for files in the terminal.

# SEE ALSO

[cp](/man/cp)(1), [mv](/man/mv)(1), [xclip](/man/xclip)(1)
