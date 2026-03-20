# TAGLINE

Verify TeX Live installation integrity

# TLDR

**Check all aspects of the installation**

```tlmgr check all```

**Check that all files listed in the database are present**

```tlmgr check files```

**Check for missing dependencies**

```tlmgr check depends```

**Check for conflicting run files between packages**

```tlmgr check runfiles```

**Check ls-R file consistency**

```tlmgr check lsr```

**Run checks with verbose output**

```tlmgr -v check all```

# SYNOPSIS

**tlmgr check** [_what_] [_options_]

# PARAMETERS

**files**
> Check that all files listed in the local TLPDB are actually present on disk.

**depends**
> List packages that are dependencies of an installed collection but are not themselves installed, and packages not contained in any collection.

**executes**
> Check that files referred to by execute directives in the TeX Live Database are present.

**runfiles**
> List filenames that occur more than once in the runfiles sections, except for known duplicates.

**lsr**
> Check consistency of the ls-R files. Useful after defining new trees or changing TEXMF variables.

**all**
> Run all of the above checks.

# DESCRIPTION

**tlmgr check** verifies the consistency and integrity of a TeX Live installation. If no problems are found, there is no output. Use `tlmgr -v check` for verbose output showing what is being checked. This action does not require write permissions and works the same in user mode and normal mode.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [tlmgr-install](/man/tlmgr-install)(1), [tlmgr-update](/man/tlmgr-update)(1)

