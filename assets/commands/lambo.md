# TLDR

**Create new Laravel project**

```lambo new [project-name]```

**Create with options**

```lambo new [project-name] --editor=[code]```

**Create with database**

```lambo new [project-name] --create-db```

**Create with authentication**

```lambo new [project-name] --auth```

**Skip common prompts**

```lambo new [project-name] --quiet```

# SYNOPSIS

**lambo new** [_options_] _name_

# PARAMETERS

_NAME_
> Project name.

**--editor** _EDITOR_
> Open in editor.

**--create-db**
> Create database.

**--auth**
> Install authentication.

**--quiet**
> Skip prompts.

**--browser** _BROWSER_
> Open in browser.

**--help**
> Display help information.

# DESCRIPTION

**lambo** automates Laravel project creation. It runs multiple setup steps with a single command.

The tool handles git init, composer install, and common configurations. It streamlines new project setup.

lambo creates Laravel projects.

# CAVEATS

Requires Laravel installer. PHP and Composer needed. macOS-focused.

# HISTORY

lambo was created by **Matt Stauffer** at Tighten to speed up Laravel project initialization.

# SEE ALSO

[laravel](/man/laravel)(1), [composer](/man/composer)(1), [php](/man/php)(1)
