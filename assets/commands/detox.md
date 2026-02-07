# TAGLINE

clean up problematic filenames

# TLDR

**Clean filenames** in current directory

```detox *```

**Clean filenames recursively**

```detox -r [directory]```

**Preview changes** without renaming

```detox -n [files]```

**Show verbose output**

```detox -v [files]```

**Use specific sequence** file

```detox -s [utf_8] [files]```

**Clean hidden files** too

```detox -a [directory]```

# SYNOPSIS

**detox** [_options_] _file-or-directory_...

# PARAMETERS

_FILE_
> Files or directories to process.

**-r**, **--recurse**
> Process directories recursively.

**-n**, **--dry-run**
> Show what would be renamed without changes.

**-v**, **--verbose**
> Verbose output showing renames.

**-s** _SEQUENCE_
> Cleaning sequence to use.

**-a**
> Work on hidden files/directories.

**-f** _FILE_
> Use specified configuration file.

**--help**
> Display help information.

# DESCRIPTION

**detox** cleans up filenames by replacing problematic characters with safe alternatives. It handles spaces, special characters, Unicode characters, and other elements that can cause issues in shell scripts or cross-platform file sharing.

The tool applies configurable sequences of transformations including replacing spaces with underscores, removing or transliterating non-ASCII characters, and fixing case issues. Multiple built-in sequences handle different cleaning scenarios.

detox is valuable for batch-processing files from Windows systems, music libraries with complex names, or any source with inconsistent naming conventions.

# CONFIGURATION

**/etc/detoxrc** or **~/.detoxrc**
> Configuration file defining cleaning sequences and filename filters.

# CAVEATS

May create duplicate filenames requiring manual resolution. Irreversible without backups. Unicode transliteration may lose information. Some sequences are aggressive and may over-simplify names.

# HISTORY

detox was written by **Doug Harber** to address the common problem of managing files with problematic names in Unix environments. It provides a systematic approach to filename sanitization.

# SEE ALSO

[rename](/man/rename)(1), [mv](/man/mv)(1), [convmv](/man/convmv)(1)
