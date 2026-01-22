# TLDR

Rename files using **simple substitutions**

```rename [foo] [bar] *```

**Dry-run** - display which renames would occur without performing them

```rename -v -n [foo] [bar] *```

Do **not overwrite** existing files

```rename -o [foo] [bar] *```

Change **file extensions**

```rename .ext .bak *.ext```

**Prepend** text to all filenames

```rename '' '[prefix]' *```

**Zero-pad** numbered files

```rename foo foo00 foo? && rename foo foo0 foo??```

# SYNOPSIS

**rename** [_options_] _expression_ _replacement_ _file_...

# PARAMETERS

**-v**, **--verbose**
> Show which files are being renamed

**-n**, **--no-act**
> Dry run; show what would be renamed without doing it

**-o**, **--no-overwrite**
> Do not overwrite existing files

**-a**, **--all**
> Replace all occurrences, not just the first

**-l**, **--last**
> Replace the last occurrence instead of the first

**-s**, **--symlink**
> Rename symbolic link target instead of link itself

**-i**, **--interactive**
> Prompt before overwriting

**-V**, **--version**
> Display version information

**-h**, **--help**
> Display help message

# DESCRIPTION

**rename** from util-linux performs batch file renaming using simple string substitution. It replaces the first occurrence of _expression_ with _replacement_ in each filename. Unlike the Perl rename command, it does not use regular expressions.

The command processes all matching files, making it efficient for bulk operations like changing extensions or adding prefixes. Multiple rename operations can be chained together for more complex transformations.

# CAVEATS

**Overwrites files without prompting** by default; use **-n** for dry runs and **-o** to prevent overwrites. Only replaces the first occurrence unless **-a** is specified. Does not support regular expressions; use Perl rename for complex patterns.

# HISTORY

Part of **util-linux**, the standard Linux utility collection. Provides simple string-based renaming as opposed to the more powerful (but complex) Perl-based rename found on Debian systems. The two commands are often confused due to sharing the same name.

# SEE ALSO

[mv](/man/mv)(1), [rename](/man/rename)(1), [mmv](/man/mmv)(1)
