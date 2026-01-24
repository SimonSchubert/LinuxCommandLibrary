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

**shards** is the Crystal language package manager. It manages dependencies defined in shard.yml.

shard.yml defines project metadata and dependencies. Similar to Gemfile or package.json.

Lock files ensure reproducible builds. shard.lock pins exact versions.

Building compiles Crystal projects. Executables output to bin/.

Git repositories serve as shard sources. GitHub and other hosts supported.

# CAVEATS

Crystal ecosystem smaller than Ruby. Some dependencies may be unmaintained. Binary compatibility can break.

# HISTORY

**shards** is the official dependency manager for **Crystal**, the Ruby-like compiled language. It follows conventions familiar to Ruby developers.

# SEE ALSO

[crystal](/man/crystal)(1), [bundler](/man/bundler)(1)
