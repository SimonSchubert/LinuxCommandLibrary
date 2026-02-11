# TAGLINE

GCP cloud security assessment

# TLDR

**Run GCP security assessment**

```prowler gcp```

**Run specific checks**

```prowler gcp --checks [cloudstorage_bucket_public_access]```

**Run with compliance framework**

```prowler gcp --compliance [cis_2.0_gcp]```

**Specify project**

```prowler gcp --project-ids [project-id]```

# SYNOPSIS

**prowler gcp** [_options_]

# PARAMETERS

**--checks** _checks_
> Specific checks to run.

**--services** _services_
> Services to check.

**--compliance** _framework_
> Compliance framework.

**--project-ids** _ids_
> GCP project IDs.

**-M**, **--output-modes** _format_
> Output format.

**-o**, **--output-directory** _dir_
> Output directory.

# DESCRIPTION

**prowler gcp** performs security assessment of Google Cloud Platform projects. Checks configuration against best practices and compliance frameworks. Identifies security issues in GCP resources.

# SEE ALSO

[prowler](/man/prowler)(1), [gcloud](/man/gcloud)(1)

