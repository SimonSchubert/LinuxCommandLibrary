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

**--help**
> Display help information.

# DESCRIPTION

**Mercurial** (hg) is a distributed version control system. It tracks changes in source code and supports branching, merging, and collaboration.

Mercurial is similar to Git but with different command syntax and philosophy. It emphasizes simplicity and consistency in its interface.

hg provides distributed version control.

# CAVEATS

Less popular than Git. Different workflow. Extension system for features.

# HISTORY

Mercurial was created by **Matt Mackall** in **2005**, shortly after Git, as another solution for Linux kernel development.

# SEE ALSO

[git](/man/git)(1), [svn](/man/svn)(1), [hg-clone](/man/hg-clone)(1)
