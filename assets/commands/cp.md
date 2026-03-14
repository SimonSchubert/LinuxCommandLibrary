# TAGLINE

Copy files and directories

# TLDR

**Copy a file to a destination**

```cp [path/to/source.txt] [path/to/destination.txt]```

**Copy a directory recursively**

```cp -r [path/to/source_dir] [path/to/dest_dir]```

**Copy with interactive prompt before overwrite**

```cp -i [path/to/source] [path/to/dest]```

**Preserve mode, ownership, and timestamps**

```cp -p [path/to/source] [path/to/dest]```

**Archive copy (preserve all attributes, recursive)**

```cp -a [path/to/source_dir] [path/to/dest_dir]```

**Copy multiple files to a directory**

```cp [file1] [file2] [file3] [path/to/dest_dir/]```

# SYNOPSIS

**cp** [_options_] [**-T**] _source_ _dest_
**cp** [_options_] _source..._ _directory_
**cp** [_options_] **-t** _directory_ _source..._

# DESCRIPTION

**cp** copies files and directories. It can copy single files, multiple files to a directory, or entire directory trees. It preserves or modifies file attributes depending on options used.

The command is a fundamental tool for file management on Unix systems.

# PARAMETERS

**-r**, **-R**, **--recursive**
> Copy directories recursively

**-i**, **--interactive**
> Prompt before overwrite

**-f**, **--force**
> Force overwrite

**-n**, **--no-clobber**
> Don't overwrite existing files

**-p**, **--preserve**
> Preserve mode, ownership, timestamps

**-a**, **--archive**
> Archive mode (same as -dR --preserve=all)

**-u**, **--update**
> Copy only when source is newer

**-v**, **--verbose**
> Verbose output

**-l**, **--link**
> Hard link instead of copy

**-s**, **--symbolic-link**
> Symbolic link instead of copy

**-t**, **--target-directory** _DIR_
> Copy all sources into DIR

**-T**, **--no-target-directory**
> Treat destination as a normal file

**--backup**[=_CONTROL_]
> Backup existing files

**-d**
> Same as --no-dereference --preserve=links

**--preserve**=_ATTR_LIST_
> Preserve specified attributes (mode,ownership,timestamps,context,links,xattr,all)

# WORKFLOW

```bash
# Copy file
cp file.txt copy.txt

# Copy to directory
cp file.txt /tmp/

# Copy multiple files
cp file1.txt file2.txt file3.txt /destination/

# Copy directory
cp -r source_dir/ destination_dir/

# Preserve attributes
cp -p original.txt copy.txt

# Archive copy (preserve everything)
cp -a directory/ backup/

# Interactive (ask before overwrite)
cp -i file.txt existing.txt

# Backup existing file
cp --backup file.txt existing.txt
```

# COPYING DIRECTORIES

```bash
# Copy directory and contents
cp -r project/ project_backup/

# Archive mode (preserve all attributes)
cp -a /data/ /backup/data/

# Update only newer files
cp -ru source/ destination/
```

# CAVEATS

Without -r, cannot copy directories. Overwrites by default (use -i for safety). When -n and -i are both given, the last one takes precedence. -p doesn't always preserve all attributes (use --preserve=all for everything). Large recursive copies can be slow. Sparse files may not be handled efficiently without --sparse=always. Symlinks are copied as links or dereferenced depending on options.

# HISTORY

**cp** has been a core Unix command since the early **1970s**, part of the original Unix toolset.

# SEE ALSO

[mv](/man/mv)(1), [rm](/man/rm)(1), [ln](/man/ln)(1), [rsync](/man/rsync)(1), [install](/man/install)(1), [dd](/man/dd)(1)
