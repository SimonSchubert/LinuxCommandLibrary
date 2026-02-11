# TAGLINE

Crystal language dependency manager

# TLDR

**Install dependencies**

```shards install```

**Update dependencies**

```shards update```

**Add dependency**

```shards add [package-name]```

**List installed shards**

```shards list```

**Build project**

```shards build```

**Check outdated shards**

```shards outdated```

**Initialize new project**

```shards init```

**Lock dependencies**

```shards lock```

# SYNOPSIS

**shards** _command_ [_options_] [_args_]

# PARAMETERS

**install**
> Install dependencies.

**update**
> Update dependencies.

**add** _NAME_
> Add dependency.

**list**
> Show installed.

**build**
> Build project.

**outdated**
> Check for updates.

**init**
> Create shard.yml.

**lock**
> Generate lock file.

**--without-development**
> Skip dev dependencies.

# DESCRIPTION

**shards** is the official dependency manager for the Crystal programming language, similar to Bundler for Ruby or npm for JavaScript. It reads project dependencies from a **shard.yml** file that defines package metadata, version constraints, and development dependencies.

Dependencies are resolved from Git repositories, with GitHub being the most common source. The **shard.lock** file pins exact versions to ensure reproducible builds across environments. The **build** command compiles Crystal projects and places executables in the **bin/** directory, while **install** and **update** manage the dependency lifecycle.

# CONFIGURATION

**shard.yml**
> Project-level configuration file defining name, version, dependencies, and development dependencies.

**shard.lock**
> Lock file pinning exact dependency versions for reproducible builds.

# CAVEATS

Crystal ecosystem smaller than Ruby. Some dependencies may be unmaintained. Binary compatibility can break.

# HISTORY

**shards** is the official dependency manager for **Crystal**, the Ruby-like compiled language. It follows conventions familiar to Ruby developers.

# SEE ALSO

[crystal](/man/crystal)(1), [bundler](/man/bundler)(1)
