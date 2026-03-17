# TAGLINE

Line-oriented text editor, the predecessor of vi

# TLDR

**Start ex mode on a file**

```ex [file.txt]```

**Execute a substitution command and quit**

```ex -c "%s/[old]/[new]/g" -c "wq" [file.txt]```

**Open a file in read-only mode**

```ex -R [file.txt]```

**Edit multiple files sequentially**

```ex [file1.txt] [file2.txt]```

# SYNOPSIS

**ex** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files to edit.

**-c** _COMMAND_
> Execute command after loading the first file.

**-s**
> Silent (batch) mode. Suppress all interactive feedback. Useful for scripting.

**-R**
> Read-only mode. Prevents writing to the file.

**-r** _FILE_
> Recover editing session from a swap file after a crash.

**-n**
> Do not use a swap file (vim implementation).

**-t** _TAG_
> Edit the file containing the specified tag.

**-V**
> Verbose mode. Show commands read from stdin.

**-v**
> Start in visual mode (equivalent to running vi).

# DESCRIPTION

**ex** is a line-oriented text editor. It provides command-line editing without a visual interface, using the same command language that powers vi's colon (:) commands. Commands are entered at a prompt rather than in a full-screen display.

ex is particularly valuable for batch editing and scripted file modifications, allowing search/replace and other transformations without interactive use. When combined with **-s** for silent mode, it can process editing commands from stdin or scripts.

The ex and vi editors are the same program started in different modes. Running **ex -v** starts visual mode (vi), and running **vi -e** starts line mode (ex).

# CAVEATS

No visual feedback in ex mode, making complex edits error-prone. Most modern systems provide ex via vim (as **vim -e**). The POSIX specification defines a subset of features; vim's ex mode includes many extensions.

# HISTORY

ex was developed by **Bill Joy** at UC Berkeley in the late 1970s as an extended version of ed. It later gained the visual interface that became vi, with ex remaining as the underlying command mode. ex first appeared in **1BSD** (1978).

# SEE ALSO

[vi](/man/vi)(1), [vim](/man/vim)(1), [ed](/man/ed)(1), [sed](/man/sed)(1)
