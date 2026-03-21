# TAGLINE

Crystal language dependency manager

# TLDR

**Install dependencies**

```shards install```

**Update all dependencies**

```shards update```

**Build project targets**

```shards build```

**Check for outdated dependencies**

```shards outdated```

**Initialize a new shard.yml**

```shards init```

**List installed shards**

```shards list```

**Install without development dependencies**

```shards install --production```

**Verify dependencies are installed and satisfied**

```shards check```

# SYNOPSIS

**shards** _command_ [_options_] [_args_]

# SUBCOMMANDS

**install**
> Resolve and install dependencies into the lib folder.

**update**
> Re-resolve and update all dependencies, regenerating shard.lock.

**build** [_targets_]
> Build specified targets into the bin/ directory. Builds all if none specified.

**check**
> Verify that all dependencies are installed and requirements are satisfied.

**init**
> Create a default shard.yml in the current directory.

**list**
> Show installed shards and their versions.

**outdated**
> List dependencies that have newer versions available.

**version**
> Print the current shard version from shard.yml.

# PARAMETERS

**--production**
> Skip development dependencies and only use locked versions.

**--without-development**
> Skip development dependencies during install.

**--skip-postinstall**
> Skip running postinstall scripts.

**--skip-executables**
> Skip installing executables.

**-q**, **--quiet**
> Decrease log verbosity, printing only warnings and errors.

**-v**, **--verbose**
> Increase log verbosity.

**--jobs** _N_
> Number of parallel download jobs.

**--frozen**
> Require that shard.lock is up to date and refuse to update it.

**--ignore-crystal-version**
> Do not check the Crystal version restriction in shard.yml.

# DESCRIPTION

**shards** is the official dependency manager for the Crystal programming language, similar to Bundler for Ruby or npm for JavaScript. It reads project dependencies from a **shard.yml** file that defines package metadata, version constraints, and development dependencies.

Dependencies are resolved from Git repositories, with GitHub being the most common source. The **shard.lock** file pins exact versions to ensure reproducible builds across environments. The **build** command compiles Crystal projects and places executables in the **bin/** directory, while **install** and **update** manage the dependency lifecycle.

# CONFIGURATION

**shard.yml**
> Project-level configuration file defining name, version, dependencies, and development dependencies.

**shard.lock**
> Lock file pinning exact dependency versions for reproducible builds.

# CAVEATS

Crystal ecosystem is smaller than Ruby or JavaScript. Some dependencies may be unmaintained. Binary compatibility can break between Crystal versions. The **--frozen** flag is recommended for CI builds to ensure the lock file is not modified unexpectedly.

# HISTORY

**shards** is the official dependency manager for **Crystal**, the Ruby-like compiled language. It follows conventions familiar to Ruby developers.

# SEE ALSO

[crystal](/man/crystal)(1), [bundler](/man/bundler)(1), [cargo](/man/cargo)(1), [npm](/man/npm)(1)
