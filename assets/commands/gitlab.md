# TAGLINE

Python CLI for the GitLab API

# TLDR

**List projects**

```gitlab project list```

**Create project**

```gitlab project create --name "[name]"```

**List merge requests**

```gitlab project-merge-request list --project-id [id]```

**Create merge request**

```gitlab project-merge-request create --project-id [id] --source-branch [feature] --target-branch [main] --title "[title]"```

# SYNOPSIS

**gitlab** _resource_ _action_ [_options_]

# RESOURCES

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

# DESCRIPTION

**gitlab** is the python-gitlab CLI for interacting with the GitLab API. It manages projects, merge requests, issues, users, groups, and other GitLab resources from the command line.

The tool follows a resource-action pattern, where you specify the GitLab resource type and the action to perform on it.

# CONFIGURATION

**~/.python-gitlab.cfg**
> Configuration file containing GitLab instance URLs, private tokens, and default settings.

# SEE ALSO

[glab](/man/glab)(1), [git](/man/git)(1)
