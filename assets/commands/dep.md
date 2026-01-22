# TLDR

**Initialize dependency management** for project

```dep init```

**Add a dependency**

```dep ensure -add [github.com/pkg/errors]```

**Update all dependencies**

```dep ensure -update```

**Update specific dependency**

```dep ensure -update [github.com/pkg/errors]```

**Check dependency status**

```dep status```

**Visualize dependency tree**

```dep status -dot | dot -Tpng -o deps.png```

# SYNOPSIS

**dep** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: init, ensure, status, prune, check.

**init**
> Initialize new project with dep.

**ensure**
> Ensure dependencies are satisfied.

**-add** _PACKAGE_
> Add a dependency.

**-update** [_PACKAGE_]
> Update dependencies.

**status**
> Show status of dependencies.

**prune**
> Remove unused dependencies.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**dep** was the official dependency management tool for Go before Go modules became the standard. It manages project dependencies through Gopkg.toml and Gopkg.lock files, ensuring reproducible builds.

The tool resolves transitive dependencies, handles version constraints, and vendors dependencies in the vendor directory. The ensure command is the primary interface for adding, updating, and synchronizing dependencies.

dep uses semantic import versioning and supports various version constraint syntaxes including semver ranges, branches, and revisions.

# CAVEATS

Superseded by Go modules (go mod) in Go 1.11+. New projects should use Go modules. Migration path available from dep to modules. Only supports projects in GOPATH.

# HISTORY

dep was developed by the Go community and released in **2016** as the official experiment in dependency management. It served as a bridge solution until Go modules were introduced in Go 1.11 (**2018**), after which dep was placed in maintenance mode.

# SEE ALSO

[go](/man/go)(1), [govendor](/man/govendor)(1), [glide](/man/glide)(1)
