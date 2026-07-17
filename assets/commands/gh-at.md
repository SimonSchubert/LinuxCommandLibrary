# TAGLINE

Download and verify artifact attestations (alias for gh attestation)

# TLDR

**Verify an artifact** against a repository's attestations

```gh at verify [example.bin] --repo [owner/repo]```

**Verify an artifact** against an organization's attestations

```gh at verify [example.bin] --owner [org-name]```

**Verify an OCI image**

```gh at verify [oci://image-uri] --owner [org-name]```

**Verify and print full JSON** result

```gh at verify [example.bin] --owner [org-name] --format [json]```

**Download attestations** for offline verification

```gh at download [example.bin] --repo [owner/repo]```

**Output the trusted root** for offline verification

```gh at trusted-root --repo [owner/repo]```

# SYNOPSIS

**gh at** _command_ [_flags_]

# PARAMETERS

**verify** [_file-path_ | _oci://image-uri_]
> Verify the integrity and provenance of an artifact using its associated attestations.

**download** [_file-path_ | _oci://image-uri_]
> Download an artifact's attestations for offline use.

**trusted-root**
> Output trusted_root.jsonl contents, for offline verification.

**-o**, **--owner** _string_
> GitHub organization to scope the attestation lookup by.

**-R**, **--repo** _string_
> Repository name in the format _owner/repo_.

# VERIFY FLAGS

**-d**, **--digest-alg** _string_
> Digest algorithm used to compute the artifact's digest: sha256 or sha512 (default sha256).

**--cert-identity** _string_
> Enforce an exact match of the certificate's SubjectAlternativeName.

**-i**, **--cert-identity-regex** _string_
> Enforce a regex match of the certificate's SubjectAlternativeName.

**--cert-oidc-issuer** _string_
> Enforce the OIDC token issuer (default https://token.actions.githubusercontent.com).

**--signer-repo** _string_
> Enforce a match on the signer workflow's repository.

**--signer-workflow** _string_
> Enforce a match on the signer workflow's path.

**-b**, **--bundle** _string_
> Verify using a bundle stored on disk instead of fetching from GitHub.

**--bundle-from-oci**
> Fetch the attestation bundle from the OCI registry instead of GitHub.

**--format** _string_
> Output format; currently only **json** is supported.

**-L**, **--limit** _int_
> Maximum number of attestations to fetch (default 30).

# DESCRIPTION

**gh at** is the built-in alias for **gh attestation**, part of the official **GitHub CLI**. It downloads and verifies build provenance attestations, cryptographically signed records that tie an artifact back to the GitHub repository, commit, and workflow that built it (via Sigstore). It's used to confirm that a downloaded binary, package, or container image genuinely came from the claimed source and build pipeline.

# CAVEATS

Requires either **--owner** or **--repo** to scope the lookup. Verification depends on network access to GitHub and Sigstore's public-good instance unless **--custom-trusted-root** or **--bundle** is used for fully offline verification.

# SEE ALSO

[gh](/man/gh)(1), [gh-release](/man/gh-release)(1)

# RESOURCES

```[Manual](https://cli.github.com/manual/gh_attestation)```

```[Source code](https://github.com/cli/cli)```

<!-- verified: 2026-07-17 -->
