# TAGLINE

Publish packages to the Arch User Repository

# TLDR

**Publish** a package to the AUR

```aurpublish [package_name]```

**Add githooks** to the current repository

```aurpublish setup```

# SYNOPSIS

**aurpublish** [_options_] [_package_]

# DESCRIPTION

**aurpublish** streamlines publishing packages to the Arch User Repository. It verifies PKGBUILD integrity, generates **.SRCINFO** files, creates commit message templates, and handles the git push to the AUR.

The tool is designed for AUR package maintainers to simplify the update and publishing workflow.

# SUBCOMMANDS

**setup**
> Install git hooks in the current repository for automated checks

# PARAMETERS

**-h, --help**
> Display help information

# CAVEATS

Requires AUR SSH access to be configured. The PKGBUILD must pass validation before publishing. Existing **.SRCINFO** files will be regenerated automatically.

# SEE ALSO

[makepkg](/man/makepkg)(8), [git](/man/git)(1), [mksrcinfo](/man/mksrcinfo)(1)
