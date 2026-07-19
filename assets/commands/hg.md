# TAGLINE

distributed version control system

# TLDR

**Initialize repository**

```hg init```

**Clone repository**

```hg clone [url]```

**Show status**

```hg status```

**Add files**

```hg add [files]```

**Commit changes**

```hg commit -m "[message]"```

**View log**

```hg log```

**Pull changes**

```hg pull```

**Push changes**

```hg push```

# SYNOPSIS

**hg** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Mercurial command.

**init**
> Create repository.

**clone**
> Clone repository.

**status**
> Show working directory status.

**add**
> Add files.

**commit**
> Commit changes.

**log**
> Show history.

**pull**
> Pull from remote.

**push**
> Push to remote.

**-R**, **--repository** _REPO_
> Run as if started in the given repository.

**-v**, **--verbose**
> Increase amount of output.

**-q**, **--quiet**
> Suppress output.

**--version**
> Output version information.

**--help**
> Display help information.

# DESCRIPTION

**Mercurial** (hg) is a distributed version control system. It tracks changes in source code and supports branching, merging, and collaboration.

Mercurial is similar to Git but with different command syntax and philosophy. It emphasizes simplicity and consistency in its interface.

# CONFIGURATION

Mercurial reads settings from several **hgrc** files, in order: the system-wide file (e.g. **/etc/mercurial/hgrc**), the per-user file (**~/.hgrc**), and the per-repository file (**.hg/hgrc**). Later files override earlier ones. Common sections include **[ui]** for username and editor, **[paths]** for remote aliases, and **[extensions]** to enable built-in or third-party extensions.

# CAVEATS

Less popular than Git. Different workflow. Extension system for features.

# HISTORY

Mercurial was created by **Matt Mackall** in **2005**, shortly after Git, as another solution for Linux kernel development.

# SEE ALSO

[git](/man/git)(1), [svn](/man/svn)(1), [hg-clone](/man/hg-clone)(1), [hg-commit](/man/hg-commit)(1), [hg-init](/man/hg-init)(1)

# RESOURCES

```[Source code](https://foss.heptapod.net/mercurial/mercurial-devel)```

```[Homepage](https://www.mercurial-scm.org/)```

```[Documentation](https://wiki.mercurial-scm.org/)```

<!-- verified: 2026-07-19 -->
