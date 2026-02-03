# TLDR

**List logs**

```gcloud logging logs list```

**List with limit**

```gcloud logging logs list --limit [10]```

**List in specific project**

```gcloud logging logs list --project [project_id]```

**List in JSON format**

```gcloud logging logs list --format json```

# SYNOPSIS

**gcloud** **logging** **logs** **list** [_options_]

# PARAMETERS

**--limit** _num_
> Maximum results.

**--project** _id_
> Project ID.

**--format** _format_
> Output format.

# DESCRIPTION

**gcloud logging logs list** lists the available logs in Cloud Logging. Each log contains entries written by services or applications.

# SEE ALSO

[gcloud-logging](/man/gcloud-logging)(1), [gcloud-logging-read](/man/gcloud-logging-read)(1)

