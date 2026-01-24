# TLDR

**Create new project**

```symfony new [project_name]```

**Create web app**

```symfony new [project_name] --webapp```

**Start development server**

```symfony server:start```

**Stop server**

```symfony server:stop```

**Show server status**

```symfony server:status```

**Open in browser**

```symfony open:local```

**Run console command**

```symfony console [command]```

**Check security**

```symfony check:security```

# SYNOPSIS

**symfony** _command_ [_options_] [_args_]

# PARAMETERS

**new** _NAME_
> Create project.

**server:start**
> Start local server.

**server:stop**
> Stop server.

**console** _CMD_
> Run Symfony console.

**open:local**
> Open in browser.

**check:security**
> Check vulnerabilities.

**--webapp**
> Full web app template.

**-d**, **--daemon**
> Run in background.

# DESCRIPTION

**symfony** CLI manages Symfony PHP projects. It provides local development tools.

Project creation scaffolds Symfony apps. Full webapp or minimal skeleton.

Local server includes PHP. No separate server configuration needed.

Console wrapper runs Symfony commands. Cache clear, migrations, etc.

Security checking finds vulnerable dependencies. Updates recommended.

# CAVEATS

Requires PHP. Full features need Docker. Symfony account for cloud features.

# HISTORY

The **Symfony CLI** was created by **SensioLabs** for Symfony framework development. It consolidates project management and local development.

# SEE ALSO

[php](/man/php)(1), [composer](/man/composer)(1)
