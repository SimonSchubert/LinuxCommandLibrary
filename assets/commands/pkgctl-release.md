# TAGLINE

Release Arch Linux package build artifacts

# TLDR

**Release a package with a commit message**

```pkgctl release -m "[commit message]"```

**Release and automatically update the pacman database**

```pkgctl release --db-update -m "[commit message]"```

**Release to the staging counterpart** of the auto-detected repository

```pkgctl release --staging -m "[commit message]"```

**Release to the testing counterpart** of the auto-detected repository

```pkgctl release --testing -m "[commit message]"```

**Release a new package** to a specific repository

```pkgctl release --repo [extra] -m "[commit message]"```

# SYNOPSIS

**pkgctl release** [_options_] [_path_...]

# PARAMETERS

_PATH_
> Package directories to release (default: the current directory).

**-m**, **--message** _message_
> Commit message for the release.

**-r**, **--repo** _repo_
> Target repository for new packages not yet in any official repository. Disallowed for already released packages, as it would bypass auto-detection.

**-u**, **--db-update**
> Automatically update the pacman database after uploading.

**-s**, **--staging**
> Release to the staging counterpart of the auto-detected repository.

**-t**, **--testing**
> Release to the testing counterpart of the auto-detected repository.

**-h**, **--help**
> Show help text.

# DESCRIPTION

**pkgctl release** performs the release step to commit, tag, and upload build artifacts to Arch Linux repositories. It automates the workflow of finalizing package releases.

The command handles version tagging, source commits, and artifact upload as a single coordinated operation. By default, artifacts are uploaded to the user's staging directory on repos.archlinux.org and a signed tag is created on the packages git repository. To also update the binary package repository, pass `--db-update` or use `pkgctl db update` separately.

The target repository is auto-detected from where the package is currently released, and a new package must name one with **--repo**. If the version matches or supersedes an open bumpbuddy out-of-date issue, the commit message closes that issue.

# CAVEATS

Intended for Arch Linux package maintainers with push and upload access. Packages in **core** go to **core-testing** by default. Ensure build artifacts are properly tested before release.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [pkgctl-auth](/man/pkgctl-auth)(1), [pkgctl-build](/man/pkgctl-build)(1), [pkgctl-db-update](/man/pkgctl-db-update)(1)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/archlinux/devtools)```

```[Documentation](https://man.archlinux.org/man/pkgctl-release.1)```

<!-- verified: 2026-11-09 -->
