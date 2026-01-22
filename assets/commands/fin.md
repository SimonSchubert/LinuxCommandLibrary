# TLDR

**List projects**

```fin project list```

**Start project**

```fin project start```

**Stop project**

```fin project stop```

**SSH into container**

```fin bash```

**Run drush command**

```fin drush [status]```

# SYNOPSIS

**fin** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: project, bash, drush, exec, etc.

**project** _ACTION_
> Manage Docksal projects.

**bash**
> SSH into CLI container.

**drush** _CMD_
> Run Drush command.

**exec** _CMD_
> Execute command in container.

**up**
> Start project containers.

**stop**
> Stop project containers.

**--help**
> Display help information.

# DESCRIPTION

**fin** is the Docksal command-line tool for managing Docker-based development environments. It simplifies container orchestration for web development projects, particularly Drupal, WordPress, and other PHP applications.

The tool handles project creation, starting/stopping containers, running commands inside containers, and managing development services like databases and mail catchers.

fin abstracts Docker complexity, providing developers with simple commands for common tasks.

# CAVEATS

Requires Docksal and Docker. Configuration specific to Docksal. Project must be initialized.

# HISTORY

fin is part of **Docksal**, a Docker-based development environment tool. Created to simplify local development setup, particularly for Drupal projects, providing consistent environments across team members.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [drush](/man/drush)(1)
