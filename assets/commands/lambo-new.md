# TLDR

**Create Laravel project**

```lambo new [project-name]```

**With editor**

```lambo new [project-name] --editor=[code]```

**With database creation**

```lambo new [project-name] --create-db```

**With auth scaffolding**

```lambo new [project-name] --auth```

**Full setup**

```lambo new [project-name] --create-db --auth --editor=[code]```

# SYNOPSIS

**lambo new** [_options_] _name_

# PARAMETERS

_NAME_
> Project directory name.

**--editor** _EDITOR_
> Editor to open project.

**--create-db**
> Create MySQL database.

**--auth**
> Add authentication.

**--dev**
> Use dev Laravel version.

**--quiet**
> Minimal output.

**--help**
> Display help information.

# DESCRIPTION

**lambo new** creates new Laravel projects with automation. It combines multiple setup steps into one command.

The command handles git initialization, dependency installation, and configuration. It opens the project in your editor.

lambo new bootstraps Laravel apps.

# CAVEATS

Subcommand of lambo. Laravel installer required. PHP/Composer needed.

# HISTORY

lambo new is the main command of **lambo**, created by Matt Stauffer for rapid Laravel project setup.

# SEE ALSO

[lambo](/man/lambo)(1), [laravel](/man/laravel)(1), [composer](/man/composer)(1)
