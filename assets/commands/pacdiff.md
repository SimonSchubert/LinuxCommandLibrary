# TLDR

**Review files** that need maintenance in interactive mode

```pacdiff```

Use **sudo and sudoedit** to remove and merge files

```pacdiff -s```

Review files, creating **.bak backups** of originals when overwriting

```pacdiff -s -b```

Use a **specific editor** to view and merge configuration files

```DIFFPROG=[editor] pacdiff```

Scan for files with **locate** instead of pacman database

```pacdiff -l```

# SYNOPSIS

**pacdiff** [_options_]

# PARAMETERS

**-s**, **--sudo**
> Use sudo and sudoedit to remove and edit files

**-b**, **--backup**
> Create .bak backup of original when overwriting

**-l**, **--locate**
> Find files using locate instead of pacman database

**-f**, **--find**
> Find files using find command

**-p**, **--pacmandb**
> Scan using pacman database (default)

**-o**, **--output**
> Print files to stdout instead of interactive mode

**-3**, **--threeway**
> View diffs in three-way comparison (original, new, current)

**-m**, **--merge**
> Perform a three-way merge

**-h**, **--help**
> Display help message

# DESCRIPTION

**pacdiff** manages configuration file conflicts created by pacman during package upgrades. When pacman encounters modified configuration files, it saves new versions with **.pacnew** extension and original versions as **.pacorig** or **.pacsave**, requiring manual review.

The tool presents each file interactively, allowing users to view differences, edit files, overwrite with new version, or remove the conflict file. It uses **vim -d** by default for viewing differences, but respects the **DIFFPROG** environment variable for custom diff tools.

# CAVEATS

Interactive mode requires user attention for each file. The default diff viewer (vim -d) requires vim to be installed. Using **-l** (locate) requires an updated mlocate database. Always review changes carefully before overwriting system configuration files.

# HISTORY

Part of **pacman-contrib**, a collection of maintenance scripts for Arch Linux. Addresses one of the most common maintenance tasks on rolling-release distributions where frequent updates may conflict with user-customized configuration files.

# SEE ALSO

[pacman](/man/pacman)(8), [paccache](/man/paccache)(8), [vimdiff](/man/vimdiff)(1)
