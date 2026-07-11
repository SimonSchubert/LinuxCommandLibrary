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

**Use a specific sequence** of filters

```detox -s [iso8859_1] [files]```

**List available sequences**

```detox -L```

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
> Cleaning sequence to use (default runs the safe and wipeup filters).

**-L**
> List the currently available sequences.

**--special**
> Work on links and special files too.

**-f** _FILE_
> Use specified configuration file instead of the defaults.

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

detox was written by **Doug Harple** to address the common problem of managing files with problematic names in Unix environments. It provides a systematic approach to filename sanitization.

# SEE ALSO

[rename](/man/rename)(1), [mv](/man/mv)(1), [convmv](/man/convmv)(1)

# RESOURCES

```[Source code](https://github.com/dharple/detox)```

<!-- verified: 2026-07-11 -->
