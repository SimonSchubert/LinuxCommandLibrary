# TLDR

**Start a time entry**

```clockify-cli start "[Task description]"```

**Start with project and tags**

```clockify-cli start "[Task]" -p [project_id] -t [tag1,tag2]```

**Stop current time entry**

```clockify-cli stop```

**Show current running entry**

```clockify-cli show current```

**List recent time entries**

```clockify-cli report```

**List all projects**

```clockify-cli project list```

**List workspaces**

```clockify-cli workspace list```

**Configure API key**

```clockify-cli config set api-key [your_api_key]```

# SYNOPSIS

**clockify-cli** _command_ [_options_]

# PARAMETERS

**start** _description_
> Start a new time entry.

**stop**
> Stop the current time entry.

**show current**
> Display currently running entry.

**report** [_options_]
> Show time entry reports.

**project list**
> List all projects.

**workspace list**
> List all workspaces.

**config set** _key_ _value_
> Set configuration value.

**-p**, **--project** _id_
> Assign to project.

**-t**, **--tag** _tags_
> Add tags (comma-separated).

**--task** _id_
> Assign to task.

**-b**, **--billable**
> Mark as billable.

**-w**, **--workspace** _id_
> Specify workspace.

# DESCRIPTION

**clockify-cli** is a command-line interface for Clockify, a time tracking service. It enables starting, stopping, and managing time entries without leaving the terminal.

The tool integrates with the Clockify API to track time across projects and workspaces. Time entries can be tagged, assigned to projects and tasks, and marked as billable. Reports provide summaries of tracked time.

Configuration is stored locally, including API key and default workspace. The CLI supports multiple workspaces for users who track time across different organizations.

# CAVEATS

Requires a Clockify account and API key from account settings. Some features may require a paid Clockify plan. Network connectivity is required for all operations. The CLI is a community project and may lag behind official Clockify features.

# HISTORY

Clockify was founded in **2017** by COING as a free time tracking solution. The service gained popularity for offering unlimited users and tracking on the free tier. Various community-developed CLI tools emerged to provide command-line access, with **clockify-cli** being one of the more feature-complete options for developers who prefer terminal-based workflows.

# SEE ALSO

[toggl](/man/toggl)(1), [watson](/man/watson)(1), [timew](/man/timew)(1)
