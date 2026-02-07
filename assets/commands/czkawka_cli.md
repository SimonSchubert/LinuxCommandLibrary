# TAGLINE

fast multi-function file cleaner written in Rust

# TLDR

**Find duplicate files**

```czkawka_cli dup -d [/path/to/search]```

**Find empty files**

```czkawka_cli empty-files -d [/path/to/search]```

**Find empty directories**

```czkawka_cli empty-folders -d [/path/to/search]```

**Find big files**

```czkawka_cli big -d [/path/to/search]```

**Find similar images**

```czkawka_cli image -d [/path/to/search]```

**Find temporary files**

```czkawka_cli temp -d [/path/to/search]```

# SYNOPSIS

**czkawka_cli** _command_ [_options_]

# SUBCOMMANDS

**dup**
> Find duplicate files.

**empty-files**
> Find empty files.

**empty-folders**
> Find empty directories.

**big**
> Find large files.

**temp**
> Find temporary files.

**image**
> Find similar images.

**music**
> Find similar music by tags.

**symlinks**
> Find invalid symlinks.

**broken**
> Find broken files.

# PARAMETERS

**-d**, **--directories** _paths_
> Directories to search.

**-e**, **--excluded** _paths_
> Directories to exclude.

**-f**, **--file-to-save** _file_
> Save results to file.

**-D**, **--delete-files**
> Delete found files.

# DESCRIPTION

**czkawka_cli** (Polish for "hiccup") is a fast duplicate file finder and cleaner. It can find duplicate files, similar images, empty files/directories, large files, and temporary files.

Written in Rust for high performance, it's the CLI version of the Czkawka application.

# CAVEATS

The **-D** flag permanently deletes files. Always review results before deletion. Use **-f** to save results first.

# SEE ALSO

[fdupes](/man/fdupes)(1), [rmlint](/man/rmlint)(1)
