# TAGLINE

create new Fossil repository

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

**fossil init** creates a new Fossil repository file. The repository is a single SQLite database that contains all history, wiki, tickets, and project metadata.

After initialization, use **fossil open** to create a working directory. The repository file can be hosted via **fossil ui** for web access or served over HTTP for remote collaboration.

Repository settings include project name, description, and admin credentials. The **--template** option allows creating repositories based on existing ones, inheriting their configuration.

# SEE ALSO

[fossil-clone](/man/fossil-clone)(1), [fossil-open](/man/fossil-open)(1)

