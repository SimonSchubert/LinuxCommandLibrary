# TAGLINE

Bun package manager utilities

# TLDR

**Show the bin directory path**

```bun pm bin```

**Show the global bin directory path**

```bun pm bin -g```

**List installed packages**

```bun pm ls```

**List all installed packages including dependencies**

```bun pm ls --all```

**Print the package manager version**

```bun pm version```

**Migrate from npm or yarn to Bun**

```bun pm migrate```

**Generate or update the lockfile without installing**

```bun pm hash```

# SYNOPSIS

**bun** **pm** _subcommand_ [_options_]

# SUBCOMMANDS

**bin**
> Print the path to the bin folder. Use **-g** for the global bin directory.

**ls**
> List installed packages. Use **--all** to include transitive dependencies.

**version**
> Print the package manager version.

**migrate**
> Migrate from npm or yarn to Bun by converting lockfiles.

**hash**
> Print the hash of the lockfile.

**hash-print**
> Print the hash stored in the lockfile.

**hash-string**
> Print the string used to compute the lockfile hash.

**cache**
> Print the path to the global module cache, or clear it with **rm**.

# DESCRIPTION

**bun pm** provides package manager utilities for managing dependencies and package configuration. It offers commands for inspecting installations, migrating projects from npm/yarn, and working with the lockfile and cache.

# SEE ALSO

[bun](/man/bun)(1), [bun-install](/man/bun-install)(1), [bun-pm-ls](/man/bun-pm-ls)(1), [npm](/man/npm)(1)
