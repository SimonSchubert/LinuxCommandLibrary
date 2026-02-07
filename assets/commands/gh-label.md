# TAGLINE

manage issue and PR labels

# TLDR

**List labels**

```gh label list```

**Create a label**

```gh label create [name] -c [color] -d "[description]"```

**Edit a label**

```gh label edit [name] --name [new_name]```

**Delete a label**

```gh label delete [name]```

**Clone labels from another repo**

```gh label clone [owner/repo]```

# SYNOPSIS

**gh** **label** _command_ [_options_]

# SUBCOMMANDS

**list**
> List labels.

**create**
> Create a label.

**edit**
> Edit a label.

**delete**
> Delete a label.

**clone**
> Clone labels from repo.

# PARAMETERS

**-c**, **--color** _color_
> Label color (hex without #).

**-d**, **--description** _text_
> Label description.

**--name** _name_
> New label name.

**--force**
> Overwrite existing labels.

# DESCRIPTION

**gh label** manages repository labels used for categorizing and filtering issues and pull requests. Labels provide visual organization with customizable colors and descriptions, helping teams triage work and track issue types.

Common label patterns include bug/feature categorization, priority levels, status indicators, and area tags. The clone command copies an entire label scheme from another repository, useful for maintaining consistency across projects or setting up new repositories.

Labels are essential for automated workflows, project boards, and issue management systems. They enable quick filtering and provide visual cues in issue lists.

# SEE ALSO

[gh](/man/gh)(1), [gh-issue](/man/gh-issue)(1)

