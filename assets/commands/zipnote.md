# TAGLINE

Manage ZIP file comments

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

**zipnote** reads and writes comments stored in ZIP archives. ZIP files support per-file comments and an overall archive comment, and zipnote provides a way to view and modify these metadata fields from the command line.

In read mode (the default), zipnote outputs a structured listing of all filenames and their associated comments. The output uses a specific format with **@** markers separating entries, which can be redirected to a file for editing.

In write mode (**-w**), zipnote reads the modified structured format from standard input and updates the archive's comments accordingly. This workflow allows batch editing of comments across all files in an archive. zipnote is part of the Info-ZIP suite of utilities.

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
