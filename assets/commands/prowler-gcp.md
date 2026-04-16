# TAGLINE

GCP cloud security assessment

# TLDR

**Run GCP security assessment** against all accessible projects

```prowler gcp```

**Scan specific project(s)**

```prowler gcp --project-ids [project-id-1] [project-id-2]```

**Run specific checks**

```prowler gcp --checks [cloudstorage_bucket_public_access]```

**Run specific services** only

```prowler gcp --services [iam] [compute]```

**Run with a compliance framework**

```prowler gcp --compliance [cis_2.0_gcp]```

**Impersonate a service account**

```prowler gcp --impersonate-service-account [name@project.iam.gserviceaccount.com]```

**List accessible GCP projects**

```prowler gcp --list-project-ids```

**Skip API activation check**

```prowler gcp --skip-api-check```

# SYNOPSIS

**prowler** **gcp** [_options_]

# PARAMETERS

**--project-ids** _ID_...
> Scan only the given GCP project IDs (default: all accessible projects).

**--excluded-project-ids** _ID_...
> Exclude the given project IDs from scanning.

**--list-project-ids**
> List all GCP project IDs accessible with the current credentials and exit.

**--credentials-file** _PATH_
> Path to a service account application credentials JSON file.

**--impersonate-service-account** _EMAIL_
> Impersonate the given service account when making API calls.

**--skip-api-check**
> Skip API activation verification and assume all required APIs are enabled.

**-c**, **--checks** _CHECK_...
> Run only the specified checks.

**-s**, **--services** _SERVICE_...
> Run only checks for the specified GCP services (e.g. _iam_, _compute_, _cloudstorage_).

**--compliance** _FRAMEWORK_
> Run the specified compliance framework (e.g. _cis_2.0_gcp_, _mitre_attack_gcp_).

**-M**, **--output-modes** _FORMAT_
> Output format(s): _csv_, _json-ocsf_, _json-asff_, _html_.

**-F**, **--output-filename** _NAME_
> Base name for output files.

**-o**, **--output-directory** _DIR_
> Directory where output reports are written.

# DESCRIPTION

**prowler gcp** performs a security assessment of Google Cloud Platform projects. It evaluates configurations against best practices and compliance frameworks such as CIS, MITRE ATT&CK, and GDPR, and reports findings as CSV, JSON, or HTML reports.

By default, Prowler scans every project accessible to the authenticated principal. Authentication can use Application Default Credentials (ADC), a credentials file, or service account impersonation.

# CAVEATS

Requires valid GCP credentials with at least the _Viewer_ and _Security Reviewer_ roles on target projects. Some checks need additional APIs (Cloud Asset, Cloud Resource Manager, IAM) enabled. Rate limiting on large organizations may slow scans significantly.

# SEE ALSO

[prowler](/man/prowler)(1), [prowler-aws](/man/prowler-aws)(1), [prowler-azure](/man/prowler-azure)(1), [prowler-kubernetes](/man/prowler-kubernetes)(1), [gcloud](/man/gcloud)(1)

