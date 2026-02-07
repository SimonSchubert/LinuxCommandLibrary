# TAGLINE

Strip directory and suffix from filenames.

# TLDR

**Extract** filename from path

```basename [/path/to/file.txt]```

**Remove** suffix

```basename [/path/to/file.txt] [.txt]```

**Multiple** files

```basename -a [/path/to/file1.txt] [/path/to/file2.txt]```

Remove **any suffix**

```basename -s [.txt] [/path/to/file.txt]```

# SYNOPSIS

**basename** _path_ [_suffix_]

# DESCRIPTION

**basename** removes directory components from a pathname, leaving only the final filename. It can optionally remove a trailing suffix, making it useful for extracting filenames in shell scripts.

The tool is part of GNU coreutils and commonly used in build scripts and file processing pipelines.

# PARAMETERS

**-a**, **--multiple**
> Process multiple arguments

**-s**, **--suffix=**_suffix_
> Remove trailing suffix

**-z**, **--zero**
> Separate output with NUL instead of newline

# BEHAVIOR

Given `/path/to/file.txt`:
- **basename** returns `file.txt`
- **basename** with suffix `.txt` returns `file`

# WORKFLOW

```bash
# Get filename
basename /usr/local/bin/command
# Output: command

# Remove extension
basename /path/to/document.pdf .pdf
# Output: document

# In scripts
filename=$(basename "$filepath")
name=$(basename "$filepath" .txt)

# Multiple files
basename -a /path/*.txt
```

# CAVEATS

Only removes trailing suffix (not all occurrences). Doesn't handle multiple extensions well (use parameter expansion for that). Path doesn't need to exist.

# HISTORY

**basename** has been part of Unix since the early days, included in POSIX standards, and is available in GNU coreutils since **1992**.

# SEE ALSO

[dirname](/man/dirname)(1), [realpath](/man/realpath)(1), [readlink](/man/readlink)(1)
