# TLDR

**Create new repository**

```fossil init [repo.fossil]```

**Create with admin password**

```fossil init --admin-user [admin] [repo.fossil]```

**Create with project name**

```fossil init --project-name "[name]" [repo.fossil]```

# SYNOPSIS

**fossil** **init** [_options_] _repository_

# PARAMETERS

**--admin-user** _name_
> Set admin username.

**--project-name** _name_
> Set project name.

**--project-desc** _text_
> Set project description.

**--template** _repo_
> Use template repository.

# DESCRIPTION

**fossil init** creates a new Fossil repository file. The repository is a single SQLite database that contains all history, wiki, and tickets.

# SEE ALSO

[fossil-clone](/man/fossil-clone)(1), [fossil-open](/man/fossil-open)(1)

