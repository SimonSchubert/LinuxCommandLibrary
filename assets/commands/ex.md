# TLDR

**Start ex mode**

```ex [file.txt]```

**Execute command** and quit

```ex -c "[:%s/old/new/g]" -c "[:wq]" [file.txt]```

**Edit multiple files**

```ex [file1.txt] [file2.txt]```

**Read from stdin**

```echo "command" | ex [file.txt]```

# SYNOPSIS

**ex** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files to edit.

**-c** _COMMAND_
> Execute command after loading.

**-s**
> Silent mode.

**-R**
> Read-only mode.

**-n**
> No swap file.

**-V**
> Verbose mode.

# DESCRIPTION

**ex** is the line-editing mode of vi/vim. It provides command-line editing without the visual interface, useful for scripted file modifications.

Commands are entered on a command line rather than visual mode. The same command language powers vi's : commands. ex can process multiple files sequentially.

ex is valuable for batch editing, allowing search/replace and other modifications without interactive use.

# CAVEATS

Learning curve if unfamiliar with ed/vi commands. No visual feedback. Complex edits may be error-prone. Usually invoked via vim -e.

# HISTORY

ex was developed by **Bill Joy** at UC Berkeley in the late 1970s as an extended version of ed. It later gained the visual interface that became vi, with ex remaining as the command mode.

# SEE ALSO

[vi](/man/vi)(1), [vim](/man/vim)(1), [ed](/man/ed)(1), [sed](/man/sed)(1)
