# TLDR

**Copy text to clipboard**

```echo "[text]" | pbcopy```

**Copy file contents**

```pbcopy < [file.txt]```

**Copy command output**

```ls -la | pbcopy```

**Paste from clipboard**

```pbpaste```

**Paste to file**

```pbpaste > [file.txt]```

# SYNOPSIS

**pbcopy** [_options_]

**pbpaste** [_options_]

# DESCRIPTION

**pbcopy** copies standard input to the macOS clipboard (pasteboard). Its companion **pbpaste** outputs clipboard contents to standard output.

These tools integrate the command line with the graphical clipboard, enabling scripted clipboard operations.

# PARAMETERS

**-pboard** _name_
> Pasteboard name (general, ruler, find, font).

**-Prefer** _type_
> Preferred data type (txt, rtf, ps).

# USAGE EXAMPLES

Copy output and paste elsewhere:
```
cat file.txt | pbcopy
# Cmd+V in any application
```

Process clipboard contents:
```
pbpaste | grep pattern
```

# CAVEATS

macOS only. Rich text may not copy as expected. Binary data needs careful handling. Pasteboard changes affect system clipboard.

# HISTORY

**pbcopy** and **pbpaste** are macOS utilities provided by **Apple**. They have been part of macOS since early versions, providing command-line access to the system pasteboard (clipboard).

# SEE ALSO

[xclip](/man/xclip)(1), [xsel](/man/xsel)(1), [wl-copy](/man/wl-copy)(1)
