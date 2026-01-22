# TLDR

**Release** a build artifact

```pkgctl release --repo repository --message commit_message```

# SYNOPSIS

**pkgctl release** [_options_]

# PARAMETERS

**--repo** _repository_
> Target repository for the release

**--message**, **-m** _message_
> Commit message for the release

# DESCRIPTION

**pkgctl release** performs the release step to commit, tag, and upload build artifacts to Arch Linux repositories. It automates the workflow of finalizing package releases.

The command handles version tagging, source commits, and artifact upload as a single coordinated operation.

# CAVEATS

Requires authentication via pkgctl auth. Ensure build artifacts are properly tested before release.

# HISTORY

Part of **pkgctl**, the Arch Linux package control tool for official repository maintainers. Simplifies the release workflow for package updates.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [pkgctl-auth](/man/pkgctl-auth)(1), [pkgctl-db-update](/man/pkgctl-db-update)(1)
