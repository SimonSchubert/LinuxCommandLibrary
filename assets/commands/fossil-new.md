# TAGLINE

alias for fossil init

# TLDR

**Create new repository**

```fossil new [repo.fossil]```

**Create with project name**

```fossil new --project-name "[name]" [repo.fossil]```

**Create with a specific admin user**

```fossil new -A [username] [repo.fossil]```

**Create using settings from an existing repository as template**

```fossil new --template [existing.fossil] [repo.fossil]```

**Create with project name and description**

```fossil new --project-name "[name]" --project-desc "[description]" [repo.fossil]```

# SYNOPSIS

**fossil** **new** [_options_] _repository_

# PARAMETERS

**-A, --admin-user** _USERNAME_
> Select the given username as the admin user instead of the current login name.

**--template** _FILE_
> Copy initial settings from the specified repository file. Almost all settings accessible from the setup page will be copied, but normal users and their permissions will not.

**--project-name** _STRING_
> Set the name of the project.

**--project-desc** _STRING_
> Set the description of the project.

**--date-override** _DATETIME_
> Use the specified datetime as the time of the initial check-in. Accepts "now" or "YYYY-MM-DDTHH:MM:SS.SSS" format with optional timezone offset.

**--sha1**
> Use an initial hash policy of SHA1 instead of the default SHA3-256.

# DESCRIPTION

**fossil new** is an alias for **fossil init**. It creates a new Fossil repository file with identical functionality. All options and behaviors are identical to **fossil init**.

# SEE ALSO

[fossil-init](/man/fossil-init)(1), [fossil-commit](/man/fossil-commit)(1)

