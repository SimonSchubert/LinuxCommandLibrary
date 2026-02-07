# TAGLINE

Pure Rust Git implementation CLI

# TLDR

**Clone a repository**

```gix clone [https://github.com/user/repo]```

**Fetch updates** from remote

```gix fetch```

**Show repository status**

```gix status```

**List remotes**

```gix remote list```

**Create a commit**

```gix commit -m "[message]"```

**Show object info**

```gix free pack verify [path/to/pack]```

**List available subcommands**

```gix --help```

# SYNOPSIS

**gix** [_options_] _command_ [_args_...]

**ein** [_options_] _command_ [_args_...]

# COMMANDS

**clone** _url_ [_path_]
> Clone a repository to local path.

**fetch** [_remote_]
> Fetch updates from remote repository.

**status**
> Show working tree status.

**commit** [_options_]
> Record changes to the repository.

**remote** _subcommand_
> Manage remote repositories.

**free pack** _subcommand_
> Pack file operations and verification.

**free index** _subcommand_
> Index file operations.

**free mailmap** _subcommand_
> Mailmap operations.

**free commitgraph** _subcommand_
> Commit graph operations.

**no-repo** _subcommand_
> Commands that don't require a repository.

# PARAMETERS

**-r**, **--repository** _path_
> Use repository at specified path.

**-t**, **--threads** _num_
> Number of threads to use.

**--progress**
> Show progress information.

**--verbose**
> Enable verbose output.

**-h**, **--help**
> Show help for command or subcommand.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**gix** (gitoxide) provides two CLI binaries: **gix** for low-level plumbing operations and **ein** for high-level porcelain commands. Written entirely in Rust, it aims to be a correct, performant, and safe Git implementation.

The **gix** binary serves as a testing and validation tool for the gitoxide API, providing expert-level access to Git internals. The **ein** binary is designed for everyday Git workflows with an enhanced, intuitive interface.

Both binaries access the same underlying **gix** library ecosystem, which provides pure Rust implementations of Git protocols, object storage, reference handling, and more.

# CAVEATS

The CLI binaries are considered unstable and should not be relied upon in scripts. Feature coverage is incomplete compared to Git; some operations may not be implemented. The project is under active development with APIs subject to change.

# HISTORY

Gitoxide was created by **Sebastian Thiel** as an effort to rewrite Git in Rust. Development began with a focus on correctness first, then performance. The project has grown to include comprehensive Git functionality with multiple crates (gix-*) providing modular components.

# SEE ALSO

[git](/man/git)(1), [lazygit](/man/lazygit)(1), [tig](/man/tig)(1)
