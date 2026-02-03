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

**gh label** manages repository labels. Labels help categorize issues and pull requests for organization and filtering.

# SEE ALSO

[gh](/man/gh)(1), [gh-issue](/man/gh-issue)(1)

