# TLDR

**Initialize monorepo**

```lerna init```

**Bootstrap packages**

```lerna bootstrap```

**Run script in all packages**

```lerna run [build]```

**Run in specific package**

```lerna run [build] --scope=[package-name]```

**Publish packages**

```lerna publish```

**List packages**

```lerna list```

**Version packages**

```lerna version```

# SYNOPSIS

**lerna** _command_ [_options_]

# PARAMETERS

**init**
> Initialize monorepo.

**bootstrap**
> Install dependencies.

**run** _SCRIPT_
> Run npm script.

**publish**
> Publish packages.

**version**
> Bump versions.

**list**
> List packages.

**--scope** _PKG_
> Target specific package.

**--help**
> Display help information.

# DESCRIPTION

**Lerna** manages JavaScript monorepos. It handles multiple packages in a single repository.

The tool coordinates versioning and publishing. It links local dependencies and runs scripts across packages.

Lerna manages JS monorepos.

# CAVEATS

Consider npm/yarn workspaces. Nx for advanced features. Node.js required.

# HISTORY

Lerna was created by **Sebastian McKenzie** (Babel author) for managing monorepos, now maintained by Nx.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [nx](/man/nx)(1)
