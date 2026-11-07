# TAGLINE

manages configuration file conflicts created by pacman during package upgrades

# TLDR

**Review files** that need maintenance in interactive mode

```pacdiff```

Use **sudo and sudoedit** to remove and merge files

```pacdiff -s```

Review files, creating **.bak backups** of originals when overwriting

```pacdiff -s -b```

Use a **specific editor** to view and merge configuration files

```DIFFPROG=[editor] pacdiff```

**List** pacnew/pacsave files without merging

```pacdiff -o```

Scan **/etc and /boot** with find instead of the pacman database

```DIFFSEARCHPATH="/etc /boot" pacdiff -f```

Use **meld** as viewer and **git merge-file** for 3-way merges

```DIFFPROG=meld MERGEPROG="git merge-file -p" pacdiff -s```

# SYNOPSIS

**pacdiff** [_options_]

# PARAMETERS

**-s**, **--sudo**
> Use sudo and sudoedit to remove and edit files

**-b**, **--backup**
> Create .bak backup of original when overwriting

**-l**, **--locate**
> Scan using locate

**-f**, **--find**
> Scan using find (searches DIFFSEARCHPATH, default /etc)

**-p**, **--pacmandb**
> Scan using pacman database (default)

**-c**, **--cachedir** _dir_
> Scan _dir_ for 3-way merge base candidates (default: from pacman.conf)

**-o**, **--output**
> Print files instead of merging them

**-3**, **--threeway**
> View diffs in 3-way fashion (base package version, new, current)

**--nocolor**
> Do not colorize output

**-h**, **--help**
> Display help message

**-V**, **--version**
> Display version information

# DESCRIPTION

**pacdiff** manages configuration file conflicts created by pacman during package upgrades. When pacman encounters modified configuration files, it saves new versions with **.pacnew** extension and original versions as **.pacorig** or **.pacsave**, requiring manual review.

For each file it prompts **(V)iew, (M)erge, (S)kip, (R)emove, (O)verwrite, (Q)uit**. Viewing opens **vim -d** (or **nvim -d** if EDITOR=nvim) unless **DIFFPROG** is set. Merging performs a 3-way merge with **diff3 -m** (override with **MERGEPROG**), using the previous package version from the pacman cache as the merge base.

# ENVIRONMENT

**DIFFPROG**
> Diff/view program (default: vim -d)

**MERGEPROG**
> 3-way merge program (default: diff3 -m)

**DIFFSEARCHPATH**
> Directories scanned with **--find** (default: /etc)

# CAVEATS

Interactive mode requires user attention for each file. The default diff viewer (vim -d) requires vim to be installed. Using **-l** requires an up-to-date locate database. Merging needs the old package still present in the pacman cache, so aggressive **paccache** cleanup can prevent it. Always review changes carefully before overwriting system configuration files.

# HISTORY

Part of **pacman-contrib**, a collection of maintenance scripts for Arch Linux. Addresses one of the most common maintenance tasks on rolling-release distributions where frequent updates may conflict with user-customized configuration files.

# INSTALL

```pacman: sudo pacman -S pacman-contrib```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacman](/man/pacman)(8), [paccache](/man/paccache)(8), [vimdiff](/man/vimdiff)(1), [diff3](/man/diff3)(1), [meld](/man/meld)(1)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/pacman/pacman-contrib)```

```[Documentation](https://wiki.archlinux.org/title/Pacnew_and_Pacsave_files)```

<!-- verified: 2026-11-07 -->
