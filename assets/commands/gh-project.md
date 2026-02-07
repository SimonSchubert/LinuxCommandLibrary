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

**delete**
> Delete a project.

**item-add**
> Add item to project.

**item-list**
> List project items.

**edit**
> Edit a project.

**close**
> Close a project.

# PARAMETERS

**--owner** _owner_
> Project owner.

**--title** _title_
> Project title.

**--url** _url_
> Issue or PR URL.

# DESCRIPTION

**gh project** manages GitHub Projects (project boards) from the command line. It enables organizing and tracking work with customizable views, fields, and automation.

Projects can contain issues, pull requests, and draft items organized into boards with custom columns and filters. The command provides full lifecycle management from creation through closure.

# SEE ALSO

[gh](/man/gh)(1), [gh-issue](/man/gh-issue)(1)
