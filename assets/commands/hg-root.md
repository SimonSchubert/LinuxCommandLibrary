# TAGLINE

prints the root directory of the Mercurial repository

# TLDR

**Show repository root**

```hg root```

**Use in scripts**

```cd $(hg root)```

# SYNOPSIS

**hg root** [_options_]

# PARAMETERS

**--share-source**
> Print the share source root instead, when the repository was created with the **share** extension.

**-T**, **--template** _TEMPLATE_
> Display output with the given template.

**--help**
> Display help information.

# DESCRIPTION

**hg root** prints the root directory of the Mercurial repository. It outputs the absolute path to the .hg directory's parent.

The command is useful in scripts to locate the repository root regardless of current working directory. It fails if not in a repository.

# CAVEATS

Fails if not in repository. Returns absolute path. Simple utility command.

# HISTORY

Root is a **Mercurial** utility command for locating the repository top-level directory.

# SEE ALSO

[hg](/man/hg)(1), [git-rev-parse](/man/git-rev-parse)(1), [pwd](/man/pwd)(1)

# RESOURCES

```[Source code](https://foss.heptapod.net/mercurial/mercurial-devel)```

```[Documentation](https://wiki.mercurial-scm.org/)```

<!-- verified: 2026-07-19 -->
