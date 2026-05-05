# TAGLINE

creates new Laravel projects with automation

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

**-e**, **--editor** _EDITOR_
> Editor command to open the project after install.

**-m**, **--message** _MSG_
> Initial git commit message.

**-p**, **--path** _PATH_
> Path where the project will be created.

**-b**, **--browser** _URL_
> Open a browser at the given URL after install.

**-l**, **--link**
> Create a Valet link to the project.

**-s**, **--secure**
> Configure Valet with HTTPS for the project.

**--create-db**
> Create a corresponding MySQL database.

**--dbuser** _USER_
> Database user (default: root).

**--dbpassword** _PASS_
> Database password.

**--auth**
> Run php artisan make:auth scaffolding (legacy Laravel).

**--dev**
> Use the development Laravel version.

**--node**
> Run npm install after creation.

**--mix**
> Run npm run dev (Laravel Mix) after creation.

**--quiet**
> Minimal output.

**--help**
> Display help information.

# DESCRIPTION

**lambo new** creates new Laravel projects with automation. It combines multiple setup steps into one command.

The command handles git initialization, dependency installation, and configuration. It opens the project in your editor.

# CAVEATS

Subcommand of lambo. Laravel installer required. PHP/Composer needed.

# HISTORY

lambo new is the main command of **lambo**, created by Matt Stauffer for rapid Laravel project setup.

# SEE ALSO

[lambo](/man/lambo)(1), [laravel](/man/laravel)(1), [composer](/man/composer)(1)
