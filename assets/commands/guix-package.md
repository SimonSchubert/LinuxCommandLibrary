# TAGLINE

manages packages in GNU Guix, a functional package manager

# TLDR

**Install** a package

```guix package -i [package]```

**Remove** a package

```guix package -r [package]```

**Search** for packages

```guix package -s "[search_pattern]"```

List **installed** packages

```guix package -I```

List **generations** (previous configurations)

```guix package -l```

**Roll back** to the previous generation

```guix package --roll-back```

# SYNOPSIS

**guix package** [_options_]

# PARAMETERS

**-i**, **--install** _PACKAGE_
> Install specified package

**-r**, **--remove** _PACKAGE_
> Remove specified package

**-s**, **--search** _PATTERN_
> Search package database using regex pattern

**-I**, **--list-installed**
> List all installed packages

**-l**, **--list-generations**
> List all generations (snapshots)

**--roll-back**
> Switch to the previous generation

**-u**, **--upgrade**
> Upgrade installed packages

# DESCRIPTION

**guix package** manages packages in GNU Guix, a functional package manager. Unlike traditional package managers, Guix keeps multiple versions and configurations in separate generations, allowing easy rollback to previous states.

Each operation creates a new generation, preserving the previous state. This transactional approach means failed upgrades don't leave the system in a broken state, and users can always return to a known-good configuration.

Packages are installed per-user by default, not requiring root privileges. The functional model ensures reproducible builds and the ability to run multiple versions of the same package.

# CAVEATS

Guix uses a different filesystem hierarchy than traditional systems, with packages in /gnu/store. Shell integration may require sourcing Guix profile. Build times can be long when substitutes aren't available.

# HISTORY

GNU Guix was announced in **2012** by Ludovic Courtès as a functional package manager based on Nix concepts but using GNU Guile Scheme. It evolved into a full GNU/Linux distribution (Guix System) while remaining usable as a package manager on other distributions.

# SEE ALSO

[guix](/man/guix)(1), [guix-pull](/man/guix-pull)(1), [guix-gc](/man/guix-gc)(1)
