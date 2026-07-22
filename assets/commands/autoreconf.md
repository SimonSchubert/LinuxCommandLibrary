# TAGLINE

Regenerate autotools build system files

# TLDR

**Regenerate** all autotools files

```autoreconf```

Regenerate with **install** of missing files

```autoreconf --install```

**Force** regeneration

```autoreconf --force --install```

Regenerate **verbosely**

```autoreconf --install --verbose```

# SYNOPSIS

**autoreconf** [_-f_] [_-i_] [_-v_] [_options_]

# DESCRIPTION

**autoreconf** runs autoconf, autoheader, automake, and related tools in the correct order. It's the recommended way to regenerate configure scripts and related files in autotools projects.

The tool automatically determines which programs to run based on project configuration.

# PARAMETERS

**-i**, **--install**
> Add missing auxiliary files

**-f**, **--force**
> Force regeneration even if files are current

**-v**, **--verbose**
> Verbose output

**-s**, **--symlink**
> When used with --install, install symbolic links instead of copying auxiliary files

**-I** _dir_, **--include=**_dir_
> Append dir to the include path searched by aclocal, autoconf, and autoheader

**-m**, **--make**
> When applicable, run ./config.status --recheck and ./config.status, then make to update everything

**-W** _category_, **--warnings=**_category_
> Report the warnings in category (all, none, error, or a specific category)

**-d**, **--debug**
> Don't remove the temporary files

**--no-recursive**
> Don't rebuild files in subdirectories (configured packages)

# WORKFLOW

Typical usage when building from git:
```bash
autoreconf --install
./configure
make
```

# CAVEATS

Requires autoconf, automake, and related tools installed. Can be slow on large projects. Modern alternatives (CMake, Meson) are often easier.

# HISTORY

**autoreconf** was added to autoconf to simplify the complex process of regenerating autotools files in the correct order.

# INSTALL

```dnf: sudo dnf install autoconf```

```pacman: sudo pacman -S autoconf```

```apk: sudo apk add autoconf```

```zypper: sudo zypper install autoconf```

```brew: brew install autoconf```

```nix: nix profile install nixpkgs#autoconf```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[autoconf](/man/autoconf)(1), [automake](/man/automake)(1), [libtoolize](/man/libtoolize)(1)

# RESOURCES

```[Homepage](https://www.gnu.org/software/autoconf/)```

```[Documentation](https://www.gnu.org/software/autoconf/manual/)```

<!-- verified: 2026-06-17 -->

