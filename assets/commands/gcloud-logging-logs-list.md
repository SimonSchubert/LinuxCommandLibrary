# TAGLINE

list available logs in Cloud Logging

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

**gcloud logging logs list** displays all log streams available in a Google Cloud project's Cloud Logging service. Each log name represents a distinct stream of log entries, typically corresponding to a specific service, application, or resource.

Logs are created automatically when services write entries to them. Common log names include those from Compute Engine instances, App Engine applications, Kubernetes clusters, and other GCP services. User applications can also write to custom logs.

This command is useful for discovering what logs are available before reading their contents with other logging commands. The output helps identify the correct log name to use when querying or tailing specific application or service logs.

# SEE ALSO

[gcloud-logging](/man/gcloud-logging)(1), [gcloud-logging-read](/man/gcloud-logging-read)(1)

