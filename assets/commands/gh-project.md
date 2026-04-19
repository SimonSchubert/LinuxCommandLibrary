# TAGLINE

Manage GitHub project boards and work items

# TLDR

**List projects**

```gh project list```

**View a project**

```gh project view [number]```

**Create a project**

```gh project create --title "[title]"```

**Add item to project**

```gh project item-add [number] --url [issue_url]```

**Delete a project**

```gh project delete [number]```

# SYNOPSIS

**gh** **project** _command_ [_options_]

# SUBCOMMANDS

**list**
> List projects.

**view**
> View a project.

**create**
> Create a project.

**copy**
> Copy a project.

**edit**
> Edit project settings.

**close**
> Close a project.

**delete**
> Delete a project.

**link** / **unlink**
> Link or unlink a repository or team to a project.

**mark-template**
> Mark a project as a template.

**item-add**
> Add an existing issue or PR to a project.

**item-create**
> Create a draft item in a project.

**item-edit**
> Edit an item's field values.

**item-archive**
> Archive an item.

**item-delete**
> Remove an item.

**item-list**
> List project items.

**field-create** / **field-list** / **field-delete**
> Manage custom fields on a project.

# PARAMETERS

**--owner** _owner_
> Owner of the project (user or organization).

**--title** _title_
> Project title.

**--url** _url_
> Issue or PR URL to add.

**--format** _format_
> Output format (e.g. json).

**-q**, **--jq** _expression_
> Filter JSON output with a jq expression.

# DESCRIPTION

**gh project** manages GitHub Projects (project boards) from the command line. It enables organizing and tracking work with customizable views, fields, and automation.

Projects can contain issues, pull requests, and draft items organized into boards with custom columns and filters. The command provides full lifecycle management from creation through closure.

# SEE ALSO

[gh](/man/gh)(1), [gh-issue](/man/gh-issue)(1), [gh-pr](/man/gh-pr)(1), [gh-repo](/man/gh-repo)(1)
