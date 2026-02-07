# TAGLINE

Google Cloud Platform diagnostics tool

# TLDR

**Run lint checks**

```gcpdiag lint --project [project_id]```

**Run with specific rule**

```gcpdiag lint --project [project_id] --include [gke/ERR/2021_001]```

**Run excluding rules**

```gcpdiag lint --project [project_id] --exclude [gke/*]```

**Output as JSON**

```gcpdiag lint --project [project_id] --output json```

**Enable verbose output**

```gcpdiag lint --project [project_id] --verbose```

# SYNOPSIS

**gcpdiag** **lint** [_options_]

# SUBCOMMANDS

**lint**
> Run diagnostic checks.

# PARAMETERS

**--project** _id_
> Google Cloud project ID.

**--include** _pattern_
> Include rules matching pattern.

**--exclude** _pattern_
> Exclude rules matching pattern.

**--output** _format_
> Output format (text, json).

**--verbose**
> Verbose output.

**--auth-adc**
> Use Application Default Credentials.

# DESCRIPTION

**gcpdiag** is a command-line diagnostics tool for Google Cloud Platform that runs automated checks against projects to identify common issues. It analyzes infrastructure for misconfigurations, quota problems, permission errors, and best practice violations.

The tool executes a curated set of rules organized by service (GKE, Compute Engine, Cloud SQL, etc.). Each rule checks for specific known issues based on Google's internal troubleshooting knowledge. Results indicate whether checks passed, failed, or were skipped, with detailed explanations and remediation guidance.

gcpdiag reduces troubleshooting time by proactively identifying issues before they cause outages. It's particularly useful for validating new deployments and investigating production problems.

# SEE ALSO

[gcloud](/man/gcloud)(1)

