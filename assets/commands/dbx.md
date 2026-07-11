# TAGLINE

Databricks CLI extensions for workflow development

# TLDR

**Configure a new dbx project** in the current directory

```dbx configure --profile [DEFAULT]```

**Deploy a workflow** to artifact storage

```dbx deploy [workflow_name]```

**Launch a deployed workflow**

```dbx launch [workflow_name]```

**Execute a workflow** on an interactive cluster (without deploying)

```dbx execute [workflow_name] --cluster-name=[cluster]```

**Sync local files to DBFS** and watch for changes

```dbx sync dbfs --source [path/to/directory] --dest [path/to/remote_directory]```

# SYNOPSIS

**dbx** _command_ [_options_]

# PARAMETERS

**configure**
> Configure the project in the current directory.

**init**
> Generate a new project skeleton from a template.

**deploy** _workflow_
> Deploy a workflow definition and its artifacts to the Databricks workspace.

**launch** _workflow_
> Launch a previously deployed workflow as a job run.

**execute** _workflow_
> Run workflow code directly on an interactive (all-purpose) cluster.

**sync**
> Synchronize local files to DBFS or a repo, optionally watching for changes.

**destroy**
> Delete defined workflows and optionally their assets.

**--profile** _PROFILE_
> Databricks CLI connection profile to use.

**--environment** _ENV_
> Project environment defined in the deployment file (default: default).

# DESCRIPTION

**dbx** (Databricks CLI eXtensions) is a Databricks Labs tool that extends the databricks CLI with functionality for rapid development and CI/CD of Databricks workflows. It manages deployment of jobs, workflows, and their artifacts across multiple environments and workspaces.

Projects are described in a deployment file (deployment.yml) which defines workflows, cluster configurations, and dependencies. dbx versions and uploads artifacts, then creates or updates the corresponding Databricks jobs, making it suitable for automated pipelines.

Authentication reuses the profiles of the databricks CLI (~/.databrickscfg), so dbx works against any workspace configured there.

# CAVEATS

dbx has been retired by Databricks; Databricks Asset Bundles (the `databricks bundle` command in the new Databricks CLI) is the recommended replacement. Installed via pip (`pip install dbx`), it requires Python and a configured Databricks authentication profile.

# HISTORY

dbx was developed by Databricks Labs as a shortcut for "Databricks CLI eXtensions", filling the CI/CD gap before Databricks Asset Bundles became generally available. It was subsequently deprecated in favor of that first-party tooling.

# SEE ALSO

[pip](/man/pip)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/databrickslabs/dbx)```

```[Documentation](https://dbx.readthedocs.io)```

<!-- verified: 2026-07-11 -->
