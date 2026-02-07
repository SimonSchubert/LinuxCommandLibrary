# TAGLINE

verify artifact attestations and build provenance

# TLDR

**Verify artifact attestation**

```gh attestation verify [artifact] -R [owner/repo]```

**Verify with specific bundle**

```gh attestation verify [artifact] --bundle [attestation.json]```

**Download attestations**

```gh attestation download [artifact] -R [owner/repo]```

# SYNOPSIS

**gh** **attestation** _command_ [_options_]

# SUBCOMMANDS

**verify**
> Verify artifact attestation.

**download**
> Download attestation bundle.

# PARAMETERS

**-R**, **--repo** _owner/repo_
> Repository.

**--bundle** _file_
> Attestation bundle file.

**--owner** _owner_
> Repository owner.

# DESCRIPTION

**gh attestation** verifies artifact attestations using GitHub's artifact attestation feature. Ensures artifacts were built in GitHub Actions with provenance.

# SEE ALSO

[gh](/man/gh)(1), [gh-release](/man/gh-release)(1)

