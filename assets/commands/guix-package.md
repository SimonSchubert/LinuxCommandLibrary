# TAGLINE

manages packages in GNU Guix, a functional package manager

# TLDR

**Install** a package

```guix package -i [package]```

**Remove** a package

```guix package -r [package]```

**Upgrade** all installed packages (run **guix pull** first)

```guix package -u```

**Install and remove** in a single transaction

```guix package -i [package1] -r [package2]```

Install everything listed in a **manifest** file

```guix package -m [manifest.scm]```

**Search** for packages

```guix package -s "[search_pattern]"```

List **installed** packages

```guix package -I```

List **generations** (previous configurations)

```guix package -l```

**Roll back** to the previous generation

```guix package --roll-back```

**Switch** to a specific generation

```guix package -S [3]```

**Delete** generations older than one month

```guix package -d [1m]```

# SYNOPSIS

**guix package** [_options_]

# PARAMETERS

**-i**, **--install** _PACKAGE_
> Install specified package

**-r**, **--remove** _PACKAGE_
> Remove specified package

**-s**, **--search** _REGEXP_
> Search available package names, synopses, and descriptions using a regular expression

**--show** _PACKAGE_
> Show details about a package

**-e**, **--install-from-expression** _EXP_
> Install the package that the Scheme expression evaluates to

**-f**, **--install-from-file** _FILE_
> Install the package defined in a Scheme file

**-u**, **--upgrade** [_REGEXP_]
> Upgrade installed packages, or only those matching _REGEXP_

**--do-not-upgrade** [_REGEXP_]
> With **-u**, skip packages matching _REGEXP_

**-m**, **--manifest** _FILE_
> Replace the profile contents with the packages listed in a manifest file

**-I**, **--list-installed** [_REGEXP_]
> List installed packages, optionally filtered

**-A**, **--list-available** [_REGEXP_]
> List packages available for installation

**-l**, **--list-generations** [_PATTERN_]
> List generations of the profile

**--roll-back**
> Switch to the previous generation

**-S**, **--switch-generation** _PATTERN_
> Switch to a generation number or relative offset such as **+1** or **-1**

**-d**, **--delete-generations** [_PATTERN_]
> Delete generations; _PATTERN_ can be a number, range, or duration like **1m**

**-p**, **--profile** _PROFILE_
> Operate on _PROFILE_ instead of the user's default profile

**--search-paths**
> Print environment variable definitions needed by installed packages

**--export-manifest**
> Print a manifest describing the current profile

# DESCRIPTION

**guix package** manages packages in GNU Guix, a functional package manager. Unlike traditional package managers, Guix keeps multiple versions and configurations in separate generations, allowing easy rollback to previous states.

Each operation creates a new generation, preserving the previous state. This transactional approach means failed upgrades don't leave the system in a broken state, and users can always return to a known-good configuration.

Packages are installed per-user by default, not requiring root privileges. The functional model ensures reproducible builds and the ability to run multiple versions of the same package.

The shorter commands **guix install**, **guix remove**, and **guix upgrade** are aliases for **guix package -i**, **-r**, and **-u**, and **guix search** is an alias for **guix package -s**.

# CAVEATS

Guix uses a different filesystem hierarchy than traditional systems, with packages in /gnu/store. Shell integration may require sourcing the profile (**~/.guix-profile/etc/profile**). **guix package -u** only upgrades to versions known to the current Guix revision, so run **guix pull** first. Build times can be long when substitutes aren't available.

# HISTORY

GNU Guix was announced in **2012** by Ludovic Courtès as a functional package manager based on Nix concepts but using GNU Guile Scheme. It evolved into a full GNU/Linux distribution (Guix System) while remaining usable as a package manager on other distributions.

# SEE ALSO

[nix](/man/nix)(1), [apt](/man/apt)(8), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://codeberg.org/guix/guix)```

```[Homepage](https://guix.gnu.org)```

```[Documentation](https://guix.gnu.org/manual/en/html_node/Invoking-guix-package.html)```

<!-- verified: 2026-11-23 -->
