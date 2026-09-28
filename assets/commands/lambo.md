# TAGLINE

automates Laravel project creation

# TLDR

**Create new Laravel project**

```lambo new [project-name]```

Create and **open in an editor**

```lambo new [project-name] --editor=[code]```

Create in a **specific directory**

```lambo new [project-name] --path=[~/Sites]```

**Create and migrate** a MySQL database named after the project

```lambo new [project-name] --create-db --migrate-db```

Install the **Breeze** starter kit

```lambo new [project-name] --breeze=[blade|vue|react]```

Install **Jetstream** with teams support

```lambo new [project-name] --jetstream=[livewire|inertia],teams```

Create and migrate the database, then **link and secure** the site with Valet

```lambo new [project-name] --full```

Push to a new **GitHub repository**

```lambo new [project-name] --github```

**Edit** the saved default configuration

```lambo edit-config```

# SYNOPSIS

**lambo new** [_options_] _name_

**lambo** **edit-config**|**edit-after**|**help**

# PARAMETERS

_NAME_
> Project name.

**-e**, **--editor** _EDITOR_
> Editor command to run in the project directory after creation.

**-p**, **--path** _PATH_
> Directory in which to create the project.

**-m**, **--message** _MESSAGE_
> Message for the initial Git commit.

**-f**, **--force**
> Delete an existing project directory of the same name first.

**-d**, **--dev**
> Install the development branch of Laravel.

**-b**, **--browser** _BROWSER_
> Browser to open the project in.

**-l**, **--link**
> Create a Valet link to the project directory.

**-s**, **--secure**
> Secure the Valet site with HTTPS.

**--create-db**
> Create a MySQL database named after the project (requires **mysql**).

**--migrate-db**
> Run database migrations.

**--dbuser**, **--dbpassword**, **--dbhost** _VALUE_
> Database credentials and host written to **.env**.

**--breeze** _STACK_
> Install Laravel Breeze with the blade, vue or react stack.

**--jetstream** _STACK_[,teams]
> Install Laravel Jetstream with the inertia or livewire stack, optionally with teams.

**--full**
> Shortcut for --create-db, --migrate-db, --link and --secure.

**-g**, **--github**
> Create a private GitHub repository and push the project (requires **gh** or **hub**).

**--gh-public**, **--gh-org** _ORG_, **--gh-description** _TEXT_, **--gh-homepage** _URL_
> Options for the created GitHub repository.

**--help**
> Display help information.

# DESCRIPTION

**lambo** is a "super-powered **laravel new**" for Laravel and Valet. It creates a Laravel application and then performs common setup steps with a single command.

After running **laravel new**, it initializes a Git repository with an initial commit, sets the database credentials and **APP_URL** in **.env** and **.env.example** (using the Valet TLD), generates an app key, and opens the project in your editor and browser.

Defaults can be stored in **~/.lambo/config** (**lambo edit-config**), and a Bash script in **~/.lambo/after** (**lambo edit-after**) runs after each project is created.

# CAVEATS

The project is **archived** and no longer maintained, so it may not support current Laravel releases or starter kits; the official **laravel new** installer now covers most of its features. Requires PHP and Composer, and is designed around macOS with Laravel Valet.

# HISTORY

lambo was created by **Matt Stauffer** at Tighten to speed up Laravel project initialization. It started as a shell script and was later rewritten in PHP using Laravel Zero; the GitHub repository is now archived (last commit in 2023).

# SEE ALSO

[laravel](/man/laravel)(1), [valet](/man/valet)(1), [composer](/man/composer)(1), [php](/man/php)(1)

# RESOURCES

```[Source code](https://github.com/tighten/lambo)```

<!-- verified: 2026-09-29 -->
