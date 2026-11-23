# TAGLINE

deploy Cradle PHP applications to servers

# TLDR

**Deploy code** to the configured servers

```cradle deploy production```

Upload **static assets to Amazon S3**

```cradle deploy s3```

Upload static assets **including the Yarn components** folder

```cradle deploy s3 --include-yarn```

Upload static assets **including the upload** folder

```cradle deploy s3 --include-upload```

Show **help** for the deploy commands

```cradle deploy help```

# SYNOPSIS

**cradle deploy** **production**

**cradle deploy** **s3** [**--include-yarn**] [**--include-upload**]

**cradle deploy** [**help**]

# PARAMETERS

**production**
> Deploy code to the servers defined in **config/deploy.php**.

**s3**
> Upload static assets to Amazon S3, using the credentials in **config/services.php**.

**--include-yarn**
> With **s3**: also upload the Yarn components folder.

**--include-upload**
> With **s3**: also upload the upload folder.

**help**
> Show the available deploy commands.

# DESCRIPTION

**cradle deploy** is part of the command line tools of **Cradle**, a PHP 7 content management system and framework. The **production** subcommand pushes the project code to the servers listed in **config/deploy.php**, while **s3** publishes static assets to an S3 bucket configured in **config/services.php**.

Related commands are **cradle connect** _server_ to open a connection to a server defined in config/deploy.php, and **cradle install** / **cradle update** for setting up and updating the project.

# CAVEATS

Requires SSH access to the target servers and correctly configured **config/deploy.php** and **config/services.php** files. The Cradle project has seen no development since **2022**.

# SEE ALSO

[cradle](/man/cradle)(1), [rsync](/man/rsync)(1), [ssh](/man/ssh)(1), [composer](/man/composer)(1)

# RESOURCES

```[Source code](https://github.com/CradlePHP/cradle)```

```[Documentation](https://cradlephp.github.io/docs/3.B.-Reference-Command-Line-Tools.html)```

<!-- verified: 2026-11-23 -->
