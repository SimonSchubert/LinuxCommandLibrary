# TAGLINE

creates new Laravel projects with automation

# TLDR

**Create Laravel project**

```lambo new [project-name]```

**Open in an editor** afterwards

```lambo new [project-name] --editor=[code]```

**Create and migrate** a MySQL database

```lambo new [project-name] --create-db --migrate-db```

**Install a starter kit** (Breeze or Jetstream)

```lambo new [project-name] --breeze=[blade|vue|react]```

**Create, migrate, Valet link and secure** in one go

```lambo new [project-name] --full```

**Push to a new GitHub repository** in an organization

```lambo new [project-name] --github --gh-org=[org]```

# SYNOPSIS

**lambo new** [_options_] _name_

# PARAMETERS

_NAME_
> Project directory name. Dashes become underscores in the database name.

**-e**, **--editor** _EDITOR_
> Editor command run as **EDITOR .** in the project after install.

**-m**, **--message** _MSG_
> Initial git commit message (default: "Initial commit.").

**-p**, **--path** _PATH_
> Path where the project will be created.

**-b**, **--browser** _BROWSER_
> Browser to open the site in, e.g. **firefox**.

**-f**, **--force**
> Install even if the directory already exists (deletes it first).

**-d**, **--dev**
> Install Laravel from the develop branch.

**-l**, **--link**
> Create a Valet link to the project directory.

**-s**, **--secure**
> Generate and use an HTTPS certificate with Valet.

**--create-db**
> Create a MySQL database named after the project (needs the **mysql** client).

**--migrate-db**
> Run database migrations.

**--dbhost**, **--dbport**, **--dbname** _VALUE_
> Database host, port, and name to write into **.env**.

**--dbuser** _USER_
> Database user (default: root).

**--dbpassword** _PASS_
> Database password (default: empty).

**--breeze** _STACK_
> Install the Laravel Breeze starter kit: **blade**, **vue**, or **react**.

**--jetstream** _STACK_[,teams]
> Install the Laravel Jetstream starter kit: **inertia** or **livewire**, optionally with teams.

**--full**
> Shortcut for **--create-db --migrate-db --link --secure**.

**-g**, **--github**
> Create a new private GitHub repository and push the project (needs **gh** or **hub**).

**--gh-public**, **--gh-description** _TEXT_, **--gh-homepage** _URL_, **--gh-org** _ORG_
> Make the GitHub repository public, or set its description, homepage, or organization.

**-q**, **--quiet**
> Do not output to the console (except for user input).

**--help**
> Display help information.

# DESCRIPTION

**lambo new** creates a new Laravel project and wraps up the steps that usually follow **laravel new**: it initializes a git repository and makes an initial commit, points **.env** and **.env.example** at a MySQL database named after the project, sets **APP_URL** to the Valet domain, generates an app key, and opens the project in your editor and browser.

Defaults can be stored in **~/.lambo/config** (**lambo edit-config**), and **~/.lambo/after** (**lambo edit-after**) is a bash script run after every new project. Command-line parameters override both.

# CAVEATS

Requires PHP and Composer; Laravel Valet is optional but needed for **--link**, **--secure**, and the Valet URL. The repository was **archived in August 2023** (last release v3.1.1), so newer Laravel starter kits and installer options are not supported.

# HISTORY

lambo new is the main command of **lambo**, created by Matt Stauffer and maintained by **Tighten** for rapid Laravel project setup on top of Valet.

# SEE ALSO

[lambo](/man/lambo)(1), [laravel](/man/laravel)(1), [composer](/man/composer)(1), [valet](/man/valet)(1)

# RESOURCES

```[Source code](https://github.com/tighten/lambo)```

<!-- verified: 2026-11-23 -->
