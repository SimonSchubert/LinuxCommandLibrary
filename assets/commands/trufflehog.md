# TAGLINE

Secret and credential scanner for code

# TLDR

**Scan git repository**

```trufflehog git [https://github.com/user/repo]```

**Scan local git repository**

```trufflehog git file://[/path/to/repo]```

**Scan filesystem**

```trufflehog filesystem [/path/to/scan]```

**Scan GitHub organization**

```trufflehog github --org [organization]```

**Scan S3 bucket**

```trufflehog s3 --bucket [bucket-name]```

**Only verified secrets**

```trufflehog git --only-verified [https://github.com/user/repo]```

**Output as JSON**

```trufflehog git --json [https://github.com/user/repo]```

**Scan specific branch**

```trufflehog git --branch [main] [https://github.com/user/repo]```

# SYNOPSIS

**trufflehog** _source_ [_--only-verified_] [_--json_] [_options_] _target_

# PARAMETERS

**git** _URL_
> Scan git repository.

**github**
> Scan GitHub (org, user, or repo).

**gitlab**
> Scan GitLab.

**filesystem** _PATH_
> Scan local filesystem.

**s3**
> Scan S3 bucket.

**gcs**
> Scan Google Cloud Storage.

**docker**
> Scan Docker image.

**--only-verified**
> Only report verified credentials.

**--json**
> Output as JSON.

**--no-update**
> Don't check for updates.

**--concurrency** _NUM_
> Scanner concurrency.

**--include-paths** _FILE_
> Only scan matching paths.

**--exclude-paths** _FILE_
> Skip matching paths.

**--include-detectors** _LIST_
> Only use specified detectors.

**--exclude-detectors** _LIST_
> Skip specified detectors.

**--branch** _NAME_
> Scan specific branch.

**--since-commit** _HASH_
> Start from commit.

**--max-depth** _NUM_
> Maximum commit history depth.

# DESCRIPTION

**trufflehog** finds secrets and credentials in code repositories, filesystems, and cloud storage. It uses hundreds of detectors for API keys, passwords, and tokens.

The tool scans git history, catching secrets that were committed and later deleted. Each commit is checked against detector patterns. High entropy strings are flagged as potential secrets.

Verification mode (--only-verified) actively tests found credentials against their services. This confirms whether secrets are still valid, prioritizing real exposures over false positives.

Detectors cover major services: AWS, GCP, Azure, GitHub, Slack, Stripe, Twilio, and many more. Custom regex patterns can extend detection.

Multiple source types enable comprehensive scanning: repositories, organizations, cloud storage, Docker images, and local filesystems.

JSON output integrates with security tools and CI/CD pipelines. Exit codes indicate whether secrets were found, enabling automated gates.

# CAVEATS

Verification makes network requests to third-party services. Scanning history of large repos is slow. False positives occur with high-entropy strings. Encrypted or obfuscated secrets may be missed. Verification may trigger security alerts.

# HISTORY

**trufflehog** was created by **Dylan Ayrey** at **Truffle Security** around **2016**. Originally a Python tool, version 3 was rewritten in Go for performance. The project addresses the serious problem of secrets committed to version control, providing automated detection before breaches occur.

# SEE ALSO

[gitleaks](/man/gitleaks)(1), [git-secrets](/man/git-secrets)(1), [detect-secrets](/man/detect-secrets)(1)
