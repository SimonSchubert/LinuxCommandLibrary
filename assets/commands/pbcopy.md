# TAGLINE

copies standard input to the macOS clipboard

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

**Paste, preferring rich text**

```pbpaste -Prefer rtf```

**Copy to the find pasteboard**

```echo "[text]" | pbcopy -pboard find```

# SYNOPSIS

**pbcopy** [**-help**] [**-pboard** _name_]

**pbpaste** [**-help**] [**-pboard** _name_] [**-Prefer** _type_]

# DESCRIPTION

**pbcopy** copies standard input to the macOS clipboard (pasteboard). Its companion **pbpaste** outputs clipboard contents to standard output.

Input is stored as plain text unless it begins with an Encapsulated PostScript or Rich Text Format header, in which case it is stored as that type. **pbpaste** looks for plain text first, then EPS, then RTF, and prints nothing if none is present.

These tools integrate the command line with the graphical clipboard, enabling scripted clipboard operations.

# PARAMETERS

**-pboard** _name_
> Pasteboard to use: general (default), ruler, find, or font.

**-Prefer** _type_
> With **pbpaste** only, the data type to look for first: txt, rtf, or ps.

**-help**
> Show usage information.

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

macOS only. Encoding follows the locale environment variables, so set **LANG** to a UTF-8 locale if non-ASCII text comes out wrong. Writing to the general pasteboard replaces the system clipboard. There is no way to make **pbpaste** return only one data type.

# HISTORY

**pbcopy** and **pbpaste** are macOS utilities provided by **Apple**, giving command-line access to the system pasteboard (clipboard).

# SEE ALSO

[xclip](/man/xclip)(1), [xsel](/man/xsel)(1), [wl-copy](/man/wl-copy)(1), [wl-paste](/man/wl-paste)(1)
