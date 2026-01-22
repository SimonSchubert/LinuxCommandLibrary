# TLDR

**Scan directory**

```osv-scanner -r [directory]```

**Scan lockfile**

```osv-scanner --lockfile=[package-lock.json]```

**Scan SBOM**

```osv-scanner --sbom=[sbom.json]```

**Output as JSON**

```osv-scanner -r [directory] --json```

**Scan specific ecosystem**

```osv-scanner --lockfile=requirements.txt```

# SYNOPSIS

**osv-scanner** [_options_] [_targets_]

# PARAMETERS

**-r** _DIR_
> Scan directory recursively.

**--lockfile** _FILE_
> Scan specific lockfile.

**--sbom** _FILE_
> Scan SBOM file.

**--json**
> JSON output.

**--config** _FILE_
> Configuration file.

**--help**
> Display help information.

# DESCRIPTION

**osv-scanner** finds vulnerabilities in dependencies. Uses OSV database.

The tool scans lockfiles and SBOMs. Open source vulnerability detection.

osv-scanner detects vulnerabilities.

# CAVEATS

Requires network access. Database coverage varies. Google maintained.

# HISTORY

osv-scanner was created by **Google** for scanning dependencies against OSV database.

# SEE ALSO

[npm-audit](/man/npm-audit)(1), [trivy](/man/trivy)(1), [grype](/man/grype)(1)

