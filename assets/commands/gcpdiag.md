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

**gcpdiag** diagnoses Google Cloud Platform issues. Runs automated checks against projects to identify misconfigurations, quota issues, and best practice violations.

# SEE ALSO

[gcloud](/man/gcloud)(1)

