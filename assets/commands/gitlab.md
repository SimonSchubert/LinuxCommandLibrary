# TAGLINE

Python CLI for the GitLab API

# TLDR

**List projects**

```gitlab project list```

**Create a project**

```gitlab project create --name "[name]"```

**List merge requests for a project**

```gitlab project-merge-request list --project-id [id]```

**Create a merge request**

```gitlab project-merge-request create --project-id [id] --source-branch [feature] --target-branch [main] --title "[title]"```

**Use YAML output**

```gitlab -o yaml project list```

**Use a specific GitLab instance from the config file**

```gitlab -g [instance-name] project list```

# SYNOPSIS

**gitlab** [_options_] _object_ _action_ [_parameters_]

# OBJECTS

**project**
> Manage projects.

**project-merge-request**
> Manage merge requests.

**project-issue**
> Manage issues.

**user**
> Manage users.

**group**
> Manage groups.

**group-member** / **project-member**
> Manage group/project membership.

# PARAMETERS

**--project-id** _id_
> Project ID.

**--name** _name_
> Resource name.

**--title** _title_
> Title.

**--source-branch** _branch_
> Source branch.

**--target-branch** _branch_
> Target branch.

**-o**, **--output** _FORMAT_
> Output format: `legacy` (default), `yaml`, or `json`.

**-f**, **--fields** _FIELDS_
> Comma-separated list of fields to display.

**-c**, **--config-file** _FILE_
> Use a specific configuration file instead of the default search path.

**-g**, **--gitlab** _NAME_
> GitLab instance to use, as defined in the configuration file.

**-v**, **--verbose**
> Show detailed information about the retrieved object(s).

# DESCRIPTION

**gitlab** is the python-gitlab CLI for interacting with the GitLab API. It manages projects, merge requests, issues, users, groups, and other GitLab resources from the command line.

The tool follows an object-action pattern, where you specify the GitLab object type and the action to perform on it (e.g. `list`, `create`, `get`, `update`, `delete`).

# CONFIGURATION

**~/.python-gitlab.cfg**
> User configuration file (INI format) containing GitLab instance URLs, private tokens, and default settings under a `[global]` section and one section per instance.

**/etc/python-gitlab.cfg**
> System-wide configuration file, searched before the user config.

# SEE ALSO

[glab](/man/glab)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/python-gitlab/python-gitlab)```

```[Documentation](https://python-gitlab.readthedocs.io/en/stable/cli-usage.html)```

<!-- verified: 2026-07-17 -->
