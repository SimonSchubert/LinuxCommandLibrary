# TAGLINE

schedules files to be added to the repository on the next commit

# TLDR

**Add a specific file**

```hg add [file]```

**Add all new files**

```hg add```

**Add files by pattern**

```hg add '*.py'```

**Add files in directory**

```hg add [path/to/directory]```

**Dry run to preview**

```hg add -n [file]```

# SYNOPSIS

**hg** **add** [_options_] [_files_...]

# PARAMETERS

**-n**, **--dry-run**
> Do not perform actions, preview only.

**-I**, **--include** _pattern_
> Include files matching pattern.

**-X**, **--exclude** _pattern_
> Exclude files matching pattern.

# DESCRIPTION

**hg add** schedules files to be added to the repository on the next commit. Without arguments, it adds all new files in the working directory. Use a .hgignore file to exclude files from version control. Added files appear with 'A' status in **hg status** until committed.

# SEE ALSO

[hg](/man/hg)(1), [hg-commit](/man/hg-commit)(1), [hg-status](/man/hg-status)(1)

