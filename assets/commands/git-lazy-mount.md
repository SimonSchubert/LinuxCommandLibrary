# TAGLINE

Mount a Git repository without cloning it

# TLDR

**Mount a remote repository** onto a local directory

```git lazy-mount [https://github.com/example/huge-repo] [~/huge-repo]```

**Work in the mounted tree** with ordinary Git commands

```cd [~/huge-repo] && git switch -c [feature]```

**Build from source** with the FUSE feature enabled

```cargo build --release -p glm-cli --features fuse```

# SYNOPSIS

**git lazy-mount** _repository_url_ _mount_point_

**git-lazy-mount** _repository_url_ _mount_point_

# DESCRIPTION

**git-lazy-mount** mounts a Git repository as a local working tree without first cloning it. Instead of downloading every object up front, it exposes the repository through a **FUSE** file system and fetches file contents on demand, the moment a file is opened, read, or edited. Files that are never touched are never downloaded, which makes very large repositories usable in seconds and with a fraction of the disk space.

Because the mount looks like an ordinary checkout, normal Git commands work inside it: you can edit files, commit, create branches, and push. The project also ships a companion `sgrep` tool that queries a remote code-search index and overlays your uncommitted edits, so searching a huge repository does not require materializing it.

It installs as a Git subcommand, so `git lazy-mount` and the underlying `git-lazy-mount` binary are equivalent. The tool is built in **Rust** and targets Linux, where it relies on the kernel FUSE interface.

# CAVEATS

git-lazy-mount is **Linux only**; macOS and Windows are studied but not supported. It requires **libfuse3** and a system **Git of at least version 2.36**. Because file contents are fetched lazily over the network, accessing many files for the first time, or working offline, can be slow or fail, and the mount depends on the remote staying reachable. It is best suited to read-mostly work and targeted edits on large repositories rather than operations that scan the whole tree.

# HISTORY

git-lazy-mount was created by **Mohsen Azimi** (mohsen1) and is dual-licensed under **MIT** and **Apache 2.0**. In the author's benchmarks across twenty repositories it used about 1.3 GB versus 23 GB for full clones, roughly eighteen times less, while preserving complete history.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git](/man/git)(1), [sshfs](/man/sshfs)(1), [mount](/man/mount)(8), [fusermount](/man/fusermount)(1)

# RESOURCES

```[Source code](https://github.com/mohsen1/git-lazy-mount)```

<!-- verified: 2026-06-27 -->
