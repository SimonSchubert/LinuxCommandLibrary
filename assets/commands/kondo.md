# TAGLINE

Clean dependencies and build artifacts from projects

# TLDR

**Scan the current directory** for cleanable projects

```kondo```

**Scan a specific directory**

```kondo [path/to/directory]```

**Scan multiple directories**

```kondo [path/to/dir1] [path/to/dir2]```

**Filter to projects not modified** for a given period

```kondo -o [3months]```

# SYNOPSIS

**kondo** [_options_] [_directories_...]

# PARAMETERS

**-o**, **--older** _PERIOD_
> Filter projects to those not modified for at least the specified period (e.g., 3months, 1year).

**-a**, **--all**
> Clean all found projects without prompting.

**-f**, **--follow-symlinks**
> Follow symbolic links when scanning.

**-I**, **--ignored-dirs** _DIRS_
> Directories to ignore during scanning.

# DESCRIPTION

**kondo** is a filesystem cleaning tool that recursively searches directories for known project structures and determines how much space can be saved by removing dependency and build artifact directories. It supports **20+ project types** including Cargo (Rust), node_modules (JavaScript), target (Java/Gradle), __pycache__ (Python), and many more.

When cleanable projects are found, kondo displays how much space each one uses and prompts whether to delete the artifacts.

# CAVEATS

Kondo is essentially **rm -rf** with a prompt. Always have a backup of your projects before using it. Deleted build artifacts will need to be re-downloaded or rebuilt.

# HISTORY

**kondo** was created by **tbillington** and is written in **Rust**. The name references Marie Kondo's decluttering philosophy applied to developer project directories.

# SEE ALSO

[du](/man/du)(1), [rm](/man/rm)(1), [ncdu](/man/ncdu)(1)
