# TAGLINE

Generate Makefile.in templates from Makefile.am

# TLDR

**Generate** Makefile.in

```automake --add-missing```

Generate with **copy** instead of symlink

```automake --add-missing --copy```

Generate for **specific version**

```automake-1.16```

# SYNOPSIS

**automake** [_--add-missing_] [_--copy_] [_options_] [_Makefile_...]

# DESCRIPTION

**automake** generates Makefile.in templates from Makefile.am files. It works with autoconf to create the complete GNU Build System, handling compilation, installation, and distribution tasks.

Automake provides portable makefiles that work across Unix-like systems.

# PARAMETERS

**-a**, **--add-missing**
> Add missing standard auxiliary files (install-sh, missing, etc.).

**-c**, **--copy**
> Copy auxiliary files instead of symlinking them.

**--force-missing**
> Replace standard auxiliary files even if they already exist.

**-W** _category_, **--warnings=**_category_
> Report warnings for the given category (e.g. all, none, error, portability).

**--gnu**
> Require conformance to GNU coding standards (the default).

**--foreign**
> Relax checks; allow files that GNU standards require to be absent.

**--gnits**
> Apply the stricter GNU Gnits standards.

**-i**, **--ignore-deps**
> Disable generation of automatic dependency tracking.

# WORKFLOW

1. Write Makefile.am
2. Run **automake** to generate Makefile.in
3. Run **autoconf** to generate configure
4. Users run ./configure to generate Makefile

# CAVEATS

Steep learning curve. Generated Makefiles are complex. Requires understanding of autotools conventions. Many projects now use CMake or Meson instead.

# HISTORY

**Automake** was created by David MacKenzie and Tom Tromey, first released in **1994** to complement autoconf with makefile generation.

# INSTALL

```dnf: sudo dnf install automake```

```pacman: sudo pacman -S automake```

```apk: sudo apk add automake```

```zypper: sudo zypper install automake```

```brew: brew install automake```

```nix: nix profile install nixpkgs#automake```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[autoconf](/man/autoconf)(1), [autoreconf](/man/autoreconf)(1), [make](/man/make)(1)

# RESOURCES

```[Homepage](https://www.gnu.org/software/automake/)```

```[Documentation](https://www.gnu.org/software/automake/manual/automake.html)```

<!-- verified: 2026-06-17 -->
