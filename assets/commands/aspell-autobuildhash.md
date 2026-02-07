# TAGLINE

Rebuild aspell dictionary hash files

# TLDR

**Rebuild** all hash files

```sudo aspell-autobuildhash```

Rebuild for **specific language**

```sudo aspell-autobuildhash --lang=[en]```

# SYNOPSIS

**aspell-autobuildhash** [_--force_] [_--lang=lang_]

# DESCRIPTION

**aspell-autobuildhash** regenerates aspell's hash files from dictionary sources. These hash files are used for fast spell checking and are typically rebuilt automatically after dictionary updates.

The script scans for dictionary source files and creates corresponding hash files.

# PARAMETERS

**--force**
> Force rebuild even if hash is current

**--lang=**_code_
> Process specific language only

# CAVEATS

Requires root privileges to write to system dictionary directories. Automatically run by package managers after dictionary installation.

# HISTORY

**aspell-autobuildhash** was added to simplify dictionary management, automatically regenerating hash files after updates.

# SEE ALSO

[aspell](/man/aspell)(1), [aspell-import](/man/aspell-import)(1)
