# TAGLINE

verify artifact attestations and build provenance

# TLDR

**Verify artifact attestation**

```gh attestation verify [artifact] -R [owner/repo]```

**Verify with a specific predicate type**

```gh attestation verify [artifact] -R [owner/repo] --predicate-type [https://example.com/predicate/v1]```

**Verify with specific bundle file** (offline)

```gh attestation verify [artifact] --bundle [attestation.json]```

**Verify and deny self-hosted runners**

```gh attestation verify [artifact] -R [owner/repo] --deny-self-hosted-runners```

**Download attestations**

```gh attestation download [artifact] -R [owner/repo]```

**Download attestations as JSON**

```gh attestation download [artifact] -R [owner/repo] --format json```

# SYNOPSIS

**gh** **attestation** _command_ [_options_]

# SUBCOMMANDS

**verify**
> Cryptographically verify an artifact's attestation.

**download**
> Download attestation bundle for offline verification.

# PARAMETERS

**-R**, **--repo** _owner/repo_
> Repository to scope the attestation lookup.

**--bundle** _file_
> Path to a local attestation bundle file.

**--owner** _owner_
> GitHub organization or user to scope the attestation lookup.

**--format** _format_
> Output format (json).

**--predicate-type** _type_
> Verify a specific attestation predicate type (default: https://slsa.dev/provenance/v1).

**--signer-repo** _owner/repo_
> Repository of reusable workflow that signed the attestation.

**--signer-workflow** _workflow_
> Workflow that signed the attestation.

**--deny-self-hosted-runners**
> Fail verification for attestations generated on self-hosted runners.

# DESCRIPTION

**gh attestation** verifies artifact attestations using GitHub's artifact attestation feature. It cryptographically validates that artifacts were built in trusted GitHub Actions workflows with SLSA build provenance. Attestations can be verified online against the GitHub API or offline using downloaded bundle files.

# SEE ALSO

[gh](/man/gh)(1), [gh-release](/man/gh-release)(1)

