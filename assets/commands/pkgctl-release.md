# TAGLINE

Release Arch Linux package build artifacts

# TLDR

**Release a package with a commit message**

```pkgctl release -m "[commit message]"```

**Release and automatically update the pacman database**

```pkgctl release --db-update -m "[commit message]"```

**Release to the staging repository**

```pkgctl release --staging -m "[commit message]"```

**Release to the testing repository**

```pkgctl release --testing -m "[commit message]"```

# SYNOPSIS

**pkgctl release** [_options_]

# PARAMETERS

**-m**, **--message** _message_
> Commit message for the release.

**-u**, **--db-update**
> Automatically update the pacman database as the last action.

**-s**, **--staging**
> Release to the staging repository.

**-t**, **--testing**
> Release to the testing repository.

**-h**, **--help**
> Show help text.

# DESCRIPTION

**pkgctl release** performs the release step to commit, tag, and upload build artifacts to Arch Linux repositories. It automates the workflow of finalizing package releases.

The command handles version tagging, source commits, and artifact upload as a single coordinated operation. By default, artifacts are uploaded to the user's staging directory on repos.archlinux.org and a signed tag is created on the packages git repository. To also update the binary package repository, pass `--db-update` or use `pkgctl db update` separately.

# CAVEATS

Requires authentication via `pkgctl auth`. Ensure build artifacts are properly tested before release.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [pkgctl-auth](/man/pkgctl-auth)(1), [pkgctl-build](/man/pkgctl-build)(1), [pkgctl-db-update](/man/pkgctl-db-update)(1)
