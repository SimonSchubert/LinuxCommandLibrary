# TLDR

**Show file comments**

```zipnote [archive.zip]```

**Edit comments**

```zipnote [archive.zip] > [notes.txt] && vim [notes.txt] && zipnote -w [archive.zip] < [notes.txt]```

**Write comments from file**

```zipnote -w [archive.zip] < [notes.txt]```

# SYNOPSIS

**zipnote** [_-w_] [_options_] _zipfile_

# PARAMETERS

**-w**
> Write mode.

**-b** _PATH_
> Temp file path.

**-h**
> Show help.

**-v**
> Show version.

# DESCRIPTION

**zipnote** reads and writes ZIP file comments. It manages metadata.

Read mode outputs comments. Each file's comment shown.

Output format is structured. File names and comments separated.

Write mode updates comments. Reads modified format.

Archive comments also handled. Overall archive description.

# FORMAT

```
@ filename
comment text here
@ (comment above this line)
@ filename2
```

# CAVEATS

Part of Info-ZIP. Specific format required. Edit carefully.

# HISTORY

**zipnote** is part of **Info-ZIP** utilities. It enables comment management in ZIP files.

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1), [zipinfo](/man/zipinfo)(1)
