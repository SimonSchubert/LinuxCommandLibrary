# TAGLINE

manage issue and PR labels

# TLDR

**List labels in the current repository**

```gh label list```

**List labels with a search query**

```gh label list --search "[bug]"```

**Create a label with color and description**

```gh label create [name] -c [color] -d "[description]"```

**Edit a label's name**

```gh label edit [name] --name [new_name]```

**Edit a label's color and description**

```gh label edit [name] -c [ff0000] -d "[new description]"```

**Delete a label** (with confirmation)

```gh label delete [name]```

**Clone labels from another repository**

```gh label clone [owner/repo]```

**Force-clone labels**, overwriting existing ones

```gh label clone [owner/repo] --force```

# SYNOPSIS

**gh** **label** _command_ [_options_]

# SUBCOMMANDS

**list**
> List labels in the repository.

**create**
> Create a new label.

**edit**
> Edit an existing label.

**delete**
> Delete a label.

**clone**
> Clone labels from another repository.

# PARAMETERS

**-c**, **--color** _color_
> Label color as hex value (without the # prefix).

**-d**, **--description** _text_
> Label description text.

**--name** _name_
> New label name (used with edit).

**--force**
> Overwrite existing labels when cloning.

**--search** _query_
> Filter labels by search query.

**-L**, **--limit** _int_
> Maximum number of labels to list (default 30).

**--sort** _field_
> Sort by: created, name (default: created).

**--order** _direction_
> Order: asc, desc (default: asc).

**-w**, **--web**
> Open the labels page in the web browser.

**-R**, **--repo** _owner/repo_
> Select a different repository.

# DESCRIPTION

**gh label** manages repository labels used for categorizing and filtering issues and pull requests. Labels provide visual organization with customizable colors and descriptions, helping teams triage work and track issue types.

Common label patterns include bug/feature categorization, priority levels, status indicators, and area tags. The **clone** command copies an entire label scheme from another repository, useful for maintaining consistency across projects or setting up new repositories.

# SEE ALSO

[gh](/man/gh)(1), [gh-issue](/man/gh-issue)(1), [gh-pr](/man/gh-pr)(1)

