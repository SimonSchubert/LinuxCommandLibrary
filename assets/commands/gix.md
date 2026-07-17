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

**Show the commit log**

```gix log```

**Blame a file**

```gix blame [path/to/file]```

**Verify repository integrity**

```gix verify```

**List available subcommands**

```gix --help```

# SYNOPSIS

**gix** [_options_] _command_ [_args_...]

**ein** [_options_] _command_ [_args_...]

# COMMANDS

**clone** _url_ [_path_]
> Clone a repository into a new directory.

**fetch** [_remote_]
> Fetch data from remotes and store it in the repository.

**status**
> Compute and show repository status.

**commit** _subcommand_
> Interact with commit objects.

**branch** _subcommand_
> Interact with branches.

**tag** _subcommand_
> Interact with tag objects.

**remote** _subcommand_
> Interact with the remote hosts.

**log** [_path_]
> List commits in the repository, optionally limited to those changing a path.

**diff**
> Print all changes between two objects.

**blame** _path_
> Blame lines in a file.

**worktree** _subcommand_
> Handle worktrees.

**submodule** _subcommand_
> Interact with submodules.

**index** _subcommand_
> Interact with a worktree index like `.git/index`.

**mailmap**
> Interact with the mailmap.

**commit-graph** _subcommand_
> Interact with commit-graph files.

**verify**
> Verify the integrity of the entire repository.

**credential**
> A program just like `git credential`.

**free** _subcommand_
> Subcommands that need no Git repository to run (e.g. pack and index operations).

**completions**
> Generate shell completions to stdout or a directory.

This is a subset; run **gix --help** for the full, self-documenting list of subcommands (it has grown to cover archive, clean, fsck, odb, attributes, exclude, dirwalk, merge, and more).

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

The **gix** binary exposes low-level, self-documenting plumbing commands and serves as a testing and validation tool for the gitoxide API. The **ein** binary is the smaller, porcelain-facing counterpart, offering a handful of convenience commands (like **init**, **clone**, and repository-discovery tools under **tools**) aimed at everyday human use rather than API validation.

Both binaries access the same underlying **gix** library ecosystem, which provides pure Rust implementations of Git protocols, object storage, reference handling, and more.

# CAVEATS

The CLI binaries are considered unstable and should not be relied upon in scripts. Feature coverage is incomplete compared to Git; some operations may not be implemented. The project is under active development with APIs subject to change.

# HISTORY

Gitoxide was created by **Sebastian Thiel** as an effort to rewrite Git in Rust. Development began with a focus on correctness first, then performance. The project has grown to include comprehensive Git functionality with multiple crates (gix-*) providing modular components.

# SEE ALSO

[git](/man/git)(1), [lazygit](/man/lazygit)(1), [tig](/man/tig)(1)

# RESOURCES

```[Source code](https://github.com/GitoxideLabs/gitoxide)```

```[Crate status](https://github.com/GitoxideLabs/gitoxide/blob/main/crate-status.md)```

<!-- verified: 2026-07-17 -->
