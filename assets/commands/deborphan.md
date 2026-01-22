# TLDR

Display **orphan library** packages

```deborphan```

List orphans including **library-like names**

```deborphan --guess-all```

Find packages only **recommended or suggested**

```deborphan -n```

# SYNOPSIS

**deborphan** [_options_]

# DESCRIPTION

**deborphan** finds orphaned packages on Debian-based systems. Orphaned packages are typically libraries that were installed as dependencies but are no longer required by any installed package.

By default, it checks only packages in the "libs" section, but can be configured to check all packages.

# PARAMETERS

**--guess-all**
> Include packages with library-like names

**-n, --nice-mode**
> Show packages that are only recommended/suggested

**-a, --all-packages**
> Check all packages, not just libs section

**-H, --show-section**
> Show package section

**-s** _section_
> Check specific section

# CAVEATS

Only shows libraries by default. Results should be reviewed before removal as some packages may still be wanted. For automatic cleanup, consider apt autoremove.

# SEE ALSO

[apt](/man/apt)(8), [aptitude](/man/aptitude)(8), [dpkg](/man/dpkg)(1)
